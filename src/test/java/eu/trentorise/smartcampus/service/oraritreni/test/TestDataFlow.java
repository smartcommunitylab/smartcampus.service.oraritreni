package eu.trentorise.smartcampus.service.oraritreni.test;

import it.sayservice.platform.servicebus.test.DataFlowTestHelper;

import java.util.HashMap;
import java.util.Map;

import eu.trentorise.smartcampus.service.oraritreni.impl.GetOrariTreniDataFlow;

import junit.framework.TestCase;

public class TestDataFlow extends TestCase {
	public void testRun() throws Exception {
		DataFlowTestHelper helper = new DataFlowTestHelper();
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("stazione", "trento");
		Map<String, Object> out = helper.executeDataFlow("smartcampus.service.oraritreni", "GetOrariTreni", new GetOrariTreniDataFlow(), parameters);
		System.err.println(out);
		
	}
}
