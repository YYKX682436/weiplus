package com.tencent.mm.plugin.game.commlib.util;

/* loaded from: classes8.dex */
public abstract class n {
    public static void a(android.content.Context context, java.lang.String str, int i17, boolean z17, int i18, float f17, java.lang.String str2, java.lang.String str3) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", !z17);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        intent.putExtra("KHalfScreenHeight", i18);
        intent.putExtra("KHalfScreenHeightPercent", f17);
        intent.putExtra("KHalfScreenBackGroundColor", com.tencent.mm.ui.bk.C() ? context.getColor(com.tencent.mm.R.color.f479225td) : context.getColor(com.tencent.mm.R.color.f479224tc));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            intent.putExtra("KGamePreloadData", str2);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            intent.putExtra("game_pre_inject_data", str3);
        }
        if (i17 > 0) {
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, i17);
        } else {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public static void b(android.content.Context context, java.lang.String str, int i17, boolean z17, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", !z17);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            intent.putExtra("KGamePreloadData", str2);
        }
        if (i17 > 0) {
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, i17);
        } else {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
