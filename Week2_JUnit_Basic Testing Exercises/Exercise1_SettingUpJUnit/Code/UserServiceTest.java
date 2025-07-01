package com.example;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserServiceTest {

    private UserService service;

    @Before
    public void setUp() {
        service = new UserService();
        service.register("john", "password123");
    }

    @Test
    public void testSuccessfulRegistration() {
        assertTrue(service.register("jane", "pass456"));
    }

    @Test
    public void testDuplicateRegistration() {
        assertFalse(service.register("john", "newpass"));
    }

    @Test
    public void testSuccessfulLogin() {
        assertTrue(service.login("john", "password123"));
    }

    @Test
    public void testFailedLoginWrongPassword() {
        assertFalse(service.login("john", "wrongpass"));
    }

    @Test
    public void testFailedLoginUnknownUser() {
        assertFalse(service.login("unknown", "nopass"));
    }

    @Test
    public void testUserCount() {
        service.register("alice", "xyz123");
        assertEquals(2, service.getUserCount());
    }
}
