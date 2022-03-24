package com.example.service.impl;

import com.example.entity.SignIn;
import com.example.mapper.SignInMapper;
import com.example.service.ISignInService;
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
public class SignInServiceImpl extends ServiceImpl<SignInMapper, SignIn> implements ISignInService {

}
