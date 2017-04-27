package wzj.service.impl;

import java.util.List;

import wzj.dao.IAreaplusDAO;
import wzj.service.IAreaplusService;
import wzj.util.factory.Factory;
import wzj.vo.Areaplus;

public class AreaplusServiceImpl implements IAreaplusService {

	@Override
	public List<Areaplus> list(int aid) throws Exception {
		IAreaplusDAO areaplusDAO=Factory.getDAOInstance("areaplus.dao") ;
		return areaplusDAO.findAllByAreaId(aid) ;
	}

}
