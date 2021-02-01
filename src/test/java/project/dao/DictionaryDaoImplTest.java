package project.dao;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DictionaryDaoImplTest {
    @Test
    public void Test1() {
        System.out.println("TEST 1");
    }
    @Test
    @Ignore
    public void Test2() {
        System.out.println("TEST 2");
    }
    @Test
    public void Test3() {
        System.out.println("TEST 3");
        throw new RuntimeException("Bad exception");
    }
}