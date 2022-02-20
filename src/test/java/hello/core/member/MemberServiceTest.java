package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

//Test 코드를 잘 작성하는 것이 중요
public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);

    }

}
