

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.HttpServer;
public abstract class Autorefresh extends HttpServer
{
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	   response.setIntHeader("Refresh", 5);

	   // Set response content type
	   response.setContentType("text/html");
/*
	   // Get current time
	   Calendar calendar = new GregorianCalendar();
	   calendar.get(Calendar.HOUR);
	   calendar.get(Calendar.MINUTE);
	   calendar.get(Calendar.SECOND);

		response.getWriter().append("Served at: ").append(request.getContextPath());
		   response.getWriter();
out.println("current time is:");
*/
	   Date o=new Date();
	   PrintWriter out=response.getWriter();
	   SimpleDateFormat df= new SimpleDateFormat("HH:mm:ss");
	   out.println(df.format(o));
	   }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
	



