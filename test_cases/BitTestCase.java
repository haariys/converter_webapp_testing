package xyz1;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class BitTestCase {
	String[] values = {"-1","0","1","100","999999","100000","100001"};
	@Test
	public void TestBit0()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"-1",
				"-0.125",
				"-0.0009765625",
				"-0.0001220703125",
				"-9.5367431640625e-7",
				"-1.1920928955078125e-7",
				"-9.313225746154785e-10",
				"-1.1641532182693481e-10",
				"-1.1368683772161603e-13",};
		String[] t1 = obj.getBit(values[0]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestBit1()
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
		String[] t1 = obj.getBit(values[1]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestBit2()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"1",
				"0.125",
				"0.0009765625",
				"0.0001220703125",
				"9.5367431640625e-7",
				"1.1920928955078125e-7",
				"9.313225746154785e-10",
				"1.1641532182693481e-10",
				"1.1368683772161603e-13",};
		String[] t1 = obj.getBit(values[2]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestBit3()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100",
				"12.5",
				"0.09765625",
				"0.01220703125",
				"0.000095367431640625",
				"0.000011920928955078125",
				"9.313225746154785e-8",
				"1.1641532182693481e-8",
				"1.1368683772161603e-11",};
		String[] t1 = obj.getBit(values[3]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestBit4()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"999999",
				"124999.875",
				"976.5615234375",
				"122.0701904296875",
				"0.9536733627319336",
				"0.1192091703414917",
				"0.0009313216432929039",
				"0.00011641520541161299",
				"1.1368672403477831e-7",};
		String[] t1 = obj.getBit(values[4]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestBit5()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100000",
				"12500",
				"97.65625",
				"12.20703125",
				"0.095367431640625",
				"0.011920928955078125",
				"0.00009313225746154785",
				"0.000011641532182693481",
				"1.1368683772161603e-8",};
		String[] t1 = obj.getBit(values[5]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestBit6()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100001",
				"12500.125",
				"97.6572265625",
				"12.2071533203125",
				"0.0953683853149414",
				"0.011921048164367676",
				"0.00009313318878412247",
				"0.000011641648598015308",
				"1.1368797458999325e-8",};
		String[] t1 = obj.getBit(values[6]);
	assertArrayEquals(Arr,t1);
	}
			
		
		
	}

