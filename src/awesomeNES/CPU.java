package awesomeNES;

public class CPU {
	private byte registerA;
	private byte registerX;
	private byte registerY;
	
	private short programCounter;
	private short stackPointer;
	
	private boolean carryFlag;
	private boolean zeroFlag;
	private boolean interuptFlag;
	private boolean decimalFlag;
	private boolean breakFlag;
	private boolean unusedFlag;   
	private boolean overflowFlag;
	private boolean negativeFlag;
	
	Memory ram;
	public CPU(Memory ram) {
		this.ram=ram;
		short programCounter = read16BitAddress((short) 0xFFFC);
		stackPointer=0x01FF;
	}
	short read16BitAddress(short address) {
		return  (short) (ram.getRam()[address+1]<<8+ram.getRam()[address]); //doing this because the CPU is little endian
	}
	public byte getRegisterA() {
		return registerA;
	}
	public void setRegisterA(byte registerA) {
		this.registerA = registerA;
	}
	public byte getRegisterX() {
		return registerX;
	}
	public void setRegisterX(byte registerX) {
		this.registerX = registerX;
	}
	public byte getRegisterY() {
		return registerY;
	}
	public void setRegisterY(byte registerY) {
		this.registerY = registerY;
	}
	public short getProgramCounter() {
		return programCounter;
	}
	public void setProgramCounter(short programCounter) {
		this.programCounter = programCounter;
	}
	public short getStackPointer() {
		return stackPointer;
	}
	public void setStackPointer(short stackPointer) {
		this.stackPointer = stackPointer;
	}
	public boolean isCarryFlag() {
		return carryFlag;
	}
	public void setCarryFlag(boolean carryFlag) {
		this.carryFlag = carryFlag;
	}
	public boolean isZeroFlag() {
		return zeroFlag;
	}
	public void setZeroFlag(boolean zeroFlag) {
		this.zeroFlag = zeroFlag;
	}
	public boolean isInteruptFlag() {
		return interuptFlag;
	}
	public void setInteruptFlag(boolean interuptFlag) {
		this.interuptFlag = interuptFlag;
	}
	public boolean isDecimalFlag() {
		return decimalFlag;
	}
	public void setDecimalFlag(boolean decimalFlag) {
		this.decimalFlag = decimalFlag;
	}
	public boolean isBreakFlag() {
		return breakFlag;
	}
	public void setBreakFlag(boolean breakFlag) {
		this.breakFlag = breakFlag;
	}
	public boolean isUnusedFlag() {
		return unusedFlag;
	}
	public void setUnusedFlag(boolean unusedFlag) {
		this.unusedFlag = unusedFlag;
	}
	public boolean isOverflowFlag() {
		return overflowFlag;
	}
	public void setOverflowFlag(boolean overflowFlag) {
		this.overflowFlag = overflowFlag;
	}
	public boolean isNegativeFlag() {
		return negativeFlag;
	}
	public void setNegativeFlag(boolean negativeFlag) {
		this.negativeFlag = negativeFlag;
	}
	public Memory getRam() {
		return ram;
	}
	public void setRam(Memory ram) {
		this.ram = ram;
	}
}
