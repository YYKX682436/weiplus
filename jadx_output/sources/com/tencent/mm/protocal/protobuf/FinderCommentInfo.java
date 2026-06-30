package com.tencent.mm.protocal.protobuf;

/* loaded from: classes10.dex */
public class FinderCommentInfo extends com.tencent.mm.protobuf.e {
    public FinderCommentInfo() {
        super(com.tencent.mm.protobuf.i.u(1, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(2, "nickname"), com.tencent.mm.protobuf.i.u(3, "content"), com.tencent.mm.protobuf.i.n(4, "commentId"), com.tencent.mm.protobuf.i.n(5, "replyCommentId"), com.tencent.mm.protobuf.i.i(6, "deleteFlag"), com.tencent.mm.protobuf.i.u(7, "headUrl"), com.tencent.mm.protobuf.i.s(8, "levelTwoComment", com.tencent.mm.protocal.protobuf.FinderCommentInfo.class), com.tencent.mm.protobuf.i.n(9, "createtime"), com.tencent.mm.protobuf.i.u(10, "replyNickname"), com.tencent.mm.protobuf.i.u(11, "displayidDiscarded"), com.tencent.mm.protobuf.i.i(12, "likeFlag"), com.tencent.mm.protobuf.i.i(13, "likeCount"), com.tencent.mm.protobuf.i.n(14, "displayid"), com.tencent.mm.protobuf.i.i(15, "expandCommentCount"), com.tencent.mm.protobuf.i.a(16, "lastBuffer"), com.tencent.mm.protobuf.i.i(17, "continueFlag"), com.tencent.mm.protobuf.i.i(18, "displayFlag"), com.tencent.mm.protobuf.i.i(19, "blacklist_flag"), com.tencent.mm.protobuf.i.u(20, "reply_content"), com.tencent.mm.protobuf.i.u(21, "reply_username"), com.tencent.mm.protobuf.i.u(22, "client_id"), com.tencent.mm.protobuf.i.i(23, "upContinueFlag"), com.tencent.mm.protobuf.i.i(24, "replyBlacklistFlag"), com.tencent.mm.protobuf.i.i(25, "extFlag"), com.tencent.mm.protobuf.i.i(26, "unreadFlag"), com.tencent.mm.protobuf.i.r(27, "msgInfo", r45.lz0.class), com.tencent.mm.protobuf.i.r(28, "author_contact", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.r(29, "reply_contact", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.i(30, ya.b.CONTENT_TYPE), com.tencent.mm.protobuf.i.r(31, "content_info", r45.e60.class), com.tencent.mm.protobuf.i.u(32, "report_json"), com.tencent.mm.protobuf.i.i(33, "dislike_flag"), com.tencent.mm.protobuf.i.i(34, "dislike_count"), com.tencent.mm.protobuf.i.r(35, "ip_region_info", r45.dc1.class), com.tencent.mm.protobuf.i.s(36, "search_keyword_info", r45.my0.class), com.tencent.mm.protobuf.i.u(37, "replaced_content"), com.tencent.mm.protobuf.i.r(38, "advertisement_info", r45.ky0.class), com.tencent.mm.protobuf.i.i(39, "comment_type"), com.tencent.mm.protobuf.i.u(40, "chatroom_member_nickname"), com.tencent.mm.protobuf.i.r(41, "ref_feed_jump_info", r45.m60.class), com.tencent.mm.protobuf.i.s(42, "mentioned_user_info", r45.py0.class), com.tencent.mm.protobuf.i.r(43, "ref_product_jump_info", r45.o60.class), com.tencent.mm.protobuf.i.s(45, "interaction_label_list", r45.zb1.class), com.tencent.mm.protobuf.i.r(46, "promotion_info", r45.qy0.class), com.tencent.mm.protobuf.i.i(47, "recommend_flag"), com.tencent.mm.protobuf.i.i(48, "recommend_count"), com.tencent.mm.protobuf.i.r(49, "friend_recommend_list", r45.k60.class), com.tencent.mm.protobuf.i.r(50, "author_reaction_info", r45.dc.class), com.tencent.mm.protobuf.i.i(52, "thank_flag"), com.tencent.mm.protobuf.i.r(57, "help_promotion_button", r45.ly0.class));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.FinderCommentInfo create() {
        return new com.tencent.mm.protocal.protobuf.FinderCommentInfo();
    }

    public com.tencent.mm.protocal.protobuf.FinderCommentInfo addElementInteraction_label_list(r45.zb1 zb1Var) {
        addElement(43, zb1Var);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderCommentInfo addElementLevelTwoComment(com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo) {
        addElement(7, finderCommentInfo);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderCommentInfo addElementMentioned_user_info(r45.py0 py0Var) {
        addElement(41, py0Var);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderCommentInfo addElementSearch_keyword_info(r45.my0 my0Var) {
        addElement(35, my0Var);
        return this;
    }

    public final r45.ky0 getAdvertisement_info() {
        return (r45.ky0) getCustom(37);
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact getAuthor_contact() {
        return (com.tencent.mm.protocal.protobuf.FinderContact) getCustom(27);
    }

    public final r45.dc getAuthor_reaction_info() {
        return (r45.dc) getCustom(48);
    }

    public final int getBlacklist_flag() {
        return getInteger(18);
    }

    public final java.lang.String getChatroom_member_nickname() {
        return getString(39);
    }

    public final java.lang.String getClient_id() {
        return getString(21);
    }

    public final long getCommentId() {
        return getLong(3);
    }

    public final int getComment_type() {
        return getInteger(38);
    }

    public final java.lang.String getContent() {
        return getString(2);
    }

    public final r45.e60 getContent_info() {
        return (r45.e60) getCustom(30);
    }

    public final int getContent_type() {
        return getInteger(29);
    }

    public final int getContinueFlag() {
        return getInteger(16);
    }

    public final long getCreatetime() {
        return getLong(8);
    }

    public final int getDeleteFlag() {
        return getInteger(5);
    }

    public final int getDislike_count() {
        return getInteger(33);
    }

    public final int getDislike_flag() {
        return getInteger(32);
    }

    public final int getDisplayFlag() {
        return getInteger(17);
    }

    public final long getDisplayid() {
        return getLong(13);
    }

    public final java.lang.String getDisplayidDiscarded() {
        return getString(10);
    }

    public final int getExpandCommentCount() {
        return getInteger(14);
    }

    public final int getExtFlag() {
        return getInteger(24);
    }

    public final r45.k60 getFriend_recommend_list() {
        return (r45.k60) getCustom(47);
    }

    public final java.lang.String getHeadUrl() {
        return getString(6);
    }

    public final r45.ly0 getHelp_promotion_button() {
        return (r45.ly0) getCustom(50);
    }

    public final java.util.LinkedList<r45.zb1> getInteraction_label_list() {
        return getList(43);
    }

    public final r45.dc1 getIp_region_info() {
        return (r45.dc1) getCustom(34);
    }

    public final com.tencent.mm.protobuf.g getLastBuffer() {
        return getByteString(15);
    }

    public final java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> getLevelTwoComment() {
        return getList(7);
    }

    public final int getLikeCount() {
        return getInteger(12);
    }

    public final int getLikeFlag() {
        return getInteger(11);
    }

    public final java.util.LinkedList<r45.py0> getMentioned_user_info() {
        return getList(41);
    }

    public final r45.lz0 getMsgInfo() {
        return (r45.lz0) getCustom(26);
    }

    public final java.lang.String getNickname() {
        return getString(1);
    }

    public final r45.qy0 getPromotion_info() {
        return (r45.qy0) getCustom(44);
    }

    public final int getRecommend_count() {
        return getInteger(46);
    }

    public final int getRecommend_flag() {
        return getInteger(45);
    }

    public final r45.m60 getRef_feed_jump_info() {
        return (r45.m60) getCustom(40);
    }

    public final r45.o60 getRef_product_jump_info() {
        return (r45.o60) getCustom(42);
    }

    public final java.lang.String getReplaced_content() {
        return getString(36);
    }

    public final int getReplyBlacklistFlag() {
        return getInteger(23);
    }

    public final long getReplyCommentId() {
        return getLong(4);
    }

    public final java.lang.String getReplyNickname() {
        return getString(9);
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact getReply_contact() {
        return (com.tencent.mm.protocal.protobuf.FinderContact) getCustom(28);
    }

    public final java.lang.String getReply_content() {
        return getString(19);
    }

    public final java.lang.String getReply_username() {
        return getString(20);
    }

    public final java.lang.String getReport_json() {
        return getString(31);
    }

    public final java.util.LinkedList<r45.my0> getSearch_keyword_info() {
        return getList(35);
    }

    public final int getThank_flag() {
        return getInteger(49);
    }

    public final int getUnreadFlag() {
        return getInteger(25);
    }

    public final int getUpContinueFlag() {
        return getInteger(22);
    }

    public final java.lang.String getUsername() {
        return getString(0);
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setAdvertisement_info(r45.ky0 ky0Var) {
        set(37, ky0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setAuthor_contact(com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        set(27, finderContact);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setAuthor_reaction_info(r45.dc dcVar) {
        set(48, dcVar);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setBlacklist_flag(int i17) {
        set(18, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setChatroom_member_nickname(java.lang.String str) {
        set(39, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setClient_id(java.lang.String str) {
        set(21, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setCommentId(long j17) {
        set(3, java.lang.Long.valueOf(j17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setComment_type(int i17) {
        set(38, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setContent(java.lang.String str) {
        set(2, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setContent_info(r45.e60 e60Var) {
        set(30, e60Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setContent_type(int i17) {
        set(29, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setContinueFlag(int i17) {
        set(16, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setCreatetime(long j17) {
        set(8, java.lang.Long.valueOf(j17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setDeleteFlag(int i17) {
        set(5, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setDislike_count(int i17) {
        set(33, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setDislike_flag(int i17) {
        set(32, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setDisplayFlag(int i17) {
        set(17, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setDisplayid(long j17) {
        set(13, java.lang.Long.valueOf(j17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setDisplayidDiscarded(java.lang.String str) {
        set(10, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setExpandCommentCount(int i17) {
        set(14, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setExtFlag(int i17) {
        set(24, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setFriend_recommend_list(r45.k60 k60Var) {
        set(47, k60Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setHeadUrl(java.lang.String str) {
        set(6, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setHelp_promotion_button(r45.ly0 ly0Var) {
        set(50, ly0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setInteraction_label_list(java.util.LinkedList<r45.zb1> linkedList) {
        set(43, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setIp_region_info(r45.dc1 dc1Var) {
        set(34, dc1Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setLastBuffer(com.tencent.mm.protobuf.g gVar) {
        set(15, gVar);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setLevelTwoComment(java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> linkedList) {
        set(7, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setLikeCount(int i17) {
        set(12, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setLikeFlag(int i17) {
        set(11, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setMentioned_user_info(java.util.LinkedList<r45.py0> linkedList) {
        set(41, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setMsgInfo(r45.lz0 lz0Var) {
        set(26, lz0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setNickname(java.lang.String str) {
        set(1, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setPromotion_info(r45.qy0 qy0Var) {
        set(44, qy0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setRecommend_count(int i17) {
        set(46, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setRecommend_flag(int i17) {
        set(45, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setRef_feed_jump_info(r45.m60 m60Var) {
        set(40, m60Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setRef_product_jump_info(r45.o60 o60Var) {
        set(42, o60Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setReplaced_content(java.lang.String str) {
        set(36, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setReplyBlacklistFlag(int i17) {
        set(23, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setReplyCommentId(long j17) {
        set(4, java.lang.Long.valueOf(j17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setReplyNickname(java.lang.String str) {
        set(9, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setReply_contact(com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        set(28, finderContact);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setReply_content(java.lang.String str) {
        set(19, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setReply_username(java.lang.String str) {
        set(20, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setReport_json(java.lang.String str) {
        set(31, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setSearch_keyword_info(java.util.LinkedList<r45.my0> linkedList) {
        set(35, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setThank_flag(int i17) {
        set(49, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setUnreadFlag(int i17) {
        set(25, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setUpContinueFlag(int i17) {
        set(22, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo setUsername(java.lang.String str) {
        set(0, str);
        return this;
    }
}
