package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class q1 {
    public q1(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return com.tencent.mars.xlog.Log.getLogLevel() == 0 && z65.c.a();
    }

    public final boolean b() {
        if (a()) {
            return true;
        }
        return com.tencent.mm.plugin.webview.core.t1.a().getBoolean("webview_use_a8key_lite_header", false);
    }
}
