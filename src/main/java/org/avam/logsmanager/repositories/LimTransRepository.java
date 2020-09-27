package org.avam.logsmanager.repositories;

import org.avam.logsmanager.entities.LimItem;
import org.springframework.data.repository.CrudRepository;

public interface LimTransRepository extends CrudRepository<LimItem, Integer> {

}
