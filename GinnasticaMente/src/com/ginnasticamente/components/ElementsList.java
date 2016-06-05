package com.ginnasticamente.components;

import javax.swing.JList;
import javax.swing.JPanel;

public class ElementsList extends JPanel {
	
	public ElementsList() {
		
		JList list = new JList();
		add(list);
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {

				
			}
		});
		t.start();
	}
}
