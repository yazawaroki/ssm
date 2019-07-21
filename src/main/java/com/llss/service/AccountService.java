package com.llss.service;

import com.llss.domain.Account;

import java.util.List;

/**
 * Created by apple on 2019/7/15.
 */
public interface AccountService {
    public List<Account> findAll();
    public void saveAccount(Account account);
}
