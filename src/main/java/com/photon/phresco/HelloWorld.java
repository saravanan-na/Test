/**
 * Archetype - phresco-java-quickstart-archetype
 *
 * Copyright (C) 1999-2013 Photon Infotech Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.photon.phresco;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;


public class HelloWorld extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private static JLabel lbl_username;
	public static Container container;
	private static JDesktopPane panel;
	
	public HelloWorld(){
		super("Hello World");
		try{
			container = getContentPane();
			container.setBackground(new java.awt.Color(255, 255, 255));
			container.setBounds(0, 600, 600, 600);
			container.setVisible(true);
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		initComponents();
	}
	
	public void initComponents() {

		setTitle("Hello World");
		setResizable(false);
		
		panel = new JDesktopPane();
		
		getContentPane().add( "Center", panel );
		
		container.add(panel);
		
		panel.setBackground(new Color(216, 229, 246));
		panel.setVisible(true);
		panel.setBounds(300, 350, 100, 120);
		
		lbl_username = new JLabel();
		lbl_username.setText("Hello World");
		Font font = new Font("Arial", 1, 40);
		lbl_username.setFont(font);
		
		
		panel.add(lbl_username, JLayeredPane.DEFAULT_LAYER);
		lbl_username.setBounds(550, 450, 500, lbl_username.getPreferredSize().height);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}
	
	
}

	 