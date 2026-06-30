package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes7.dex */
public final class j extends com.tencent.mm.sdk.platformtools.n3 {
    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.what != 1) {
            com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
            com.tencent.mars.xlog.Log.e("MicroMsg.WebComponent", "unknown message " + msg.what);
            return;
        }
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var2 = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
        if (com.tencent.mm.plugin.webview.webcompt.f1.f187803k) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "jsEngine already paused");
            return;
        }
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        android.os.PowerManager powerManager = (android.os.PowerManager) systemService;
        if (powerManager.isInteractive()) {
            com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner appUIForegroundOwner = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE;
            if (appUIForegroundOwner.isForeground()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "power interactive " + powerManager.isInteractive() + " isForeground " + appUIForegroundOwner.isForeground());
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "jsEngine pause");
        com.tencent.mm.plugin.webview.webcompt.f1.f187803k = true;
        com.tencent.mm.plugin.webview.webcompt.h0.b(h0Var2).pause();
    }
}
