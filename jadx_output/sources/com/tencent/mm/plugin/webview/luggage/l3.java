package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.w3 f182554d;

    public l3(com.tencent.mm.plugin.webview.luggage.w3 w3Var) {
        this.f182554d = w3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.luggage.w3 w3Var = this.f182554d;
        com.tencent.xweb.d1 d1Var = w3Var.f182664e;
        if (d1Var != null) {
            w3Var.d(d1Var);
            return;
        }
        com.tencent.xweb.d1 d1Var2 = w3Var.f182665f;
        if (d1Var2 != null) {
            w3Var.c(d1Var2);
        }
    }
}
