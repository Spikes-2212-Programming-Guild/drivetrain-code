/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import java.util.function.Supplier;

import com.spikes2212.dashboard.ConstantHandler;
import com.spikes2212.genericsubsystems.basicSubsystem.commands.MoveBasicSubsystem;


import edu.wpi.first.wpilibj.Joystick;

public class OI /* GEVALD */ {
	private static Joystick leftJoystick = new Joystick(0);
	private static Joystick rightJoystick = new Joystick(1);


	public OI() {
	}

	public static double getLeftJoystickX() {
		return -leftJoystick.getX();
	}

	
	public static double getLeftJoystickY() {
		return -leftJoystick.getY();
	}

	public static double getRightJoystickX() {
		return rightJoystick.getX();
	}

	public static double getRightJoystickY() {
		return -rightJoystick.getY();
	}

}
