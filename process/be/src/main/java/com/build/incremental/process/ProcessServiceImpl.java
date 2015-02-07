package com.build.incremental.process;

/**
 * @author Matej Kosco
 */
public class ProcessServiceImpl implements ProcessService {

    private static long PROCESS_ID_COUNTER = 0;

    @Override
    public ProcessInstanceDTO startProcess(Process process) {
        ProcessInstanceDTO dto = new ProcessInstanceDTO();
        dto.setId(PROCESS_ID_COUNTER++);
        return dto;
    }
}
