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
	

    }	
}
		


    

