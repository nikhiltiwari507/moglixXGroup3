package com.moglix.catalogproject.repository;

import com.moglix.catalogproject.dto.Catalog;

public class CatalogRepositoryImpl implements CatalogRepository {
	private static CatalogRepository catalogRepository;

	private CatalogRepositoryImpl() {
	}

	public static CatalogRepository getInstance() {
		if (catalogRepository == null) {
			catalogRepository = new CatalogRepositoryImpl();
			return catalogRepository;
		} else {
			return catalogRepository;
		}
	}

	private static int counter = 0;
	private Catalog catalogs[] = new Catalog[16];

	private int getIndex(String productId) {
		for (int i = 0; i < catalogs.length; i++) {
			if (catalogs[i] != null && catalogs[i].getProductId().equalsIgnoreCase(productId)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String addcatalog(Catalog catalog) {
		if (counter < catalogs.length) {
			catalogs[counter++] = catalog;
			return "Added Sccessfully";
		}
		return "Not inserted";
	}

	@Override
	public String updateCatalog(String id, Catalog catalog) {
		int index = this.getIndex(id);
		if (index != -1) {
			catalogs[index] = catalog;
			return "updated Successfully";
		}
		return "not updated";
	}

	@Override
	public Catalog getCatalogById(String id) {
		int index = this.getIndex(id);
		if (index != -1) {
			return catalogs[index];
		}
		return null;
	}

	@Override
	public void deleteCatalogById(String id) {
		int index = this.getIndex(id);
		if (index != -1) {
			catalogs[index] = null;
			System.out.println("Deleted successfully");
		}
	}

	@Override
	public Catalog[] getallCatalog() {
		return catalogs;
	}

	@Override
	public void deleteAllCatalog() {
		catalogs = null;

	}

}
