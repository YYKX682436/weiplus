package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class gb extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.gb f186205d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gb();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.f340790a.get("requestName");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = msg.f340790a.get("requestIconUrl");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                uk0.a.b(null, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ab(), new com.tencent.mm.plugin.webview.ui.tools.newjsapi.cb(env, msg));
                return true;
            }
        }
        env.f340863d.e(msg.f341013c, "requestBindPhoneNumber:fail requestName or requestIcon is null", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 387;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "requestBindPhoneNumber";
    }
}
