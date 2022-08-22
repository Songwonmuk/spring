package net.softsociety.spring4.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import net.softsociety.spring4.vo.Guestbook;

/**
 * Mybatis의 매퍼 인터페이스
 */
@Mapper
public interface GuestbookDAO {
    //저장
    public int insert(Guestbook gb);
    //전체 조회
    public ArrayList<Guestbook> selectAll();
    //글 삭제
	public int delete(Guestbook guestbook);
    
}
