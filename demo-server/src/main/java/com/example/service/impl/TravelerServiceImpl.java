package com.example.service.impl;

import com.example.entity.Traveler;
import com.example.mapper.TravelerMapper;
import com.example.service.ITravelerService;
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
public class TravelerServiceImpl extends ServiceImpl<TravelerMapper, Traveler> implements ITravelerService {

}
