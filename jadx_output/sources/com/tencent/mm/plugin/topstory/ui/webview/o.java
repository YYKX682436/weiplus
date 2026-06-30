package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175241e;

    public o(com.tencent.mm.plugin.topstory.ui.webview.l lVar, java.lang.String str) {
        this.f175241e = lVar;
        this.f175240d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.webview.b.a(this.f175241e, "onWebRecommendNotifyReddotExtMsg", this.f175240d);
    }
}
