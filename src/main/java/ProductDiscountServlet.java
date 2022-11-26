import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet", value = "/product")
public class ProductDiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        double discountAmount, newPrice;
        discountAmount =  price * percent * 0.01;
        newPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>Product description: " + description + "</h1>" );
        writer.println("<h1>List price: " + price + "</h1>" );
        writer.println("<h1>Discount percent: " + percent + "</h1>" );
        writer.println("<h1>Discount amount: " + discountAmount + "</h1>" );
        writer.println("<h1>New price: " + newPrice + "</h1>" );
        writer.println("</html></body>");

    }
}
