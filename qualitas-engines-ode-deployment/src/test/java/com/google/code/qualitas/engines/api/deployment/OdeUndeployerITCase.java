package com.google.code.qualitas.engines.api.deployment;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.code.qualitas.engines.ode.core.OdeProcessBundle;
import com.google.code.qualitas.engines.ode.deployment.OdeUndeployer;

public class OdeUndeployerITCase {

    private static OdeProcessBundle odeProcessBundle;
    private static OdeUndeployer odeUndeployer;

    @BeforeClass
    public static void setUpClass() throws IOException {
        odeProcessBundle = new OdeProcessBundle();
        odeProcessBundle.setMainProcessName("XhHelloWorld2");
        // undeployer
        odeUndeployer = new OdeUndeployer();
        odeUndeployer
                .setDeploymentServiceEndpoint("http://localhost:9090/ode/processes/DeploymentService");
    }

    @AfterClass
    public static void tearDownClass() throws IOException {
        odeProcessBundle.cleanUp();
    }

    @Test
    public void testSetDeploymentServiceEndpoint() {
        odeUndeployer
                .setDeploymentServiceEndpoint("http://localhost:9090/ode/processes/DeploymentService");
    }

    @Test
    public void testSetDefaultDeploymentServiceEndpoint() {
        odeUndeployer
                .setDefaultDeploymentServiceEndpoint("http://localhost:9090/ode/processes/DeploymentService");
    }

    @Test
    public void testUndeploy() throws DeploymentException {
        odeUndeployer.undeploy(odeProcessBundle);
    }

}