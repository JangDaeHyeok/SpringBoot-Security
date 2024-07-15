package com.jdh.springSecuritySession.api.user.dto.request;

import com.jdh.springSecuritySession.api.user.enums.RoleName;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserAddRequestDTO {

    @NotNull
    @NotEmpty
    private String userId;

    @NotNull
    @NotEmpty
    private String password;

    @NotNull
    @NotEmpty
    private String name;

    private String tel;

    private RoleName roleName;

}
