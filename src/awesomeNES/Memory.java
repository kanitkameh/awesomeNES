package awesomeNES;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Memory {
	private byte ram[];
	private int cartSize;
	public Memory() {
		ram = new byte[(0xFFFF+1)];
	}
	void loadCartridge(File f) throws IOException{
		FileInputStream fr = new FileInputStream(f);
		int len = fr.read(ram, 0x4020, 0xFFFF-0x4020); //loads the rom from 4020 to FFFF
		cartSize = len;
		fr.close();
	}
	void cartMemoryDump() {
		for(int i=0;i<cartSize;i++) {
			System.out.println(String.format("0x%08X",0x4020+i)+" : "+String.format("0x%08X",ram[0x4020+i]));
		}
	}
	public byte[] getRam() {
		return ram;
	}
	public void setRam(byte[] ram) {
		this.ram = ram;
	}
	public int getCartSize() {
		return cartSize;
	}
	public void setCartSize(int cartSize) {
		this.cartSize = cartSize;
	}
}
