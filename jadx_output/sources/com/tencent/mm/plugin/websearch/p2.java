package com.tencent.mm.plugin.websearch;

@j95.b
/* loaded from: classes.dex */
public class p2 extends i95.w implements su4.g1 {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f181588d = "websearch_";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f181589e;

    public void Ai() {
        com.tencent.mars.xlog.Log.i("WebSearchPrivacyMgr", "reInit");
        f181588d = "websearch_" + gm0.j1.b().j();
        java.lang.Object l17 = gm0.j1.u().c().l(274436, "");
        java.lang.String obj = l17 != null ? l17.toString() : "en";
        f181589e = java.lang.String.format("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/cgi-bin/newreadtemplate?t=gdpr/confirm&business=search&lang=%s&cc=%s&autoCloseWindow=1", com.tencent.mm.sdk.platformtools.m2.d(), obj);
        java.lang.String.format("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/cgi-bin/newreadtemplate?t=gdpr/close&business=search&lang=%s&cc=%s&autoCloseWindow=1", com.tencent.mm.sdk.platformtools.m2.d(), obj);
    }

    public void Bi(android.content.Context context, java.lang.Runnable runnable) {
        wi();
        runnable.run();
    }

    public void wi() {
        if (f181589e == null) {
            Ai();
        }
    }
}
