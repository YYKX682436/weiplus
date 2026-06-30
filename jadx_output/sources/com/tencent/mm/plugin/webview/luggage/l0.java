package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class l0 implements com.tencent.mm.ui.e8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182551a;

    public l0(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.f182551a = e0Var;
    }

    @Override // com.tencent.mm.ui.e8
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "onKeyBoardStateChange, state = " + i17);
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182551a;
        if (!e0Var.U) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "background ignored");
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = e0Var.f182187u;
        com.tencent.mm.sdk.platformtools.n3 n3Var = e0Var.M;
        if (i17 == -3) {
            n3Var.post(new com.tencent.mm.plugin.webview.luggage.n0(e0Var, webViewKeyboardLinearLayout.getKeyBoardHeight()));
        } else {
            n3Var.post(new com.tencent.mm.plugin.webview.luggage.p0(e0Var));
        }
        if (i17 != -3) {
            e0Var.r(0);
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter = e0Var.f182188v;
        if (webViewInputFooter != null && webViewInputFooter.getVisibility() == 0) {
            com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter2 = e0Var.f182188v;
            if (webViewInputFooter2.f187289s) {
                webViewInputFooter2.setVisibility(8);
            }
            webViewInputFooter2.f187280g = 0;
            webViewInputFooter2.b();
        }
        e0Var.r(e0Var.f182187u.getKeyBoardHeight());
    }
}
