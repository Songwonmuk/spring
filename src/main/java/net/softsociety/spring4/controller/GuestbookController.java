package net.softsociety.spring4.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.spring4.service.GuestbookService;
import net.softsociety.spring4.vo.Guestbook;

@Slf4j
@Controller
public class GuestbookController {

    @Autowired
    private GuestbookService service;
    
    /**
     * 전체 목록 보기
     */
    @GetMapping("/list")
    public String list(Model model) {
    	ArrayList<Guestbook> list = service.selectAll();
    	model.addAttribute("list", list);
    	return "list";
    }

    /**
     * 전체 목록 보기2
     */
    @GetMapping("/list2")
    public String list2(Model model) {
    	ArrayList<Guestbook> list = service.selectAll();
    	model.addAttribute("list", list);
    	return "list2";
    }

    /**
     * 글쓰기 폼으로 이동
     */
    @GetMapping("/write")
    public String write() {
    	return "writeForm";
    }
    
    /**
     * 글 저장
     */
    @PostMapping("/write")
    public String write(Guestbook guestbook) {
    	log.debug("전달된 정보 : {}", guestbook);
    	int result = service.insertGuestbook(guestbook);
    	
    	return "redirect:/list";
    }
    
    /**
     * 글 삭제
     */
    @PostMapping("/delete")
    public String delete(Guestbook guestbook) {
    	log.debug("전달된 정보 : {}", guestbook);
    	int result = service.deleteGuestbook(guestbook);
    	
    	if (result == 0) {
    		log.debug("삭제 실패");
    	}
    	else {
    		log.debug("삭제 성공");
    	}
    	
    	return "redirect:/list";
    }
    
    /**
     * 글 삭제2
     */
    @PostMapping("/delete2")
    public String delete2(Guestbook guestbook) {
    	log.debug("전달된 정보 : {}", guestbook);
    	int result = service.deleteGuestbook(guestbook);
    	
    	if (result == 0) {
    		log.debug("삭제 실패");
    	}
    	else {
    		log.debug("삭제 성공");
    	}
    	
    	return "redirect:/list2";
    }

    
}
