package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175234e;

    public l0(com.tencent.mm.plugin.topstory.ui.webview.l lVar, java.lang.String str) {
        this.f175234e = lVar;
        this.f175233d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.webview.b.a(this.f175234e, "onWebRecommendSetComments", this.f175233d);
    }
}
