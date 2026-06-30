package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class bb implements com.tencent.xweb.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f183996a;

    public bb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f183996a = webViewUI;
    }

    @Override // com.tencent.xweb.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f183996a;
        if (webViewUI.f183815f == null) {
            return false;
        }
        al5.m2 m2Var = webViewUI.f183856s3;
        if (m2Var == null) {
            return true;
        }
        m2Var.m(i17, i18, i19, i27, i28, i29, i37, i38, z17);
        return true;
    }

    @Override // com.tencent.xweb.g1
    public void b(int i17) {
    }

    @Override // com.tencent.xweb.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        al5.m2 m2Var = this.f183996a.f183856s3;
        if (m2Var != null) {
            m2Var.d(i17, i18, i19, i27, view);
        }
    }

    @Override // com.tencent.xweb.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f183996a;
        al5.m2 m2Var = webViewUI.f183856s3;
        if (m2Var != null) {
            m2Var.e(i17, i18, z17, z18, view);
        }
        webViewUI.M2 = i18 == 0 && z18;
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = webViewUI.f183866w2;
        if (ldVar != null) {
            ldVar.m();
        }
    }
}
