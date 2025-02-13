@RestController
@RequestMapping("/api")
class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Kubernetes with ArgoCD!";
    }
}
