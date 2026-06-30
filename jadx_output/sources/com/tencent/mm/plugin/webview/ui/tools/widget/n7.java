package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class n7 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter f187452d;

    public n7(com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        this.f187452d = webViewSearchContentInputFooter;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter = this.f187452d;
        com.tencent.mm.plugin.webview.ui.tools.widget.p7 p7Var = webViewSearchContentInputFooter.f187089m;
        if (p7Var != null) {
            p7Var.a(webViewSearchContentInputFooter, charSequence == null ? "" : charSequence.toString());
        }
    }
}
