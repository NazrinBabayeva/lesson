package com.example.projectdemonezrin.dto;

import ch.qos.logback.classic.spi.LoggingEventVO;
import com.example.projectdemonezrin.entityUser.User;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    String name;
    String surname;
    String email;

    public static LoggingEventVO notFound() {
        return null;
    }

    public static User ok(User user) {
        return user;
    }
}
