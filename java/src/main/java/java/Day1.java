package java;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	public class testing {

		@Test
		public void demo() {
			System.out.println("Hello");
		}

		@BeforeTest
		public void demo1() {
			System.out.println("I am the first");
		}
		
		@Test
		public void demo2() {
			System.out.println("Last");
		}
		
		@Test
		public void demo3() {
			System.out.println("Last");
		}
		
		@Test
		public void demo4() {
			System.out.println("Last");
		}
		

	}
}


