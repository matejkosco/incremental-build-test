package com.build.incremental.core;

/**
 * @author Matej Kosco
 */
public class CoreServiceImpl implements CoreService {
    @Override
    public String coreMethod(String param) {
        return param.toUpperCase();
    }
}
