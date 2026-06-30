package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class wb implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Callable f187019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f187020b;

    public wb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, java.util.concurrent.Callable callable, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f187019a = callable;
        this.f187020b = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "notice button clicked!");
            this.f187019a.call();
            this.f187020b.B();
        } catch (java.lang.Exception unused) {
        }
    }
}
