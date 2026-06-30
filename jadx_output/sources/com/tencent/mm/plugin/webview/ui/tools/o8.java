package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f186734e;

    public o8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, android.os.Bundle bundle) {
        this.f186733d = webViewUI;
        this.f186734e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186733d;
        if (webViewUI == null || webViewUI.isFinishing() || (bundle = this.f186734e) == null) {
            return;
        }
        java.lang.String string = bundle.getString("key_bag_icon");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL = webViewUI.f183864v2;
            if (handOffURL != null) {
                handOffURL.setIcon(string == null ? "" : string);
            }
            vx4.d dVar = webViewUI.F2;
            if (dVar != null) {
                dVar.K(string);
            }
            webViewUI.f183874y2.X(string);
        }
        java.lang.String string2 = bundle.getString("key_brand_name");
        java.lang.String string3 = bundle.getString("key_brand_user_name");
        java.lang.String string4 = bundle.getString("key_title");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
            webViewUI.getIntent().putExtra("srcUsername", string3);
        }
        webViewUI.getIntent().putExtra("show_forward_mp", bundle.getBoolean("show_forward_mp"));
        webViewUI.getIntent().putExtra("show_mp_page_new_font", bundle.getBoolean("key_mp_page_new_font"));
        com.tencent.mars.xlog.Log.i("FloatBall", "currentMpInfo, brandName:%s, title:%s", string2, string4);
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = webViewUI.f183866w2;
        if (ldVar != null) {
            java.lang.String string5 = bundle.getString("key_url");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string5)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUIStyleHelper", "updateCurrentInfo url is null");
            } else {
                java.lang.String f17 = ldVar.f(string5);
                java.util.HashMap hashMap = (java.util.HashMap) com.tencent.mm.plugin.webview.ui.tools.ld.f185649s;
                android.os.Bundle bundle2 = (android.os.Bundle) hashMap.get(f17);
                if (bundle2 == null) {
                    hashMap.put(f17, bundle);
                } else {
                    bundle.putBoolean("key_current_info_show", bundle2.getBoolean("key_current_info_show"));
                    hashMap.put(f17, bundle);
                }
                if (bundle.getBoolean("key_show_live_top_bar", true) && ldVar.k() && ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(string5)) {
                    if (ldVar.i(bundle)) {
                        ldVar.q();
                    }
                    ldVar.r(bundle.getString("key_brand_user_name"));
                } else {
                    ldVar.n();
                }
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = webViewUI.f183846p2;
        if (b5Var != null) {
            ((java.util.HashMap) com.tencent.mm.plugin.webview.ui.tools.b5.f183928u).put(b5Var.m(b5Var.f183941i), java.lang.Boolean.valueOf(bundle.getBoolean("key_forbidForward")));
            boolean z17 = bundle.getBoolean("key_enable_share_image_watermark", false);
            if (b5Var.f183941i.isEmpty()) {
                b5Var.f183941i = b5Var.j();
            }
            ((java.util.HashMap) com.tencent.mm.plugin.webview.ui.tools.b5.f183929v).put(b5Var.m(b5Var.f183941i), new r01.h0(b5Var.m(b5Var.f183941i), z17, bundle.getString("key_brand_name", ""), bundle.getString("key_alias", ""), bundle.getInt("key_brand_service_type", 0), bundle.getInt("key_image_watermark_type", 0), bundle.getString("key_share_image_watermark_params", ""), bundle.getString("key_brand_user_name", ""), bundle.getString("key_title", ""), bundle.getInt("key_item_show_type", -1)));
        }
        webViewUI.b7();
        if (com.tencent.mm.sdk.platformtools.t8.K0(string4) && webViewUI.getMMTitle() != null) {
            string4 = webViewUI.getMMTitle().toString();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = webViewUI.f183874y2.f93132d;
            if (com.tencent.mm.sdk.platformtools.t8.K0(ballInfo != null ? ballInfo.f93063x : null)) {
                webViewUI.f183874y2.Z(string2);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(webViewUI.F2.C.getString(4))) {
                webViewUI.F2.L(string2);
            }
            com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL2 = webViewUI.f183864v2;
            if (handOffURL2 != null && com.tencent.mm.sdk.platformtools.t8.K0(handOffURL2.getTitle()) && !com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                webViewUI.f183864v2.setTitle(string2);
            }
        } else {
            vx4.d dVar2 = webViewUI.F2;
            if (dVar2 != null) {
                dVar2.L(string4);
            }
            webViewUI.f183874y2.Z(string4);
            com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL3 = webViewUI.f183864v2;
            if (handOffURL3 != null) {
                handOffURL3.setTitle(string4);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            vx4.d dVar3 = webViewUI.F2;
            if (dVar3 != null) {
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = dVar3.f300077a;
                r45.lr4 v07 = multiTaskInfo != null ? multiTaskInfo.v0() : null;
                if (v07 != null) {
                    v07.set(0, string2);
                }
                dVar3.I();
            }
            com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL4 = webViewUI.f183864v2;
            if (handOffURL4 != null) {
                handOffURL4.setDisplaySourceName(string2);
            }
        }
        if (webViewUI.f183864v2 != null) {
            ((d73.i) i95.n0.c(d73.i.class)).Jc(webViewUI.f183864v2);
        }
        java.lang.String string6 = bundle.getString("key_menu_recent_read_url", "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string6)) {
            webViewUI.f183849q2.f184069z = string6;
        }
        java.lang.String string7 = bundle.getString("key_menu_underline_url", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string7)) {
            return;
        }
        webViewUI.f183849q2.A = string7;
    }
}
