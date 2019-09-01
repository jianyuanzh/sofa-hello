package cc.databus.service;

import cc.databus.facade.SampleJvmService;
import com.alipay.sofa.runtime.api.annotation.SofaService;

/**
 * @author jianyuan
 * @version $Id: SampleJvmServiceAnnotationImpl.java, v0.1 2019-08-31 12:26 PM by jianyuan
 */
@SofaService(uniqueId = "annotationImpl")
public class SampleJvmServiceAnnotationImpl implements SampleJvmService {
    @Override
    public String message() {
        String message = "Hello, jvm service annotation implementation";
        System.out.println(message);
        return message;
    }
}
