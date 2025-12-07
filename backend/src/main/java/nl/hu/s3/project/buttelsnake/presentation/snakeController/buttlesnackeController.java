package nl.hu.s3.project.buttelsnake.presentation.snakeController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/buttlesnake")
public class buttlesnackeController {


    @GetMapping
    public Map<String,String> initializeSnake() {
            Map<String, String> response = new HashMap<>();
            response.put("apiversion", "1");
            response.put("author", "StartSnake"); // TODO: Your Battlesnake Username
            response.put("color", "#888888"); // TODO: Personalize
            response.put("head", "default"); // TODO: Personalize
            response.put("tail", "default"); // TODO: Personalize
            return response;
        }

    }
