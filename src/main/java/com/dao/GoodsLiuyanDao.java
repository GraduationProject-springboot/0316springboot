package com.dao;

import com.entity.GoodsLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GoodsLiuyanView;

/**
 * 商品评价 Dao 接口
 *
 * @author 
 */
public interface GoodsLiuyanDao extends BaseMapper<GoodsLiuyanEntity> {

   List<GoodsLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
