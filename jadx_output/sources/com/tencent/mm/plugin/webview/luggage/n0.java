package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f182577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182578e;

    public n0(com.tencent.mm.plugin.webview.luggage.e0 e0Var, int i17) {
        this.f182578e = e0Var;
        this.f182577d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f182578e.f406655i.c(new com.tencent.mm.plugin.webview.luggage.m0(this));
    }
}
