package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class x6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f187669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.y6 f187670e;

    public x6(com.tencent.mm.plugin.webview.ui.tools.y6 y6Var, boolean z17) {
        this.f187670e = y6Var;
        this.f187669d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.y6 y6Var = this.f187670e;
        y6Var.f187691a.dismiss();
        if (this.f187669d) {
            com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = y6Var.f187693c;
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17 = c6Var.c();
            bw5.lp0 lp0Var = y6Var.f187692b;
            if (c17 == null) {
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.e7(c6Var, c17, lp0Var));
        }
    }
}
