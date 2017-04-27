package wzj.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import wzj.dao.IAreaplusDAO;
import wzj.util.dbc.DatabaseConnection;
import wzj.vo.Areaplus;

public class AreaplusDAOImpl implements IAreaplusDAO {
	private PreparedStatement ps ;
	@Override
	public List<Areaplus> findAllByAreaId(Integer aid) throws SQLException {
		List<Areaplus> all=new ArrayList<Areaplus>();
		String sql="select apid,aid,title from areaplus where aid=? " ;
		ps=DatabaseConnection.getConnection().prepareStatement(sql) ;
		ps.setInt(1, aid);
		ResultSet rs=ps.executeQuery() ;
		while(rs.next()){
			Areaplus vo=new Areaplus() ;
			vo.setApid(rs.getInt(1));
			vo.setAid(rs.getInt(2));
			vo.setTitle(rs.getString(3));
			all.add(vo) ;
		}
		return all ;
	}
	
	@Override
	public boolean doCreate(Areaplus vo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doUpdate(Areaplus vo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemove(Integer mid) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Areaplus fingById(Integer mid) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Areaplus> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Areaplus> findAllSplit(Integer currentPage, Integer lineSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Areaplus> findAllSplit(Integer currentPage, Integer lineSize, Integer column, Integer keyword)
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
