package com.ginnasticamente.frames;

import java.awt.BorderLayout;

import com.ginnasticamente.models.FrameModel;
import com.ginnasticamente.panels.MainTabPanel;

public class MainFrame extends FrameModel {
	
	public MainFrame(int width, int height, String title) {
		
		super(width, height, title);
	}
	
	@Override
	public void drawLayout() {
	
		add(new MainTabPanel(), BorderLayout.CENTER);
	}
}
