package com.moglix.catalogproject.service;

import com.moglix.catalogproject.dto.Catalog;
import com.moglix.catalogproject.repository.CatalogRepository;
import com.moglix.catalogproject.repository.CatalogRepositoryImpl;

public class CatalogServiceImpl implements CatalogService {
	CatalogRepository catalogRepository=CatalogRepositoryImpl.getInstance();
	private static CatalogService catalogService;
	private CatalogServiceImpl() {
	}
	public static CatalogService getInstance() {
		if(catalogService==null) {
			catalogService=new CatalogServiceImpl();
			return catalogService;
		}else {
			return catalogService;
		}
	}

	@Override
	public String addcatalog(Catalog catalog) {
		return catalogRepository.addcatalog(catalog);
	}

	@Override
	public String updateCatalog(String id, Catalog catalog) {
		return catalogRepository.updateCatalog(id, catalog);
	}

	@Override
	public Catalog getCatalogById(String id) {
		return catalogRepository.getCatalogById(id);
	}

	@Override
	public void deleteCatalogById(String id) {
		catalogRepository.deleteCatalogById(id);
		
	}

	@Override
	public Catalog[] getallCatalog() {
		return catalogRepository.getallCatalog();
	}

	@Override
	public void deleteAllCatalog() {
		catalogRepository.deleteAllCatalog();
		
	}

}
