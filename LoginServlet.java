import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    // Simulating a basic in-memory username and password check
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve username and password from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Set content type for the response
        response.setContentType("text/html");

        // Get the PrintWriter to write the response
        PrintWriter out = response.getWriter();

        // Validate user credentials
        if (username != null && password != null && username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            // If credentials are correct, display a welcome message
            out.println("<h2>Welcome, " + username + "!</h2>");
        } else {
            // If credentials are incorrect, show an error message
            out.println("<h2>Invalid credentials. Please try again.</h2>");
        }
    }
}
