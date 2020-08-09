package com.example.demo.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.entity.Pay;

@Mapper
public interface PayMapper {
	List<Pay> selectAll();
}
