package com.huwa.serviceImpl;

import com.huwa.dao.ProductDao;
import com.huwa.daoImpl.ProductDaoImpl;
import com.huwa.entity.Product;
import com.huwa.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductDao productDao;

    public  ProductServiceImpl(){
         productDao = new ProductDaoImpl();
    }

    //查询总记录
    @Override
    public Long productTotal() throws Exception {
        return  productDao.productTotal();
    }

    @Override
    public List<Product> productAll(Integer pageNo, Integer pageSize) throws Exception {
         Integer start =(pageNo-1)*pageSize;
         if (start<0){

         }
        return productDao.productAll(start,pageSize);
    }

    @Override
    public Product productOne(Long id) throws Exception {
        return  productDao.productOne(id);
    }
}
