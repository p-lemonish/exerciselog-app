package s24.backend.exerciselog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()) // permit all while dev
            .csrf(csrf -> csrf.disable())
            .headers(headers -> headers
            .frameOptions(frameOptions -> frameOptions.sameOrigin())); //fix for h2-console not working
            /*
            .requestMatchers("/h2-console/*").permitAll() //TODO uncomment for security features
            .anyRequest().authenticated())
            .formLogin(form -> form.permitAll())
            .logout(logout -> logout.logoutSuccessUrl("/login").permitAll());
            */
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}