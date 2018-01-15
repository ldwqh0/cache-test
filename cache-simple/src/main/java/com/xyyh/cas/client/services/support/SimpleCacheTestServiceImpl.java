package com.xyyh.cas.client.services.support;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.xyyh.cas.client.services.CacheTestService;

@Service
public class SimpleCacheTestServiceImpl implements CacheTestService {
	private static final Logger logger = LoggerFactory.getLogger(SimpleCacheTestServiceImpl.class);

	@Autowired
	private CacheManager cacheManager;

	@Override
	@Cacheable(cacheNames = "test")
	public String get(String id) {
		// 记录数据产生的时间，用于测试对比
		long time = new Date().getTime();
		// 打印使用到的cacheManager
		logger.info("The cacheManager is" + cacheManager);
		// 当数据不是从cache里面获取时，打印日志
		logger.info("Get value by id=" + id + ", The time is " + time);
		return "Get value by id=" + id + ", The time is " + time;
	}

}
