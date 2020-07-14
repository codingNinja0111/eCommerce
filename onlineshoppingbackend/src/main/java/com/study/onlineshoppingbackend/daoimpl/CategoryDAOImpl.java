
package com.study.onlineshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.study.onlineshoppingbackend.dto.Category;
import com.study.onlineshoppingbackend.dao.CategoryDAO;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{

//	private static List<Category> categories= new ArrayList<>();
//	
//	static {
//		Category category = new Category();
//		category.setId(1);
//		category.setDescription("This is television");
//		category.setActive(true);
//		category.setName("Telivision");
//		category.setImgUrl("CAT1.png");
//		categories.add(category);
//		Category category2 = new Category();
//		category.setId(2);
//		category.setDescription("This is modbile");
//		category.setActive(true);
//		category.setName("mobile");
//		category.setImgUrl("mob.png");
//		categories.add(category2);
////		Category category3 = new Category();
////		category.setId(3);
////		category.setDescription("This is latop");
////		category.setActive(true);
////		category.setName("jhjhjhj");
////		category.setImgUrl("laptop.png");
////		categories.add(category3);
//	}
	@Override
	public List<Category> list() {
		return null;
		
}

}
