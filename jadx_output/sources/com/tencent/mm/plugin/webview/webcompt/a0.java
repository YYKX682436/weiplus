package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes7.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.webcompt.a0 f187738d = new com.tencent.mm.plugin.webview.webcompt.a0();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
        if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.webview.webcompt.f1.f187802j).getValue()).booleanValue()) {
            if (j62.e.g().c(new com.tencent.mm.repairer.config.webview.RepairConfigWebComponentLeakFix()) == 1) {
                com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(new com.tencent.mm.plugin.webview.webcompt.v());
            } else {
                new com.tencent.mm.plugin.webview.webcompt.y().alive();
            }
        }
    }
}
