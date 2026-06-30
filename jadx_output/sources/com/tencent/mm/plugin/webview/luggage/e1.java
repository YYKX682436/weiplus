package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f182202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182203e;

    public e1(com.tencent.mm.plugin.webview.luggage.e0 e0Var, boolean z17) {
        this.f182203e = e0Var;
        this.f182202d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f182203e.p(this.f182202d);
    }
}
