package io.cloudtype.springrabbit.controller;

import io.cloudtype.springrabbit.service.EnqueueDequeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQTestController {

    private final EnqueueDequeService enqueueDequeService;

    public RabbitMQTestController(EnqueueDequeService enqueueDequeService) {
        this.enqueueDequeService = enqueueDequeService;
    }

    @PostMapping("/publish")
    public String publishMessage(@RequestBody MessageDto messageDto) {
        enqueueDequeService.publishMessage(messageDto);
        System.out.println(messageDto);
        return messageDto.sender + " 님의 메세지가 정상적으로 발송되었습니다.";
    }
}
