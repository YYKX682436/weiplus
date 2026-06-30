package com.tencent.wechat.aff.newlife;

/* loaded from: classes10.dex */
public class FinderContact extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderContact DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderContact();
    public java.lang.String username = "";
    public java.lang.String nickname = "";
    public java.lang.String head_url = "";
    public long seq = 0;
    public java.lang.String signature = "";
    public int follow_flag = 0;
    public int follow_time = 0;
    public com.tencent.wechat.aff.newlife.FinderAuthInfo auth_info = com.tencent.wechat.aff.newlife.FinderAuthInfo.getDefaultInstance();
    public java.lang.String cover_img_url = "";
    public int spam_status = 0;
    public int ext_flag = 0;
    public com.tencent.wechat.aff.newlife.FinderContactExtInfo ext_info = com.tencent.wechat.aff.newlife.FinderContactExtInfo.getDefaultInstance();
    public int original_flag = 0;
    public com.tencent.wechat.aff.newlife.FinderOriginalInfo original_info = com.tencent.wechat.aff.newlife.FinderOriginalInfo.getDefaultInstance();
    public int live_status = 0;
    public com.tencent.wechat.aff.newlife.FinderContactMsgInfo msg_info = com.tencent.wechat.aff.newlife.FinderContactMsgInfo.getDefaultInstance();
    public int original_entrance_flag = 0;
    public java.lang.String live_cover_img_url = "";
    public int foreign_user_flag = 0;
    public java.lang.String loggingout_wording = "";
    public int friend_follow_count = 0;
    public int fans_count = 0;
    public java.lang.String wx_username_v5 = "";
    public java.lang.String vest_nickname = "";
    public int feed_count = 0;
    public int user_mode = 0;
    public java.lang.String cover_url = "";
    public int cover_entrance_flag = 0;
    public com.tencent.wechat.aff.newlife.AchievementInfo achievement_info = com.tencent.wechat.aff.newlife.AchievementInfo.getDefaultInstance();
    public int user_flag = 0;
    public int one_time_flag = 0;
    public long status = 0;
    public long additional_flag = 0;
    public int hobbies_flag = 0;
    public com.tencent.wechat.aff.newlife.FinderMemberInfo member_info = com.tencent.wechat.aff.newlife.FinderMemberInfo.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.FinderContactClubInfo club_info = com.tencent.wechat.aff.newlife.FinderContactClubInfo.getDefaultInstance();

    public static com.tencent.wechat.aff.newlife.FinderContact create() {
        return new com.tencent.wechat.aff.newlife.FinderContact();
    }

    public static com.tencent.wechat.aff.newlife.FinderContact getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderContact newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderContact();
    }

    public com.tencent.wechat.aff.newlife.FinderContact build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderContact)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderContact finderContact = (com.tencent.wechat.aff.newlife.FinderContact) fVar;
        return n51.f.a(this.username, finderContact.username) && n51.f.a(this.nickname, finderContact.nickname) && n51.f.a(this.head_url, finderContact.head_url) && n51.f.a(java.lang.Long.valueOf(this.seq), java.lang.Long.valueOf(finderContact.seq)) && n51.f.a(this.signature, finderContact.signature) && n51.f.a(java.lang.Integer.valueOf(this.follow_flag), java.lang.Integer.valueOf(finderContact.follow_flag)) && n51.f.a(java.lang.Integer.valueOf(this.follow_time), java.lang.Integer.valueOf(finderContact.follow_time)) && n51.f.a(this.auth_info, finderContact.auth_info) && n51.f.a(this.cover_img_url, finderContact.cover_img_url) && n51.f.a(java.lang.Integer.valueOf(this.spam_status), java.lang.Integer.valueOf(finderContact.spam_status)) && n51.f.a(java.lang.Integer.valueOf(this.ext_flag), java.lang.Integer.valueOf(finderContact.ext_flag)) && n51.f.a(this.ext_info, finderContact.ext_info) && n51.f.a(java.lang.Integer.valueOf(this.original_flag), java.lang.Integer.valueOf(finderContact.original_flag)) && n51.f.a(this.original_info, finderContact.original_info) && n51.f.a(java.lang.Integer.valueOf(this.live_status), java.lang.Integer.valueOf(finderContact.live_status)) && n51.f.a(this.msg_info, finderContact.msg_info) && n51.f.a(java.lang.Integer.valueOf(this.original_entrance_flag), java.lang.Integer.valueOf(finderContact.original_entrance_flag)) && n51.f.a(this.live_cover_img_url, finderContact.live_cover_img_url) && n51.f.a(java.lang.Integer.valueOf(this.foreign_user_flag), java.lang.Integer.valueOf(finderContact.foreign_user_flag)) && n51.f.a(this.loggingout_wording, finderContact.loggingout_wording) && n51.f.a(java.lang.Integer.valueOf(this.friend_follow_count), java.lang.Integer.valueOf(finderContact.friend_follow_count)) && n51.f.a(java.lang.Integer.valueOf(this.fans_count), java.lang.Integer.valueOf(finderContact.fans_count)) && n51.f.a(this.wx_username_v5, finderContact.wx_username_v5) && n51.f.a(this.vest_nickname, finderContact.vest_nickname) && n51.f.a(java.lang.Integer.valueOf(this.feed_count), java.lang.Integer.valueOf(finderContact.feed_count)) && n51.f.a(java.lang.Integer.valueOf(this.user_mode), java.lang.Integer.valueOf(finderContact.user_mode)) && n51.f.a(this.cover_url, finderContact.cover_url) && n51.f.a(java.lang.Integer.valueOf(this.cover_entrance_flag), java.lang.Integer.valueOf(finderContact.cover_entrance_flag)) && n51.f.a(this.achievement_info, finderContact.achievement_info) && n51.f.a(java.lang.Integer.valueOf(this.user_flag), java.lang.Integer.valueOf(finderContact.user_flag)) && n51.f.a(java.lang.Integer.valueOf(this.one_time_flag), java.lang.Integer.valueOf(finderContact.one_time_flag)) && n51.f.a(java.lang.Long.valueOf(this.status), java.lang.Long.valueOf(finderContact.status)) && n51.f.a(java.lang.Long.valueOf(this.additional_flag), java.lang.Long.valueOf(finderContact.additional_flag)) && n51.f.a(java.lang.Integer.valueOf(this.hobbies_flag), java.lang.Integer.valueOf(finderContact.hobbies_flag)) && n51.f.a(this.member_info, finderContact.member_info) && n51.f.a(this.club_info, finderContact.club_info);
    }

    public com.tencent.wechat.aff.newlife.AchievementInfo getAchievementInfo() {
        return this.achievement_info;
    }

    public com.tencent.wechat.aff.newlife.AchievementInfo getAchievement_info() {
        return this.achievement_info;
    }

    public long getAdditionalFlag() {
        return this.additional_flag;
    }

    public long getAdditional_flag() {
        return this.additional_flag;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo getAuthInfo() {
        return this.auth_info;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo getAuth_info() {
        return this.auth_info;
    }

    public com.tencent.wechat.aff.newlife.FinderContactClubInfo getClubInfo() {
        return this.club_info;
    }

    public com.tencent.wechat.aff.newlife.FinderContactClubInfo getClub_info() {
        return this.club_info;
    }

    public int getCoverEntranceFlag() {
        return this.cover_entrance_flag;
    }

    public java.lang.String getCoverImgUrl() {
        return this.cover_img_url;
    }

    public java.lang.String getCoverUrl() {
        return this.cover_url;
    }

    public int getCover_entrance_flag() {
        return this.cover_entrance_flag;
    }

    public java.lang.String getCover_img_url() {
        return this.cover_img_url;
    }

    public java.lang.String getCover_url() {
        return this.cover_url;
    }

    public int getExtFlag() {
        return this.ext_flag;
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo getExtInfo() {
        return this.ext_info;
    }

    public int getExt_flag() {
        return this.ext_flag;
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo getExt_info() {
        return this.ext_info;
    }

    public int getFansCount() {
        return this.fans_count;
    }

    public int getFans_count() {
        return this.fans_count;
    }

    public int getFeedCount() {
        return this.feed_count;
    }

    public int getFeed_count() {
        return this.feed_count;
    }

    public int getFollowFlag() {
        return this.follow_flag;
    }

    public int getFollowTime() {
        return this.follow_time;
    }

    public int getFollow_flag() {
        return this.follow_flag;
    }

    public int getFollow_time() {
        return this.follow_time;
    }

    public int getForeignUserFlag() {
        return this.foreign_user_flag;
    }

    public int getForeign_user_flag() {
        return this.foreign_user_flag;
    }

    public int getFriendFollowCount() {
        return this.friend_follow_count;
    }

    public int getFriend_follow_count() {
        return this.friend_follow_count;
    }

    public java.lang.String getHeadUrl() {
        return this.head_url;
    }

    public java.lang.String getHead_url() {
        return this.head_url;
    }

    public int getHobbiesFlag() {
        return this.hobbies_flag;
    }

    public int getHobbies_flag() {
        return this.hobbies_flag;
    }

    public java.lang.String getLiveCoverImgUrl() {
        return this.live_cover_img_url;
    }

    public int getLiveStatus() {
        return this.live_status;
    }

    public java.lang.String getLive_cover_img_url() {
        return this.live_cover_img_url;
    }

    public int getLive_status() {
        return this.live_status;
    }

    public java.lang.String getLoggingoutWording() {
        return this.loggingout_wording;
    }

    public java.lang.String getLoggingout_wording() {
        return this.loggingout_wording;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberInfo getMemberInfo() {
        return this.member_info;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberInfo getMember_info() {
        return this.member_info;
    }

    public com.tencent.wechat.aff.newlife.FinderContactMsgInfo getMsgInfo() {
        return this.msg_info;
    }

    public com.tencent.wechat.aff.newlife.FinderContactMsgInfo getMsg_info() {
        return this.msg_info;
    }

    public java.lang.String getNickname() {
        return this.nickname;
    }

    public int getOneTimeFlag() {
        return this.one_time_flag;
    }

    public int getOne_time_flag() {
        return this.one_time_flag;
    }

    public int getOriginalEntranceFlag() {
        return this.original_entrance_flag;
    }

    public int getOriginalFlag() {
        return this.original_flag;
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo getOriginalInfo() {
        return this.original_info;
    }

    public int getOriginal_entrance_flag() {
        return this.original_entrance_flag;
    }

    public int getOriginal_flag() {
        return this.original_flag;
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo getOriginal_info() {
        return this.original_info;
    }

    public long getSeq() {
        return this.seq;
    }

    public java.lang.String getSignature() {
        return this.signature;
    }

    public int getSpamStatus() {
        return this.spam_status;
    }

    public int getSpam_status() {
        return this.spam_status;
    }

    public long getStatus() {
        return this.status;
    }

    public int getUserFlag() {
        return this.user_flag;
    }

    public int getUserMode() {
        return this.user_mode;
    }

    public int getUser_flag() {
        return this.user_flag;
    }

    public int getUser_mode() {
        return this.user_mode;
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public java.lang.String getVestNickname() {
        return this.vest_nickname;
    }

    public java.lang.String getVest_nickname() {
        return this.vest_nickname;
    }

    public java.lang.String getWxUsernameV5() {
        return this.wx_username_v5;
    }

    public java.lang.String getWx_username_v5() {
        return this.wx_username_v5;
    }

    public com.tencent.wechat.aff.newlife.FinderContact mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderContact();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.username;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.nickname;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.head_url;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.seq);
            java.lang.String str4 = this.signature;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.follow_flag);
            fVar.e(7, this.follow_time);
            com.tencent.wechat.aff.newlife.FinderAuthInfo finderAuthInfo = this.auth_info;
            if (finderAuthInfo != null) {
                fVar.i(8, finderAuthInfo.computeSize());
                this.auth_info.writeFields(fVar);
            }
            java.lang.String str5 = this.cover_img_url;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.spam_status);
            fVar.e(11, this.ext_flag);
            com.tencent.wechat.aff.newlife.FinderContactExtInfo finderContactExtInfo = this.ext_info;
            if (finderContactExtInfo != null) {
                fVar.i(12, finderContactExtInfo.computeSize());
                this.ext_info.writeFields(fVar);
            }
            fVar.e(13, this.original_flag);
            com.tencent.wechat.aff.newlife.FinderOriginalInfo finderOriginalInfo = this.original_info;
            if (finderOriginalInfo != null) {
                fVar.i(14, finderOriginalInfo.computeSize());
                this.original_info.writeFields(fVar);
            }
            fVar.e(15, this.live_status);
            com.tencent.wechat.aff.newlife.FinderContactMsgInfo finderContactMsgInfo = this.msg_info;
            if (finderContactMsgInfo != null) {
                fVar.i(16, finderContactMsgInfo.computeSize());
                this.msg_info.writeFields(fVar);
            }
            fVar.e(17, this.original_entrance_flag);
            java.lang.String str6 = this.live_cover_img_url;
            if (str6 != null) {
                fVar.j(18, str6);
            }
            fVar.e(19, this.foreign_user_flag);
            java.lang.String str7 = this.loggingout_wording;
            if (str7 != null) {
                fVar.j(21, str7);
            }
            fVar.e(23, this.friend_follow_count);
            fVar.e(24, this.fans_count);
            java.lang.String str8 = this.wx_username_v5;
            if (str8 != null) {
                fVar.j(25, str8);
            }
            java.lang.String str9 = this.vest_nickname;
            if (str9 != null) {
                fVar.j(26, str9);
            }
            fVar.e(27, this.feed_count);
            fVar.e(28, this.user_mode);
            java.lang.String str10 = this.cover_url;
            if (str10 != null) {
                fVar.j(31, str10);
            }
            fVar.e(32, this.cover_entrance_flag);
            com.tencent.wechat.aff.newlife.AchievementInfo achievementInfo = this.achievement_info;
            if (achievementInfo != null) {
                fVar.i(33, achievementInfo.computeSize());
                this.achievement_info.writeFields(fVar);
            }
            fVar.e(35, this.user_flag);
            fVar.e(36, this.one_time_flag);
            fVar.h(38, this.status);
            fVar.h(40, this.additional_flag);
            fVar.e(41, this.hobbies_flag);
            com.tencent.wechat.aff.newlife.FinderMemberInfo finderMemberInfo = this.member_info;
            if (finderMemberInfo != null) {
                fVar.i(42, finderMemberInfo.computeSize());
                this.member_info.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.FinderContactClubInfo finderContactClubInfo = this.club_info;
            if (finderContactClubInfo != null) {
                fVar.i(43, finderContactClubInfo.computeSize());
                this.club_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.username;
            int j17 = str11 != null ? b36.f.j(1, str11) + 0 : 0;
            java.lang.String str12 = this.nickname;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.head_url;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            int h17 = j17 + b36.f.h(4, this.seq);
            java.lang.String str14 = this.signature;
            if (str14 != null) {
                h17 += b36.f.j(5, str14);
            }
            int e17 = h17 + b36.f.e(6, this.follow_flag) + b36.f.e(7, this.follow_time);
            com.tencent.wechat.aff.newlife.FinderAuthInfo finderAuthInfo2 = this.auth_info;
            if (finderAuthInfo2 != null) {
                e17 += b36.f.i(8, finderAuthInfo2.computeSize());
            }
            java.lang.String str15 = this.cover_img_url;
            if (str15 != null) {
                e17 += b36.f.j(9, str15);
            }
            int e18 = e17 + b36.f.e(10, this.spam_status) + b36.f.e(11, this.ext_flag);
            com.tencent.wechat.aff.newlife.FinderContactExtInfo finderContactExtInfo2 = this.ext_info;
            if (finderContactExtInfo2 != null) {
                e18 += b36.f.i(12, finderContactExtInfo2.computeSize());
            }
            int e19 = e18 + b36.f.e(13, this.original_flag);
            com.tencent.wechat.aff.newlife.FinderOriginalInfo finderOriginalInfo2 = this.original_info;
            if (finderOriginalInfo2 != null) {
                e19 += b36.f.i(14, finderOriginalInfo2.computeSize());
            }
            int e27 = e19 + b36.f.e(15, this.live_status);
            com.tencent.wechat.aff.newlife.FinderContactMsgInfo finderContactMsgInfo2 = this.msg_info;
            if (finderContactMsgInfo2 != null) {
                e27 += b36.f.i(16, finderContactMsgInfo2.computeSize());
            }
            int e28 = e27 + b36.f.e(17, this.original_entrance_flag);
            java.lang.String str16 = this.live_cover_img_url;
            if (str16 != null) {
                e28 += b36.f.j(18, str16);
            }
            int e29 = e28 + b36.f.e(19, this.foreign_user_flag);
            java.lang.String str17 = this.loggingout_wording;
            if (str17 != null) {
                e29 += b36.f.j(21, str17);
            }
            int e37 = e29 + b36.f.e(23, this.friend_follow_count) + b36.f.e(24, this.fans_count);
            java.lang.String str18 = this.wx_username_v5;
            if (str18 != null) {
                e37 += b36.f.j(25, str18);
            }
            java.lang.String str19 = this.vest_nickname;
            if (str19 != null) {
                e37 += b36.f.j(26, str19);
            }
            int e38 = e37 + b36.f.e(27, this.feed_count) + b36.f.e(28, this.user_mode);
            java.lang.String str20 = this.cover_url;
            if (str20 != null) {
                e38 += b36.f.j(31, str20);
            }
            int e39 = e38 + b36.f.e(32, this.cover_entrance_flag);
            com.tencent.wechat.aff.newlife.AchievementInfo achievementInfo2 = this.achievement_info;
            if (achievementInfo2 != null) {
                e39 += b36.f.i(33, achievementInfo2.computeSize());
            }
            int e47 = e39 + b36.f.e(35, this.user_flag) + b36.f.e(36, this.one_time_flag) + b36.f.h(38, this.status) + b36.f.h(40, this.additional_flag) + b36.f.e(41, this.hobbies_flag);
            com.tencent.wechat.aff.newlife.FinderMemberInfo finderMemberInfo2 = this.member_info;
            if (finderMemberInfo2 != null) {
                e47 += b36.f.i(42, finderMemberInfo2.computeSize());
            }
            com.tencent.wechat.aff.newlife.FinderContactClubInfo finderContactClubInfo2 = this.club_info;
            return finderContactClubInfo2 != null ? e47 + b36.f.i(43, finderContactClubInfo2.computeSize()) : e47;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.username = aVar2.k(intValue);
                return 0;
            case 2:
                this.nickname = aVar2.k(intValue);
                return 0;
            case 3:
                this.head_url = aVar2.k(intValue);
                return 0;
            case 4:
                this.seq = aVar2.i(intValue);
                return 0;
            case 5:
                this.signature = aVar2.k(intValue);
                return 0;
            case 6:
                this.follow_flag = aVar2.g(intValue);
                return 0;
            case 7:
                this.follow_time = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.aff.newlife.FinderAuthInfo finderAuthInfo3 = new com.tencent.wechat.aff.newlife.FinderAuthInfo();
                    if (bArr != null && bArr.length > 0) {
                        finderAuthInfo3.parseFrom(bArr);
                    }
                    this.auth_info = finderAuthInfo3;
                }
                return 0;
            case 9:
                this.cover_img_url = aVar2.k(intValue);
                return 0;
            case 10:
                this.spam_status = aVar2.g(intValue);
                return 0;
            case 11:
                this.ext_flag = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.tencent.wechat.aff.newlife.FinderContactExtInfo finderContactExtInfo3 = new com.tencent.wechat.aff.newlife.FinderContactExtInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderContactExtInfo3.parseFrom(bArr2);
                    }
                    this.ext_info = finderContactExtInfo3;
                }
                return 0;
            case 13:
                this.original_flag = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    com.tencent.wechat.aff.newlife.FinderOriginalInfo finderOriginalInfo3 = new com.tencent.wechat.aff.newlife.FinderOriginalInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderOriginalInfo3.parseFrom(bArr3);
                    }
                    this.original_info = finderOriginalInfo3;
                }
                return 0;
            case 15:
                this.live_status = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    com.tencent.wechat.aff.newlife.FinderContactMsgInfo finderContactMsgInfo3 = new com.tencent.wechat.aff.newlife.FinderContactMsgInfo();
                    if (bArr4 != null && bArr4.length > 0) {
                        finderContactMsgInfo3.parseFrom(bArr4);
                    }
                    this.msg_info = finderContactMsgInfo3;
                }
                return 0;
            case 17:
                this.original_entrance_flag = aVar2.g(intValue);
                return 0;
            case 18:
                this.live_cover_img_url = aVar2.k(intValue);
                return 0;
            case 19:
                this.foreign_user_flag = aVar2.g(intValue);
                return 0;
            case 20:
            case 22:
            case 29:
            case 30:
            case 34:
            case 37:
            case 39:
            default:
                return -1;
            case 21:
                this.loggingout_wording = aVar2.k(intValue);
                return 0;
            case 23:
                this.friend_follow_count = aVar2.g(intValue);
                return 0;
            case 24:
                this.fans_count = aVar2.g(intValue);
                return 0;
            case 25:
                this.wx_username_v5 = aVar2.k(intValue);
                return 0;
            case 26:
                this.vest_nickname = aVar2.k(intValue);
                return 0;
            case 27:
                this.feed_count = aVar2.g(intValue);
                return 0;
            case 28:
                this.user_mode = aVar2.g(intValue);
                return 0;
            case 31:
                this.cover_url = aVar2.k(intValue);
                return 0;
            case 32:
                this.cover_entrance_flag = aVar2.g(intValue);
                return 0;
            case 33:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j29.get(i29);
                    com.tencent.wechat.aff.newlife.AchievementInfo achievementInfo3 = new com.tencent.wechat.aff.newlife.AchievementInfo();
                    if (bArr5 != null && bArr5.length > 0) {
                        achievementInfo3.parseFrom(bArr5);
                    }
                    this.achievement_info = achievementInfo3;
                }
                return 0;
            case 35:
                this.user_flag = aVar2.g(intValue);
                return 0;
            case 36:
                this.one_time_flag = aVar2.g(intValue);
                return 0;
            case 38:
                this.status = aVar2.i(intValue);
                return 0;
            case 40:
                this.additional_flag = aVar2.i(intValue);
                return 0;
            case 41:
                this.hobbies_flag = aVar2.g(intValue);
                return 0;
            case 42:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j37.get(i37);
                    com.tencent.wechat.aff.newlife.FinderMemberInfo finderMemberInfo3 = new com.tencent.wechat.aff.newlife.FinderMemberInfo();
                    if (bArr6 != null && bArr6.length > 0) {
                        finderMemberInfo3.parseFrom(bArr6);
                    }
                    this.member_info = finderMemberInfo3;
                }
                return 0;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j38.get(i38);
                    com.tencent.wechat.aff.newlife.FinderContactClubInfo finderContactClubInfo3 = new com.tencent.wechat.aff.newlife.FinderContactClubInfo();
                    if (bArr7 != null && bArr7.length > 0) {
                        finderContactClubInfo3.parseFrom(bArr7);
                    }
                    this.club_info = finderContactClubInfo3;
                }
                return 0;
        }
    }

    public com.tencent.wechat.aff.newlife.FinderContact setAchievementInfo(com.tencent.wechat.aff.newlife.AchievementInfo achievementInfo) {
        this.achievement_info = achievementInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setAchievement_info(com.tencent.wechat.aff.newlife.AchievementInfo achievementInfo) {
        this.achievement_info = achievementInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setAdditionalFlag(long j17) {
        this.additional_flag = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setAdditional_flag(long j17) {
        this.additional_flag = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setAuthInfo(com.tencent.wechat.aff.newlife.FinderAuthInfo finderAuthInfo) {
        this.auth_info = finderAuthInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setAuth_info(com.tencent.wechat.aff.newlife.FinderAuthInfo finderAuthInfo) {
        this.auth_info = finderAuthInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setClubInfo(com.tencent.wechat.aff.newlife.FinderContactClubInfo finderContactClubInfo) {
        this.club_info = finderContactClubInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setClub_info(com.tencent.wechat.aff.newlife.FinderContactClubInfo finderContactClubInfo) {
        this.club_info = finderContactClubInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setCoverEntranceFlag(int i17) {
        this.cover_entrance_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setCoverImgUrl(java.lang.String str) {
        this.cover_img_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setCoverUrl(java.lang.String str) {
        this.cover_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setCover_entrance_flag(int i17) {
        this.cover_entrance_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setCover_img_url(java.lang.String str) {
        this.cover_img_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setCover_url(java.lang.String str) {
        this.cover_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setExtFlag(int i17) {
        this.ext_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setExtInfo(com.tencent.wechat.aff.newlife.FinderContactExtInfo finderContactExtInfo) {
        this.ext_info = finderContactExtInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setExt_flag(int i17) {
        this.ext_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setExt_info(com.tencent.wechat.aff.newlife.FinderContactExtInfo finderContactExtInfo) {
        this.ext_info = finderContactExtInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setFansCount(int i17) {
        this.fans_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setFans_count(int i17) {
        this.fans_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setFeedCount(int i17) {
        this.feed_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setFeed_count(int i17) {
        this.feed_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setFollowFlag(int i17) {
        this.follow_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setFollowTime(int i17) {
        this.follow_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setFollow_flag(int i17) {
        this.follow_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setFollow_time(int i17) {
        this.follow_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setForeignUserFlag(int i17) {
        this.foreign_user_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setForeign_user_flag(int i17) {
        this.foreign_user_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setFriendFollowCount(int i17) {
        this.friend_follow_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setFriend_follow_count(int i17) {
        this.friend_follow_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setHeadUrl(java.lang.String str) {
        this.head_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setHead_url(java.lang.String str) {
        this.head_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setHobbiesFlag(int i17) {
        this.hobbies_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setHobbies_flag(int i17) {
        this.hobbies_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setLiveCoverImgUrl(java.lang.String str) {
        this.live_cover_img_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setLiveStatus(int i17) {
        this.live_status = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setLive_cover_img_url(java.lang.String str) {
        this.live_cover_img_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setLive_status(int i17) {
        this.live_status = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setLoggingoutWording(java.lang.String str) {
        this.loggingout_wording = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setLoggingout_wording(java.lang.String str) {
        this.loggingout_wording = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setMemberInfo(com.tencent.wechat.aff.newlife.FinderMemberInfo finderMemberInfo) {
        this.member_info = finderMemberInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setMember_info(com.tencent.wechat.aff.newlife.FinderMemberInfo finderMemberInfo) {
        this.member_info = finderMemberInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setMsgInfo(com.tencent.wechat.aff.newlife.FinderContactMsgInfo finderContactMsgInfo) {
        this.msg_info = finderContactMsgInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setMsg_info(com.tencent.wechat.aff.newlife.FinderContactMsgInfo finderContactMsgInfo) {
        this.msg_info = finderContactMsgInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setNickname(java.lang.String str) {
        this.nickname = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setOneTimeFlag(int i17) {
        this.one_time_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setOne_time_flag(int i17) {
        this.one_time_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setOriginalEntranceFlag(int i17) {
        this.original_entrance_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setOriginalFlag(int i17) {
        this.original_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setOriginalInfo(com.tencent.wechat.aff.newlife.FinderOriginalInfo finderOriginalInfo) {
        this.original_info = finderOriginalInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setOriginal_entrance_flag(int i17) {
        this.original_entrance_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setOriginal_flag(int i17) {
        this.original_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setOriginal_info(com.tencent.wechat.aff.newlife.FinderOriginalInfo finderOriginalInfo) {
        this.original_info = finderOriginalInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setSeq(long j17) {
        this.seq = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setSignature(java.lang.String str) {
        this.signature = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setSpamStatus(int i17) {
        this.spam_status = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setSpam_status(int i17) {
        this.spam_status = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setStatus(long j17) {
        this.status = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setUserFlag(int i17) {
        this.user_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setUserMode(int i17) {
        this.user_mode = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setUser_flag(int i17) {
        this.user_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setUser_mode(int i17) {
        this.user_mode = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setUsername(java.lang.String str) {
        this.username = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setVestNickname(java.lang.String str) {
        this.vest_nickname = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setVest_nickname(java.lang.String str) {
        this.vest_nickname = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setWxUsernameV5(java.lang.String str) {
        this.wx_username_v5 = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact setWx_username_v5(java.lang.String str) {
        this.wx_username_v5 = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContact mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderContact parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderContact) super.parseFrom(bArr);
    }
}
