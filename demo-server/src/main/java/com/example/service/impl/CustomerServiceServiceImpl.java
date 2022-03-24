package com.example.service.impl;

import com.example.entity.CustomerService;
import com.example.mapper.CustomerServiceMapper;
import com.example.service.ICustomerServiceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author donghui
 * @since 2022-03-23
 */
@Service
public class CustomerServiceServiceImpl extends ServiceImpl<CustomerServiceMapper, CustomerService> implements ICustomerServiceService {

}
