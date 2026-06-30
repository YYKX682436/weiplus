package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class l3 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f181877d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Class f181878e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.core.y0 f181879f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.stub.v0 f181880g;

    public l3(boolean z17, java.lang.Class stubService) {
        kotlin.jvm.internal.o.g(stubService, "stubService");
        this.f181877d = z17;
        this.f181878e = stubService;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.tencent.mm.plugin.webview.core.y0 y0Var;
        com.tencent.mm.plugin.webview.core.m3 m3Var = com.tencent.mm.plugin.webview.core.m3.f181886a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIConnectionPool", "connected:" + componentName);
        com.tencent.mm.plugin.webview.stub.v0 d17 = com.tencent.mm.plugin.webview.stub.t0.d(iBinder);
        this.f181880g = d17;
        if (d17 == null || (y0Var = this.f181879f) == null) {
            return;
        }
        y0Var.a(new com.tencent.mm.plugin.webview.core.k3(this));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.mm.plugin.webview.core.m3 m3Var = com.tencent.mm.plugin.webview.core.m3.f181886a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIConnectionPool", "disconnected:" + componentName);
        this.f181880g = null;
        com.tencent.mm.plugin.webview.core.y0 y0Var = this.f181879f;
        java.lang.Class cls = this.f181878e;
        if (y0Var != null && y0Var.b()) {
            com.tencent.mm.plugin.webview.core.m3.f181886a.a(this.f181877d, cls, y0Var);
        }
        this.f181879f = null;
        com.tencent.mm.plugin.webview.core.m3.f181886a.b(cls).remove(this);
    }
}
