
package org.entando.plugin.token.repository;

import com.querydsl.core.types.dsl.StringPath;
import org.entando.plugin.token.domain.QToken;
import org.entando.plugin.token.domain.Token;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tokens", path = "tokens")
public interface RestTokenRepository extends PagingAndSortingRepository<Token, Long> , QuerydslPredicateExecutor<Token>, QuerydslBinderCustomizer<QToken> {
    // Add here all your custom endpoints
    //List<Token> findByName(@Param("name") String name);
    default void customize(QuerydslBindings bindings, QToken token) {
        bindings.bind(String.class).first((StringPath path, String value) -> path.equalsIgnoreCase(value));
    }
}
