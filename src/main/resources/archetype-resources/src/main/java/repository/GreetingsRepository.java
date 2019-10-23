package ${package}.repository;

import ${package}.domain.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingsRepository {

    private static final String template = "Hello, %s!";

}
