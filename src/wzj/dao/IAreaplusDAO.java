package wzj.dao;


import java.sql.SQLException;
import java.util.List;

import wzj.util.dao.IBaseDAO;
import wzj.vo.Areaplus;

public interface IAreaplusDAO extends IBaseDAO<Integer, Areaplus> {
	public List<Areaplus> findAllByAreaId(Integer aid)throws SQLException ;
}
