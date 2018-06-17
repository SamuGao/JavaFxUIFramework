package com.samugao.utils;

import java.awt.Dimension;
import java.awt.Toolkit;

public class EnvVariable {
	private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static final double screenWidth = screenSize.getWidth();
	private static final double screenHeight = screenSize.getHeight();
	
	public static double getScreenWidth(){
		return screenWidth;
	}
	
	public static double getScreenHeight(){
		return screenHeight;
	}
}
