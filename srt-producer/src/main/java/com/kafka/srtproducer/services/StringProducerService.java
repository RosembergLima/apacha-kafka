package com.kafka.srtproducer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Log4j2
@Service
public class StringProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        log.info("Sending message {}", message);
        kafkaTemplate.send("srt-topic", message);
/*                .whenComplete((result, exception) -> {
            if (exception != null) {
                log.error("Erro ao enviar mensagem para o kafka: ", exception);
            } else {
                log.info("Mensagem enviada com sucesso: {}", result);
            }
        });*/
    }
}
