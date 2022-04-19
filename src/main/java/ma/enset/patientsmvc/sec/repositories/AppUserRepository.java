package ma.enset.patientsmvc.sec.repositories;

import ma.enset.patientsmvc.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String> {
    public AppUser findByUsername(String username);
}
