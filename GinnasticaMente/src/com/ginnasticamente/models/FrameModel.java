package com.ginnasticamente.models;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public abstract class FrameModel extends JFrame {

	private int width;
	private int height;
	private String title = "GinnasticaMente 0.01a";

	public FrameModel(int width, int height, String title) {

		this.width = width;
		this.height = height;
		this.title = title;
		
		setLayout(new BorderLayout());
		drawLayout();
		pack();
		initFrame(width, height, title);
	}
	
	public void initFrame(int width, int height, String title) {
		
		setSize(width, height);
		setTitle(title);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
	}
	
	public abstract void drawLayout();
}
