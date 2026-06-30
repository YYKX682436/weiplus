package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175212e;

    public j0(com.tencent.mm.plugin.topstory.ui.webview.l lVar, java.lang.String str) {
        this.f175212e = lVar;
        this.f175211d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.webview.b.a(this.f175212e, "onBackFromTransient", this.f175211d);
    }
}
