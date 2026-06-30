package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes4.dex */
public final class k extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.k f186292d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.k();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.f340790a.get("url");
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        boolean z17 = str2 == null || str2.length() == 0;
        nw4.g gVar = env.f340863d;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAppJoinGroup.", "url is null");
            gVar.e(msg.f341013c, "joinGroup:fail", null);
            return true;
        }
        if (gVar instanceof nw4.n) {
            kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            str = ((nw4.n) gVar).r(str2);
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAppJoinGroup.", "appId is null");
            gVar.e(msg.f341013c, "joinGroup:fail", null);
            return true;
        }
        java.lang.Object obj2 = msg.f340790a.get("signature");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.Object obj3 = msg.f340790a.get("groupId");
        java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.Object obj4 = msg.f340790a.get("nonceStr");
        java.lang.String str5 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        vg3.i3 i3Var = new vg3.i3();
        i3Var.f436712d = str;
        i3Var.f436715g = str3;
        i3Var.f436713e = str4;
        i3Var.f436714f = str5;
        ((hn.s) ((vg3.k3) i95.n0.c(vg3.k3.class))).Bi(env.f340860a, i3Var);
        gVar.e(msg.f341013c, "joinGroup:success", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 377;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.t3.NAME;
    }
}
