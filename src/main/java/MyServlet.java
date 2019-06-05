import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import java.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/test")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.getWriter().print(req.getParameter("parameters"));
    }

    @Override
    public  void destroy(){
        super.destroy();
    }

    @Override
    public void init() throws ServletException{
        super.init();
    }




}

