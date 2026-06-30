package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class FinderJumpInfo extends com.tencent.mm.protobuf.e {
    public FinderJumpInfo() {
        super(com.tencent.mm.protobuf.i.i(1, "jumpinfo_type"), com.tencent.mm.protobuf.i.i(2, "business_type"), com.tencent.mm.protobuf.i.u(3, "icon_url"), com.tencent.mm.protobuf.i.u(4, "wording"), com.tencent.mm.protobuf.i.u(5, "recommend_reason"), com.tencent.mm.protobuf.i.u(6, "ext_info"), com.tencent.mm.protobuf.i.u(7, "report_info"), com.tencent.mm.protobuf.i.r(8, "mini_app_info", com.tencent.mm.protocal.protobuf.MiniAppInfo.class), com.tencent.mm.protobuf.i.r(9, "html5_info", com.tencent.mm.protocal.protobuf.Html5Info.class), com.tencent.mm.protobuf.i.r(10, "native_info", com.tencent.mm.protocal.protobuf.NativeInfo.class), com.tencent.mm.protobuf.i.r(11, "schema_info", com.tencent.mm.protocal.protobuf.SchemaInfo.class), com.tencent.mm.protobuf.i.i(12, ya.b.SOURCE), com.tencent.mm.protobuf.i.i(13, "expired_ts"), com.tencent.mm.protobuf.i.i(14, "dislike"), com.tencent.mm.protobuf.i.u(15, "icon_url_dark"), com.tencent.mm.protobuf.i.u(16, "icon_url_bg"), com.tencent.mm.protobuf.i.a(17, "ext_buff"), com.tencent.mm.protobuf.i.r(18, "red_dot", com.tencent.mm.protocal.protobuf.FinderJumpInfoRedDot.class), com.tencent.mm.protobuf.i.u(19, "jump_id"), com.tencent.mm.protobuf.i.i(20, "banner_type"), com.tencent.mm.protobuf.i.i(21, "position"), com.tencent.mm.protobuf.i.u(22, "icon_name"), com.tencent.mm.protobuf.i.i(23, "support_share"), com.tencent.mm.protobuf.i.c(24, "need_preload"), com.tencent.mm.protobuf.i.r(25, "lite_app_info", r45.k74.class), com.tencent.mm.protobuf.i.s(26, "style", r45.wf6.class), com.tencent.mm.protobuf.i.i(27, "ext_type"), com.tencent.mm.protobuf.i.i(28, "effective_duration"), com.tencent.mm.protobuf.i.i(29, "delay_preload_time"), com.tencent.mm.protobuf.i.i(30, "red_packet_type"), com.tencent.mm.protobuf.i.u(31, "group_key"), com.tencent.mm.protobuf.i.i(33, "icon_type"), com.tencent.mm.protobuf.i.u(34, "pag_icon_url"), com.tencent.mm.protobuf.i.c(37, "need_auto_show"), com.tencent.mm.protobuf.i.u(39, "click_button_name"), com.tencent.mm.protobuf.i.r(41, "online_help_info", r45.yy4.class), com.tencent.mm.protobuf.i.u(42, "open_popup_wording"), com.tencent.mm.protobuf.i.u(43, "open_popup_title"), com.tencent.mm.protobuf.i.i(44, "business_sub_type"), com.tencent.mm.protobuf.i.r(45, "flutter_info", r45.a43.class), com.tencent.mm.protobuf.i.i(46, "group_style_type"), com.tencent.mm.protobuf.i.u(47, "jump_page_id"), com.tencent.mm.protobuf.i.r(48, "ecs_jump_info", bw5.x7.class), com.tencent.mm.protobuf.i.i(49, "single_scene_effect"), com.tencent.mm.protobuf.i.c(51, "is_native_ad_component"), com.tencent.mm.protobuf.i.i(52, "business_category"), com.tencent.mm.protobuf.i.u(54, "cli_report_info"));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.FinderJumpInfo create() {
        return new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
    }

    public com.tencent.mm.protocal.protobuf.FinderJumpInfo addElementStyle(r45.wf6 wf6Var) {
        addElement(25, wf6Var);
        return this;
    }

    public final int getBanner_type() {
        return getInteger(19);
    }

    public final int getBusiness_category() {
        return getInteger(45);
    }

    public final int getBusiness_sub_type() {
        return getInteger(38);
    }

    public final int getBusiness_type() {
        return getInteger(1);
    }

    public final java.lang.String getCli_report_info() {
        return getString(46);
    }

    public final java.lang.String getClick_button_name() {
        return getString(34);
    }

    public final int getDelay_preload_time() {
        return getInteger(28);
    }

    public final int getDislike() {
        return getInteger(13);
    }

    public final bw5.x7 getEcs_jump_info() {
        return (bw5.x7) getCustom(42);
    }

    public final int getEffective_duration() {
        return getInteger(27);
    }

    public final int getExpired_ts() {
        return getInteger(12);
    }

    public final com.tencent.mm.protobuf.g getExt_buff() {
        return getByteString(16);
    }

    public final java.lang.String getExt_info() {
        return getString(5);
    }

    public final int getExt_type() {
        return getInteger(26);
    }

    public final r45.a43 getFlutter_info() {
        return (r45.a43) getCustom(39);
    }

    public final java.lang.String getGroup_key() {
        return getString(30);
    }

    public final int getGroup_style_type() {
        return getInteger(40);
    }

    public final com.tencent.mm.protocal.protobuf.Html5Info getHtml5_info() {
        return (com.tencent.mm.protocal.protobuf.Html5Info) getCustom(8);
    }

    public final java.lang.String getIcon_name() {
        return getString(21);
    }

    public final int getIcon_type() {
        return getInteger(31);
    }

    public final java.lang.String getIcon_url() {
        return getString(2);
    }

    public final java.lang.String getIcon_url_bg() {
        return getString(15);
    }

    public final java.lang.String getIcon_url_dark() {
        return getString(14);
    }

    public final boolean getIs_native_ad_component() {
        return getBoolean(44);
    }

    public final java.lang.String getJump_id() {
        return getString(18);
    }

    public final java.lang.String getJump_page_id() {
        return getString(41);
    }

    public final int getJumpinfo_type() {
        return getInteger(0);
    }

    public final r45.k74 getLite_app_info() {
        return (r45.k74) getCustom(24);
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo getMini_app_info() {
        return (com.tencent.mm.protocal.protobuf.MiniAppInfo) getCustom(7);
    }

    public final com.tencent.mm.protocal.protobuf.NativeInfo getNative_info() {
        return (com.tencent.mm.protocal.protobuf.NativeInfo) getCustom(9);
    }

    public final boolean getNeed_auto_show() {
        return getBoolean(33);
    }

    public final boolean getNeed_preload() {
        return getBoolean(23);
    }

    public final r45.yy4 getOnline_help_info() {
        return (r45.yy4) getCustom(35);
    }

    public final java.lang.String getOpen_popup_title() {
        return getString(37);
    }

    public final java.lang.String getOpen_popup_wording() {
        return getString(36);
    }

    public final java.lang.String getPag_icon_url() {
        return getString(32);
    }

    public final int getPosition() {
        return getInteger(20);
    }

    public final java.lang.String getRecommend_reason() {
        return getString(4);
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfoRedDot getRed_dot() {
        return (com.tencent.mm.protocal.protobuf.FinderJumpInfoRedDot) getCustom(17);
    }

    public final int getRed_packet_type() {
        return getInteger(29);
    }

    public final java.lang.String getReport_info() {
        return getString(6);
    }

    public final com.tencent.mm.protocal.protobuf.SchemaInfo getSchema_info() {
        return (com.tencent.mm.protocal.protobuf.SchemaInfo) getCustom(10);
    }

    public final int getSingle_scene_effect() {
        return getInteger(43);
    }

    public final int getSource() {
        return getInteger(11);
    }

    public final java.util.LinkedList<r45.wf6> getStyle() {
        return getList(25);
    }

    public final int getSupport_share() {
        return getInteger(22);
    }

    public final java.lang.String getWording() {
        return getString(3);
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setBanner_type(int i17) {
        set(19, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setBusiness_category(int i17) {
        set(45, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setBusiness_sub_type(int i17) {
        set(38, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setBusiness_type(int i17) {
        set(1, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setCli_report_info(java.lang.String str) {
        set(46, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setClick_button_name(java.lang.String str) {
        set(34, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setDelay_preload_time(int i17) {
        set(28, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setDislike(int i17) {
        set(13, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setEcs_jump_info(bw5.x7 x7Var) {
        set(42, x7Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setEffective_duration(int i17) {
        set(27, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setExpired_ts(int i17) {
        set(12, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setExt_buff(com.tencent.mm.protobuf.g gVar) {
        set(16, gVar);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setExt_info(java.lang.String str) {
        set(5, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setExt_type(int i17) {
        set(26, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setFlutter_info(r45.a43 a43Var) {
        set(39, a43Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setGroup_key(java.lang.String str) {
        set(30, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setGroup_style_type(int i17) {
        set(40, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setHtml5_info(com.tencent.mm.protocal.protobuf.Html5Info html5Info) {
        set(8, html5Info);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setIcon_name(java.lang.String str) {
        set(21, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setIcon_type(int i17) {
        set(31, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setIcon_url(java.lang.String str) {
        set(2, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setIcon_url_bg(java.lang.String str) {
        set(15, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setIcon_url_dark(java.lang.String str) {
        set(14, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setIs_native_ad_component(boolean z17) {
        set(44, java.lang.Boolean.valueOf(z17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setJump_id(java.lang.String str) {
        set(18, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setJump_page_id(java.lang.String str) {
        set(41, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setJumpinfo_type(int i17) {
        set(0, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setLite_app_info(r45.k74 k74Var) {
        set(24, k74Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setMini_app_info(com.tencent.mm.protocal.protobuf.MiniAppInfo miniAppInfo) {
        set(7, miniAppInfo);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setNative_info(com.tencent.mm.protocal.protobuf.NativeInfo nativeInfo) {
        set(9, nativeInfo);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setNeed_auto_show(boolean z17) {
        set(33, java.lang.Boolean.valueOf(z17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setNeed_preload(boolean z17) {
        set(23, java.lang.Boolean.valueOf(z17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setOnline_help_info(r45.yy4 yy4Var) {
        set(35, yy4Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setOpen_popup_title(java.lang.String str) {
        set(37, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setOpen_popup_wording(java.lang.String str) {
        set(36, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setPag_icon_url(java.lang.String str) {
        set(32, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setPosition(int i17) {
        set(20, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setRecommend_reason(java.lang.String str) {
        set(4, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setRed_dot(com.tencent.mm.protocal.protobuf.FinderJumpInfoRedDot finderJumpInfoRedDot) {
        set(17, finderJumpInfoRedDot);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setRed_packet_type(int i17) {
        set(29, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setReport_info(java.lang.String str) {
        set(6, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setSchema_info(com.tencent.mm.protocal.protobuf.SchemaInfo schemaInfo) {
        set(10, schemaInfo);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setSingle_scene_effect(int i17) {
        set(43, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setSource(int i17) {
        set(11, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setStyle(java.util.LinkedList<r45.wf6> linkedList) {
        set(25, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setSupport_share(int i17) {
        set(22, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo setWording(java.lang.String str) {
        set(3, str);
        return this;
    }
}
