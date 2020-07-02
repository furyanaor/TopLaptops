package TopLaptops.DB;

public class DISPLAY {
	private double size;
	private String resulution;
	private String panel;
	private boolean touch;
	private boolean pen;
	private boolean hc3;
	public double getSize() {
		return size;
	}
	public void setSize(double d) {
		this.size = d;
	}
	public String getResulution() {
		return resulution;
	}
	public void setResulution(String resulution) {
		this.resulution = resulution;
	}
	public String getPanel() {
		return panel;
	}
	public void setPanel(String panel) {
		this.panel = panel;
	}
	public boolean isTouch() {
		return touch;
	}
	public void setTouch(boolean touch) {
		this.touch = touch;
	}
	public boolean isPen() {
		return pen;
	}
	public void setPen(boolean pen) {
		this.pen = pen;
	}
	public boolean isHc3() {
		return hc3;
	}
	public void setHc3(boolean hc3) {
		this.hc3 = hc3;
	}
}
