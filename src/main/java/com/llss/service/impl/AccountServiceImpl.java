package com.llss.service.impl;

import com.llss.dao.AccountDao;
import com.llss.domain.Account;
import com.llss.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

/**
 * Created by apple on 2019/7/15.
 */
@Service("AccountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查找所有账户");
        List<Account> list = accountDao.findAll();
        System.out.println("业务层："+list);
        return list;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户");
        accountDao.saveAccount(account);
    }
}
