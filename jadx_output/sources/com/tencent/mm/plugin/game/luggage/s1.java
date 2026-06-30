package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class s1 extends com.tencent.mm.plugin.game.luggage.page.b0 {
    public s1(android.content.Context context) {
        super(context);
        vz4.x xVar = this.P;
        if (xVar != null) {
            xVar.f441772t = true;
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.b0, uw4.n
    public void M0() {
        getWebCore().f406632h = new com.tencent.mm.plugin.game.luggage.r1(this);
        if (getWebCore().f406636o != null) {
            getWebCore().f406636o.a(new com.tencent.mm.plugin.webview.luggage.c0());
            getWebCore().f406636o.a(new com.tencent.mm.plugin.webview.luggage.y(ik1.f.e("preload_game_adapter.js")));
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.b0
    public void O0(com.tencent.xweb.WebView webView, java.lang.String str) {
        super.O0(webView, str);
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.b0
    public void P0(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.P0(webView, str, bitmap);
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.b0, uw4.n, com.tencent.mm.ui.widget.MMWebView, com.tencent.xweb.WebView, tx5.f, pf.b
    public void loadUrl(java.lang.String str) {
        super.loadUrl(str);
        com.tencent.mm.plugin.game.luggage.v0.b(getWebCore(), str, true);
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.b0, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWebCore().c(new com.tencent.mm.plugin.game.luggage.q1(this));
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.b0, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
