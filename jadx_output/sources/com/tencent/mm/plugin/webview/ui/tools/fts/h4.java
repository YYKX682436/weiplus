package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class h4 extends com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView {
    public h4(com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI, android.content.Context context, com.tencent.xweb.f1 f1Var) {
        super(context, f1Var);
    }

    @Override // com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView
    public java.lang.String getUserAgentString() {
        return ik1.l0.a(getContext(), getSettings().g(), (ik1.k0) nd.f.a(ik1.k0.class));
    }
}
