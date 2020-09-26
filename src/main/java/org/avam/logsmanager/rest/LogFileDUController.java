package org.avam.logsmanager.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/du/images")
public class LogFileDUController {
    
    @RequestMapping(path = "/download", method = RequestMethod.GET)
    public ResponseEntity<String> downloadFile() {
        return ResponseEntity.ok("Hello World");
    }
}
