package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.*;

import java.util.List;

public interface UserService {

    ResponseData registerUser(RegisterUserDto createMovieDto);

}
