package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class FinderObjectDesc extends com.tencent.mm.protobuf.e {
    public FinderObjectDesc() {
        super(com.tencent.mm.protobuf.i.u(1, "description"), com.tencent.mm.protobuf.i.s(2, "media", com.tencent.mm.protocal.protobuf.FinderMedia.class), com.tencent.mm.protobuf.i.i(3, "mediaType"), com.tencent.mm.protobuf.i.r(4, "mediaExtra", com.tencent.mm.protocal.protobuf.FinderMediaExtra.class), com.tencent.mm.protobuf.i.r(5, ya.b.LOCATION, r45.ze2.class), com.tencent.mm.protobuf.i.r(6, "extReading", r45.o21.class), com.tencent.mm.protobuf.i.r(7, "topic", r45.n03.class), com.tencent.mm.protobuf.i.s(8, "mentionedUser", r45.zg2.class), com.tencent.mm.protobuf.i.r(9, "liveDesc", r45.uo1.class), com.tencent.mm.protobuf.i.r(10, "feed_location", r45.ze2.class), com.tencent.mm.protobuf.i.s(11, "mentionedMusics", r45.yg2.class), com.tencent.mm.protobuf.i.r(12, "longVideoDesc", r45.bf2.class), com.tencent.mm.protobuf.i.r(13, "imgFeedBgmInfo", r45.zi2.class), com.tencent.mm.protobuf.i.r(14, "feedBgmInfo", r45.el2.class), com.tencent.mm.protobuf.i.r(15, "fromApp", r45.z31.class), com.tencent.mm.protobuf.i.r(16, "tmpl_info", r45.oz2.class), com.tencent.mm.protobuf.i.r(17, "event", r45.xl2.class), com.tencent.mm.protobuf.i.r(18, "mvInfo", r45.ef2.class), com.tencent.mm.protobuf.i.n(19, "draftObjectId"), com.tencent.mm.protobuf.i.r(20, "client_draft_ext_info", r45.zw0.class), com.tencent.mm.protobuf.i.r(21, "musicInfo", r45.zi2.class), com.tencent.mm.protobuf.i.r(22, "video_tmpl_info", r45.q23.class), com.tencent.mm.protobuf.i.r(23, "generalReportInfo", r45.n41.class), com.tencent.mm.protobuf.i.r(24, "originalsound_info", r45.u25.class), com.tencent.mm.protobuf.i.r(25, "poster_location", r45.ze2.class), com.tencent.mm.protobuf.i.s(26, "short_title", r45.cw2.class), com.tencent.mm.protobuf.i.r(27, "flow_card_desc", r45.l31.class), com.tencent.mm.protobuf.i.r(28, "original_info_desc", r45.xn2.class), com.tencent.mm.protobuf.i.r(29, "finder_newlife_desc", r45.ik2.class), com.tencent.mm.protobuf.i.r(30, "member_qa_vo", r45.jg2.class), com.tencent.mm.protobuf.i.r(31, "member_data", r45.zf2.class), com.tencent.mm.protobuf.i.r(32, "hash_tag_desc", r45.p03.class), com.tencent.mm.protobuf.i.r(33, "general_follow_post_info", r45.q31.class), com.tencent.mm.protobuf.i.u(34, "highlight_description"), com.tencent.mm.protobuf.i.r(35, "mod_feed_info", r45.th2.class), com.tencent.mm.protobuf.i.r(36, "simple_topic_info", r45.hw2.class), com.tencent.mm.protobuf.i.r(38, "interaction_easter_egg", r45.t11.class), com.tencent.mm.protobuf.i.i(39, "set_interaction_easter_egg_scene"));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.FinderObjectDesc create() {
        return new com.tencent.mm.protocal.protobuf.FinderObjectDesc();
    }

    public com.tencent.mm.protocal.protobuf.FinderObjectDesc addElementMedia(com.tencent.mm.protocal.protobuf.FinderMedia finderMedia) {
        addElement(1, finderMedia);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderObjectDesc addElementMentionedMusics(r45.yg2 yg2Var) {
        addElement(10, yg2Var);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderObjectDesc addElementMentionedUser(r45.zg2 zg2Var) {
        addElement(7, zg2Var);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderObjectDesc addElementShort_title(r45.cw2 cw2Var) {
        addElement(25, cw2Var);
        return this;
    }

    public final r45.zw0 getClient_draft_ext_info() {
        return (r45.zw0) getCustom(19);
    }

    public final java.lang.String getDescription() {
        return getString(0);
    }

    public final long getDraftObjectId() {
        return getLong(18);
    }

    public final r45.xl2 getEvent() {
        return (r45.xl2) getCustom(16);
    }

    public final r45.o21 getExtReading() {
        return (r45.o21) getCustom(5);
    }

    public final r45.el2 getFeedBgmInfo() {
        return (r45.el2) getCustom(13);
    }

    public final r45.ze2 getFeed_location() {
        return (r45.ze2) getCustom(9);
    }

    public final r45.ik2 getFinder_newlife_desc() {
        return (r45.ik2) getCustom(28);
    }

    public final r45.l31 getFlow_card_desc() {
        return (r45.l31) getCustom(26);
    }

    public final r45.z31 getFromApp() {
        return (r45.z31) getCustom(14);
    }

    public final r45.n41 getGeneralReportInfo() {
        return (r45.n41) getCustom(22);
    }

    public final r45.q31 getGeneral_follow_post_info() {
        return (r45.q31) getCustom(32);
    }

    public final r45.p03 getHash_tag_desc() {
        return (r45.p03) getCustom(31);
    }

    public final java.lang.String getHighlight_description() {
        return getString(33);
    }

    public final r45.zi2 getImgFeedBgmInfo() {
        return (r45.zi2) getCustom(12);
    }

    public final r45.t11 getInteraction_easter_egg() {
        return (r45.t11) getCustom(36);
    }

    public final r45.uo1 getLiveDesc() {
        return (r45.uo1) getCustom(8);
    }

    public final r45.ze2 getLocation() {
        return (r45.ze2) getCustom(4);
    }

    public final r45.bf2 getLongVideoDesc() {
        return (r45.bf2) getCustom(11);
    }

    public final java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> getMedia() {
        return getList(1);
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaExtra getMediaExtra() {
        return (com.tencent.mm.protocal.protobuf.FinderMediaExtra) getCustom(3);
    }

    public final int getMediaType() {
        return getInteger(2);
    }

    public final r45.zf2 getMember_data() {
        return (r45.zf2) getCustom(30);
    }

    public final r45.jg2 getMember_qa_vo() {
        return (r45.jg2) getCustom(29);
    }

    public final java.util.LinkedList<r45.yg2> getMentionedMusics() {
        return getList(10);
    }

    public final java.util.LinkedList<r45.zg2> getMentionedUser() {
        return getList(7);
    }

    public final r45.th2 getMod_feed_info() {
        return (r45.th2) getCustom(34);
    }

    public final r45.zi2 getMusicInfo() {
        return (r45.zi2) getCustom(20);
    }

    public final r45.ef2 getMvInfo() {
        return (r45.ef2) getCustom(17);
    }

    public final r45.xn2 getOriginal_info_desc() {
        return (r45.xn2) getCustom(27);
    }

    public final r45.u25 getOriginalsound_info() {
        return (r45.u25) getCustom(23);
    }

    public final r45.ze2 getPoster_location() {
        return (r45.ze2) getCustom(24);
    }

    public final int getSet_interaction_easter_egg_scene() {
        return getInteger(37);
    }

    public final java.util.LinkedList<r45.cw2> getShort_title() {
        return getList(25);
    }

    public final r45.hw2 getSimple_topic_info() {
        return (r45.hw2) getCustom(35);
    }

    public final r45.oz2 getTmpl_info() {
        return (r45.oz2) getCustom(15);
    }

    public final r45.n03 getTopic() {
        return (r45.n03) getCustom(6);
    }

    public final r45.q23 getVideo_tmpl_info() {
        return (r45.q23) getCustom(21);
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setClient_draft_ext_info(r45.zw0 zw0Var) {
        set(19, zw0Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setDescription(java.lang.String str) {
        set(0, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setDraftObjectId(long j17) {
        set(18, java.lang.Long.valueOf(j17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setEvent(r45.xl2 xl2Var) {
        set(16, xl2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setExtReading(r45.o21 o21Var) {
        set(5, o21Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setFeedBgmInfo(r45.el2 el2Var) {
        set(13, el2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setFeed_location(r45.ze2 ze2Var) {
        set(9, ze2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setFinder_newlife_desc(r45.ik2 ik2Var) {
        set(28, ik2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setFlow_card_desc(r45.l31 l31Var) {
        set(26, l31Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setFromApp(r45.z31 z31Var) {
        set(14, z31Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setGeneralReportInfo(r45.n41 n41Var) {
        set(22, n41Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setGeneral_follow_post_info(r45.q31 q31Var) {
        set(32, q31Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setHash_tag_desc(r45.p03 p03Var) {
        set(31, p03Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setHighlight_description(java.lang.String str) {
        set(33, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setImgFeedBgmInfo(r45.zi2 zi2Var) {
        set(12, zi2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setInteraction_easter_egg(r45.t11 t11Var) {
        set(36, t11Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setLiveDesc(r45.uo1 uo1Var) {
        set(8, uo1Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setLocation(r45.ze2 ze2Var) {
        set(4, ze2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setLongVideoDesc(r45.bf2 bf2Var) {
        set(11, bf2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setMedia(java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> linkedList) {
        set(1, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setMediaExtra(com.tencent.mm.protocal.protobuf.FinderMediaExtra finderMediaExtra) {
        set(3, finderMediaExtra);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setMediaType(int i17) {
        set(2, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setMember_data(r45.zf2 zf2Var) {
        set(30, zf2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setMember_qa_vo(r45.jg2 jg2Var) {
        set(29, jg2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setMentionedMusics(java.util.LinkedList<r45.yg2> linkedList) {
        set(10, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setMentionedUser(java.util.LinkedList<r45.zg2> linkedList) {
        set(7, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setMod_feed_info(r45.th2 th2Var) {
        set(34, th2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setMusicInfo(r45.zi2 zi2Var) {
        set(20, zi2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setMvInfo(r45.ef2 ef2Var) {
        set(17, ef2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setOriginal_info_desc(r45.xn2 xn2Var) {
        set(27, xn2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setOriginalsound_info(r45.u25 u25Var) {
        set(23, u25Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setPoster_location(r45.ze2 ze2Var) {
        set(24, ze2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setSet_interaction_easter_egg_scene(int i17) {
        set(37, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setShort_title(java.util.LinkedList<r45.cw2> linkedList) {
        set(25, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setSimple_topic_info(r45.hw2 hw2Var) {
        set(35, hw2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setTmpl_info(r45.oz2 oz2Var) {
        set(15, oz2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setTopic(r45.n03 n03Var) {
        set(6, n03Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc setVideo_tmpl_info(r45.q23 q23Var) {
        set(21, q23Var);
        return this;
    }
}
