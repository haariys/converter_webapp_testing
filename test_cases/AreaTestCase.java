package xyz1;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class AreaTestCase {
	String[] values = {"-1","0","1","100","999999","100000","100001"};
	@Test
	public void TestArea0()
	{
		SeleniumTestCases area= new SeleniumTestCases();
		String[] Arr= {"-1",
				"-0.01",
				"-0.0015500031000062",
				"-0.000010763910416709723",
				"-0.0000011959900463010804",
				"-0.000001",
				"-1e-10",
				"-2.471053814671653e-10",
				"-3.8610215854244587e-13"};
		String[] t1 = area.getArea(values[0]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestArea1()
	{
		SeleniumTestCases area= new SeleniumTestCases();
		String[] Arr= {"0",
				"0",
				"0",
				"0",
				"0",
				"0",
				"0",
				"0",
				"0"};
		String[] t1 = area.getArea(values[1]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestArea2()
	{
		SeleniumTestCases area= new SeleniumTestCases();
		String[] Arr= {"1",
				"0.01",
				"0.0015500031000062",
				"0.000010763910416709723",
				"0.0000011959900463010804",
				"0.000001",
				"1e-10",
				"2.471053814671653e-10",
				"3.8610215854244587e-13"};
		String[] t1 = area.getArea(values[2]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestArea3()
	{
		SeleniumTestCases area= new SeleniumTestCases();
		String[] Arr= {"100",
				"1",
				"0.15500031000062",
				"0.0010763910416709723",
				"0.00011959900463010803",
				"0.0001",
				"1e-8",
				"2.4710538146716533e-8",
				"3.8610215854244583e-11"};
		String[] t1 = area.getArea(values[3]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestArea4()
	{
		SeleniumTestCases area= new SeleniumTestCases();
		String[] Arr= {"999999",
				"9999.99",
				"1550.0015500031002",
				"10.763899652799306",
				"1.195988850311034",
				"0.999999",
				"0.0000999999",
				"0.00024710513436178387",
				"3.861017724402873e-7",};
		String[] t1 = area.getArea(values[4]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestArea5()
	{
		SeleniumTestCases area= new SeleniumTestCases();
		String[] Arr= {"100000",
				"1000",
				"155.00031000062",
				"1.0763910416709723",
				"0.11959900463010803",
				"0.1",
				"0.00001",
				"0.000024710538146716532",
				"3.8610215854244584e-8",};
		String[] t1 = area.getArea(values[5]);
	assertArrayEquals(Arr,t1);
	}
	@Test
	public void TestArea6()
	{
		SeleniumTestCases area= new SeleniumTestCases();
		String[] Arr= {"100001",
				"1000.01",
				"155.00186000372003",
				"1.076401805581389",
				"0.11960020062015433",
				"0.100001",
				"0.0000100001",
				"0.000024710785252098",
				"3.861060195640313e-8",};
		String[] t1 = area.getArea(values[6]);
	assertArrayEquals(Arr,t1);
	}
			
		
		
	}

