package xyz1;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class VolumeTestCase {
	String[] values = {"-1","0","1","100","999999","100000","100001"};
	@Test
	public void TestVolume0()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"-1",
				"-1",
				"-0.004226752837730375",
				"-0.0021133764188651875",
				"-0.001",
				"-0.00026417205235814843",
				"-0.000006289810770352982",
				"-0.000001",
				"-1e-15",};
		String[] t1 = obj.getVolume(values[0]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestVolume1()
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
		String[] t1 = obj.getVolume(values[1]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestVolume2()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"1",
				"1",
				"0.004226752837730375",
				"0.0021133764188651875",
				"0.001",
				"0.00026417205235814843",
				"0.000006289810770352982",
				"0.000001",
				"1e-15",};
		String[] t1 = obj.getVolume(values[2]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestVolume3()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100",
				"100",
				"0.4226752837730375",
				"0.21133764188651874",
				"0.1",
				"0.026417205235814843",
				"0.0006289810770352982",
				"0.0001",
				"1e-13",};
		String[] t1 = obj.getVolume(values[3]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestVolume4()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"999999",
				"999999",
				"4226.748610977537",
				"2113.3743054887686",
				"999.999",
				"264.1717881860961",
				"6.2898044805422115",
				"0.999999",
				"9.99999e-10",};
		String[] t1 = obj.getVolume(values[4]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestVolume5()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100000",
				"100000",
				"422.67528377303745",
				"211.33764188651872",
				"100",
				"26.41720523581484",
				"0.6289810770352982",
				"0.1",
				"1e-10",};
		String[] t1 = obj.getVolume(values[5]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestVolume6()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100001",
				"100001",
				"422.67951052587523",
				"211.33975526293762",
				"100.001",
				"26.417469407867202",
				"0.6289873668460685",
				"0.100001",
				"1.00001e-10",};
		String[] t1 = obj.getVolume(values[6]);
	assertArrayEquals(Arr,t1);
	}
			
		
		
	}

