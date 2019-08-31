package cc.databus.service.impl;

import cc.databus.service.SampleJvmService;

/**
 * @author jianyuan
 * @version $Id: SampleJvmServiceImpl.java, v0.1 2019-08-21 12:06 AM by jianyuan
 */
public class SampleJvmServiceImpl implements SampleJvmService {

    private String message;

    public SampleJvmServiceImpl() {
    }

    public SampleJvmServiceImpl(String message) {
        this.message = message;
    }

    @Override
    public String message() {
        System.out.println(message);
        return message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
