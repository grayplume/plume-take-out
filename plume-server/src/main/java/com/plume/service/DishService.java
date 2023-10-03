package com.plume.service;

import com.plume.dto.DishDTO;

public interface DishService {


    /**
     * 新增菜品以及对应的口味
     * @param dishDTO
     */
    void saveWithFlavor(DishDTO dishDTO);
}
