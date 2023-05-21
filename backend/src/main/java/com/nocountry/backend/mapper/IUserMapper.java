package com.nocountry.backend.mapper;

import com.nocountry.backend.dto.user.UserDto;
import com.nocountry.backend.dto.user.UserRegisterDto;
import com.nocountry.backend.model.entity.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface IUserMapper {


    UserDto toUserDto(User user);

    @InheritInverseConfiguration
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "role", ignore = true)
    @Mapping(target = "addresses", ignore = true)
    User toUser(UserRegisterDto userRegisterDto);
}
