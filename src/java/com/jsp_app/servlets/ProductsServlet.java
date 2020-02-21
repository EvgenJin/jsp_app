package com.jsp_app.servlets;

import com.jsp_app.models.Products;
import com.jsp_app.dao.ProductsDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProductsServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;
    
    ProductsDAO productsDAO = new ProductsDAO();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
        try {
            listProducts(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ProductsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    private void listProducts(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException, Exception {
        List<Products> listProducts = productsDAO.getAll();
        request.setAttribute("listProducts", listProducts);
        RequestDispatcher dispatcher = request.getRequestDispatcher("products.jsp");
        dispatcher.forward(request, response);
    }    
}
