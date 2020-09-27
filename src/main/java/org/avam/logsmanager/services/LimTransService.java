package org.avam.logsmanager.services;

import org.avam.logsmanager.entities.LimItem;
import org.avam.logsmanager.repositories.LimTransRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LimTransService {
    // #region FIELDS
    @Autowired
    private LimTransRepository repository;
    // #endregion

    // #region PUBLIC METHODS
    public LimItem save(LimItem item) {
        return repository.save(item);
    }
    // #endregion
}
