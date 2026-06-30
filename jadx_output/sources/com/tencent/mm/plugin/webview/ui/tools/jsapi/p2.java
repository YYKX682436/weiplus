package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class p2 implements java.lang.Runnable {
    public p2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String n07 = com.tencent.mm.sdk.platformtools.t8.n0(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "current top activity: %s", n07);
        if (n07 == null || !n07.equals("WebViewUI")) {
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "may be not close success");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.emoji.m.CTRL_INDEX, 7);
    }
}
