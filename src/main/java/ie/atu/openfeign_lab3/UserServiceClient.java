package ie.atu.openfeign_lab3;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Service
@FeignClient(name = "productList", url= "http://localhost:8080/products")
public interface UserServiceClient {
    @GetMapping("/product")
    public String getProducts();

    @PutMapping("/product/{id}")
    public String updateProduct(@PathVariable int id, User user);

    @PostMapping("/product")
    public String addProduct(@RequestBody User user);

    @PostMapping("/product/{id}")
    public String deleteProduct(@PathVariable long id);


}
