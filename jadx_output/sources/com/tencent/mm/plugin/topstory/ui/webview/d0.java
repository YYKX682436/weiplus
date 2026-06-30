package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm4.a f175185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175186e;

    public d0(com.tencent.mm.plugin.topstory.ui.webview.l lVar, tm4.a aVar) {
        this.f175186e = lVar;
        this.f175185d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.webview.b.a(this.f175186e, "onUniformReddotDataChanged", this.f175185d.toJson().toString());
    }
}
