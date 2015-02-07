package com.build.incremental.process;

import com.build.incremental.core.CoreService;
import com.build.incremental.core.CoreView;

import java.util.ServiceLoader;

/**
 * @author Matej Kosco
 */
public class ProcessView extends CoreView {

    private CoreService coreService;
    private ProcessService processService;

    public ProcessView() {
        ServiceLoader<CoreService> coreServiceLoader = ServiceLoader.load(CoreService.class);
        coreService = coreServiceLoader.iterator().next();

        ServiceLoader<ProcessService> processServiceLoader = ServiceLoader.load(ProcessService.class);
        processService = processServiceLoader.iterator().next();
    }

    @Override
    public String render() {
        String result = "New Process Instance ID: ";

        ProcessInstanceDTO dto = processService.startProcess(Process.TEST_PROCESS);
        result += dto.getId();

        return coreService.coreMethod(result);
    }
}
