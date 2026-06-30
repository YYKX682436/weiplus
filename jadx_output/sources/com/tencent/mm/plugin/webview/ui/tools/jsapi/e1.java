package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185065d;

    public e1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var) {
        this.f185065d = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.o0(this.f185065d, new nw4.y2(), null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "openCunstomWebview, close window exception : %s", e17.getMessage());
        }
    }
}
