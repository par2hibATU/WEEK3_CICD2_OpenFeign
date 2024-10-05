package ie.atu.openfeign_lab3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServiceClient userServiceClient;
    @GetMapping("/f-product")
    public String getAllProducts() {
        return userServiceClient.getProducts();
    }

    @PutMapping("/f-product/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody User user) {
        return userServiceClient.updateProduct(id, user);
    }

    @PostMapping("/f-product")
    public String addProduct(@RequestBody User user){
        return userServiceClient.addProduct(user);
    }

    @PostMapping("/f-product/{id}")
    public String deleteProduct(@PathVariable int id) {
        return userServiceClient.deleteProduct(id);
    }

}
