package com.bokeunjeong.portfolio;

import com.bokeunjeong.portfolio.model.Contact;
import com.bokeunjeong.portfolio.service.TransactionalService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
@DisplayName("@Transactional 테스트")
public class TransactionalServiceTest {

    @Autowired
    TransactionalService transactionalService;


    @Test
    @DisplayName("1. 트랜잭션 메소드 안에서 1개 insert 실행 중 예외")
    public void _01_testTransaction() {

        Contact contact = new Contact();
        contact.setId("C004");
        contact.setType("Github");
        contact.setDetail("https://github.com/infomuscle");

        try {
            transactionalService.addContact(contact);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    @DisplayName("2. 트랜잭션 메소드 안에서 n개 insert 실행 중 예외")
    public void _02_testTransaction() {

    }


    @Test
    @DisplayName("3. 논트랜잭션 메소드 안에서 1개 insert 실행 중 예외")
    public void _03_test() {

    }


}