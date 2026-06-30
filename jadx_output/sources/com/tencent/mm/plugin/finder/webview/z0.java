package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.n1 f136939d;

    public z0(com.tencent.mm.plugin.finder.webview.n1 n1Var) {
        this.f136939d = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.finder.webview.n1 n1Var = this.f136939d;
        com.tencent.xweb.d1 d1Var = n1Var.f136899c;
        if (d1Var != null) {
            n1Var.k(d1Var);
            return;
        }
        com.tencent.xweb.d1 d1Var2 = n1Var.f136900d;
        if (d1Var2 != null) {
            n1Var.j(d1Var2);
        }
    }
}
