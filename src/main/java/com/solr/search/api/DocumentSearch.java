package com.solr.search.api;

public class DocumentSearch<T> implements Search<T> {

	public T ping(T value) {
		return value;
	}

}
