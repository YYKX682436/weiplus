package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class FinderUserPageResponse extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public FinderUserPageResponse() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "object", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.u(3, "firstPageMD5"), com.tencent.mm.protobuf.i.r(5, "contact", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.i(6, "feedsCount"), com.tencent.mm.protobuf.i.i(7, "continueFlag"), com.tencent.mm.protobuf.i.r(8, "verifyInfo", r45.nk2.class), com.tencent.mm.protobuf.i.i(9, "fansCount"), com.tencent.mm.protobuf.i.a(10, "lastBuffer"), com.tencent.mm.protobuf.i.i(11, "friendFollowCount"), com.tencent.mm.protobuf.i.w(12, "userTags"), com.tencent.mm.protobuf.i.i(13, "originalEntranceFlag"), com.tencent.mm.protobuf.i.r(14, "entranceInfo", r45.r25.class), com.tencent.mm.protobuf.i.r(15, "preloadInfo", r45.sq2.class), com.tencent.mm.protobuf.i.s(16, "liveObjects", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.i(17, "privateLock"), com.tencent.mm.protobuf.i.r(18, "wxaShopInfo", r45.c33.class), com.tencent.mm.protobuf.i.r(19, "liveNoticeInfo", r45.h32.class), com.tencent.mm.protobuf.i.s(20, "usualTopics", r45.r03.class), com.tencent.mm.protobuf.i.i(22, "logout_lock"), com.tencent.mm.protobuf.i.u(23, "acct_detail_entrance"), com.tencent.mm.protobuf.i.u(24, "loggingout_wording"), com.tencent.mm.protobuf.i.r(25, "poi_info", r45.t13.class), com.tencent.mm.protobuf.i.u(26, "logout_url"), com.tencent.mm.protobuf.i.r(27, "biz_info", r45.fw0.class), com.tencent.mm.protobuf.i.s(28, "eventInfoList", r45.e21.class), com.tencent.mm.protobuf.i.r(29, "just_watch", r45.yc1.class), com.tencent.mm.protobuf.i.r(30, "live_notice_list_info", r45.j32.class), com.tencent.mm.protobuf.i.s(31, "jump_info", com.tencent.mm.protocal.protobuf.FinderJumpInfo.class), com.tencent.mm.protobuf.i.c(33, "has_acct_recommend"), com.tencent.mm.protobuf.i.r(34, "anchor_stat", r45.ah1.class), com.tencent.mm.protobuf.i.r(35, "ip_region_info", r45.dc1.class), com.tencent.mm.protobuf.i.r(36, "mcn_info", r45.sf2.class), com.tencent.mm.protobuf.i.i(37, "preload_expire_time"), com.tencent.mm.protobuf.i.i(38, "mv_object_move_flag"), com.tencent.mm.protobuf.i.u(39, "preload_buffer"), com.tencent.mm.protobuf.i.r(40, "collection_list_info", r45.wx0.class), com.tencent.mm.protobuf.i.r(41, "attr_region_info", r45.dc1.class), com.tencent.mm.protobuf.i.r(42, "club_info", r45.gx0.class), com.tencent.mm.protobuf.i.r(43, "original_info", r45.vn2.class), com.tencent.mm.protobuf.i.r(44, "product_info", com.tencent.mm.protocal.protobuf.FinderJumpInfo.class), com.tencent.mm.protobuf.i.i(45, "feeds_global_fav_count"), com.tencent.mm.protobuf.i.i(46, "feeds_fav_count"), com.tencent.mm.protobuf.i.r(47, "layout_config", r45.zc1.class), com.tencent.mm.protobuf.i.r(48, "profile_banner", r45.er2.class), com.tencent.mm.protobuf.i.i(50, "feeds_chatroom_push_count"), com.tencent.mm.protobuf.i.r(51, "show_info", r45.tr2.class), com.tencent.mm.protobuf.i.r(52, com.tencent.map.geolocation.sapp.TencentLocationListener.RADIO, r45.cj2.class), com.tencent.mm.protobuf.i.r(53, "mile_stone", r45.ah2.class), com.tencent.mm.protobuf.i.r(54, "feed_brief_info", r45.zq0.class), com.tencent.mm.protobuf.i.i(56, "member_status"), com.tencent.mm.protobuf.i.i(57, "feeds_like_count"), com.tencent.mm.protobuf.i.i(58, "feeds_forward_count"), com.tencent.mm.protobuf.i.i(59, "up_continue_flag"), com.tencent.mm.protobuf.i.a(60, "up_lastbuffer"), com.tencent.mm.protobuf.i.u(61, "window_product_url"), com.tencent.mm.protobuf.i.r(62, "next_live_notification_button", r45.fw4.class), com.tencent.mm.protobuf.i.i(63, "allow_guide_to_discover"));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.FinderUserPageResponse create() {
        return new com.tencent.mm.protocal.protobuf.FinderUserPageResponse();
    }

    public com.tencent.mm.protocal.protobuf.FinderUserPageResponse addElementEventInfoList(r45.e21 e21Var) {
        addElement(25, e21Var);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderUserPageResponse addElementJump_info(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        addElement(28, finderJumpInfo);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderUserPageResponse addElementLiveObjects(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        addElement(14, finderObject);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderUserPageResponse addElementObject(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        addElement(1, finderObject);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderUserPageResponse addElementUserTags(java.lang.String str) {
        addElement(10, str);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderUserPageResponse addElementUsualTopics(r45.r03 r03Var) {
        addElement(18, r03Var);
        return this;
    }

    public final java.lang.String getAcct_detail_entrance() {
        return getString(20);
    }

    public final int getAllow_guide_to_discover() {
        return getInteger(57);
    }

    public final r45.ah1 getAnchor_stat() {
        return (r45.ah1) getCustom(30);
    }

    public final r45.dc1 getAttr_region_info() {
        return (r45.dc1) getCustom(37);
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(0);
    }

    public final r45.fw0 getBiz_info() {
        return (r45.fw0) getCustom(24);
    }

    public final r45.gx0 getClub_info() {
        return (r45.gx0) getCustom(38);
    }

    public final r45.wx0 getCollection_list_info() {
        return (r45.wx0) getCustom(36);
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact getContact() {
        return (com.tencent.mm.protocal.protobuf.FinderContact) getCustom(3);
    }

    public final int getContinueFlag() {
        return getInteger(5);
    }

    public final r45.r25 getEntranceInfo() {
        return (r45.r25) getCustom(12);
    }

    public final java.util.LinkedList<r45.e21> getEventInfoList() {
        return getList(25);
    }

    public final int getFansCount() {
        return getInteger(7);
    }

    public final r45.zq0 getFeed_brief_info() {
        return (r45.zq0) getCustom(49);
    }

    public final int getFeedsCount() {
        return getInteger(4);
    }

    public final int getFeeds_chatroom_push_count() {
        return getInteger(45);
    }

    public final int getFeeds_fav_count() {
        return getInteger(42);
    }

    public final int getFeeds_forward_count() {
        return getInteger(52);
    }

    public final int getFeeds_global_fav_count() {
        return getInteger(41);
    }

    public final int getFeeds_like_count() {
        return getInteger(51);
    }

    public final java.lang.String getFirstPageMD5() {
        return getString(2);
    }

    public final int getFriendFollowCount() {
        return getInteger(9);
    }

    public final boolean getHas_acct_recommend() {
        return getBoolean(29);
    }

    public final r45.dc1 getIp_region_info() {
        return (r45.dc1) getCustom(31);
    }

    public final java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderJumpInfo> getJump_info() {
        return getList(28);
    }

    public final r45.yc1 getJust_watch() {
        return (r45.yc1) getCustom(26);
    }

    public final com.tencent.mm.protobuf.g getLastBuffer() {
        return getByteString(8);
    }

    public final r45.zc1 getLayout_config() {
        return (r45.zc1) getCustom(43);
    }

    public final r45.h32 getLiveNoticeInfo() {
        return (r45.h32) getCustom(17);
    }

    public final java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> getLiveObjects() {
        return getList(14);
    }

    public final r45.j32 getLive_notice_list_info() {
        return (r45.j32) getCustom(27);
    }

    public final java.lang.String getLoggingout_wording() {
        return getString(21);
    }

    public final int getLogout_lock() {
        return getInteger(19);
    }

    public final java.lang.String getLogout_url() {
        return getString(23);
    }

    public final r45.sf2 getMcn_info() {
        return (r45.sf2) getCustom(32);
    }

    public final int getMember_status() {
        return getInteger(50);
    }

    public final r45.ah2 getMile_stone() {
        return (r45.ah2) getCustom(48);
    }

    public final int getMv_object_move_flag() {
        return getInteger(34);
    }

    public final r45.fw4 getNext_live_notification_button() {
        return (r45.fw4) getCustom(56);
    }

    public final java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> getObject() {
        return getList(1);
    }

    public final int getOriginalEntranceFlag() {
        return getInteger(11);
    }

    public final r45.vn2 getOriginal_info() {
        return (r45.vn2) getCustom(39);
    }

    public final r45.t13 getPoi_info() {
        return (r45.t13) getCustom(22);
    }

    public final r45.sq2 getPreloadInfo() {
        return (r45.sq2) getCustom(13);
    }

    public final java.lang.String getPreload_buffer() {
        return getString(35);
    }

    public final int getPreload_expire_time() {
        return getInteger(33);
    }

    public final int getPrivateLock() {
        return getInteger(15);
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo getProduct_info() {
        return (com.tencent.mm.protocal.protobuf.FinderJumpInfo) getCustom(40);
    }

    public final r45.er2 getProfile_banner() {
        return (r45.er2) getCustom(44);
    }

    public final r45.cj2 getRadio() {
        return (r45.cj2) getCustom(47);
    }

    public final r45.tr2 getShow_info() {
        return (r45.tr2) getCustom(46);
    }

    public final int getUp_continue_flag() {
        return getInteger(53);
    }

    public final com.tencent.mm.protobuf.g getUp_lastbuffer() {
        return getByteString(54);
    }

    public final java.util.LinkedList<java.lang.String> getUserTags() {
        return getList(10);
    }

    public final java.util.LinkedList<r45.r03> getUsualTopics() {
        return getList(18);
    }

    public final r45.nk2 getVerifyInfo() {
        return (r45.nk2) getCustom(6);
    }

    public final java.lang.String getWindow_product_url() {
        return getString(55);
    }

    public final r45.c33 getWxaShopInfo() {
        return (r45.c33) getCustom(16);
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setAcct_detail_entrance(java.lang.String str) {
        set(20, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setAllow_guide_to_discover(int i17) {
        set(57, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setAnchor_stat(r45.ah1 ah1Var) {
        set(30, ah1Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setAttr_region_info(r45.dc1 dc1Var) {
        set(37, dc1Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setBiz_info(r45.fw0 fw0Var) {
        set(24, fw0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setClub_info(r45.gx0 gx0Var) {
        set(38, gx0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setCollection_list_info(r45.wx0 wx0Var) {
        set(36, wx0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setContact(com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        set(3, finderContact);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setContinueFlag(int i17) {
        set(5, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setEntranceInfo(r45.r25 r25Var) {
        set(12, r25Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setEventInfoList(java.util.LinkedList<r45.e21> linkedList) {
        set(25, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setFansCount(int i17) {
        set(7, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setFeed_brief_info(r45.zq0 zq0Var) {
        set(49, zq0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setFeedsCount(int i17) {
        set(4, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setFeeds_chatroom_push_count(int i17) {
        set(45, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setFeeds_fav_count(int i17) {
        set(42, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setFeeds_forward_count(int i17) {
        set(52, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setFeeds_global_fav_count(int i17) {
        set(41, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setFeeds_like_count(int i17) {
        set(51, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setFirstPageMD5(java.lang.String str) {
        set(2, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setFriendFollowCount(int i17) {
        set(9, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setHas_acct_recommend(boolean z17) {
        set(29, java.lang.Boolean.valueOf(z17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setIp_region_info(r45.dc1 dc1Var) {
        set(31, dc1Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setJump_info(java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderJumpInfo> linkedList) {
        set(28, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setJust_watch(r45.yc1 yc1Var) {
        set(26, yc1Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setLastBuffer(com.tencent.mm.protobuf.g gVar) {
        set(8, gVar);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setLayout_config(r45.zc1 zc1Var) {
        set(43, zc1Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setLiveNoticeInfo(r45.h32 h32Var) {
        set(17, h32Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setLiveObjects(java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> linkedList) {
        set(14, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setLive_notice_list_info(r45.j32 j32Var) {
        set(27, j32Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setLoggingout_wording(java.lang.String str) {
        set(21, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setLogout_lock(int i17) {
        set(19, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setLogout_url(java.lang.String str) {
        set(23, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setMcn_info(r45.sf2 sf2Var) {
        set(32, sf2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setMember_status(int i17) {
        set(50, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setMile_stone(r45.ah2 ah2Var) {
        set(48, ah2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setMv_object_move_flag(int i17) {
        set(34, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setNext_live_notification_button(r45.fw4 fw4Var) {
        set(56, fw4Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setObject(java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> linkedList) {
        set(1, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setOriginalEntranceFlag(int i17) {
        set(11, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setOriginal_info(r45.vn2 vn2Var) {
        set(39, vn2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setPoi_info(r45.t13 t13Var) {
        set(22, t13Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setPreloadInfo(r45.sq2 sq2Var) {
        set(13, sq2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setPreload_buffer(java.lang.String str) {
        set(35, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setPreload_expire_time(int i17) {
        set(33, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setPrivateLock(int i17) {
        set(15, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setProduct_info(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        set(40, finderJumpInfo);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setProfile_banner(r45.er2 er2Var) {
        set(44, er2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setRadio(r45.cj2 cj2Var) {
        set(47, cj2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setShow_info(r45.tr2 tr2Var) {
        set(46, tr2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setUp_continue_flag(int i17) {
        set(53, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setUp_lastbuffer(com.tencent.mm.protobuf.g gVar) {
        set(54, gVar);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setUserTags(java.util.LinkedList<java.lang.String> linkedList) {
        set(10, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setUsualTopics(java.util.LinkedList<r45.r03> linkedList) {
        set(18, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setVerifyInfo(r45.nk2 nk2Var) {
        set(6, nk2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setWindow_product_url(java.lang.String str) {
        set(55, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setWxaShopInfo(r45.c33 c33Var) {
        set(16, c33Var);
        return this;
    }

    @Override // r45.ny3
    public final com.tencent.mm.protocal.protobuf.FinderUserPageResponse setBaseResponse(r45.ie ieVar) {
        set(0, ieVar);
        return this;
    }
}
