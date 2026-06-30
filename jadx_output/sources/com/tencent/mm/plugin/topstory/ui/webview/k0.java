package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175215e;

    public k0(com.tencent.mm.plugin.topstory.ui.webview.l lVar, java.lang.String str) {
        this.f175215e = lVar;
        this.f175214d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.webview.b.a(this.f175215e, "onWebRecommendCommCgiResult", this.f175214d);
    }
}
