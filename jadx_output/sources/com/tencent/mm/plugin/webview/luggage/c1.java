package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182155d;

    public c1(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.f182155d = e0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.k kVar = (sd.k) ((sd.u) this.f182155d.f406612f).f406653a.f406663d.peek();
        if (kVar == null || !(kVar instanceof com.tencent.mm.plugin.webview.luggage.e0)) {
            return;
        }
        ((com.tencent.mm.plugin.webview.luggage.e0) kVar).l();
    }
}
