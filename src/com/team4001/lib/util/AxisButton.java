package com.team4001.lib.util;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

public class AxisButton extends Button {
	
	public Joystick joystick;
	public int joystick_axis;
	
	public AxisButton(Joystick gamepad1, int axis){
		joystick = gamepad1;
		joystick_axis = axis;
				
	}
	
	public boolean get(){
		//System.out.println(joystick.getRawAxis(joystick_axis));
		return joystick.getRawAxis(joystick_axis) > 0;
	}
	
}
