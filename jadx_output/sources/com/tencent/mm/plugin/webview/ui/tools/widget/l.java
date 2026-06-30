package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class l extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f187372b;

    public l(java.lang.ref.WeakReference commWebView) {
        kotlin.jvm.internal.o.g(commWebView, "commWebView");
        this.f187372b = commWebView;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void b(int i17, java.lang.String reqUrl, int i18, int i19, java.lang.String errMsg) {
        com.tencent.mm.plugin.webview.ui.tools.widget.o1 o1Var;
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        if (i17 != 0 && i17 != 2) {
            switch (i17) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return;
            }
        }
        java.lang.ref.WeakReference weakReference = this.f187372b;
        if (weakReference == null || (o1Var = (com.tencent.mm.plugin.webview.ui.tools.widget.o1) weakReference.get()) == null) {
            return;
        }
        ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) o1Var).o();
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void m() {
        com.tencent.mm.plugin.webview.ui.tools.widget.o1 o1Var;
        java.lang.ref.WeakReference weakReference = this.f187372b;
        if (weakReference == null || (o1Var = (com.tencent.mm.plugin.webview.ui.tools.widget.o1) weakReference.get()) == null) {
            return;
        }
        ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) o1Var).h();
    }
}
