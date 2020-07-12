package top.hanshin;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
public class MemberService implements IMemberService {
    @Value("${dubbo.protocol.port}")
    private String dubboPort;

    // 1.dubbo服务发布 采用dubbo 注解方式 使用Dubbo 提供@Service 注解进行发布服务
    // 2.Dubbo 提供@Service 将该接口注册到注册中心上去

    @Override
    public String getMemberInfo() {
        System.out.println("订单服务调用会员服务 dubbo服务端口号:" + dubboPort);
        return "订单服务调用会员服务 dubbo服务端口号:" + dubboPort;
    }
}
