package testing;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsExamples {

	@Test
	public void softAssert() {

		SoftAssert sa = new SoftAssert();
		System.out.println("Soft Assert Started");
		sa.assertTrue(false);
		System.out.println("Soft Assert Ended");

	}

	@Test
	public void hardAssert() {

		System.out.println("Hard Asser Started");
		Assert.assertTrue(false);
		System.out.println("Hard Assert Ended");

	}
}
