package springpractise.training.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import springpractise.training.model.Role;
import springpractise.training.model.User;
import springpractise.training.repository.RoleRepository;
import springpractise.training.repository.UserRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DbInit {
    @Value("admin")
    private String username;
    @Value("admin123")
    private String password;

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public DbInit(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @PostConstruct
    public void setAdmin(){
//        List<Role>roleList = new ArrayList<>();
//        Role role = new Role();
//        role.setRoleName("ROLE_CLIENT");
//        roleRepository.save(role);
//        roleList.add(role);
//        User user = new User();
//        user.setUsername("client");
//        user.setPassword(passwordEncoder.encode("client123"));
//        user.setRoleList(roleList);
//        userRepository.save(user);
//        Role role1 = new Role();
//        role1.setRoleName("ROLE_USER");
//        roleRepository.save(role1);
//        roleList.add(role1);
//        User user1 = new User();
//        user1.setUsername("user");
//        user1.setPassword(passwordEncoder.encode("user123"));
//        user1.setRoleList(roleList);
//        userRepository.save(user1);


    }

}
