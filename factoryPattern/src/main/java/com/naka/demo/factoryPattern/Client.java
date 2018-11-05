package com.naka.demo.factoryPattern;

import com.naka.demo.factoryPattern.abstractFactory.HpFactory;
import com.naka.demo.factoryPattern.abstractFactory.PcFactory;
import com.naka.demo.factoryPattern.factoryMethod.DellMouseFactory;
import com.naka.demo.factoryPattern.factoryMethod.HpMouseFactory;
import com.naka.demo.factoryPattern.model.DellMouse;
import com.naka.demo.factoryPattern.model.Keyboard;
import com.naka.demo.factoryPattern.model.Mouse;
import com.naka.demo.factoryPattern.simpleFactory.MouseFactory;
import org.junit.jupiter.api.Test;

import java.security.Key;

public class Client {

    @Test
    public void buyMouseSimple(){
        Mouse mouse = MouseFactory.createMouse("Dell");
        mouse.sayHi();
    }

    @Test
    public void buyMouseFactoryMethod(){
        HpMouseFactory hpMouseFactory = new HpMouseFactory();
        DellMouseFactory dellMouseFactory = new DellMouseFactory();
        Mouse hpMouse = hpMouseFactory.createMouse();
        Mouse dellMouse = dellMouseFactory.createMouse();
        hpMouse.sayHi();
        dellMouse.sayHi();
    }

    @Test
    public void buyMouseAbstractFactory(){
        PcFactory hpFactory = new HpFactory();
        Mouse hpMouse = hpFactory.createMouse();
        Keyboard hpKeyboard = hpFactory.createKeyboard();
        hpMouse.sayHi();
        hpKeyboard.sayHi();
    }
}
