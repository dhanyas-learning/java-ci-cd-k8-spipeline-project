// Sample Unit Test (src/test/java/com/example/demo/HelloControllerTest.java)
package com.example.demo;

import org.junit.jupiter.api.Test;
import org.spr
ingframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HelloControllerTest {
    @Test
    void testHelloEndpoint() {
        HelloController controller = new HelloController();
        String response = controller.sayHello();
        assertThat(response).isEqualTo("Hello, Kubernetes with ArgoCD!");
    }
}

