package hello;

public class HelloControllerTest {

    private MockMvc mvc;

    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from SpringBoot!")));
    }
}