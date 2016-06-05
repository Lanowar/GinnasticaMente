package com.ginnasticamente;

import com.ginnasticamente.frames.MainFrame;

public class Main {
	
	private static final String APP_NAME = "GinnasticaMente 0.02a";

	public static void main(String[] args) {
		
		MainFrame mainFrame = new MainFrame(800, 600, APP_NAME);
		mainFrame.setVisible(true);
		
	}
}
