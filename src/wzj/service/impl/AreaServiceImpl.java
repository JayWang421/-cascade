package wzj.service.impl;

import java.util.List;

import wzj.dao.IAreaDAO;
import wzj.service.IAreaService;
import wzj.util.factory.Factory;
import wzj.vo.Area;

public class AreaServiceImpl implements IAreaService {

	@Override
	public List<Area> list() throws Exception {
		IAreaDAO areaDAO=Factory.getDAOInstance("area.dao") ;
		return areaDAO.findAll() ;
	}

}
