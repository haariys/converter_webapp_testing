package xyz1;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class TimeTestCase {
	String[] values = {"-1","0","1","100","999999","100000","100001"};
	@Test
	public void TestTime0()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"-1",
				"-0.001",
				"-0.000001",
				"-1.6666666666666667e-8",
				"-2.7777777777777777e-10",
				"-1.1574074074074074e-11",
				"-1.6534391534391534e-12",
				"-3.8051750380517506e-13",
				"-3.1709791983764584e-14",};
		String[] t1 = obj.getTime(values[0]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestTime1()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"0",
				"0",
				"0",
				"0",
				"0",
				"0",
				"0",
				"0",
				"0"};
		String[] t1 = obj.getTime(values[1]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestTime2()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"1",
				"0.001",
				"0.000001",
				"1.6666666666666667e-8",
				"2.7777777777777777e-10",
				"1.1574074074074074e-11",
				"1.6534391534391534e-12",
				"3.8051750380517506e-13",
				"3.1709791983764584e-14",};
		String[] t1 = obj.getTime(values[2]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestTime3()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100",
				"0.1",
				"0.0001",
				"0.0000016666666666666667",
				"2.7777777777777777e-8",
				"1.1574074074074074e-9",
				"1.6534391534391534e-10",
				"3.80517503805175e-11",
				"3.1709791983764588e-12",};
		String[] t1 = obj.getTime(values[3]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestTime4()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"999999",
				"999.999",
				"0.999999",
				"0.01666665",
				"0.0002777775",
				"0.0000115740625",
				"0.0000016534375",
				"3.8051712328767125e-7",
				"3.17097602739726e-8",};
		String[] t1 = obj.getTime(values[4]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestTime5()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100000",
				"100",
				"0.1",
				"0.0016666666666666668",
				"0.00002777777777777778",
				"0.0000011574074074074074",
				"1.6534391534391535e-7",
				"3.80517503805175e-8",
				"3.1709791983764586e-9",};
		String[] t1 = obj.getTime(values[5]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestTime6()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100001",
				"100.001",
				"0.100001",
				"0.0016666833333333333",
				"0.000027778055555555555",
				"0.0000011574189814814815",
				"1.6534556878306878e-7",
				"3.805213089802131e-8",
				"3.1710109081684425e-9",};
		String[] t1 = obj.getTime(values[6]);
	assertArrayEquals(Arr,t1);
	}
			
		
		
	}

