package com.sankalp.reactivedemo.Service;

import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    private static String UPLOAD_ROOT = "uplod-dir";
    private final ResourceLoader resourceLoader;

    public ImageService(ResourceLoader resourceLoader) {

        this.resourceLoader = resourceLoader;
    }
}
