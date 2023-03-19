package com.HanSeongJae.springmybox.service;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileService {

    private final Path rootLocation = Paths.get("upload-dir");

    public void store(MultipartFile file) throws IOException {
        System.out.println(rootLocation);
        Files.createDirectories(rootLocation);
        file.transferTo(rootLocation.resolve(file.getOriginalFilename()));
    }
}
