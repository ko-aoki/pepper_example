package jp.co.ysk.pepper.api;

import jp.co.ysk.pepper.dto.ExampleDto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ko-aoki on 2016/02/14.
 */
@RestController
public class WebSocketController {

    @MessageMapping(value = "/greet" /* 宛先名 */) // Controller内の@MessageMappingアノテーションをつけたメソッドが、メッセージを受け付ける
    @SendTo(value = "/topic/greetings") // 処理結果の送り先
    String greet(ExampleDto dto) {
        System.out.println("received " + dto.getMessage());
        return "Hello " + dto.getMessage();
    }
}
