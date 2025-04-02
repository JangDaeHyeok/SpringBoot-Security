package com.jdh.springSecuritySession.config.security.csrf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;

@Configuration
public class HttpSessionCsrfToken {

    @Bean
    HttpSessionCsrfTokenRepository httpSessionCsrfTokenRepository() {
        HttpSessionCsrfTokenRepository csrfRepository = new HttpSessionCsrfTokenRepository();

        // HTTP 헤더 name 설정
        // 기본값: "X-CSRF-TOKEN"
        csrfRepository.setHeaderName("X-CSRF-TOKEN");
        // URL 파라미터에서 토큰에 대응되는 name 설정
        // 기본값: "_csrf"
        csrfRepository.setParameterName("_csrf");
        // 세션에서 토큰을 인덱싱 하는 문자열을 설정
        // 기본값: "org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository.CSRF_TOKEN"
        csrfRepository.setSessionAttributeName("CSRF_TOKEN");

        return csrfRepository;
    }

}
