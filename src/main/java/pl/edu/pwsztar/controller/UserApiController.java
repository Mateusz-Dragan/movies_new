package pl.edu.pwsztar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwsztar.domain.dto.RegisterUserDto;
import pl.edu.pwsztar.domain.dto.ResponseData;
import pl.edu.pwsztar.service.UserService;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UserApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserApiController.class);

    private final UserService userService;

    //@Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }


    @CrossOrigin
    @PostMapping(value = "/users/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterUserDto registerUserDto) {
        LOGGER.info("register user: {}", registerUserDto);
        ResponseData responseData = userService.registerUser(registerUserDto);

        return new ResponseEntity<>(responseData.getFieldsErrorsNames(), HttpStatus.valueOf(responseData.getErrorCode()));
    }

}
