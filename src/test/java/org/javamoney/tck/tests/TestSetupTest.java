package org.javamoney.tck.tests;

import static org.junit.Assert.*;

import org.javamoney.tck.TCKTestSetup;
import org.jboss.test.audit.annotations.SpecAssertion;
import org.jboss.test.audit.annotations.SpecVersion;
import org.junit.Test;

@SpecVersion(spec = "JSR 354", version = "1.0.0")
public class TestSetupTest {

	@SpecAssertion(
		section = "0",
		id = "EnsureSetup")
	@Test
	public void testTestSetup() {
		assertTrue("TCK Configuration not available.",
				TCKTestSetup.getTestConfiguration() != null);
		assertNotNull(TCKTestSetup.getTestConfiguration());
	}


	@SpecAssertion(
		section = "0",
		id = "EnsureAdjusterSetup")
	@Test
	public void testOperatorTestSetup() {
		fail("not implemented");
//		assertNotNull(TCKTestSetup.getTestConfiguration().getOperators());
//		assertFalse(TCKTestSetup.getTestConfiguration().getOperators()
//				.isEmpty());
	}

	@SpecAssertion(
		section = "0",
		id = "EnsureQuerySetup")
	@Test
	public void testQueryTestSetup() {
		fail("not implemented");
		// assertNotNull(TCKTestSetup.getTestConfiguration().getQueries());
		// assertFalse(TCKTestSetup.getTestConfiguration().getQueries().isEmpty());
	}
}
