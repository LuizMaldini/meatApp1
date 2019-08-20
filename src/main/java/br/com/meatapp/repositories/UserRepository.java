package br.com.meatapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.meatapp.domain.User;
/*toda parte do down está pronta, todo crud de user pronto*/

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {

}
