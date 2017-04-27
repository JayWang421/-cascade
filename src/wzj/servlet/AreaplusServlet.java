package wzj.servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import wzj.service.IAreaplusService;
import wzj.util.factory.Factory;
import wzj.vo.Areaplus;

@SuppressWarnings("serial")
@WebServlet("/areaplus")
public class AreaplusServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		IAreaplusService areaplusService=Factory.getServiceInstance("areaplus.service") ;
		try {
			List<Areaplus> all=areaplusService.list(Integer.parseInt(request.getParameter("aid"))) ;
			JSONObject obj=new JSONObject() ;
			JSONArray arr=new JSONArray() ;
			Iterator<Areaplus> iter=all.iterator() ;
			while(iter.hasNext()){
				arr.add(iter.next()) ;
			}
			obj.put("allplus", arr) ;
			response.getWriter().println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
