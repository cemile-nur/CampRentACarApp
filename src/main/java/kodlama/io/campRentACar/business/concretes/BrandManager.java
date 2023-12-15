package kodlama.io.campRentACar.business.concretes;

import kodlama.io.campRentACar.business.abstracts.BrandService;
import kodlama.io.campRentACar.business.requests.CreateBrandRequest;
import kodlama.io.campRentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.campRentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.campRentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands =brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponse =new ArrayList<GetAllBrandsResponse>();

        for (Brand brand :brands){
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());

            brandsResponse.add(responseItem);
        }
        //iş kuralları
        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand= new Brand();
        brand.setName(createBrandRequest.getName());
        this.brandRepository.save(brand);
    }
}
