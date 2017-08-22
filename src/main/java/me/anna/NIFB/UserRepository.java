package me.anna.NIFB;


import me.anna.NIFB.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}