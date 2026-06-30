package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class xc implements com.tencent.mm.plugin.webview.ui.tools.widget.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f187683a;

    public xc(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI.AnonymousClass1 anonymousClass1) {
        this.f187683a = webViewUI;
    }

    public void a(int i17) {
        int i18;
        if (i17 != 0) {
            switch (i17) {
                case 2:
                    i18 = 3;
                    break;
                case 3:
                    i18 = 4;
                    break;
                case 4:
                    i18 = 5;
                    break;
                case 5:
                    i18 = 6;
                    break;
                case 6:
                    i18 = 7;
                    break;
                case 7:
                    i18 = 8;
                    break;
                default:
                    i18 = 2;
                    break;
            }
        } else {
            i18 = 1;
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f187683a;
        webViewUI.L1.A1(i18);
        try {
            if (webViewUI.K1.lb()) {
                com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("WebViewFontUtil", 2, null);
                N.putBoolean("webview_key_font_has_set", true);
                N.putBoolean("webview_key_has_transfer_mp", true);
                com.tencent.mm.sdk.platformtools.o4.N("WebViewFontUtil", 2, null).putBoolean("webview_key_font_use_system", false);
                webViewUI.K1.Ui(16384, i18);
                webViewUI.K1.Ui(16388, i18);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI", "onCheckedChanged, ex = " + e17.getMessage());
        }
    }
}
