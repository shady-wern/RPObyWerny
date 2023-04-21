package ru.iu3.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.iu3.backend.models.Artist;
import ru.iu3.backend.models.Country;
import ru.iu3.backend.models.User;

import java.util.Optional;
public interface ArtistRepository extends JpaRepository<Artist, Long> {
	Optional<Artist> findByName(String name);
}