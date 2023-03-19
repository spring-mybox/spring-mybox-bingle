package com.HanSeongJae.springmybox.repository;

import com.HanSeongJae.springmybox.domain.File;

import java.util.List;
import java.util.Optional;

public interface FileRepository {
    File save(File member);

    Optional<File> findById(Long id);
    Optional<File> findByName(String name);
    List<File> findAll();
}
