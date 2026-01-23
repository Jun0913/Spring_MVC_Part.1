package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    /**
     * 회원 목록 조회: GET /users
     * 회원 등록: POST /users
     * 회원 조회: GET /users/{userId}
     * 회원 수정: PATCH /users/{userId}
     * 회원 삭제: DELETE /users/{userId}
     * */

    @GetMapping
    public String user(){
        return "get users";
    }

    @PostMapping
    public String addUser(){
        return "post user";
    }

    @GetMapping("/{userID}")
    public String findUser(@PathVariable String userID){
        return "get userID = " + userID;
    }

    @PatchMapping("/{userID}")
    public String updateUser(@PathVariable String userID){
        return "update userId = " + userID;
    }

    @DeleteMapping("/{userID}")
    public String deleteUser(@PathVariable String userID){
        return "delete userId = " + userID;
    }
}
