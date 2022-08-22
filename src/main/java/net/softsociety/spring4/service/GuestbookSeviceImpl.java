package net.softsociety.spring4.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.spring4.dao.GuestbookDAO;
import net.softsociety.spring4.vo.Guestbook;

/**
 * PersonService 인터페이스의 구현체
 */
@Service
@Slf4j
public class GuestbookSeviceImpl implements GuestbookService {

    @Autowired
    private GuestbookDAO guestbookDAO;

	@Override
	public int insertGuestbook(Guestbook guestbook) {
		int result = guestbookDAO.insert(guestbook);
		return result;
	}

	@Override
	public ArrayList<Guestbook> selectAll() {
		ArrayList<Guestbook> list = guestbookDAO.selectAll();
		return list;
	}

	@Override
	public int deleteGuestbook(Guestbook guestbook) {
		int result = guestbookDAO.delete(guestbook);
		return result;
	}
	

}
