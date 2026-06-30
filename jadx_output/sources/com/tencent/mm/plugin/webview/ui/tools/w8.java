package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class w8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f187015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187016e;

    public w8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, android.os.Bundle bundle) {
        this.f187015d = webViewUI;
        this.f187016e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f187015d;
        if (webViewUI == null || webViewUI.isFinishing()) {
            return;
        }
        android.os.Bundle bundle = this.f187016e;
        int i17 = bundle != null ? bundle.getInt("key_image_pos", -1) : -1;
        int i18 = bundle != null ? bundle.getInt("key_webview_id", -1) : -1;
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        px4.a.f358955a.a(i18, i17);
    }
}
