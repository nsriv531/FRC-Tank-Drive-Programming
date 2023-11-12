// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
/**
 * The VM is configured to automatically run this class, and to call the run() function when the
 * robot is enabled. If you change the name of this class or the package after creating this
 * project, you must also update the build.gradle file in the project.
 */
public class Robot extends EducationalRobot {
  private WPI_TalonSRX talon0 = new WPI_TalonSRX(1);
  private WPI_TalonSRX talon1 = new WPI_TalonSRX(2);
  private WPI_TalonSRX talon2 = new WPI_TalonSRX(3);
  private WPI_TalonSRX talon3 = new WPI_TalonSRX(4);
  private XboxController joystick = new XboxController(0);

  /**
   * This function is run when the robo\t is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    
  }

  /** This function is run when the robot is enabled. */
  @Override
  public void run() {
 
    // update phoenix to 5.20.2
    // update phoenix tuner and talons 
    // turned to team 0 because DNS is roborio-0-FRC but was using ip adress of 10.0.0.91 last time
    while(true) {
      talon0.set(-joystick.getLeftY());
      talon1.set(-joystick.getLeftY());
      talon2.set(joystick.getRightY());
      talon3.set(joystick.getRightY());
      //talon0.set(ControlMode.PercentOutput, stick);
      //talon1.set(ControlMode.PercentOutput, stick);
      System.out.println("works");
    }
  }
}