package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		//3. use a for loop to initialize the robots.
		int xVal = 100;
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			//4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i].miniaturize();
			robots[i].setSpeed(75);
			robots[i].setX(xVal);
			robots[i].setY(590);
			xVal = xVal + 100;
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	Random random = new Random();
    	boolean end = false;
    	while (end == false) {
    		for (int i = 0; i < robots.length; i++) {
    			robots[i].move(random.nextInt(50));
    			if (robots[i].getY() <= 50) {
					end = true;
					robots[i].expand();
				}
    		}
    	}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	for (int i = 0; i < robots.length; i++) {
			robots[i].sparkle();
		}
    	for (int i = 0; i < robots.length; i++) {
			robots[i].hide();
			robots[i].unSparkle();
		}
		//8. try different races with different amounts of robots.
    	Robot[] robotsI = new Robot[8];
		xVal = 100;
		end = false;
		for (int i = 0; i < robotsI.length; i++) {
			robotsI[i] = new Robot();
			robotsI[i].miniaturize();
			robotsI[i].setX(xVal);
			robotsI[i].setY(590);
			robotsI[i].setSpeed(75);
			xVal = xVal + 100;
		}
    	while (end == false) {
    		for (int i = 0; i < robotsI.length; i++) {
    			robotsI[i].move(random.nextInt(50));
    			if (robotsI[i].getY() <= 0) {
					end = true;
					robotsI[i].expand();
				}
    		}
    	}
    	for (int i = 0; i < robotsI.length; i++) {
			robotsI[i].sparkle();
    	}
		for (int i = 0; i < robotsI.length; i++) {
			robotsI[i].unSparkle();
			robotsI[i].hide();
		}
	    //9. make the robots race around a circular track.
		int[] robotVals = new int[5];
		for (int i = 0; i < robotVals.length; i++) {
			robotVals[i] = 0;
		}
		Robot[] robotsII = new Robot[5];
		int yVal = 0;
		end = false;
		for (int i = 0; i < robotsII.length; i++) {
			robotsII[i] = new Robot();
			robotsII[i].miniaturize();
			robotsII[i].penDown();
			robotsII[i].setY(yVal);
			robotsII[i].setX(500);
			robotsII[i].setSpeed(75);
			yVal = yVal + 50;
			robotsII[i].setAngle(90);
		}
		int distance = 5;
    	while (end == false) {
    		for (int i = 0; i < robotsII.length; i++) {
    			for (int j = 0; j < random.nextInt(50); j++) {
					robotsII[i].move(distance);
					robotsII[i].turn(1);
					robotVals[i] = robotVals[i] + 1;
				}
    			distance = distance - 1;
    			if (robotVals[i] >= 360) {
					end = true;
					robotsII[i].expand();
				}
    		}
    		distance = 5;
    	}
    	for (int i = 0; i < robotsII.length; i++) {
			robotsII[i].sparkle();
    	}
	}
}
