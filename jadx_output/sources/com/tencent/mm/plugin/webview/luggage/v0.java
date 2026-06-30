package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182635e;

    public v0(com.tencent.mm.plugin.webview.luggage.e0 e0Var, java.lang.String str) {
        this.f182635e = e0Var;
        this.f182634d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182635e;
        e0Var.f182183q.setBackgroundColor(com.tencent.mm.plugin.webview.ui.tools.a1.c(this.f182634d, e0Var.f406610d.getResources().getColor(com.tencent.mm.R.color.aak)));
        e0Var.f182183q.setPullDownViewVisibility(8);
    }
}
