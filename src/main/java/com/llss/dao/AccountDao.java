package com.llss.dao;

import com.llss.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by apple on 2019/7/15.
 */
@Repository
public interface AccountDao {

    @Select("select * from account")
    public List<Account> findAll();
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
}
