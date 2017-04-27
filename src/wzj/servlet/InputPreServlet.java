package wzj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wzj.service.IAreaService;
import wzj.util.factory.Factory;

@SuppressWarnings("serial")
@WebServlet("/inputpre")
public class InputPreServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		IAreaService areaService=Factory.getServiceInstance("area.service") ;
		try {
			request.setAttribute("allAreas", areaService.list());
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/input.jsp").forward(request, response);
	}
	
}
