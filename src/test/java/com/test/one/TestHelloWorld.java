package com.test.one;
/*package com.test.one;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
*/

import org.testng.annotations.Test;

import Test.RandomEmailGenerator;
import junit.framework.Assert;

public class TestHelloWorld {

    @Test()
    public void testEmailGenerator() {

        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();

        //≈–∂œ «∑Ò «ø’(≤‚ ‘∂œ—‘)
        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yiibai.com");

    }

}