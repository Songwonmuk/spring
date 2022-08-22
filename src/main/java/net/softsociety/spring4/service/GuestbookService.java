package net.softsociety.spring4.service;

import java.util.ArrayList;

import net.softsociety.spring4.vo.Guestbook;

/** 
 * 서비스 인터페이스
 */
public interface GuestbookService {
	/**
	 * 저장
	 * @param guestbook 저장할 정보
	 * @return 저장된 행 개수
	 */
	public int insertGuestbook(Guestbook guestbook);
	
	/**
	 * 전체 조회
	 * @return 글 목록
	 */
	public ArrayList<Guestbook> selectAll();

	/**
	 * 글 삭제
	 * @param guestbook 삭제할 글번호와 비밀번호
	 */
	public int deleteGuestbook(Guestbook guestbook);

}
