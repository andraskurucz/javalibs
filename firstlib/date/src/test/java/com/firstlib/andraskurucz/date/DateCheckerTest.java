package com.firstlib.andraskurucz.date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateCheckerTest {

    private DateChecker dateChecker;

    @Before
    public void setUp() throws Exception {
        dateChecker = new DateChecker();
    }

    @Test
    public void getDate() throws Exception {
        Assert.assertEquals("today", dateChecker.getDate());
    }
}