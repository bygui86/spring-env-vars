package com.rabbit.samples.springenvvars.integrations;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource("classpath:application-test.properties")
public class SpringEnvVarsIntegrationTest {

	@Value("${property.classical:TEST}")
	String classical;

	@Value("${property.env.var.home}")
	String envVarHome;

	@Value("${property.env.var.path}")
	String envVarPath;

	@Value("${property.env.var.spring}")
	String envVarSpring;

	@Value("${property.env.var.docker}")
	String envVarDocker;

	@Value("${property.env.var.kube}")
	String envVarKube;


	@Test
	public void environmentVariablesTest() {

		Assert.assertEquals("classical", classical);
		Assert.assertNotEquals("TEST", envVarHome);
		Assert.assertNotEquals("TEST", envVarPath);
		Assert.assertEquals("TEST", envVarSpring);
		Assert.assertEquals("TEST", envVarDocker);
		Assert.assertEquals("TEST", envVarKube);
	}

}
