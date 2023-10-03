package com.plume.service;

import com.plume.dto.DishDTO;
import com.plume.dto.DishPageQueryDTO;
import com.plume.result.PageResult;

import java.util.List;

public interface DishService {


    /**
     * 新增菜品以及对应的口味
     * @param dishDTO
     */
    void saveWithFlavor(DishDTO dishDTO);

    /**
     * 菜品分页查询
     * @param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 菜品批量删除
     * @param ids
     */
    void deleteBatch(List<Long> ids);
}
