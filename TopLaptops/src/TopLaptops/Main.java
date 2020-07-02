package TopLaptops;

import TopLaptops.view.view;
import TopLaptops.controller.Button_next_pre;
import TopLaptops.controller.Button_next_search;
import TopLaptops.LogicClassTest;
import TopLaptops.DB.GRAPHIC;
import TopLaptops.DB.LAPTOP;
import TopLaptops.DB.STORAGE;
import TopLaptops.DB.database;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		//database storage
		
		//lvl 0 touch_off
		LAPTOP lap = new LAPTOP();
		lap.setId(1);
		lap.setVandor("Lenovo");
		lap.setModel("V145 15");
		//lap.setDate(today);
		lap.setCpu("AMD A4-9125");
		lap.setCpudate("Q2-2018");
		lap.setRam(4);
		//lap.setDisplaySize(15.6);
		lap.setSize(15.6);
		lap.setResulution("1366x768");
		lap.setPanel("TN");
		lap.setTouch(false);
		lap.setPen(false);
		lap.setHc3(true);
		//lap.battery;
		lap.setStorageHDD(500);
		lap.setAluminum(false);
		lap.setBacklight(false);
		lap.setPrice(1_100);
		
		LAPTOP lap2 = new LAPTOP();
		lap2.setId(2);
		lap2.setVandor("Lenovo");
		lap2.setModel("IdeaPad 330-15");
		//lap2.setDate(today);
		lap2.setCpu("N5000");
		lap2.setCpudate("Q2-2018");
		lap2.setRam(4);
		//lap2.setDisplaySize(15.6);
		lap2.setSize(15.6);
		lap2.setResulution("1366x768");
		lap2.setPanel("TN");
		lap2.setTouch(false);
		lap2.setPen(false);
		lap2.setHc3(false);
		//lap2.battery;
		lap2.setStorageHDD(500);
		lap2.setAluminum(false);
		lap2.setBacklight(false);
		lap2.setPrice(1_299);
		
		
		//lvl 0 touch_off, A=5, B=5, C=5, D=5
		LAPTOP lap3 = new LAPTOP();
		lap3.setId(1);
		lap3.setVandor("HP");
		lap3.setModel("EliteBook 1050 G1");
		//lap3.setDate(today);
		lap3.setCpu("i7-8750H");
		lap3.setCpudate("Q1-2018");
		lap3.setRam(32);
		//lap3.setDisplaySize(15.6);
		lap3.setSize(15.6);
		lap3.setResulution("3840x2160");
		lap3.setPanel("IPS");
		lap3.setTouch(false);
		lap3.setPen(false);
		lap3.setHc3(true);
		//lap3.battery;
		lap3.setStorageHDD(1000);
		lap3.setAluminum(true);
		lap3.setBacklight(true);
		lap3.setPrice(10_900);
		
		//lvl 2 touch_on
		GRAPHIC graph20 = new GRAPHIC();
		graph20.setId(1);
		graph20.setVandor("Lenovo");
		graph20.setModel("IdeaPad C340-15IML");
		//lap20.setDate(today);
		graph20.setCpu("i5-10210U");
		graph20.setCpudate("Q2-2019");
		graph20.setRam(8);
		//lap20.setDisplaySize(15.6);
		graph20.setSize(15.6);
		graph20.setResulution("1920x1080");
		graph20.setPanel("IPS");
		graph20.setTouch(true);
		graph20.setPen(false);
		graph20.setHc3(false);
		
		graph20.setRj45(false);
		graph20.setWight(2.0);
		graph20.setGpu("NVIDIA GeForce MX230");
		graph20.setHz(60);
		graph20.setRgb(false);
		//lap20.battery;
		graph20.setStorageNVMe(256);
		graph20.setAluminum(false);
		graph20.setBacklight(true);
		graph20.setPrice(3_555);
		
		GRAPHIC graph21 = new GRAPHIC();
		graph21.setId(2);
		graph21.setVandor("Lenovo");
		graph21.setModel("IdeaPad C340-15");
		//lap20.setDate(today);
		graph21.setCpu("i5-8265U");
		graph21.setCpudate("Q3-2018");
		graph21.setRam(8);
		//lap20.setDisplaySize(15.6);
		graph21.setSize(15.6);
		graph21.setResulution("1920x1080");
		graph21.setPanel("IPS");
		graph21.setTouch(true);
		graph21.setPen(false);
		graph21.setHc3(false);
		
		graph21.setRj45(false);
		graph21.setWight(2.0);
		graph21.setGpu("NVIDIA GeForce MX230");
		graph21.setHz(60);
		graph21.setRgb(false);
		//lap20.battery;
		graph21.setStorageNVMe(256);
		graph21.setAluminum(false);
		graph21.setBacklight(true);
		graph21.setPrice(3_549);
		
		
		//lvl 2 touch_on, A=3, B=2, C=2, D=2, E=1, F=3
		GRAPHIC graph22 = new GRAPHIC();
		graph22.setId(1);
		graph22.setVandor("Asus");
		graph22.setModel("ZenBook Flip 15");
		//lap24.setDate(today);
		graph22.setCpu("i7-10510U");
		graph22.setCpudate("Q3-2019");
		graph22.setRam(16);
		//lap24.setDisplaySize(15.6);
		graph22.setSize(15.6);

		graph22.setResulution("1920x1080");
		graph22.setPanel("IPS");
		graph22.setTouch(true);
		graph22.setPen(false);
		graph22.setHc3(false);
		
		graph22.setRj45(false);
		graph22.setWight(1.9);
		graph22.setGpu("NVIDIA GeForce GTX1050");
		graph22.setHz(60);
		graph22.setRgb(false);
		//lap24.battery;
		graph22.setStorageNVMe(512);
		graph22.setAluminum(false);
		graph22.setBacklight(false);
		graph22.setPrice(6_179);
		
		GRAPHIC graph23 = new GRAPHIC();
		graph23.setId(2);
		graph23.setVandor("Lenovo");
		graph23.setModel("Yoga 720 15");
		//lap24.setDate(today);
		graph23.setCpu("i7-7700HQ");
		graph23.setCpudate("Q4-2016");
		graph23.setRam(16);
		//lap24.setDisplaySize(15.6);
		graph23.setSize(15.6);
		graph23.setResulution("1920x1080");
		graph23.setPanel("IPS");
		graph23.setTouch(true);
		graph23.setPen(false);
		graph23.setHc3(true);
		
		graph23.setRj45(false);
		graph23.setWight(2.0);
		graph23.setGpu("NVIDIA GeForce GTX1050");
		graph23.setHz(60);
		graph23.setRgb(false);
		//lap24.battery;
		graph23.setStorageNVMe(512);
		graph23.setAluminum(false);
		graph23.setBacklight(false);
		graph23.setPrice(5_590);
		
		
		
		//view block:		
		view MyView = new view();
		System.out.println("Radio Basic: " + MyView.getRadio_basic());
		System.out.println("Radio Level I - Portability: " +MyView.getRadio_level_I());
		System.out.println("Radio Level II - Graphic: " +MyView.getRadio_level_II());
		System.out.println("Radio Level III - WorkStation: " +MyView.getRadio_level_III());
		System.out.println("TouchScreen CheckBox: " +MyView.getCheckbox_touch());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a Laptop Level (1-3 or 0 for basic):");
		byte level = scanner.nextByte();
		
		switch (level) {
		case 1:
			MyView.setRadio_basic(0);
			MyView.setRadio_level_I(1);
			MyView.setRadio_level_II(0);
			MyView.setRadio_level_III(0);
			break;
		case 2:
			MyView.setRadio_basic(0);
			MyView.setRadio_level_I(0);
			MyView.setRadio_level_II(1);
			MyView.setRadio_level_III(0);			
			break;
		case 3:
			MyView.setRadio_basic(0);
			MyView.setRadio_level_I(0);
			MyView.setRadio_level_II(0);
			MyView.setRadio_level_III(1);			
			break;
		default:
			MyView.setRadio_basic(1);
			MyView.setRadio_level_I(0);
			MyView.setRadio_level_II(0);
			MyView.setRadio_level_III(0);	
			level = 0;
			break;
		}
		
		System.out.println("1 - TouchScreen / 0 - normal");
		byte touch = scanner.nextByte();
		switch (touch) {
		case 1:
			MyView.setCheckbox_touch(true);
			break;
		default:
			MyView.setCheckbox_touch(false);
			break;
		}
		
	
		//Controller block:
		Button_next_pre next_pre = new Button_next_pre();
		if (MyView.getCheckbox_touch())
			next_pre.setTouch(true);
		else
			next_pre.setTouch(false);
		
		if (MyView.getRadio_basic() == 1) {
			LogicClassTest.testPreFilter(MyView, 0);
			next_pre.setRadio(0);
		}
		if (MyView.getRadio_level_I() == 1) {
			LogicClassTest.testPreFilter(MyView, 1);
			next_pre.setRadio(1);
		}
		
		if (MyView.getRadio_level_II() == 1) {
			LogicClassTest.testPreFilter(MyView, 2);
			next_pre.setRadio(2);
		}
		if (MyView.getRadio_level_III() == 1) {
			LogicClassTest.testPreFilter(MyView, 3);
			next_pre.setRadio(3);
		}
		
		//Pull Result's
		next_pre.DB_Pull(MyView);
		
		
		if (MyView.getRadio_basic() == 1) {
			lap.print();
			lap2.print();
		}
		if (MyView.getRadio_level_I() == 1) {
		
		}
		
		if (MyView.getRadio_level_II() == 1) {
			graph20.print();
			graph21.print();
		}
		if (MyView.getRadio_level_III() == 1) {
			
		}

		//choose laptop from list:
		byte Select;
		
		do {
			System.out.println("Choose laptop from list or 0 to set attribute (0-2):");
			Select = scanner.nextByte();

			switch(Select) {
			case 1:
				if (level == 0)
					lap.print_page();
				if (level == 2)
					graph20.print_page();
				break;
			case 2:
				if (level == 0)
					lap2.print_page();
				if (level == 2)
					graph21.print_page();
				break;
			default:
				break;
			}
		} while(Select != 0);
		
		
		//Slider's set:
		System.out.println("Set Preformence rate (1-5):");
		byte slider_scan_A = scanner.nextByte();
		MyView.Slider_A = slider_scan_A;
		
		System.out.println("Set Storage rate (1-5):");
		byte slider_scan_B = scanner.nextByte();
		MyView.Slider_B = slider_scan_B;
		
		System.out.println("Set Durability rate (1-5):");
		byte slider_scan_C = scanner.nextByte();
		MyView.Slider_C = slider_scan_C;
		
		System.out.println("Set Screen rate (1-5):");
		byte slider_scan_D = scanner.nextByte();
		MyView.Slider_D = slider_scan_D;
		
		if (MyView.Slider_E != 0) {
			System.out.println("Set " + MyView.Slider_E_lable + " (1-5):");
			byte slider_scan_E = scanner.nextByte();
			MyView.Slider_E = slider_scan_E;
		}
		
		if (MyView.Slider_F != 0) {
			System.out.println("Set Graphic rate (1-5)");
			byte slider_scan_F = scanner.nextByte();
			MyView.Slider_F = slider_scan_F;
		}
				
		//set controller search parameters
		Button_next_search next_search = new Button_next_search();
		next_search.setSlider_A(MyView.Slider_A);
		next_search.setSlider_B(MyView.Slider_B);
		next_search.setSlider_C(MyView.Slider_C);
		next_search.setSlider_D(MyView.Slider_D);
		next_search.setSlider_E(MyView.Slider_E);
		next_search.setSlider_F(MyView.Slider_F);
		
		//Pull Result's
				next_search.DB_Pull(MyView.Slider_E_lable);
				
				
				if (MyView.getRadio_basic() == 1) {
					lap3.print();
				}
				if (MyView.getRadio_level_I() == 1) {

				}
				if (MyView.getRadio_level_II() == 1) {
					graph22.print();
					graph23.print();
				}
				if (MyView.getRadio_level_III() == 1) {

				}
		
		//choose laptop from list:				
				do {
					System.out.println("Choose laptop from list or 0 to set attribute (0-1):");
					Select = scanner.nextByte();

					switch(Select) {
					case 1:
						if (level == 0)
						lap3.print_page();
						if (level == 2)
							graph22.print_page();
						break;
						
					case 2:

						if (level == 0);
						if (level == 2)
							graph23.print_page();
						break;
					default:
						break;
					}
				} while(Select != 0);
				System.out.println("end");
	}
}
