package com.tencent.mm.plugin.websearch.webview;

/* loaded from: classes8.dex */
public class WebSearchWebView extends com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView {
    public WebSearchWebView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView
    public java.lang.String getUserAgentString() {
        return ik1.l0.a(getContext(), getSettings().g(), (ik1.k0) nd.f.a(ik1.k0.class));
    }

    public WebSearchWebView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
