package spring.project.nyangmeong.web.api.dto.boards;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class BoardsInfoDto {

    private long id;
    private String text;
    private String tag;
    private LocalDateTime createdate;
    private long likesCount;
    private boolean likeState;
    private boolean uploader;
    private String postImgUrl;
}