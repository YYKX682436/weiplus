package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f184799d;

    public h6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var) {
        this.f184799d = c6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f184799d;
        if (c6Var.c().f183844p0 != null) {
            c6Var.c().f183844p0.u0(false, false);
        }
    }
}
