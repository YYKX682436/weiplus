package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class l5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.b5 f185634d;

    public l5(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var) {
        this.f185634d = b5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = this.f185634d;
        com.tencent.xweb.d1 d1Var = b5Var.f183935c;
        if (d1Var != null) {
            b5Var.t(d1Var);
            return;
        }
        com.tencent.xweb.d1 d1Var2 = b5Var.f183936d;
        if (d1Var2 != null) {
            b5Var.s(d1Var2);
        }
    }
}
