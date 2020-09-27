package org.avam.logsmanager.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "LIM_TRANS")
public class LimItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String app;
    // private String filePath;
    private long size;
    @Column(name = "ts")
    private long uploadTime;

    public int getId() {
        return id;
    }

    public long getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(long uploadTime) {
        this.uploadTime = uploadTime;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    // public String getFilePath() {
    // return filePath;
    // }

    // public void setFilePath(String filePath) {
    // this.filePath = filePath;
    // }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public void setId(int id) {
        this.id = id;
    }

}
