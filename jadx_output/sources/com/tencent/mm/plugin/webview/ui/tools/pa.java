package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class pa implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186755a;

    public pa(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f186755a = webViewUI;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186755a;
        int color = webViewUI.getResources().getColor(com.tencent.mm.R.color.aak);
        java.lang.String str2 = "";
        if (com.tencent.mm.plugin.webview.ui.tools.WebViewUI.f183800y3.matcher(str).matches()) {
            java.lang.String[] split = str.replaceAll("\"", "").replaceFirst("rgba", "").replaceFirst("\\(", "").replaceFirst("\\)", "").split(",");
            if (split.length != 4) {
                return;
            }
            try {
                java.lang.String str3 = split[0];
                if (str3 == null) {
                    str3 = "";
                }
                int P = com.tencent.mm.sdk.platformtools.t8.P(str3.trim(), 0);
                java.lang.String str4 = split[1];
                if (str4 == null) {
                    str4 = "";
                }
                int P2 = com.tencent.mm.sdk.platformtools.t8.P(str4.trim(), 0);
                java.lang.String str5 = split[2];
                if (str5 == null) {
                    str5 = "";
                }
                int P3 = com.tencent.mm.sdk.platformtools.t8.P(str5.trim(), 0);
                java.lang.String str6 = split[3];
                if (str6 != null) {
                    str2 = str6;
                }
                color = android.graphics.Color.argb(com.tencent.mm.sdk.platformtools.t8.P(str2.trim(), 0), P, P2, P3);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "handle bgColor from html, bgColor = %s, exception = %s", str, e17);
                return;
            }
        } else if (com.tencent.mm.plugin.webview.ui.tools.WebViewUI.f183801z3.matcher(str).matches()) {
            java.lang.String[] split2 = str.replaceAll("\"", "").replaceFirst("rgb", "").replaceFirst("\\(", "").replaceFirst("\\)", "").split(",");
            if (split2.length != 3) {
                return;
            }
            try {
                java.lang.String str7 = split2[0];
                if (str7 == null) {
                    str7 = "";
                }
                int P4 = com.tencent.mm.sdk.platformtools.t8.P(str7.trim(), 0);
                java.lang.String str8 = split2[1];
                if (str8 == null) {
                    str8 = "";
                }
                int P5 = com.tencent.mm.sdk.platformtools.t8.P(str8.trim(), 0);
                java.lang.String str9 = split2[2];
                if (str9 != null) {
                    str2 = str9;
                }
                color = android.graphics.Color.argb(255, P4, P5, com.tencent.mm.sdk.platformtools.t8.P(str2.trim(), 0));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "handle bgColor from html, bgColor = %s, exception = %s", str, e18);
                return;
            }
        }
        android.view.View view = webViewUI.f183804a3.f186859m;
        if (view != null) {
            view.setBackgroundColor(color);
        }
    }
}
