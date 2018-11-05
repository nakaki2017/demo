package com.naka.demo.factoryPattern.simpleFactory;

import com.naka.demo.factoryPattern.model.DellMouse;
import com.naka.demo.factoryPattern.model.HpMouse;
import com.naka.demo.factoryPattern.model.Mouse;

public class MouseFactory {
    public static Mouse createMouse(String type){
        if("Dell".equals(type)) {
            return new DellMouse();
        }
        if("Hp".equals(type)) {
            return new HpMouse();
        }
        return null;
    }
}
