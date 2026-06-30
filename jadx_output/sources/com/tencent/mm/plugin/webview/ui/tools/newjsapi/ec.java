package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class ec extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.ec f186067d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ec();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.Object obj2 = msg.f340790a.get("htmlText");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        com.tencent.mm.sdk.platformtools.b0.d(env.f340860a, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, str, str2 != null ? str2 : "");
        pm0.v.X(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.dc(env));
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 403;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return be1.r0.NAME;
    }
}
