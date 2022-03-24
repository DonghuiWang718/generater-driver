package com.example.service.impl;

import com.example.entity.ItemType;
import com.example.mapper.ItemTypeMapper;
import com.example.service.IItemTypeService;
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
public class ItemTypeServiceImpl extends ServiceImpl<ItemTypeMapper, ItemType> implements IItemTypeService {

}
