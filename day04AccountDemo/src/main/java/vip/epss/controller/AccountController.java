package vip.epss.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.domain.Account;
import vip.epss.service.AccountService;

//Account的controller,
@Controller
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Test
    public void testTranser(){
        Account zs = new Account(1, "zs", 999.99);
        Account ls = new Account(2, "ls", 9.99);
        if(accountService.transfer(zs,ls)){
            System.out.println("转账成功");
        }else{
            System.out.println("转账失败");
        }
    }
}
