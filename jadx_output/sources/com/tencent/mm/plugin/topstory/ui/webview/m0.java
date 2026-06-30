package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175237e;

    public m0(com.tencent.mm.plugin.topstory.ui.webview.l lVar, java.lang.String str) {
        this.f175237e = lVar;
        this.f175236d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.webview.b.a(this.f175237e, "onWebRecommendPostComments", this.f175236d);
    }
}
