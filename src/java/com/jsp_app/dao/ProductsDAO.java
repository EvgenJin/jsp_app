package com.jsp_app.dao;

import com.jsp_app.models.Products;
import com.jsp_app.utils.ConnectBean;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ProductsDAO {
    
    public List<Products> getAll() throws Exception {
        List<Products> listProducts = new ArrayList<>();         
        String sql_query = "SELECT * FROM products";         
        try (Statement stmt = ConnectBean.getInstance().getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(sql_query);
            while (rs.next()) {
                Products product = new Products();
                product.setId(rs.getInt("id"));
                product.setSerial_num(rs.getString("serial_num"));
                product.setInventory_num(rs.getString("inventory_num"));
                listProducts.add(product);
            }
            rs.close();
            ConnectBean.getInstance().getConnection().close();
        }
        return listProducts;
    }    
}
