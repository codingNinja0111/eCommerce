package com.study.dao;

import java.util.List;

import com.study.dto.Category;

public interface CategoryDAO{
	List<Category> list();
	Category get(int id);
}
