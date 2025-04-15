package ru.practicum.user.service;

import org.springframework.transaction.annotation.Transactional;
import ru.practicum.user.dto.UserDto;
import ru.practicum.user.param.UserParams;

import java.util.List;

@Transactional(readOnly = true)
public interface UserService {

    List<UserDto> getUsers(UserParams userParams);

    @Transactional
    UserDto addUser(UserDto userDto);

    @Transactional
    void deleteUser(Integer userId);
}
