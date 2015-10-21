package ACSR;

import lejos.nxt.Motor;

public class RobotControl {
	private Motor left;
	private Motor right;
	private Motor upper;
	
	public Motor getLeftMotor() {
		return left;
	}

	public Motor getRightMotor() {
		return right;
	}
	
	public Motor getUpperMotor() {
		return upper;
	}
	
	public void setLeftMotor(Motor left) {
		this.left = left;
	}
	
	public void setRightMotor(Motor right) {
		this.right = right;
	}
	
	public void setUpperMotor(Motor upper) {
		this.upper = upper;
	}
	
}
