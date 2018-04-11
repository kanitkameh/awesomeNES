package awesomeNES;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;

public class Launcher {
	void start() throws IOException {
		JFrame window = new JFrame("awesomeNES");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		File cartridge = new File("input.nes");
		Memory ram = new Memory();
		ram.loadCartridge(cartridge);
		ram.cartMemoryDump();
		BufferedImage bi = new BufferedImage(256, 240, BufferedImage.TYPE_INT_RGB);
		
		Renderer ppu = new Renderer(bi);
		
		window.add(ppu);
		window.setSize(276, 290);
		window.setVisible(true);
		
		
		ppu.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
				bi.setRGB(e.getX(), e.getY(), 0x7d42f4);
				ppu.repaint();
			}
			@Override
			public void mouseMoved(MouseEvent e) {
					
			}
		});
		
	}
}
