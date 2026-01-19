package cn.handyplus.region.util;

import cn.handyplus.lib.core.StrUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IpApiUtilTest {

    @Test
    public void getIpRegion() {
        // ipv4
        String ipv4 = IpApiUtil.getIpRegion("119.75.217.109");
        if (StrUtil.isNotEmpty(ipv4)) {
            Assertions.assertEquals("中国|北京市|北京|Beijing Baidu Netcom Science and Technology Co., Ltd.", ipv4);
        } else {
            System.out.println("未获取到 ipv4 地址信息，可能是因为 ip-api.com 不可用。");
        }
        // ipv6
        String ipv6 = IpApiUtil.getIpRegion("240e:e9:6002:1ac:0:ff:b07e:36c5");
        if (StrUtil.isNotEmpty(ipv6)) {
            Assertions.assertEquals("中国|北京市|北京|China Telecom", ipv6);
        } else {
            System.out.println("未获取到 ipv6 地址信息，可能是因为 ip-api.com 不可用。");
        }
    }

}
