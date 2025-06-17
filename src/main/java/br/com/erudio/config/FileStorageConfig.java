package br.com.erudio.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "file")
public class FileStorageConfig {

    private String downloadTests;

    public FileStorageConfig() {}

    public String getDownloadTests() {
        return downloadTests;
    }

    public void setDownloadTests(String downloadTests) {
        this.downloadTests = downloadTests;
    }
}
