package com.tencent.mm.protocal.protobuf;

/* loaded from: classes10.dex */
public class FinderContact extends com.tencent.mm.protobuf.e {
    public FinderContact() {
        super(com.tencent.mm.protobuf.i.u(1, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(2, "nickname"), com.tencent.mm.protobuf.i.u(3, "headUrl"), com.tencent.mm.protobuf.i.n(4, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ), com.tencent.mm.protobuf.i.u(5, "signature"), com.tencent.mm.protobuf.i.i(6, "followFlag"), com.tencent.mm.protobuf.i.i(7, "followTime"), com.tencent.mm.protobuf.i.r(8, "authInfo", com.tencent.mm.protocal.protobuf.FinderAuthInfo.class), com.tencent.mm.protobuf.i.u(9, "coverImgUrl"), com.tencent.mm.protobuf.i.i(10, "spamStatus"), com.tencent.mm.protobuf.i.i(11, "extFlag"), com.tencent.mm.protobuf.i.r(12, "extInfo", r45.hz0.class), com.tencent.mm.protobuf.i.i(13, "originalFlag"), com.tencent.mm.protobuf.i.r(14, "originalInfo", r45.yn2.class), com.tencent.mm.protobuf.i.i(15, "liveStatus"), com.tencent.mm.protobuf.i.r(16, "msgInfo", r45.lz0.class), com.tencent.mm.protobuf.i.i(17, "originalEntranceFlag"), com.tencent.mm.protobuf.i.u(18, "liveCoverImgUrl"), com.tencent.mm.protobuf.i.i(19, "foreign_user_flag"), com.tencent.mm.protobuf.i.r(20, "live_notice_info", r45.h32.class), com.tencent.mm.protobuf.i.u(21, "loggingout_wording"), com.tencent.mm.protobuf.i.r(22, "live_info", r45.kz0.class), com.tencent.mm.protobuf.i.i(23, "friend_follow_count"), com.tencent.mm.protobuf.i.i(24, "fans_count"), com.tencent.mm.protobuf.i.u(25, "wx_username_v5"), com.tencent.mm.protobuf.i.u(26, "vestNickname"), com.tencent.mm.protobuf.i.i(27, "feedCount"), com.tencent.mm.protobuf.i.i(28, "user_mode"), com.tencent.mm.protobuf.i.r(29, "guest_info", r45.za1.class), com.tencent.mm.protobuf.i.s(30, "bind_info", r45.zv0.class), com.tencent.mm.protobuf.i.u(31, "coverUrl"), com.tencent.mm.protobuf.i.i(32, "coverEntranceFlag"), com.tencent.mm.protobuf.i.r(33, "achievement_info", r45.k1.class), com.tencent.mm.protobuf.i.s(34, "menu", com.tencent.mm.protocal.protobuf.FinderJumpInfo.class), com.tencent.mm.protobuf.i.i(35, "user_flag"), com.tencent.mm.protobuf.i.i(36, "one_time_flag"), com.tencent.mm.protobuf.i.n(38, "status"), com.tencent.mm.protobuf.i.r(39, "live_room_img", r45.ba4.class), com.tencent.mm.protobuf.i.n(40, "additionalFlag"), com.tencent.mm.protobuf.i.r(43, "club_info", r45.dz0.class), com.tencent.mm.protobuf.i.r(44, "privacy_info", r45.mz0.class), com.tencent.mm.protobuf.i.s(46, "reference_info", r45.dt2.class), com.tencent.mm.protobuf.i.r(47, "wxuser_finder_identity_info", r45.ub1.class));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.FinderContact create() {
        return new com.tencent.mm.protocal.protobuf.FinderContact();
    }

    public com.tencent.mm.protocal.protobuf.FinderContact addElementBind_info(r45.zv0 zv0Var) {
        addElement(29, zv0Var);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderContact addElementMenu(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        addElement(33, finderJumpInfo);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderContact addElementReference_info(r45.dt2 dt2Var) {
        addElement(41, dt2Var);
        return this;
    }

    public final r45.k1 getAchievement_info() {
        return (r45.k1) getCustom(32);
    }

    public final long getAdditionalFlag() {
        return getLong(38);
    }

    public final com.tencent.mm.protocal.protobuf.FinderAuthInfo getAuthInfo() {
        return (com.tencent.mm.protocal.protobuf.FinderAuthInfo) getCustom(7);
    }

    public final java.util.LinkedList<r45.zv0> getBind_info() {
        return getList(29);
    }

    public final r45.dz0 getClub_info() {
        return (r45.dz0) getCustom(39);
    }

    public final int getCoverEntranceFlag() {
        return getInteger(31);
    }

    public final java.lang.String getCoverImgUrl() {
        return getString(8);
    }

    public final java.lang.String getCoverUrl() {
        return getString(30);
    }

    public final int getExtFlag() {
        return getInteger(10);
    }

    public final r45.hz0 getExtInfo() {
        return (r45.hz0) getCustom(11);
    }

    public final int getFans_count() {
        return getInteger(23);
    }

    public final int getFeedCount() {
        return getInteger(26);
    }

    public final int getFollowFlag() {
        return getInteger(5);
    }

    public final int getFollowTime() {
        return getInteger(6);
    }

    public final int getForeign_user_flag() {
        return getInteger(18);
    }

    public final int getFriend_follow_count() {
        return getInteger(22);
    }

    public final r45.za1 getGuest_info() {
        return (r45.za1) getCustom(28);
    }

    public final java.lang.String getHeadUrl() {
        return getString(2);
    }

    public final java.lang.String getLiveCoverImgUrl() {
        return getString(17);
    }

    public final int getLiveStatus() {
        return getInteger(14);
    }

    public final r45.kz0 getLive_info() {
        return (r45.kz0) getCustom(21);
    }

    public final r45.h32 getLive_notice_info() {
        return (r45.h32) getCustom(19);
    }

    public final r45.ba4 getLive_room_img() {
        return (r45.ba4) getCustom(37);
    }

    public final java.lang.String getLoggingout_wording() {
        return getString(20);
    }

    public final java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderJumpInfo> getMenu() {
        return getList(33);
    }

    public final r45.lz0 getMsgInfo() {
        return (r45.lz0) getCustom(15);
    }

    public final java.lang.String getNickname() {
        return getString(1);
    }

    public final int getOne_time_flag() {
        return getInteger(35);
    }

    public final int getOriginalEntranceFlag() {
        return getInteger(16);
    }

    public final int getOriginalFlag() {
        return getInteger(12);
    }

    public final r45.yn2 getOriginalInfo() {
        return (r45.yn2) getCustom(13);
    }

    public final r45.mz0 getPrivacy_info() {
        return (r45.mz0) getCustom(40);
    }

    public final java.util.LinkedList<r45.dt2> getReference_info() {
        return getList(41);
    }

    public final long getSeq() {
        return getLong(3);
    }

    public final java.lang.String getSignature() {
        return getString(4);
    }

    public final int getSpamStatus() {
        return getInteger(9);
    }

    public final long getStatus() {
        return getLong(36);
    }

    public final int getUser_flag() {
        return getInteger(34);
    }

    public final int getUser_mode() {
        return getInteger(27);
    }

    public final java.lang.String getUsername() {
        return getString(0);
    }

    public final java.lang.String getVestNickname() {
        return getString(25);
    }

    public final java.lang.String getWx_username_v5() {
        return getString(24);
    }

    public final r45.ub1 getWxuser_finder_identity_info() {
        return (r45.ub1) getCustom(42);
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setAchievement_info(r45.k1 k1Var) {
        set(32, k1Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setAdditionalFlag(long j17) {
        set(38, java.lang.Long.valueOf(j17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setAuthInfo(com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo) {
        set(7, finderAuthInfo);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setBind_info(java.util.LinkedList<r45.zv0> linkedList) {
        set(29, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setClub_info(r45.dz0 dz0Var) {
        set(39, dz0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setCoverEntranceFlag(int i17) {
        set(31, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setCoverImgUrl(java.lang.String str) {
        set(8, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setCoverUrl(java.lang.String str) {
        set(30, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setExtFlag(int i17) {
        set(10, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setExtInfo(r45.hz0 hz0Var) {
        set(11, hz0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setFans_count(int i17) {
        set(23, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setFeedCount(int i17) {
        set(26, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setFollowFlag(int i17) {
        set(5, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setFollowTime(int i17) {
        set(6, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setForeign_user_flag(int i17) {
        set(18, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setFriend_follow_count(int i17) {
        set(22, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setGuest_info(r45.za1 za1Var) {
        set(28, za1Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setHeadUrl(java.lang.String str) {
        set(2, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setLiveCoverImgUrl(java.lang.String str) {
        set(17, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setLiveStatus(int i17) {
        set(14, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setLive_info(r45.kz0 kz0Var) {
        set(21, kz0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setLive_notice_info(r45.h32 h32Var) {
        set(19, h32Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setLive_room_img(r45.ba4 ba4Var) {
        set(37, ba4Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setLoggingout_wording(java.lang.String str) {
        set(20, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setMenu(java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderJumpInfo> linkedList) {
        set(33, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setMsgInfo(r45.lz0 lz0Var) {
        set(15, lz0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setNickname(java.lang.String str) {
        set(1, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setOne_time_flag(int i17) {
        set(35, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setOriginalEntranceFlag(int i17) {
        set(16, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setOriginalFlag(int i17) {
        set(12, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setOriginalInfo(r45.yn2 yn2Var) {
        set(13, yn2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setPrivacy_info(r45.mz0 mz0Var) {
        set(40, mz0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setReference_info(java.util.LinkedList<r45.dt2> linkedList) {
        set(41, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setSeq(long j17) {
        set(3, java.lang.Long.valueOf(j17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setSignature(java.lang.String str) {
        set(4, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setSpamStatus(int i17) {
        set(9, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setStatus(long j17) {
        set(36, java.lang.Long.valueOf(j17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setUser_flag(int i17) {
        set(34, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setUser_mode(int i17) {
        set(27, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setUsername(java.lang.String str) {
        set(0, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setVestNickname(java.lang.String str) {
        set(25, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setWx_username_v5(java.lang.String str) {
        set(24, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact setWxuser_finder_identity_info(r45.ub1 ub1Var) {
        set(42, ub1Var);
        return this;
    }
}
