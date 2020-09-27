package org.avam.logsmanager.rest;

import org.avam.logsmanager.entities.LimItem;
import org.avam.logsmanager.services.LimTransService;
// import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/du/images")
public class ImageFileDUController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private LimTransService service;

    @RequestMapping(path = "/upload", method = RequestMethod.POST)
    public ResponseEntity<String> upload() {
        LOGGER.info("Request received for upload");
        LimItem lim = new LimItem();
        lim.setApp("QUICK-FIX");
        lim.setSize(345345345);
        lim.setUploadTime(System.currentTimeMillis());
        lim = service.save(lim);

        return ResponseEntity.ok("File uploaded successfully");
    }
}
