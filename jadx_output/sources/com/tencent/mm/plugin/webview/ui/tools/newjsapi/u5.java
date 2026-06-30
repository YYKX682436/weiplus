package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class u5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186558d;

    public u5(nw4.y2 y2Var) {
        this.f186558d = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLog", "jslog : %s", this.f186558d.f340790a.get("msg"));
    }
}
