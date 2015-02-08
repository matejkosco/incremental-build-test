package com.build.incremental.process;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

public class ProcessServiceImplTest {

    @Test
    public void testStartProcess() throws Exception {
        ProcessService service = new ProcessServiceImpl();
        ProcessInstanceDTO dto = service.startProcess(Process.TEST_PROCESS);
        assertNotNull(dto);
        assertNull(dto.getId());
    }
}