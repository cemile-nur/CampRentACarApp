package kodlama.io.campRentACar.dataAccess.abstracts;

import kodlama.io.campRentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
