package ru.krd.smc.dba;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.krd.smc.model.entity.User;
import ru.krd.smc.model.enums.UserType;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepo extends CrudRepository<User, UUID> {
	List<User> findAllByType(UserType type);
}
