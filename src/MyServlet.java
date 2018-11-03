

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("firstName");
		String surname = request.getParameter("secondName");
		//String job = request.getParameter("job");
		String[] jobs = request.getParameterValues("job");
		String gender = request.getParameter("gender");
		if ( gender == null) {
			gender = "-";
		}
		String age18 = request.getParameter("age18");
		if(age18==null)
			age18 = "-";
		System.out.println(name + "-"+surname);
		
		response.setContentType("text/html;charset=UTF-8");
			
		PrintWriter out = response.getWriter();
		out.println("<h3>Профиль сотрудника</h3>");
		out.println("Имя: "+name+"<br>");
		out.println("Фамилия: "+surname+"<br>");
		out.println("Профессия: "+Arrays.deepToString(jobs)+"<br>");
		out.println("Пол: "+gender+"<br>");
		out.println("Старше 18 лет - "+age18+"<br");
		out.close();
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("firstName");
		String surname = request.getParameter("secondName");
		System.out.println(name + "-"+surname);
		
		response.setContentType("text/html;charset=UTF-8");
		
		
		PrintWriter out = response.getWriter();
		out.println("<h3>Привет от MyServlet.Post "+name+"_"+surname+"</h3><br>Again");
		out.close();
		
		//doGet(request, response);
	}

}
