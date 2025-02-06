package com.dao;

import com.entity.BaoxiaoshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxiaoshenqingVO;
import com.entity.view.BaoxiaoshenqingView;


/**
 * 报销申请
 * 
 * @author 
 * @email 
 * @date 2021-03-18 19:38:53
 */
public interface BaoxiaoshenqingDao extends BaseMapper<BaoxiaoshenqingEntity> {
	
	List<BaoxiaoshenqingVO> selectListVO(@Param("ew") Wrapper<BaoxiaoshenqingEntity> wrapper);
	
	BaoxiaoshenqingVO selectVO(@Param("ew") Wrapper<BaoxiaoshenqingEntity> wrapper);
	
	List<BaoxiaoshenqingView> selectListView(@Param("ew") Wrapper<BaoxiaoshenqingEntity> wrapper);

	List<BaoxiaoshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiaoshenqingEntity> wrapper);
	
	BaoxiaoshenqingView selectView(@Param("ew") Wrapper<BaoxiaoshenqingEntity> wrapper);
	
}
