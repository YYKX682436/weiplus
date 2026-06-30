package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f183408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.a f183409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.d f183410f;

    public e(com.tencent.mm.plugin.webview.permission.d dVar, int i17, com.tencent.mm.plugin.webview.permission.a aVar) {
        this.f183410f = dVar;
        this.f183408d = i17;
        this.f183409e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8Key", "WebView-Trace Use Outer GetA8key Result CallBack");
        com.tencent.mm.plugin.webview.permission.d dVar = this.f183410f;
        com.tencent.mm.plugin.webview.permission.d.a(dVar, dVar.f183397q, this.f183408d, 0, 0, "", dVar.f183398r, this.f183409e);
    }
}
