package com.plume.mapper;

import com.plume.annotation.AutoFill;
import com.plume.entity.Dish;
import com.plume.enumeration.OperationType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DishMapper {

    /**
     * 根据分类id查询菜品数量
     * @param categoryId
     * @return
     */
    @Select("select count(id) from dish where category_id = #{categoryId}")
    Integer countByCategoryId(Long categoryId);

    /**
     * 擦汗如菜品数据
     * @param dish
     */
    @AutoFill(value = OperationType.INSERT)
    void insert(Dish dish);
}