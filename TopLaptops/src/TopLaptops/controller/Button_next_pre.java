package TopLaptops.controller;

import TopLaptops.view.view;
import TopLaptops.DB.LAPTOP;
//import java.util.Observer; // ?
//public interface Controller extends Observer {

public class Button_next_pre {
	private int Radio;
	private boolean Touch;

	public void setRadio(int Radio_value) {
		Radio = Radio_value;
	}
	public void setTouch(boolean Touch_value) {
		Touch = Touch_value;
	}
	public void DB_Pull(view MyView) {
		System.out.println("Laptops Level: " + Radio);
		System.out.println("Touch Screen: " + Touch);
		
		System.out.println("Radio Basic: " + MyView.getRadio_basic());
		System.out.println("Radio Level I - Portability: " +MyView.getRadio_level_I());
		System.out.println("Radio Level II - Graphic: " +MyView.getRadio_level_II());
		System.out.println("Radio Level III - WorkStation: " +MyView.getRadio_level_III());
		System.out.println("TouchScreen CheckBox: " +MyView.getCheckbox_touch());

		
		switch (Radio) {
		case(1):
			System.out.println("Preformence: 1/5" + " - " + "Storage: 1/5" + " - " + "Durability: 1/5" + " - " + "Screen: 1/5" + " - " + "Portability: 1/5" + " - " + "Graphic: 0/5");
			MyView.Slider_E = 1;	
			break;
		case(2):
			System.out.println("Preformence: 1/5" + " - " + "Storage: 1/5" + " - " + "Durability: 1/5" + " - " + "Screen: 1/5" + " - " + "Portability: 1/5" + " - " + "Graphic: 1/5");
			MyView.Slider_E = 1;	
			MyView.Slider_F = 1;
			break;
		case(3):
			System.out.println("Preformence: 1/5" + " - " + "Storage: 1/5" + " - " + "Durability: 1/5" + " - " + "Screen: 1/5" + " - " + "eec&Gpu optimize: 1/5" + " - " + "Graphic: 1/5");
			MyView.Slider_E = 1;
			MyView.Slider_E_lable = "eec&Gpu optimize";
			MyView.Slider_F = 1;
			break;
		default:
			System.out.println("Preformence: 1/5" + " - " + "Storage: 1/5" + " - " + "Durability: 1/5" + " - " + "Screen: 1/5" + " - " + "Portability: 0/5" + " - " + "Graphic: 0/5");
			break;
		}
		
	}
}
