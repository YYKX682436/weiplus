package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String uri;
        kotlin.jvm.internal.o.g(intent, "intent");
        try {
            str = intent.getStringExtra("rawUrl");
            if (str == null) {
                str = "";
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewController", "getRawUrl exception:%s", e17.getMessage());
            if (e17 instanceof java.lang.ClassNotFoundException) {
                throw e17;
            }
            str = null;
        }
        if (!(str == null || r26.n0.N(str))) {
            return str;
        }
        android.net.Uri data = intent.getData();
        return (data == null || (uri = data.toString()) == null) ? "" : uri;
    }
}
