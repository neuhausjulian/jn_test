/**
  SOME GPLv3-License-Text
**/
package de.jn.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Julian Neuhaus <neuhaus.julian@gmail.com>
 * @sine 1.0.0
 */
public class TestTest
{
	@Test
	public void addTest()
	{
		final int valueOne = 3;
		final int valueTwo = 4;
		final int validResult = 7;
		
		de.jn.test.Test testInstance = new de.jn.test.Test();
		
		assertTrue(testInstance.add(valueOne, valueTwo) == validResult);
	}
	
	@Test
	public void addTestWhichWillFailByPurpose()
	{
		final int valueOne = 3;
		final int valueTwo = 4;
		final int validResult = 8;
		
		de.jn.test.Test testInstance = new de.jn.test.Test();
		
		assertTrue(testInstance.add(valueOne, valueTwo) == validResult);
	}
}
