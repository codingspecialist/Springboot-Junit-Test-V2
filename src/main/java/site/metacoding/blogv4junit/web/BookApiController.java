package site.metacoding.blogv4junit.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.blogv4junit.web.dto.BookSaveReqDto;

@RestController
public class BookApiController {

    @PostMapping("/api/book")
    public ResponseEntity<?> bookSave(@RequestBody BookSaveReqDto reqDto) {
        return new ResponseEntity<>("굳", HttpStatus.CREATED);
    }
}
