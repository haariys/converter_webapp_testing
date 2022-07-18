package xyz1;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class LengthTestCase {
	String[] values = {"-1","0","1","100","999999","100000","100001"};
	@Test
	public void TestLength0()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"-1",
				"-0.1",
				"-0.03937007874015748",
				"-0.01",
				"-0.0032808398950131233",
				"-0.0010936132983377078",
				"-0.001",
				"-0.000001",
				"-6.21371192237334e-7",};
		String[] t1 = obj.getLength(values[0]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestLength1()
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
		String[] t1 = obj.getLength(values[1]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestLength2()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"1",
				"0.1",
				"0.03937007874015748",
				"0.01",
				"0.0032808398950131233",
				"0.0010936132983377078",
				"0.001",
				"0.000001",
				"6.21371192237334e-7",};
		String[] t1 = obj.getLength(values[2]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestLength3()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100",
				"10",
				"3.937007874015748",
				"1",
				"0.32808398950131235",
				"0.10936132983377078",
				"0.1",
				"0.0001",
				"0.0000621371192237334",};
		String[] t1 = obj.getLength(values[3]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestLength4()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"999999",
				"99999.9",
				"39370.03937007874",
				"9999.99",
				"3280.836614173228",
				"1093.6122047244094",
				"999.999",
				"0.999999",
				"0.6213705708661418",};
		String[] t1 = obj.getLength(values[4]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestLength5()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100000",
				"10000",
				"3937.0078740157483",
				"1000",
				"328.0839895013123",
				"109.36132983377078",
				"100",
				"0.1",
				"0.0621371192237334",};
		String[] t1 = obj.getLength(values[5]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestLength6()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100001",
				"10000.1",
				"3937.0472440944886",
				"1000.01",
				"328.08727034120733",
				"109.36242344706912",
				"100.001",
				"0.100001",
				"0.06213774059492563",};
		String[] t1 = obj.getLength(values[6]);
	assertArrayEquals(Arr,t1);
	}
			
		
		
	}

