package xyz1;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class EnergyTestCase {
	String[] values = {"-1","0","1","100","999999","100000","100001"};
	@Test
	public void TestEnergy0()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"-1",
				"-0.001",
				"-0.000001",
				};
		String[] t1 = obj.getEnergy(values[0]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestEnergy1()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"0",
				"0",
				"0",
				};
		String[] t1 = obj.getEnergy(values[1]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestEnergy2()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"1",
				"0.001",
				"0.000001",
				};
		String[] t1 = obj.getEnergy(values[2]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestEnergy3()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100",
				"0.1",
				"0.0001",
				};
		String[] t1 = obj.getEnergy(values[3]);
	assertArrayEquals(Arr,t1);
	}
	
	@Test
	public void TestEnergy4()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"999999",
				"999.999",
				"0.999999",
				};
		String[] t1 = obj.getEnergy(values[4]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestEnergy5()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100000",
				"100",
				"0.1",
				};
		String[] t1 = obj.getEnergy(values[5]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestEnergy6()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100001",
				"100.001",
				"0.100001",
				};
		String[] t1 = obj.getEnergy(values[6]);
	assertArrayEquals(Arr,t1);
	}
		
		
	}

