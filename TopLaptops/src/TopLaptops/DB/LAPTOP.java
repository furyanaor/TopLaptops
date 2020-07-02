package TopLaptops.DB;
import java.util.Date;
import TopLaptops.DB.STORAGE;

public class LAPTOP {
	protected int id;
	protected String vandor;
	protected String model;

	protected String cpu;
	protected String cpudate;
	protected int ram;
	
	protected DISPLAY display = new DISPLAY();
	protected STORAGE storage = new STORAGE();
	protected BATTERY battery = new BATTERY();
	protected boolean aluminum;
	protected boolean backlight;
	
	protected int price;
	protected int level;
	protected int touch;
	
	protected int Slider_A;
	protected int Slider_B;
	protected int Slider_C;
	protected int Slider_D;
	protected int Slider_E;
	protected int Slider_F;
	
	public void print() {
	//	System.out.println("Preformence: 1/5" + " - " + "Storage: 1/5" + " - " + "Durability: 1/5" + " - " + "Screen: 1/5" + " - " + "eec&Gpu optimize: 1/5" + " - " + "Graphic: 1/5");
		System.out.println(id + ".Vandor: " + vandor + " - Model: " + model + " - Price: " + getPrice() +".00ILS");
	}
	
	public void print_page() {
	//	System.out.println("Preformence: 1/5" + " - " + "Storage: 1/5" + " - " + "Durability: 1/5" + " - " + "Screen: 1/5" + " - " + "eec&Gpu optimize: 1/5" + " - " + "Graphic: 1/5");
		System.out.println("Vandor: " + this.getVandor());
		System.out.println("Model: " + this.getModel());
		System.out.println("CPU: " + this.getRam());
		System.out.println("CPU Release date: " + this.getCpudate());
		System.out.println("RAM: " + this.getRam() + "GB");
		System.out.println("Storage: " + getStorage());
		
		System.out.println("Display Size: " + this.getSize());
		System.out.println("Display resulution: " + this.getResulution());
		System.out.println("Panle type: " + this.getPanel());
		System.out.println("Touch Screen: " + this.isTouch());
		System.out.println("Actice Pen: " + this.isPen());
		System.out.println("Anti-Glare Hard Cout: " + this.isHc3());
		System.out.println("Aluminum material: " + this.isAluminum());
		System.out.println("Keyboard Back Light: " + this.isBacklight());
		
		System.out.println("Price: " + getPrice() +".00ILS");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVandor() {
		return vandor;
	}
	public void setVandor(String vandor) {
		this.vandor = vandor;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public DISPLAY getDisplay() {
		return display;
	}
	public void setDisplay(DISPLAY display) {
		this.display = display;
	}
	public String getStorage() {
		String result = "";
		int temp;
		
		if ((temp = this.storage.getSSD())!=0) {
			result = result.concat(String.valueOf(temp));
			result = result.concat("SSD");
		}
		if ((temp = this.storage.getNVMe())!=0) {
			result = result.concat(String.valueOf(temp));
			result = result.concat("NVMe");
		}
		if ((temp = this.storage.getHDD())!=0) {
			if ( result != "" )
				result = result.concat("+");
			result = result.concat(String.valueOf(temp));
			result = result.concat("HDD");
		}
		return result ;
	}
	public void setStorageNVMe(int nvme) {
		this.storage.setNVMe(nvme);
	}
	public void setStorageSSD(int ssd) {
		this.storage.setSSD(ssd);
	}
	public void setStorageHDD(int hdd) {
		this.storage.setHDD(hdd);
	}
	public boolean isAluminum() {
		return aluminum;
	}
	public void setAluminum(boolean aluminum) {
		this.aluminum = aluminum;
	}
	public boolean isBacklight() {
		return backlight;
	}
	public void setBacklight(boolean backlight) {
		this.backlight = backlight;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	public double getSize() {
		return this.display.getSize();
	}
	public void setSize(double d) {
		this.display.setSize(d);
	}
	public String getResulution() {
		return this.display.getResulution();
	}
	public void setResulution(String resulution) {
		this.display.setResulution(resulution);
	}
	public String getPanel() {
		return this.display.getPanel();
	}
	public void setPanel(String panel) {
		this.display.setPanel(panel);
	}
	public boolean isTouch() {
		return this.display.isTouch();
	}
	public void setTouch(boolean touch) {
		this.display.setTouch(touch);
	}
	public boolean isPen() {
		return this.display.isPen();
	}
	public void setPen(boolean pen) {
		this.display.setPen(pen);
	}
	public boolean isHc3() {
		return this.display.isHc3();
	}
	public void setHc3(boolean hc3) {
		this.display.setHc3(hc3);
	}

	public String getCpudate() {
		return cpudate;
	}

	public void setCpudate(String cpudate) {
		this.cpudate = cpudate;
	}
}
