import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class PostTest {
    @Test
    public void NewPostObjectGetsCorrectlyCreated_true() throws Exception {
        Post post = new Post("Day 1: Intro");
        assertEquals(true, post instanceof Post);


        void setUp() {
            super.setUp()
        }

        void tearDown() {
        }

    }