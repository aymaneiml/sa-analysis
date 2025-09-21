package pipeline.tuto.sa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SaAnalysysApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void endpointSaShouldReturnList() {
        String body = restTemplate.getForObject("/sa", String.class);
        assertThat(body).contains("Belle formation");
    }
}
