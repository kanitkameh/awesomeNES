package awesomeNES;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Renderer extends JPanel{
	private boolean running;
	private BufferedImage buffer;
	
	public Renderer(BufferedImage buffer) {
		this.buffer = buffer;
		setSize(buffer.getWidth(),buffer.getHeight());
		running = true;
	}
	
	@Override
	public void paint(Graphics g) {
		 super.paint(g);
		 for(int i=0;i<buffer.getHeight();i++) {
				for(int j=0;j<buffer.getWidth();j++) {
					Color current;
					current = new Color(buffer.getRGB(j, i));
					
					g.setColor(current);
					g.drawRect(j, i, 1, 1);
				}
			}
	}
	
	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public BufferedImage getBuffer() {
		return buffer;
	}

	public void setBuffer(BufferedImage buffer) {
		this.buffer = buffer;
	}
}
