package org.superbiz.moviefun;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class SmokeTest {

    @Test
    public void smokeTest() {

        String movieFunPage = "Wedding Crashers David Dobkin";
        assertThat(movieFunPage, containsString("Wedding Crashers"));
        assertThat(movieFunPage, containsString("David Dobkin"));
    }


}
