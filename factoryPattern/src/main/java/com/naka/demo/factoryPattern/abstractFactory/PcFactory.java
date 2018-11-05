package com.naka.demo.factoryPattern.abstractFactory;

import com.naka.demo.factoryPattern.model.Keyboard;
import com.naka.demo.factoryPattern.model.Mouse;

/**
 * @author: susie
 * @create: 2018-11-05 18:02
 **/
public interface PcFactory {
    Mouse createMouse();

    Keyboard createKeyboard();
}
