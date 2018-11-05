package com.naka.demo.factoryPattern.abstractFactory;

import com.naka.demo.factoryPattern.model.HpKeyboard;
import com.naka.demo.factoryPattern.model.HpMouse;
import com.naka.demo.factoryPattern.model.Keyboard;
import com.naka.demo.factoryPattern.model.Mouse;

/**
 * @author: susie
 * @create: 2018-11-05 18:07
 **/
public class HpFactory implements PcFactory{
    public Mouse createMouse() {
        return new HpMouse();
    }

    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
