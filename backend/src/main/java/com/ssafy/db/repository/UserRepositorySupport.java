package com.ssafy.db.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssafy.db.entity.User.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * 유저 모델 관련 디비 쿼리 생성을 위한 구현 정의.
 */
@Repository
public class UserRepositorySupport {
    @Autowired
    private JPAQueryFactory jpaQueryFactory;

    QUser qUser = QUser.user;
    QUserPrivacy qUserPrivacy = QUserPrivacy.userPrivacy;
    QUserProfile qUserProfile = QUserProfile.userProfile;

    public Optional<UserPrivacy> findByEmail(String email) {
        UserPrivacy userPrivacy = jpaQueryFactory.select(qUserPrivacy).from(qUserPrivacy)
                .where(qUserPrivacy.email.eq(email)).fetchOne();
        if(userPrivacy == null) return Optional.empty();
        return Optional.ofNullable(userPrivacy);
    }

    public String findNicknameById(Long user_id) {
        String nickname = jpaQueryFactory.select(qUserProfile.nickname).from(qUserProfile)
                .where(qUserProfile.user_id.eq(qUserProfile.user_id)).fetchOne();
        return nickname;
    }

    public int findPointByNick(String nickname) {
        int point = jpaQueryFactory.select(qUserProfile.point).from(qUserProfile)
                .where(qUserProfile.nickname.eq(nickname)).fetchOne();
        return point;
    }
}
