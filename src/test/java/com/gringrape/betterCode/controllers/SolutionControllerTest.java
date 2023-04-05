package com.gringrape.betterCode.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class SolutionControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void indicate() throws Exception {
        mockMvc.perform(post("/solutions")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"code\":\"Solution\"}"))
                .andExpect(status().isCreated());
    }

}
