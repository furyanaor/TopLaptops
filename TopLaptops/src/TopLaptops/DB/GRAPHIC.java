package TopLaptops.DB;

public class GRAPHIC extends PORTABILITY{
	private String gpu;
	private int hz;
	private boolean rgb;
	
	public void print_page() {
	//	System.out.println("Preformence: 1/5" + " - " + "Storage: 1/5" + " - " + "Durability: 1/5" + " - " + "Screen: 1/5" + " - " + "eec&Gpu optimize: 1/5" + " - " + "Graphic: 1/5");
		System.out.println("Vandor: " + this.getVandor());
		System.out.println("Model: " + this.getModel());
		System.out.println("CPU: " + this.getCpu());
		System.out.println("CPU Release date: " + this.getCpudate());
		System.out.println("GPU: " + this.getGpu());

		System.out.println("RAM: " + this.getRam() + "GB");
		System.out.println("Storage: " + getStorage());
		
		System.out.println("Display Size: " + this.getSize());
		System.out.println("Display resulution: " + this.getResulution());
		System.out.println("Hz: " + this.getHz());
		System.out.println("Panle type: " + this.getPanel());
		System.out.println("Touch Screen: " + this.isTouch());
		System.out.println("Actice Pen: " + this.isPen());
		System.out.println("Anti-Glare Hard Cout: " + this.isHc3());
		System.out.println("Eternet RJ-45 connection: " + this.isRj45());
		System.out.println("Aluminum material: " + this.isAluminum());
		System.out.println("Keyboard Back Light: " + this.isBacklight());
		System.out.println("RGB lights: " + this.isRgb());

		
		System.out.println("Price: " + getPrice() +".00ILS");
	}
	
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public int getHz() {
		return hz;
	}
	public void setHz(int hz) {
		this.hz = hz;
	}
	public boolean isRgb() {
		return rgb;
	}
	public void setRgb(boolean rgb) {
		this.rgb = rgb;
	}
}
