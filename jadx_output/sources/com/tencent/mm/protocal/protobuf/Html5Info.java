package com.tencent.mm.protocal.protobuf;

/* loaded from: classes8.dex */
public class Html5Info extends com.tencent.mm.protobuf.e {
    public Html5Info() {
        super(com.tencent.mm.protobuf.i.u(1, "url"), com.tencent.mm.protobuf.i.i(2, "style"), com.tencent.mm.protobuf.i.i(3, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_HEIGHT_PERCENT), com.tencent.mm.protobuf.i.u(4, "webview_ext_info"), com.tencent.mm.protobuf.i.u(5, "transit_common_ux_info"));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.Html5Info create() {
        return new com.tencent.mm.protocal.protobuf.Html5Info();
    }

    public final int getHeight_percent() {
        return getInteger(2);
    }

    public final int getStyle() {
        return getInteger(1);
    }

    public final java.lang.String getTransit_common_ux_info() {
        return getString(4);
    }

    public final java.lang.String getUrl() {
        return getString(0);
    }

    public final java.lang.String getWebview_ext_info() {
        return getString(3);
    }

    public final com.tencent.mm.protocal.protobuf.Html5Info setHeight_percent(int i17) {
        set(2, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.Html5Info setStyle(int i17) {
        set(1, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.Html5Info setTransit_common_ux_info(java.lang.String str) {
        set(4, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.Html5Info setUrl(java.lang.String str) {
        set(0, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.Html5Info setWebview_ext_info(java.lang.String str) {
        set(3, str);
        return this;
    }
}
