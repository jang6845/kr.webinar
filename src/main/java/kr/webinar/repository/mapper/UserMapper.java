package kr.webinar.repository.mapper;

import kr.webinar.model.BaseUser;
import kr.webinar.model.support.BaseUserType;

import java.util.List;

public interface UserMapper {
    BaseUser selectUser(String id);
    List<BaseUser> selectUsersWhereType(BaseUserType type);
    int insertUser(BaseUser account);
}
