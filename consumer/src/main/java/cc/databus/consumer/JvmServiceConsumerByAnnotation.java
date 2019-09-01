package cc.databus.consumer;

import cc.databus.facade.SampleJvmService;
import com.alipay.sofa.runtime.api.annotation.SofaReference;

/**
 * 使用注解方式引用服务
 *
 * @author jianyuan
 * @version $Id: JvmServiceConsumerByAnnotation.java, v0.1 2019-08-31 10:40 PM by jianyuan
 */
public class JvmServiceConsumerByAnnotation {

    @SofaReference(uniqueId = "annotationImpl")
    private SampleJvmService sampleJvmServiceAnnotationImpl;

    public void init() {
        sampleJvmServiceAnnotationImpl.message();
    }

}
