package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f182579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182580e;

    public n1(com.tencent.mm.plugin.webview.luggage.e0 e0Var, float f17) {
        this.f182580e = e0Var;
        this.f182579d = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f182580e.f182186t.setAlpha(this.f182579d);
    }
}
