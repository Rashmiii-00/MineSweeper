
//Main Class:

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class Main extends GUI implements Runnable{

	GUI window= new GUI();
	
	public static void main(String[] args) {
		new Thread(new Main()).start();
	}

	@Override
	public void run() {
        while(true) {
        	if(window.resetter==false) {
        		window.VictoryStatus();
        		
        		
        	window.repaint();
        		
        }
	}

	}
}

