package com.ss.controller;


import com.ss.Dao.UserDao;
import com.ss.pojo.Person;
import com.ss.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/taskUser")
public class UserController {

    public UserController() {
        System.out.println("创建了UserController对象");
    }

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    UserService userService; //这个名字要和刚才注入式给的一样，我猜。

    //业务方法，只要是/day2hello.action的请求，都交由HelloAction的hello方法处理
    @RequestMapping(value = "/add.action")
    public String loginMethod(Model model, Person person) throws Exception{

        System.out.println(""+person );
        int i = userService.addPerson(person);
        if(i==1){
            model.addAttribute("message",person.getId());
            return "success";
        }
        return "failure";
    }
    @RequestMapping(value = "/prepare_update.action")
    public String prepareUpdate(Model model, Person person) throws Exception{
        System.out.println(person);
        Person person1 = userService.getPersonById(person.getId());
        System.out.println("prepareUpdate() ———— 先得到该人员信息： "+person1);
        model.addAttribute("person",person1);

        return "prepareUpdate";

    }

    @RequestMapping(value = "/update.action")
    public String update(Model model, Person person) throws Exception{
        System.out.println(person);
        int i = userService.updatePerson(person);
        if(i==1) {
            logger.info("--嘿，更新成功了哦--");
        }else{
            this.failure(model);
        }
        return "welcome";
    }

    @RequestMapping(value = "/getAll.action")
    public String getAll(Model model) throws Exception{

        List list = userService.getAll();
        System.out.println("查询所有");
        model.addAttribute("allUser",list);
        return "list";

    }

    @RequestMapping(value = "/myerror")
    public String failure(Model model) throws Exception{

        logger.error("有操作发生了失败，请开发人员检测 ！");
        return "failure";
    }

    @RequestMapping(value = "/delete.action")
    public String Delete(Model model,Person person) throws Exception{
        int i = userService.deletePerson(person.getId());
        if(i==1){
            logger.info("--嘿，删除成功了--");
        }else {
            this.failure(model);
        }
        return "welcome";
    }

}
