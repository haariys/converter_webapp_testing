package xyz1;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class CurrencyTestCase {
	String[] values = {"-1","0","1","100","999999","100000","100001"};
	@Test
	public void TestCurrency0()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"-1",
				"-0.5892045205465605",
				"-0.17057389640528153",
				"-0.062012380844017924",
				"-0.01200935256144383",
				"-0.011795086056723173",
				"-0.009005442971231072",
				"-0.008941783494901072",
				"-0.00835303464980766",
				"-0.007195547053723453",};
		String[] t1 = obj.getCurrency(values[0]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestCurrency1()
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
				"0","0"};
		String[] t1 = obj.getCurrency(values[1]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestCurrency2()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"1",
				"0.5892045205465605",
				"0.17057389640528153",
				"0.062012380844017924",
				"0.01200935256144383",
				"0.011795086056723173",
				"0.009005442971231072",
				"0.008941783494901072",
				"0.00835303464980766",
				"0.007195547053723453",};
		String[] t1 = obj.getCurrency(values[2]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestCurrency3()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100",
				"58.920452054656046",
				"17.057389640528154",
				"6.201238084401792",
				"1.2009352561443831",
				"1.1795086056723172",
				"0.9005442971231071",
				"0.8941783494901071",
				"0.835303464980766",
				"0.7195547053723453",};
		String[] t1 = obj.getCurrency(values[3]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestCurrency4()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"999999",
				"589203.93134204",
				"170573.72583138512",
				"62012.31883163708",
				"12009.34055209127",
				"11795.074261637115",
				"9005.433965788101",
				"8941.774553117577",
				"8353.02629677301",
				"7195.539858176399",};
		String[] t1 = obj.getCurrency(values[4]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestCurrency5()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100000",
				"58920.452054656045",
				"17057.389640528152",
				"6201.238084401793",
				"1200.935256144383",
				"1179.5086056723173",
				"900.5442971231072",
				"894.1783494901072",
				"835.303464980766",
				"719.5547053723453",};
		String[] t1 = obj.getCurrency(values[5]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestCurrency6()
	{
		SeleniumTestCases obj= new SeleniumTestCases();
		String[] Arr= {"100001",
				"58921.04125917659",
				"17057.56021442456",
				"6201.3000967826365",
				"1200.9472654969445",
				"1179.520400758374",
				"900.5533025660784",
				"894.1872912736021",
				"835.3118180154158",
				"719.561900919399",};
		String[] t1 = obj.getCurrency(values[6]);
	assertArrayEquals(Arr,t1);
	}
			
		
		
	}

