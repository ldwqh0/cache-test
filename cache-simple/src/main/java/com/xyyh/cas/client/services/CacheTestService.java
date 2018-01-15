package com.xyyh.cas.client.services;

public interface CacheTestService {
	public String get(String id);

	public String delete(String id);

	public String save(String id, String value);

	public String update(String id, String value);
}
