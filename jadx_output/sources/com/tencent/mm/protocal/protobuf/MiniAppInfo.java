package com.tencent.mm.protocal.protobuf;

/* loaded from: classes10.dex */
public class MiniAppInfo extends com.tencent.mm.protobuf.e {
    public MiniAppInfo() {
        super(com.tencent.mm.protobuf.i.u(1, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID), com.tencent.mm.protobuf.i.u(2, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), com.tencent.mm.protobuf.i.u(3, "fetch_info_id"), com.tencent.mm.protobuf.i.u(4, "request_id"), com.tencent.mm.protobuf.i.u(5, "appusername"), com.tencent.mm.protobuf.i.i(6, "version_type"), com.tencent.mm.protobuf.i.a(7, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_EXTRA_DATA), com.tencent.mm.protobuf.i.u(8, "product_path_cookie"), com.tencent.mm.protobuf.i.i(9, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.c(10, "hide_default_bar"), com.tencent.mm.protobuf.i.c(11, "hide_drag_bar"), com.tencent.mm.protobuf.i.i(12, "launch_animation_type"), com.tencent.mm.protobuf.i.u(13, "scene_note"), com.tencent.mm.protobuf.i.i(14, "type"), com.tencent.mm.protobuf.i.u(15, "open_extra_data"), com.tencent.mm.protobuf.i.i(16, "half_page_custom_height"), com.tencent.mm.protobuf.i.n(17, "out_product_id"), com.tencent.mm.protobuf.i.u(18, "open_popup_wording"), com.tencent.mm.protobuf.i.u(19, "open_popup_title"), com.tencent.mm.protobuf.i.u(20, "tooltip_wording"), com.tencent.mm.protobuf.i.u(21, "transit_common_ux_info"), com.tencent.mm.protobuf.i.c(22, "transparent_mode"), com.tencent.mm.protobuf.i.c(26, "forbid_auto_full_screen_when_tap"), com.tencent.mm.protobuf.i.i(27, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_HEIGHT_PERCENT));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.MiniAppInfo create() {
        return new com.tencent.mm.protocal.protobuf.MiniAppInfo();
    }

    public final java.lang.String getApp_id() {
        return getString(0);
    }

    public final java.lang.String getAppusername() {
        return getString(4);
    }

    public final com.tencent.mm.protobuf.g getExtra_data() {
        return getByteString(6);
    }

    public final java.lang.String getFetch_info_id() {
        return getString(2);
    }

    public final boolean getForbid_auto_full_screen_when_tap() {
        return getBoolean(22);
    }

    public final int getHalf_page_custom_height() {
        return getInteger(15);
    }

    public final int getHeight_percent() {
        return getInteger(23);
    }

    public final boolean getHide_default_bar() {
        return getBoolean(9);
    }

    public final boolean getHide_drag_bar() {
        return getBoolean(10);
    }

    public final int getLaunch_animation_type() {
        return getInteger(11);
    }

    public final java.lang.String getOpen_extra_data() {
        return getString(14);
    }

    public final java.lang.String getOpen_popup_title() {
        return getString(18);
    }

    public final java.lang.String getOpen_popup_wording() {
        return getString(17);
    }

    public final long getOut_product_id() {
        return getLong(16);
    }

    public final java.lang.String getPath() {
        return getString(1);
    }

    public final java.lang.String getProduct_path_cookie() {
        return getString(7);
    }

    public final java.lang.String getRequest_id() {
        return getString(3);
    }

    public final int getScene() {
        return getInteger(8);
    }

    public final java.lang.String getScene_note() {
        return getString(12);
    }

    public final java.lang.String getTooltip_wording() {
        return getString(19);
    }

    public final java.lang.String getTransit_common_ux_info() {
        return getString(20);
    }

    public final boolean getTransparent_mode() {
        return getBoolean(21);
    }

    public final int getType() {
        return getInteger(13);
    }

    public final int getVersion_type() {
        return getInteger(5);
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setApp_id(java.lang.String str) {
        set(0, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setAppusername(java.lang.String str) {
        set(4, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setExtra_data(com.tencent.mm.protobuf.g gVar) {
        set(6, gVar);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setFetch_info_id(java.lang.String str) {
        set(2, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setForbid_auto_full_screen_when_tap(boolean z17) {
        set(22, java.lang.Boolean.valueOf(z17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setHalf_page_custom_height(int i17) {
        set(15, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setHeight_percent(int i17) {
        set(23, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setHide_default_bar(boolean z17) {
        set(9, java.lang.Boolean.valueOf(z17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setHide_drag_bar(boolean z17) {
        set(10, java.lang.Boolean.valueOf(z17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setLaunch_animation_type(int i17) {
        set(11, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setOpen_extra_data(java.lang.String str) {
        set(14, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setOpen_popup_title(java.lang.String str) {
        set(18, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setOpen_popup_wording(java.lang.String str) {
        set(17, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setOut_product_id(long j17) {
        set(16, java.lang.Long.valueOf(j17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setPath(java.lang.String str) {
        set(1, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setProduct_path_cookie(java.lang.String str) {
        set(7, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setRequest_id(java.lang.String str) {
        set(3, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setScene(int i17) {
        set(8, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setScene_note(java.lang.String str) {
        set(12, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setTooltip_wording(java.lang.String str) {
        set(19, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setTransit_common_ux_info(java.lang.String str) {
        set(20, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setTransparent_mode(boolean z17) {
        set(21, java.lang.Boolean.valueOf(z17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setType(int i17) {
        set(13, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.MiniAppInfo setVersion_type(int i17) {
        set(5, java.lang.Integer.valueOf(i17));
        return this;
    }
}
