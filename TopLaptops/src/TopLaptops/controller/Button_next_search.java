package TopLaptops.controller;
//import java.util.Observer; // ?
//public interface Controller extends Observer {

import TopLaptops.DB.resultTAB;

public class Button_next_search {
	private int Slider_A = 1;
	private int Slider_B = 1;
	private int Slider_C = 1;
	private int Slider_D = 1;
	private int Slider_E = 0;
	private int Slider_F = 0;
	private resultTAB TAB;
	
	public void setSlider_A(int Slider_A_value) {
		Slider_A = Slider_A_value;
	}
	public void setSlider_B(int Slider_B_value) {
		Slider_B = Slider_B_value;
	}
	public void setSlider_C(int Slider_C_value) {
		Slider_C = Slider_C_value;
	}
	public void setSlider_D(int Slider_D_value) {
		Slider_D = Slider_D_value;
	}
	public void setSlider_E(int Slider_E_value) {
		Slider_E = Slider_E_value;
	}
	public void setSlider_F(int Slider_F_value) {
		Slider_F = Slider_F_value;
	}
	public void DB_Pull(String e_lable) {

		System.out.println("Preformence: "+ Slider_A + "/5" + " - " + "Storage: "+ Slider_B + "/5" + " - " + "Durability: "+ Slider_C + "/5" + " - " + "Screen: "+ Slider_D + "/5" + " - " + e_lable + ": "+ Slider_E + "/5" + " - " + "Graphic: "+ Slider_F + "/5");

	}
}
