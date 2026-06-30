package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes7.dex */
public class m0 extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f180484a;

    public m0(android.content.Context context) {
        this.f180484a = context;
    }

    @Override // com.tencent.xweb.h1
    public boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.getStringExtra("rawUrl");
        j45.l.j(this.f180484a, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }
}
