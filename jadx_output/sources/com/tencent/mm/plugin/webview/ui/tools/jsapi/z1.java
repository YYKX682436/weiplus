package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class z1 implements java.lang.Runnable {
    public z1(com.tencent.mm.plugin.webview.ui.tools.jsapi.a2 a2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable = (java.lang.Runnable) com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.P1.pollFirst();
        if (runnable != null) {
            runnable.run();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "authJsApiQueue processed!");
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Q1 = false;
        }
    }
}
