package com.build.incremental.core;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CoreServiceImplTest {

    @Test
    public void testCoreMethod() throws Exception {
        String text = "abcd";
        CoreService coreService = new CoreServiceImpl();
        assertEquals(coreService.coreMethod(text), "ABCD");
    }
}