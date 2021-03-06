package com.krzysztof.shop.shop.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllPanelController {

    @GetMapping("/controlPanel")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public String getControlPanel(){
        return "controlPanel";
    }
}
