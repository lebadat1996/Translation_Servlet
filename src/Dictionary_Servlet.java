import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = " Dictionary_Servlet",urlPatterns = "/dictionary")
public class Dictionary_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        Map<String, String> Dictionary = new HashMap<>();
        Dictionary.put("Name", "Ten");
        Dictionary.put("Class", "Lop");
        Dictionary.put("student", "hoc sinh");
        Dictionary.put("hello", "Xin chao");
        Dictionary.put("how", "The nao");
        Dictionary.put("book", "Quyen vo");
        Dictionary.put("computer", "May tinh");

        String search = request.getParameter("textSearch");

        PrintWriter printWriter = response.getWriter();

        printWriter.println("<html>");
        String result = Dictionary.get(search);
        if (request != null) {
            printWriter.println(result);
        }else {
            printWriter.println("xin moi ban nhap lai");
        }
        printWriter.println("</html>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
