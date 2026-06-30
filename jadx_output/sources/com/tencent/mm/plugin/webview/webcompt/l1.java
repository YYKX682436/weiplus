package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes.dex */
public abstract class l1 {
    public static final com.tencent.mm.sdk.platformtools.o4 a() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("__webcompt_command");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }

    public static final void b(java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mars.xlog.Log.getLogLevel() == 0 && z65.c.a()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.webcompt.k1(str));
        }
        com.tencent.mars.xlog.Log.i("WebComptCommand", str);
    }
}
