package com.codewithabhishek.repo;

import com.codewithabhishek.bean.InfoBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface InfoRepo extends JpaRepository<InfoBean , Integer> {


}
