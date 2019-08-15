package com.codewithabhishek.main;


import com.codewithabhishek.bean.InfoBean;
import com.codewithabhishek.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {




    @Autowired
    private InfoService infoService;

    @RequestMapping("/index")
    public String index (){
        return "index";
    }

    @RequestMapping("/")
    public String addinfomation(Model model){
          InfoBean infobean = new InfoBean();
          model.addAttribute("infobean" ,infobean);
        return "new";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("infobean") InfoBean infobean) {
        infoService.save(infobean);
        return "redirect:/view";
    }

    @RequestMapping("/view")
    public String viewpage(Model model){
        List<InfoBean> infodata = infoService.listAll();
        model.addAttribute("infodata" , infodata);
        return "view";
    }



    @RequestMapping("/edit/{id}")
    public ModelAndView editdata(@PathVariable(name="id") int id){
    ModelAndView modelAndView = new ModelAndView("edit");
    InfoBean infobean = infoService.editdata(id);
    modelAndView.addObject("infobean",infobean);

    return modelAndView;
    }

    @RequestMapping("/delete/{id}")
    public String deleteinfo(@PathVariable(name="id") int id){
        infoService.delete(id);

        return "index";
    }

}
