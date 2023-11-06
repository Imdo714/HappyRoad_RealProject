package com.kh.hrp.place.model.service;

import static com.kh.hrp.common.JDBCTemplate.close;
import static com.kh.hrp.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import com.kh.hrp.common.PageInfo;
import com.kh.hrp.common.model.vo.PlaceImage;
import com.kh.hrp.place.model.dao.PlaceDao;
import com.kh.hrp.place.model.vo.Place;

public class PlaceService {
	
	public int selectListCount(int userNo) {
		
		Connection conn = getConnection();
		int listCount = new PlaceDao().selectListCount(conn, userNo);

		close(conn);
		return listCount;
	}

	public ArrayList<Place> placeLikeSelectList(int userNo, PageInfo pi) {
		
		Connection conn = getConnection();
		ArrayList<Place> placelist = new PlaceDao().placeLikeSelectList(conn, userNo, pi);
		
		close(conn);
		return placelist;
	}

	public int placeLikeDeleteController(int userNo, int placeNo) {
		
		Connection conn = getConnection();
		int result = new PlaceDao().placeLikeDeleteController(conn, userNo, placeNo);
		
		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}

	public ArrayList<PlaceImage> selectPlaceImage(int placeNo) {
		
		Connection conn = getConnection();
		ArrayList<PlaceImage> list = new PlaceDao().selectPlaceImage(conn, placeNo);
		
		close(conn);
		return list;
	}

	public int selectSearchCount(HashMap<String, String> map) {
		
		Connection conn = getConnection();
		int SearchCount = new PlaceDao().selectSearchCount(conn, map);

		close(conn);
		return SearchCount;
	}

	public ArrayList<Place> selectSearchList(HashMap<String, String> map, PageInfo pi) {
		
		Connection conn = getConnection();
		ArrayList<Place> list = new PlaceDao().selectSearchList(conn, map, pi);

		close(conn);
		return list;
	}

}