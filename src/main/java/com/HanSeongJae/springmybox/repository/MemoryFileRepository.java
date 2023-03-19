package com.HanSeongJae.springmybox.repository;

import com.HanSeongJae.springmybox.domain.File;

import java.util.*;

public class MemoryFileRepository implements FileRepository {
    private static Map<Long, File> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public File save(File File) {
        File.setId(++sequence);
        store.put(File.getId(), File);
        return File;
    }

    @Override
    public Optional<File> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<File> findByName(String name) {
        return store.values().stream()
                .filter(File -> File.getName().equals(name))
                .findAny();
    }

    @Override
    public List<File> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }
}
