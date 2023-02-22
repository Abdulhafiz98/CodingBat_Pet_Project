package uz.pdp.spring_boot_security_web.model.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionRequestDto {
    private String name;
    private String text;
    private String example;
    private int topicId;
}