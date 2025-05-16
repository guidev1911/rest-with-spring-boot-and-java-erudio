package br.com.erudio.respository;

import br.com.erudio.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository <Books, Long> {
}
