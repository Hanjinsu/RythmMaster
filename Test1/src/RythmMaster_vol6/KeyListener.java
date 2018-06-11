package RythmMaster_vol6;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(RythmMaster.game == null) {
			return;
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			RythmMaster.game.pressA();
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			RythmMaster.game.pressS();
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			RythmMaster.game.pressD();
		}
		else if(e.getKeyCode() == KeyEvent.VK_F) {
			RythmMaster.game.pressF();
		}
		else if(e.getKeyCode() == KeyEvent.VK_H) {
			RythmMaster.game.pressH();
		}
		else if(e.getKeyCode() == KeyEvent.VK_J) {
			RythmMaster.game.pressJ();
		}
		else if(e.getKeyCode() == KeyEvent.VK_K) {
			RythmMaster.game.pressK();
		}
		else if(e.getKeyCode() == KeyEvent.VK_L) {
			RythmMaster.game.pressL();
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		if(RythmMaster.game == null)
			return;
		if(e.getKeyCode() == KeyEvent.VK_A) {
			RythmMaster.game.releaseA();
    	}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			RythmMaster.game.releaseS();
    	}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			RythmMaster.game.releaseD();
    	}           
		else if(e.getKeyCode() == KeyEvent.VK_F) {
			RythmMaster.game.releaseF();
    	}       
		else if(e.getKeyCode() == KeyEvent.VK_H) {
			RythmMaster.game.releaseH();
    	}          
		else if(e.getKeyCode() == KeyEvent.VK_J) {
			RythmMaster.game.releaseJ();
    	}           	
		else if(e.getKeyCode() == KeyEvent.VK_K) {
			RythmMaster.game.releaseK();
    	}           	
		else if(e.getKeyCode() == KeyEvent.VK_L) {
			RythmMaster.game.releaseL();
    	}           
	}

}
