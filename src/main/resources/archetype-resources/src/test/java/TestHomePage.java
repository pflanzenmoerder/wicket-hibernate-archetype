package ${groupId};

import javax.persistence.Temporal;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Simple test using the WicketTester
 */
@Ignore
public class TestHomePage
{
	private WicketTester tester;

	@BeforeClass
	public void setUp()
	{
		tester = new WicketTester(new WicketApplication());
	}
	
	@Test
	public void testRenderMyPage()
	{
		//start and render the test page
		tester.startPage(HomePage.class);

		//assert rendered page class
		tester.assertRenderedPage(HomePage.class);

		//assert rendered label component
		tester.assertLabel("message", "If you see this message wicket is properly configured and running");
	}
}
