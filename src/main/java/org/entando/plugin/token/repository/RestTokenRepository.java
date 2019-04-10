
package org.entando.plugin.token.repository;

import java.util.List;
import io.swagger.annotations.Api;
import org.entando.plugin.token.domain.Token;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tokens", path = "tokens")
public interface RestTokenRepository extends PagingAndSortingRepository<Token, Long> {
    // Add here all your custom endpoints
    //List<Token> findByName(@Param("name") String name);
}
