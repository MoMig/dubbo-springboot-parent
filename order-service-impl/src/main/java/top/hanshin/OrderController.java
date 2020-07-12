package top.hanshin;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Reference
    private IMemberService iMemberService;
    @RequestMapping("/order")
    public String getOrderInfo(){
        return iMemberService.getMemberInfo();
    }
}
