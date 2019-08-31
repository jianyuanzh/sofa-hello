package cc.databus.service;

import cc.databus.service.impl.SampleJvmServiceImpl;
import com.alipay.sofa.runtime.api.aware.ClientFactoryAware;
import com.alipay.sofa.runtime.api.client.ClientFactory;
import com.alipay.sofa.runtime.api.client.ServiceClient;
import com.alipay.sofa.runtime.api.client.param.ServiceParam;

/**
 * 使用API方式发布服务
 *
 * @author jianyuan
 * @version $Id: PublisServiceWithClient.java, v0.1 2019-08-31 10:31 PM by jianyuan
 */
public class PublisServiceWithClient implements ClientFactoryAware {

    private ClientFactory clientFactory;

    public void init() {
        ServiceClient serviceClient = clientFactory.getClient(ServiceClient.class);
        ServiceParam serviceParam = new ServiceParam();
        serviceParam.setInstance(new SampleJvmServiceImpl("Hello, jvm service (service client implement)"));
        serviceParam.setUniqueId("serviceClientImpl");
        serviceClient.service(serviceParam);
    }

    @Override
    public void setClientFactory(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

}
