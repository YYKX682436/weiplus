package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.r1 f187873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187874e;

    public o1(com.tencent.mm.plugin.webview.webcompt.r1 r1Var, java.lang.String str) {
        this.f187873d = r1Var;
        this.f187874e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.webcompt.r1.b(this.f187873d, this.f187874e);
    }
}
