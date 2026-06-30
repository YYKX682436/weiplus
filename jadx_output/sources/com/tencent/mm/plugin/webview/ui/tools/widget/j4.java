package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class j4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.o4 f187348e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(java.lang.String str, com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var) {
        super(0);
        this.f187347d = str;
        this.f187348e = o4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg webViewControllerPreloadMrg = com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg.f187731a;
        com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = this.f187348e;
        boolean z17 = o4Var.f187464f.f187177c;
        webViewControllerPreloadMrg.getClass();
        java.lang.String url = this.f187347d;
        kotlin.jvm.internal.o.g(url, "url");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg.f187733c;
        com.tencent.mm.plugin.webview.ui.tools.widget.m6 m6Var = z17 ? (com.tencent.mm.plugin.webview.ui.tools.widget.m6) concurrentHashMap.get(url) : (com.tencent.mm.plugin.webview.ui.tools.widget.m6) concurrentHashMap.remove(url);
        if (m6Var != null) {
            return m6Var;
        }
        com.tencent.mm.plugin.webview.core.r0 r0Var = o4Var.G;
        kotlin.jvm.internal.o.d(r0Var);
        return new com.tencent.mm.plugin.webview.ui.tools.widget.m6(new java.lang.ref.WeakReference(r0Var));
    }
}
