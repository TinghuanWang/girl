package com.wth.dao;

import com.wth.data.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wth on 2018/3/23.
 */
@Repository
public interface GirlRepository extends JpaRepository<Girl, Long> {


}
