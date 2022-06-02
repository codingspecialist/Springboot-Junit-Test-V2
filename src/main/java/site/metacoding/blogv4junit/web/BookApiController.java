package site.metacoding.blogv4junit.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.blogv4junit.service.BookService;
import site.metacoding.blogv4junit.web.dto.BookRespDto;
import site.metacoding.blogv4junit.web.dto.BookSaveReqDto;

@RequiredArgsConstructor
@RestController
public class BookApiController {

    private final BookService bookService;

    @PostMapping("/api/book")
    public ResponseEntity<?> bookSave(@RequestBody BookSaveReqDto reqDto) {
        BookRespDto respDto = bookService.책등록하기(reqDto);
        return new ResponseEntity<>(respDto, HttpStatus.CREATED);
    }

    // 정상 : 200, 인서트 : 201, 클라이언트요청잘못 : 400, 서버쪽에러 : 500, 인증안됨 : 403
    @GetMapping("/api/book/{id}")
    public ResponseEntity<?> bookFindOne(@PathVariable Long id) {
        BookRespDto respDto = bookService.책한건가져오기(id);
        System.out.println("========================");
        System.out.println(respDto);
        System.out.println("========================");
        return new ResponseEntity<>(respDto, HttpStatus.OK);
    }
}
