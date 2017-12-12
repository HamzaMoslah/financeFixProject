package tn.insat.fix.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/inscription")
    public @ResponseBody String signUp(@RequestParam(value="userName", required=true) String userName,
                                     @RequestParam(value="email", required=true) String email,
                                     @RequestParam(value="password", required=true) String password,
                                     @RequestParam(value="intermidiaire", required=true) boolean intermidiaire) {
        User user = new User(userName, password, email, intermidiaire);
        userRepository.save(user);
        return "Bonjour "+user.getUserName()+user.isIntermidiaire();
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @GetMapping(path="/login")
    public @ResponseBody User getUser(@RequestParam(value="userName", required=true) String userName) {
        // This returns a JSON or XML with the users
        return userRepository.findUserByUserName(userName).iterator().next();
    }
}
