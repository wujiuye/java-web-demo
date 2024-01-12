package fm.lizhi.common.nebula.webdemo.controller;

import com.wujiuye.jsonparser.core.JsonUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @GetMapping("/")
    public void hello(HttpServletResponse response) throws IOException {
        response.setStatus(200);
        Map<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("message", "success");
        response.getOutputStream().write(JsonUtils.toJsonString(result).getBytes(StandardCharsets.UTF_8));
        response.getOutputStream().flush();
    }

}
