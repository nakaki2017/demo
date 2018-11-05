package com.naka.demo.factoryPattern.abstractFactory;

import com.naka.demo.factoryPattern.model.*;

/**
 * @author: susie
 * @create: 2018-11-05 18:07
 **/
public class DellFactory implements PcFactory{
    public Mouse createMouse() {
        return new DellMouse();
    }

    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
