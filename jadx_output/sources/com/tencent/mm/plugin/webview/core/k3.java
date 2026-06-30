package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class k3 implements com.tencent.mm.plugin.webview.core.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.l3 f181864d;

    public k3(com.tencent.mm.plugin.webview.core.l3 l3Var) {
        this.f181864d = l3Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.mm.plugin.webview.core.l3 l3Var = this.f181864d;
        l3Var.f181879f = null;
        if (l3Var.f181877d) {
            com.tencent.mm.plugin.webview.core.m3 m3Var = com.tencent.mm.plugin.webview.core.m3.f181886a;
            java.lang.Class cls = l3Var.f181878e;
            if (m3Var.b(cls).size() < com.tencent.mm.plugin.webview.core.m3.f181888c) {
                m3Var.b(cls).add(l3Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIConnectionPool", "detach with reuse service");
                return;
            }
        }
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unbindService(l3Var);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        com.tencent.mm.plugin.webview.core.m3 m3Var2 = com.tencent.mm.plugin.webview.core.m3.f181886a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIConnectionPool", "detach unbind service");
    }
}
