package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class x8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f187675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u7 f187676e;

    public x8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, int i17) {
        this.f187676e = u7Var;
        this.f187675d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f187676e.f186929e.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f187676e.f186929e.get()).isFinishing()) {
            return;
        }
        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f187676e.f186929e.get()).setProgressBarIndeterminateVisibility(false);
        if (this.f187675d != 0) {
            ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f187676e.f186929e.get()).f183834m.a();
        } else {
            if (((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f187676e.f186929e.get()).f183803a2 || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f187676e.f186929e.get()).f183805b2 || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f187676e.f186929e.get()).S8()) {
                return;
            }
            ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f187676e.f186929e.get()).f183834m.c();
        }
    }
}
