package io.github.sandornemeth;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * External gateway.
 *
 * @author Sandor Nemeth <sandor.nemeth.1986@gmail.com>
 */
@RestController
public class HelloEndpoint {

    @GetMapping("/admin/hello")
    @Secured("ROLE_ADMIN")
    public String sayHelloToAdmin() {
        return "Hello Admin";
    }

    @GetMapping("/user/hello")
    @Secured("ROLE_USER")
    public String sayHelloToUser() {
        return "Hello User";
    }

}
