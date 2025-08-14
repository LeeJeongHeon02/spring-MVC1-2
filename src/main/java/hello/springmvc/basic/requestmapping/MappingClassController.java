package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String users() {
        return "get users";
    }

    @PostMapping
    public String postUsers() {
        return "post users";
    }

    @GetMapping("/{userId}")
    public String getUsers(@PathVariable String userId) {
        return "get userId = " + userId;
    }

    @PatchMapping("/{userId}")
    public String patchUsers(@PathVariable String userId) {
        return "patch userId = " + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUsers(@PathVariable String userId) {
        return "delete userId = " + userId;
    }
}
