
package com.study.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.study.dto.Category;
import com.study.dao.CategoryDAO;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{

	private static List<Category> categories= new ArrayList<>();
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setDescription("This is television");
		category.setActive(true);
		category.setName("Telivision");
		category.setImgUrl("CAT1.png");
		categories.add(category);
		Category category2 = new Category();
		category2.setId(2);
		category2.setDescription("This is modbile");
		category2.setActive(true);
		category2.setName("Mobile");
		category2.setImgUrl("mob.png");
		categories.add(category2);
		Category category3 = new Category();
		category3.setId(3);
		category3.setDescription("This is latop");
		category.setActive(true);
		category3.setName("Laptop");
		category3.setImgUrl("laptop.png");
		categories.add(category3);
		
		
	}
	@Override
	public List<Category> list() {
		return categories;
		
}
	@Override
	public Category get(int id) {
		for(Category cat : categories) {
			if(cat.getId()==id)return cat;
		}
		return null;
	}

}
