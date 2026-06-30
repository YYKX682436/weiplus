package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class r6 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.s6 f186810a;

    public r6(com.tencent.mm.plugin.webview.ui.tools.s6 s6Var) {
        this.f186810a = s6Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "OpenLiteApp fail");
        com.tencent.mm.plugin.webview.ui.tools.s6 s6Var = this.f186810a;
        j45.l.j(s6Var.f186846i.c(), "webview", ".ui.tools.WebViewUI", s6Var.f186841d, null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "OpenLiteApp success");
    }
}
