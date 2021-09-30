package com.moglix.catalogproject.service;

import com.moglix.catalogproject.dto.Catalog;

public interface CatalogService {
	public String  addcatalog(Catalog catalog) ;
	public String updateCatalog(String id, Catalog catalog);
	
	public Catalog getCatalogById(String id);
	public void deleteCatalogById(String id);
	public Catalog[] getallCatalog();
	public void deleteAllCatalog();
	
	

	}
	

