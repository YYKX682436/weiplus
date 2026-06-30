package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class l4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WCPayWalletBufferEvent f185248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185250f;

    public l4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.autogen.events.WCPayWalletBufferEvent wCPayWalletBufferEvent, nw4.y2 y2Var) {
        this.f185250f = c1Var;
        this.f185248d = wCPayWalletBufferEvent;
        this.f185249e = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.WCPayWalletBufferEvent wCPayWalletBufferEvent = this.f185248d;
        int i17 = wCPayWalletBufferEvent.f54952h.f6626a;
        nw4.y2 y2Var = this.f185249e;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185250f;
        if (i17 == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("buffer", wCPayWalletBufferEvent.f54952h.f6627b);
            c1Var.i5(y2Var, "handleWCPayWalletBuffer:ok", hashMap);
        } else if (i17 == -2) {
            c1Var.i5(y2Var, "handleWCPayWalletBuffer:null", null);
        } else {
            c1Var.i5(y2Var, "handleWCPayWalletBuffer:fail", null);
        }
    }
}
