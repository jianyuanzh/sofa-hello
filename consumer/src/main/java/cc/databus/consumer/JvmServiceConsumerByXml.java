package cc.databus.consumer;

import cc.databus.facade.SampleJvmService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jianyuan
 * @version $Id: JvmServiceConsumerByXml.java, v0.1 2019-09-01 8:23 AM by jianyuan
 */
public class JvmServiceConsumerByXml {

    @Autowired
    private SampleJvmService sampleJvmServiceXml;

    public void init() {
        sampleJvmServiceXml.message();
    }

}
