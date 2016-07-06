package com.solr.search.api;

public interface Search<T> {
	public T ping(T value);
}
