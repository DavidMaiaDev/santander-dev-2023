package finalbootcamp.santanter.dev.domain.repository;

import finalbootcamp.santanter.dev.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public boolean existsByAccountNumber(String accountNumber);
}
