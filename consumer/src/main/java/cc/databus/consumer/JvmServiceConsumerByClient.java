package cc.databus.consumer;

import cc.databus.facade.SampleJvmService;
import com.alipay.sofa.runtime.api.aware.ClientFactoryAware;
import com.alipay.sofa.runtime.api.client.ClientFactory;
import com.alipay.sofa.runtime.api.client.ReferenceClient;
import com.alipay.sofa.runtime.api.client.param.ReferenceParam;

/**
 * @author jianyuan
 * @version $Id: JvmServiceConsumerByClient.java, v0.1 2019-08-31 10:44 PM by jianyuan
 */
public class JvmServiceConsumerByClient implements ClientFactoryAware {

    private ClientFactory clientFactory;

    public void init() {
        ReferenceClient referenceClient = clientFactory.getClient(ReferenceClient.class);
        ReferenceParam<SampleJvmService> referenceParam = new ReferenceParam<>();
        referenceParam.setInterfaceType(SampleJvmService.class);
        referenceParam.setUniqueId("serviceClientImpl");
        SampleJvmService sampleJvmServiceImpl = referenceClient.reference(referenceParam);
        sampleJvmServiceImpl.message();
    }

    @Override
    public void setClientFactory(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }
}
