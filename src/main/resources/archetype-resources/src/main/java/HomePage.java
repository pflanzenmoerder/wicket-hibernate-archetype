package ${groupId};

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ${groupId}.entities.TestEntity;
import ${groupId}.services.HelloWorldService;
import ${groupId}.services.TestEntityBusinessService;

/**
 * Homepage
 */
public class HomePage extends WebPage {

	private static final Logger logger=LoggerFactory.getLogger(HomePage.class);
	
	private static final long serialVersionUID = 1L;

	@SpringBean
	private HelloWorldService helloWorldService;

	@SpringBean
	private TestEntityBusinessService testEntityBusinessService;
	
    /**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * @param parameters
	 *            Page parameters
	 */
    public HomePage(final PageParameters parameters) {
    	if(logger.isDebugEnabled())
    		logger.debug("creating HomePage");
        // Add the simplest type of label
        add(new Label("message", helloWorldService.getHello()));
        TestEntity testEntity=new TestEntity();
        testEntity.setName("wuhua");
        testEntityBusinessService.persistTestEntity(testEntity);
        testEntityBusinessService.getAllTestEntities();
        // TODO Add your page's components here
    }
}
