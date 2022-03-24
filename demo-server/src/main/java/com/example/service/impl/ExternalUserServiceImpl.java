package com.example.service.impl;

import com.example.entity.ExternalUser;
import com.example.mapper.ExternalUserMapper;
import com.example.service.IExternalUserService;
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
public class ExternalUserServiceImpl extends ServiceImpl<ExternalUserMapper, ExternalUser> implements IExternalUserService {

}
