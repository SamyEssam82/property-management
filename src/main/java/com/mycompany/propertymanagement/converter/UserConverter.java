package com.mycompany.propertymanagement.converter;

import com.mycompany.propertymanagement.dto.UserDTO;
import com.mycompany.propertymanagement.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserEntity convertDTOtoEntity(UserDTO userDTO) {
        UserEntity ue = new UserEntity();
        ue.setOwnerEmail(userDTO.getOwnerEmail());
        ue.setOwnerName(userDTO.getOwnerName());
        ue.setPhone(userDTO.getPhone());
        ue.setPassword(userDTO.getPassword());

        return ue;
    }

    public UserDTO convertEntitytoDTO(UserEntity userEntity) {
        UserDTO ud = new UserDTO();
        ud.setId(userEntity.getId());
        ud.setOwnerEmail(userEntity.getOwnerEmail());
        ud.setOwnerName(userEntity.getOwnerName());
        ud.setPhone(userEntity.getPhone());
        return ud;
    }
}
