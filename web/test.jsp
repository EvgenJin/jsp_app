<%@ page contentType="text/html" %>
<%@ page import="java.sql.*" %>
<%@ page import="org.sqlite.*" %>
 
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>SQLite Demo</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Item No.</th>
                    <th>Name</th>
                </tr>
            </thead>
            <tbody>
            <%               
                Statement stmt = com.jsp_app.utils.ConnectBean.getInstance().getConnection().createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM products");                
                while (rs.next()) {
                    out.println("<tr>");
                    out.println("<td>" + rs.getString("id") + "</td>");
                    out.println("<td>" + rs.getString("serial_num") + "</td>");
                    out.println("</tr>");
                }
 
                rs.close();
//                conn.close();
            %>
            </tbody>
        </table>
    </body>
</html>