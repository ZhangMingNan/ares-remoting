package ares.remoting.framework.cluster;

import ares.remoting.framework.model.ProviderService;

import java.util.List;

/**
 * @author liyebing created on 17/2/12.
 * @version $Id$
 */
public interface ClusterStrategy {

    /**
     * 负载策略算法
     *
     * @param providerServices
     * @return
     */
     ProviderService select(List<ProviderService> providerServices);
}
