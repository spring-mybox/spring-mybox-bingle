package com.HanSeongJae.springmybox.controller;

import com.HanSeongJae.springmybox.service.FileService;
import com.HanSeongJae.springmybox.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
public class FileController {
    @Autowired
    private FileService fileService;


    @GetMapping("/files")
    public String list(Model model) {
        return "files/fileList";
    }

    @PostMapping("/files/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        System.out.println(file);
        fileService.store(file);

        return "redirect:/";
    }

}
