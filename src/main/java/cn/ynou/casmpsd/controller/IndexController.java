package cn.ynou.casmpsd.controller;



import org.jasig.cas.client.authentication.AttributePrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    HttpServletRequest request;

    AttributePrincipal principal;
    Map attributes;

    @GetMapping(value = "/")
    public String index(Model model) {
        principal = (AttributePrincipal) request.getUserPrincipal();
        attributes = principal.getAttributes();
        model.addAttribute("attributes", attributes);
        return "index";
    }

    @GetMapping(value = "/bxtx")
    public String bxtx(Model model){
        principal = (AttributePrincipal) request.getUserPrincipal();
        attributes = principal.getAttributes();
        model.addAttribute("attributes", attributes);
        return "bxtx";
    }

    @GetMapping(value = "/bxgm")
    public String bxgm(Model model){
        principal = (AttributePrincipal) request.getUserPrincipal();
        attributes = principal.getAttributes();
        model.addAttribute("attributes", attributes);
        return "bxgm";
    }

    @GetMapping(value = "/cgb")
    public String cgb(Model model){
        principal = (AttributePrincipal) request.getUserPrincipal();
        attributes = principal.getAttributes();
        model.addAttribute("attributes", attributes);
        return "cgb";
    }

    @GetMapping(value = "/gbzx")
    public String gbzx(Model model){
        principal = (AttributePrincipal) request.getUserPrincipal();
        attributes = principal.getAttributes();
        model.addAttribute("attributes", attributes);
        return "gbzx";
    }



}
