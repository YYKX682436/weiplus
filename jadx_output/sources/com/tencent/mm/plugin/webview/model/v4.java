package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public class v4 extends k34.a implements k34.g {
    @Override // k34.f
    public void c(android.content.Context context, android.content.Intent intent) {
        intent.putExtra("type", 4);
        java.lang.String str = "";
        intent.putExtra(dm.i4.COL_ID, "");
        try {
            str = java.net.URLDecoder.decode(com.tencent.mm.sdk.platformtools.c2.l(intent, "ext_info"), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", str);
        intent2.putExtra("from_shortcut", true);
        intent2.addFlags(268435456);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent2, null);
    }
}
