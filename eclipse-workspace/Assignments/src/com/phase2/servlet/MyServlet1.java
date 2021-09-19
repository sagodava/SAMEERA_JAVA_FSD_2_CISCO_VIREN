package com.phase2.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class MyServlet1 extends HttpServlet {
   
	public void doGet(HttpServletRequest request, HttpServletResponse response){
     try{
      response.setContentType("text/html");
      PrintWriter pwriter = response.getWriter();

      String name = request.getParameter("userName");
      String password = request.getParameter("userPassword");
      
      pwriter.print("Hello "+name);
    //  pwriter.print("Your Password is: "+password);
      
      HttpSession session=request.getSession(); 
      
      session.setAttribute("uname",name);
      session.setAttribute("upass",password);
     // session.setMaxInactiveInterval(2000); 
     
     // pwriter.print("<a href='welcome'>Info</a>");
      HttpSession session1=request.getSession();
      pwriter.print("<br>");
      pwriter.print("session creation time" + session1.getCreationTime());
      pwriter.print("<br>");
      pwriter.print("session last accessed time" +session1.getLastAccessedTime());
      pwriter.print("<br>");
      pwriter.print("session max interval time" +session1.getMaxInactiveInterval());
      pwriter.print("<br>");
      pwriter.print("session servelt context" +session1.getServletContext());
      pwriter.print("<a href='welcome'>Info</a>");
      session1.invalidate();
      pwriter.close();
    }catch(Exception exp){
       System.out.println(exp);
     }
  }
}