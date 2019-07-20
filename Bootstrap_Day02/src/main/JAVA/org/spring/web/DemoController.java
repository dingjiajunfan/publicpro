package org.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
/*服务器允许任何来源访问的资源*/
@CrossOrigin(value = "*")
public class DemoController {

    @RequestMapping("index")
    @ResponseBody
    public List<Map<String, Object>> index(){
        List<Map<String, Object>> arr = new ArrayList<>();
        Map<String, Object> hm = new HashMap<>();
        hm.put("hello", "hellp");
        Map<String, Object> hm1 = new HashMap<>();
        hm1.put("hello", "hellp");
        Map<String, Object> hm2 = new HashMap<>();
        hm2.put("hello", "hellp");
        arr.add(hm);
        arr.add(hm1);
        arr.add(hm2);
        return arr;
    }

}
