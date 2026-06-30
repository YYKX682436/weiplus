package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes15.dex */
public final class ga extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.ga f186118d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ga();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str2 = "";
        if (msg.f341014d.has("appId")) {
            str = msg.f341014d.optString("appId");
            kotlin.jvm.internal.o.f(str, "optString(...)");
        } else {
            str = "";
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        nw4.g gVar = env.f340863d;
        if (K0) {
            gVar.e(msg.f341013c, msg.f341019i + ":fail appId is null", null);
            return true;
        }
        if (msg.f341014d.has(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE)) {
            str2 = msg.f341014d.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
            kotlin.jvm.internal.o.f(str2, "optString(...)");
        }
        if (msg.f341014d.has("onlyUpdate") ? msg.f341014d.optBoolean("onlyUpdate") : false) {
            if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(str) == null) {
                gVar.e(msg.f341013c, msg.f341019i + ":update success", null);
                return true;
            }
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(str, null);
            gVar.e(msg.f341013c, msg.f341019i + ":update success", null);
            return true;
        }
        if (msg.f341014d.has("onlyDownload") ? msg.f341014d.optBoolean("onlyDownload") : false) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(str, null);
            gVar.e(msg.f341013c, msg.f341019i + ":update success", null);
            return true;
        }
        if (msg.f341014d.has("onlyPreLoadBaseLib") ? msg.f341014d.optBoolean("onlyPreLoadBaseLib") : false) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Qj(env.f340860a, str, str2, "updateBaseLibPath");
        } else {
            q80.e0 e0Var = new q80.e0();
            e0Var.f360675a = str;
            e0Var.f360676b = str2;
            if (kotlin.jvm.internal.o.b(str, com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_ID)) {
                e0Var.f360680f = msg.f341014d.optBoolean("keepAlive", false);
                e0Var.f360679e = msg.f341014d.optBoolean("exclusive", false);
            }
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Rj(env.f340860a, e0Var);
        }
        gVar.e(msg.f341013c, msg.f341019i + ": success", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 405;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "preloadLiteApp";
    }
}
