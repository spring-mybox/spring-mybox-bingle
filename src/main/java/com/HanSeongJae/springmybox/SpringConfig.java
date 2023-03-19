package com.HanSeongJae.springmybox;

import com.HanSeongJae.springmybox.repository.MemberRepository;
import com.HanSeongJae.springmybox.repository.MemoryMemberReopository;
import com.HanSeongJae.springmybox.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberReopository();
    }
}
