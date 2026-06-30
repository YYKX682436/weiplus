package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class t9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f186907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u7 f186908e;

    public t9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, android.os.Bundle bundle) {
        this.f186908e = u7Var;
        this.f186907d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.u7 u7Var = this.f186908e;
        if (u7Var.f186929e.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).isFinishing()) {
            return;
        }
        boolean z17 = this.f186907d.getBoolean("enable_fullscreen_params_enable", false);
        if (u7Var.j() != null) {
            u7Var.j().removeExtra("show_full_screen");
        }
        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).F8(z17, false);
    }
}
