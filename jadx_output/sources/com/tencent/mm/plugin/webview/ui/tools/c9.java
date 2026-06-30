package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class c9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u7 f184076d;

    public c9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var) {
        this.f184076d = u7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f184076d.f186929e.get()).finish();
    }
}
