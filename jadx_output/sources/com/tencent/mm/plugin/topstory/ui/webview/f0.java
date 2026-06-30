package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm4.b f175190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175191e;

    public f0(com.tencent.mm.plugin.topstory.ui.webview.l lVar, tm4.b bVar) {
        this.f175191e = lVar;
        this.f175190d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.webview.b.a(this.f175191e, "onUniformReddotDataChanged", this.f175190d.toJson().toString());
    }
}
