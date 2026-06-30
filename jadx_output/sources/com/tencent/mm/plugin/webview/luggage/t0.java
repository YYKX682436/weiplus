package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class t0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.u0 f182620a;

    public t0(com.tencent.mm.plugin.webview.luggage.u0 u0Var) {
        this.f182620a = u0Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.webview.luggage.u0 u0Var = this.f182620a;
        int color = u0Var.f182625d.f406610d.getResources().getColor(com.tencent.mm.R.color.aak);
        java.lang.String str2 = "";
        if (com.tencent.mm.plugin.webview.luggage.e0.C1.matcher(str).matches()) {
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
                com.tencent.mars.xlog.Log.e("MicroMsg.LuggageMMWebPage", "handle bgColor from html, bgColor = %s, exception = %s", str, e17);
                return;
            }
        } else if (com.tencent.mm.plugin.webview.luggage.e0.D1.matcher(str).matches()) {
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
                com.tencent.mars.xlog.Log.e("MicroMsg.LuggageMMWebPage", "handle bgColor from html, bgColor = %s, exception = %s", str, e18);
                return;
            }
        }
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = u0Var.f182625d;
        e0Var.f182183q.setBackgroundColor(color);
        e0Var.f182183q.setPullDownViewVisibility(8);
    }
}
