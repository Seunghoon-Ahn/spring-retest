package com.chap2.test.web;

import com.chap2.test.service.posts.PostsService;
import com.chap2.test.web.dto.PostsResponseDto;
import com.chap2.test.web.dto.PostsSaveRequestDto;
import com.chap2.test.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto FindById (@PathVariable Long id) {
        return postsService.findById(id);
    }
}
