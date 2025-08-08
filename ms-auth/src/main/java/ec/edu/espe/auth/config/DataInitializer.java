package ec.edu.espe.auth.config;

import ec.edu.espe.auth.model.Role;
import ec.edu.espe.auth.repository.RoleRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final RoleRepository roleRepository;

    @PostConstruct
    public void init() {
        List<String> roles = List.of(
                "ROLE_AUTOR",
                "ROLE_REVISOR",
                "ROLE_EDITOR",
                "ROLE_ADMIN",
                "ROLE_LECTOR"
        );
        for (String roleName : roles) {
            if (roleRepository.findByName(roleName).isEmpty()) {
                roleRepository.save(new Role(null, roleName));
            }
        }
    }
}
