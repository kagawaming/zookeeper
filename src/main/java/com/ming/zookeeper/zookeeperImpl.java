package com.ming.zookeeper;
import com.linkedin.d2.balancer.util.LoadBalancerClientCli;

import java.io.File;

/**
 * Created by mqiu on 8/23/17.
 */
public class zookeeperImpl {
    public static void main(String[] args) throws Exception {
        final int discoveryResult = LoadBalancerClientCli.runDiscovery(
                "localhost:2181",
                "/d2",
                new File("/Users/mqiu/Desktop/sysD/zookeeper/src/main/java/com/ming/zookeeper/d2StaticConfigFile.json"));

    }
}
