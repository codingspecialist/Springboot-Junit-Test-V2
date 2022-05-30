package site.metacoding.blogv4junit.web.dto;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import site.metacoding.blogv4junit.domain.book.Book;

// ReqDto의 경우는 무조건 빈생성자+셋터
@Setter
public class BookSaveReqDto {
    private String title;
    private String author;

    public Book toEntity() {
        return Book.builder().title(this.title).author(this.author).build();
    }
}
