package springpractise.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springpractise.training.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
