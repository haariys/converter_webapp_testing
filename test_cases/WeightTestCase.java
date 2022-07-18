package xyz1;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class WeightTestCase {
	String[] values = {"-1","0","1","100","999999","100000","100001"};
	@Test
	public void TestWeight0()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"-1",
				"-0.005",
				"-0.001",
				"-0.000035273961949580415",
				"-0.000002204622621848776",
				"-0.000001",
				"-1e-9",
				"-1e-12",
				};
		String[] t1 = obj.getWeight(values[0]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestWeight1()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"0",
				"0",
				"0",
				"0",
				"0",
				"0",
				"0",
				"0"};
		String[] t1 = obj.getWeight(values[1]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestWeight2()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"1",
				"0.005",
				"0.001",
				"0.000035273961949580415",
				"0.000002204622621848776",
				"0.000001",
				"1e-9",
				"1e-12",};
		String[] t1 = obj.getWeight(values[2]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestWeight3()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100",
				"0.5",
				"0.1",
				"0.0035273961949580414",
				"0.00022046226218487759",
				"0.0001",
				"1e-7",
				"1e-10",
};
		String[] t1 = obj.getWeight(values[3]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestWeight4()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"999999",
				"4999.995",
				"999.999",
				"35.27392667561846",
				"2.204620417226154",
				"0.999999",
				"0.000999999",
				"9.99999e-7",};
		String[] t1 = obj.getWeight(values[4]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestWeight5()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100000",
				"500",
				"100",
				"3.5273961949580412",
				"0.22046226218487758",
				"0.1",
				"0.0001",
				"1e-7",};
		String[] t1 = obj.getWeight(values[5]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestWeight6()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100001",
				"500.005",
				"100.001",
				"3.527431468919991",
				"0.22046446680749943",
				"0.100001",
				"0.000100001",
				"1.00001e-7",};
		String[] t1 = obj.getWeight(values[6]);
	assertArrayEquals(Arr,t1);
	}
			
		
		
	}

