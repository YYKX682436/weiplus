package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class u6 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f186927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f186928b;

    public u6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, android.content.Intent intent) {
        this.f186928b = c6Var;
        this.f186927a = intent;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "OpenLiteApp fail");
        j45.l.j(this.f186928b.c(), "webview", ".ui.tools.WebViewUI", this.f186927a, null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "OpenLiteApp success");
    }
}
