package hello.core.member;

public interface MemberRepository {

    //회원 저장
    void save(Member member);

    //아이디로 회원 조회
    Member findById(Long memberId);

}
