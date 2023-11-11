package hello.itemservice;

import hello.itemservice.domain.item.Item;
import hello.itemservice.domain.item.ItemRepository;
import hello.itemservice.domain.member.Member;
import hello.itemservice.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final ItemRepository itemRepository;
    private final MemberRepository memberRepository;

    /**
     * 테스트 데이터 추가
     */
    @PostConstruct
    public void init() {
        itemRepository.save(new Item("itemB", 20000, 20));
        itemRepository.save(new Item("itemA", 10000, 10));

        Member member = new Member();
        member.setLoginId("test");
        member.setName("tester");
        member.setPassword("test!");
        memberRepository.save(member);
    }

}
