package TopLaptops;

import static org.junit.Assert.assertArrayEquals;

import org.junit.*;

import TopLaptops.view.view;


public class LogicClassTest {
   @Test
   public static void testPreFilter(view MyView, int level) {
	   if (level == 0) {
		   Assert.assertEquals(MyView.getRadio_basic(), 1);
		   Assert.assertEquals(MyView.getRadio_level_I(), 0);
		   Assert.assertEquals(MyView.getRadio_level_II(), 0);
		   Assert.assertEquals(MyView.getRadio_level_III(), 0);
	   }
	   else if (level == 1) {
		   Assert.assertEquals(MyView.getRadio_basic(), 0);
		   Assert.assertEquals(MyView.getRadio_level_I(), 1);
		   Assert.assertEquals(MyView.getRadio_level_II(), 0);
		   Assert.assertEquals(MyView.getRadio_level_III(), 0);
	   }
	   else if (level == 2) {
		   Assert.assertEquals(MyView.getRadio_basic(), 0);
		   Assert.assertEquals(MyView.getRadio_level_I(), 0);
		   Assert.assertEquals(MyView.getRadio_level_II(), 1);
		   Assert.assertEquals(MyView.getRadio_level_III(), 0);
	   }
	   else if (level == 3) {
		   Assert.assertEquals(MyView.getRadio_basic(), 0);
		   Assert.assertEquals(MyView.getRadio_level_I(), 0);
		   Assert.assertEquals(MyView.getRadio_level_II(), 0);
		   Assert.assertEquals(MyView.getRadio_level_III(), 1);
	   }
      System.out.println("\n(***Junit test is done!)\n");
   }
}

