package com.naka.demo.factoryPattern.factoryMethod;

import com.naka.demo.factoryPattern.model.DellMouse;
import com.naka.demo.factoryPattern.model.HpMouse;
import com.naka.demo.factoryPattern.model.Mouse;

public class DellMouseFactory implements MouseFactoryMethod{

    public Mouse createMouse(){
        return new DellMouse();
    }
}
