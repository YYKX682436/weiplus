package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175239e;

    public n(com.tencent.mm.plugin.topstory.ui.webview.l lVar, java.lang.String str) {
        this.f175239e = lVar;
        this.f175238d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.webview.b.a(this.f175239e, "onWebRecommendInfoUpdate", this.f175238d);
    }
}
