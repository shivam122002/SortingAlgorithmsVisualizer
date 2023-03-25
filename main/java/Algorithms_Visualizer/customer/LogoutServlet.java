package Algorithms_Visualizer.customer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // invalidate the session
    HttpSession session = request.getSession();
    session.invalidate();
    // redirect the user to the login page
    response.sendRedirect(request.getContextPath() + "index.jsp");
  }
}
