package com.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void afficheLeBonMessage() {
        assertEquals("Bonjour depuis Maven !", App.message());
    }
}
