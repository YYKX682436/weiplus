package com.tencent.mm.plugin.product.ui;

/* loaded from: classes8.dex */
public class HtmlTextView2 extends com.tencent.mm.ui.widget.MMWebView {
    public final com.tencent.xweb.h1 G;

    public HtmlTextView2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(com.tencent.mm.sdk.platformtools.x2.f193071a, attributeSet);
        this.G = new com.tencent.mm.plugin.product.ui.d(this);
        I0();
    }

    public final void I0() {
        setOnTouchListener(new com.tencent.mm.plugin.product.ui.c(this));
        setVerticalScrollBarEnabled(false);
        getSettings().F(android.webkit.WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        getSettings().w(com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
    }

    public void setText(java.lang.String str) {
        setWebViewClient(null);
        loadData(str, "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        setWebViewClient(this.G);
    }

    public HtmlTextView2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(com.tencent.mm.sdk.platformtools.x2.f193071a, attributeSet, i17);
        this.G = new com.tencent.mm.plugin.product.ui.d(this);
        I0();
    }
}
