package kodlama.io.campRentACar.business.abstracts;

import kodlama.io.campRentACar.business.requests.CreateBrandRequest;
import kodlama.io.campRentACar.business.responses.GetAllBrandsResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
