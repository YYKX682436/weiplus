package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class q0 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182601h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.webview.luggage.e0 e0Var, long j17, java.lang.Integer num) {
        super(j17, num);
        this.f182601h = e0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter = this.f182601h.f182188v;
        webViewInputFooter.setVisibility(0);
        android.widget.LinearLayout linearLayout = webViewInputFooter.f187287q;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        webViewInputFooter.f187289s = true;
        webViewInputFooter.f187280g = 1;
        return java.lang.Integer.valueOf(webViewInputFooter.c());
    }
}
