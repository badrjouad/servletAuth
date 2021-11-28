package com.supmti.servlets;

import com.supmti.DAO.UserDAO;
import com.supmti.database.DatabaseConnection;
import com.supmti.entities.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@WebServlet(name = "loginServlet", value = "/loginServlet",
        initParams =
                {
                        @WebInitParam(name = "email", value = "omar@gmail.com;az@gmail.com"),
                        @WebInitParam(name = "password", value = "OMAR;AZ")

                }
)
public class LoginServlet extends HttpServlet {


    private List<String> emails;
    private List<String> passwords;

    public void init() {
        emails = Arrays.asList(getServletConfig().getInitParameter
                ("email").split(";"));
        passwords = Arrays.asList(getServletConfig().getInitParameter
                ("password").split(";"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String emailJSP = request.getParameter("email");
        String passwordJSP = request.getParameter("password");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        boolean found = false;
        int index ;
        for (String email : emails) {
            if (emailJSP.equals(email) ) {
                index= emails.indexOf(email);
                found =true;
                if(passwordJSP.equals(passwords.get(index)))

                out.println("<h1>" + "YOU HAVE SUCCESEFULLY CONNECTED !! " + "</h1>");
                else{
                    out.println("<h1>" + "PASSWORD FAILED" + "</h1>");
                }
                break;


            }
        }
        if(found==false)
        {
            out.println("<h1>" + "THERE IS NO  USER REGISTRED WITH THIS EMAIL  " + "</h1>");
        }
        out.println("</body></html>");
    }

}
