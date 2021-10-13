package incubyte;
public class StringCalculatorTesting {
    StringCalculator calc = new StringCalculator();

	//@Test
	void test1_1(){
		try {
		//Empty String test case
		assertEquals(0, calc.Add(""));
		}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	private void assertEquals(int i, int add) {
    }

    //Test
	void test1_2() {
		try {
		//Single element and 2 element string test case
		assertEquals(1, calc.Add("1"));
		assertEquals(2, calc.Add("2"));
		assertEquals(3, calc.Add("1,2"));
		assertEquals(5, calc.Add("2,3"));
		}catch(Exception e) {
    		e.printStackTrace();
    	}
	}

	//@Test
	void test2() {
		try {
		//Unknown number of elements
		assertEquals(6,  calc.Add("1,2,3"));
		assertEquals(10, calc.Add("1,2,3,4"));
		assertEquals(14, calc.Add("2,3,4,5"));
		assertEquals(42, calc.Add("2,4,6,8,10,12"));
		}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//@Test
	void test3(){
		try {
		//Handle new lines between numbers
		assertEquals(6,  calc.Add("1\n2,3"));
		assertEquals(10, calc.Add("1,2\n3,4"));
		assertEquals(10, calc.Add("1,2,3\n4"));
		assertEquals(14, calc.Add("2\n3,4,5"));
		}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//@Test
	void test4(){
		try {
		//Support Different Delimiters
		assertEquals(3, calc.Add("//;\n1;2"));
		assertEquals(6, calc.Add("//:\n1:2:3"));
		assertEquals(10,calc.Add("//'\n1'2'3'4"));
		assertEquals(3, calc.Add("// \n1 2"));
		}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//@Test 
	void test5() {
		try {
		//Handling Negative values
		assertEquals(1, calc.Add("1,-2"));
		assertEquals(1, calc.Add("1,-2,-3"));
		}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//@Test 
	void test6() {
		try {
		//Handling multiple Negative values
		assertEquals(0, calc.Add("-1,-2"));
		assertEquals(1, calc.Add("1,-2,-3"));
		}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	

   // @Test
    void test7(){
    	try {
        assertEquals(0, calc.calculateCount());
//        C.Add("12");
//        assertEquals(1, C.calculateCount());
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }

	//@Test 
	void test8(){
		try {
		//Handling numbers greater than 1000
		assertEquals(1, calc.Add("1,1001"));
		assertEquals(1, calc.Add("1,-2,5050"));
		assertEquals(3, calc.Add("1,1001,2,2000"));
		assertEquals(0, calc.Add("9000"));
		}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//@Test
	void test10() {
		try {
		//Support Different Delimiters
		assertEquals(100, calc.Add("//[***]\n1***2***3"));
		}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
   // @Test
    void test11_12() {
    	try {
    		//For multiple delimiters
            assertEquals(6,  calc.Add("//[--][++]\n1--2++3"));
            assertEquals(10, calc.Add("//[***][##]\n5##2***3"));
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }	
}
		


    

