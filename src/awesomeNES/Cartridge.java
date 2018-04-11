package awesomeNES;

public class Cartridge {
	byte[] pRG; //PRG-ROM banks
	byte[] cHR; //CHR-ROM banks
	byte[] sRAM; //Save RAM
	byte mapper; //mapper type
	byte mirror; //mirroring mode
	byte battery; //battery present
	
	public Cartridge(byte[] pRG, byte[] cHR, byte mapper, byte mirror, byte battery) {
		this.sRAM = new byte[0x2000];
		this.pRG = pRG;
		this.cHR = cHR;
		this.mapper = mapper;
		this.mirror = mirror;
		this.battery = battery;
	}

	public byte[] getpRG() {
		return pRG;
	}

	public void setpRG(byte[] pRG) {
		this.pRG = pRG;
	}

	public byte[] getcHR() {
		return cHR;
	}

	public void setcHR(byte[] cHR) {
		this.cHR = cHR;
	}

	public byte[] getsRAM() {
		return sRAM;
	}

	public void setsRAM(byte[] sRAM) {
		this.sRAM = sRAM;
	}

	public byte getMapper() {
		return mapper;
	}

	public void setMapper(byte mapper) {
		this.mapper = mapper;
	}

	public byte getMirror() {
		return mirror;
	}

	public void setMirror(byte mirror) {
		this.mirror = mirror;
	}

	public byte getBattery() {
		return battery;
	}

	public void setBattery(byte battery) {
		this.battery = battery;
	}
}

