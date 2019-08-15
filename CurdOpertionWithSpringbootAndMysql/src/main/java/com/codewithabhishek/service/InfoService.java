package com.codewithabhishek.service;


import com.codewithabhishek.bean.InfoBean;
import com.codewithabhishek.repo.InfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class InfoService {



    @Autowired
    private InfoRepo inforepo;

    public void save(InfoBean infobean){

        inforepo.save(infobean);
    }

    public List<InfoBean> listAll(){

        return inforepo.findAll();
    }


    public InfoBean editdata(int id){

        return inforepo.findById(id).get();
    }


      public void delete(int id){

        inforepo.deleteById(id);
      }


}
