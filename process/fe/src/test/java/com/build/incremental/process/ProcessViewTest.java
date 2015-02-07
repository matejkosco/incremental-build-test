package com.build.incremental.process;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ProcessViewTest {

    @Test
    public void testRender() throws Exception {
        ProcessView view = new ProcessView();
        String renderedView = view.render();

        assertTrue(renderedView.startsWith("NEW PROCESS INSTANCE ID: "));
    }
}