package com.JiraIntegration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example {

    @Test
    public void passScenario(){
        Assert.assertEquals("TestPass","TestPass");
    }
@Test
    public void failScenario(){
        Assert.assertEquals("TestPass","TestPass");
    }
}
