package com.example.demo;

import com.example.demo.user.entity.User;
import com.example.demo.user.service.IUserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
class DemoApplicationTests {

	@Autowired
	private IUserService userService;

    @Test
    void insert() {
		List<String> cityList = Arrays.asList("北京市", "深圳市", "重庆市", "上海市", "武汉市", "成都市", "广州市");
		int initialCapacity = 10000;
		Random random = new Random();
		List<User> list = new ArrayList<>(initialCapacity);
		for (int i = 0; i < initialCapacity; i++) {
			User user = new User();
			user.setName("a_"+i);
			int index = random.nextInt(7);
			user.setCityName(cityList.get(index));
			list.add(user);

		}
		userService.saveBatch(list);
    }

}
