package com.koreait.bknk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/map")
public class MapController {

    @GetMapping("/map")
    public void map() {
        System.out.println();
    }

}
