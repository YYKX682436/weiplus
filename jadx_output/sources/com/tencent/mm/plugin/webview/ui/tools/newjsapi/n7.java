package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class n7 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.n7 f186375d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.n7();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str2 = (java.lang.String) msg.f340790a.get("finderUserName");
        java.lang.Object obj = msg.f340790a.get("memberInletSource");
        if (obj == null || (str = obj.toString()) == null) {
            str = "0";
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(str, 0);
        if (str2 != null) {
            bundle.putString("key_author_finder_name", str2);
            bundle.putInt("key_member_inlet_source", P);
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.webview.ui.tools.newjsapi.l7.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.m7(env, msg));
            return true;
        }
        env.f340863d.e(msg.f341013c, msg.f341019i + ":fail_missing arguments", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 487;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderMemberView";
    }
}
