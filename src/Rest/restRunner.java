package Rest;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.support.SoapUIException;

public class restRunner {


	@Test
	public void singleTest() throws XmlException, IOException, SoapUIException {
		
		WsdlProject project = new WsdlProject("resources/Practice2-soapui-project.xml");
		WsdlTestSuite testsuite = project.getTestSuiteByName("BoardValidations");
		
		WsdlTestCase testCase= testsuite.getTestCaseByName("E2E Scripts");
		TestRunner runner = testCase.run(new PropertiesMap(), false);
		Assert.assertEquals(Status.FINISHED,runner.getStatus());
	
		
	}
	
}
