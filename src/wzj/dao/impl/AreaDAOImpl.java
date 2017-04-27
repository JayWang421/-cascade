package wzj.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import wzj.dao.IAreaDAO;
import wzj.util.dbc.DatabaseConnection;
import wzj.vo.Area;

public class AreaDAOImpl implements IAreaDAO {
	private PreparedStatement ps ;
	@Override
	public boolean doCreate(Area vo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doUpdate(Area vo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemove(Integer mid) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Area fingById(Integer mid) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Area> findAll() throws SQLException {
		List<Area> all=new ArrayList<Area>() ;
		String sql="select aid,title from area " ;
		ps=DatabaseConnection.getConnection().prepareStatement(sql) ;
		ResultSet rs=ps.executeQuery() ;
		while(rs.next()){
			Area vo=new Area() ;
			vo.setAid(rs.getInt(1));
			vo.setTitle(rs.getString(2));
			all.add(vo) ;
		}
		return all ;
	}

	@Override
	public List<Area> findAllSplit(Integer currentPage, Integer lineSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Area> findAllSplit(Integer currentPage, Integer lineSize, Integer column, Integer keyword)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount(Integer column, Integer keyword) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
