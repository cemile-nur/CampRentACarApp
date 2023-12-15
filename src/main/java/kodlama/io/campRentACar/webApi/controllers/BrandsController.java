package kodlama.io.campRentACar.webApi.controllers;

import kodlama.io.campRentACar.business.abstracts.BrandService;
import kodlama.io.campRentACar.business.requests.CreateBrandRequest;
import kodlama.io.campRentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.campRentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void Add(CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }

}
