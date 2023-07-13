package com.fda.project.dao;

import org.springframework.data.repository.CrudRepository;

import com.fda.project.entity.OrderDetail;
import com.fda.project.entity.User;

import java.util.List;

public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {
    public List<OrderDetail> findByUser(User user);

    public List<OrderDetail> findByOrderStatus(String status);
}
