package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.b0 f184331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184332e;

    public a(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.b0 b0Var) {
        this.f184332e = baseSOSWebViewUI;
        this.f184331d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = this.f184332e;
        if (baseSOSWebViewUI.s9() != null) {
            baseSOSWebViewUI.pa();
            com.tencent.mm.plugin.webview.ui.tools.fts.b0 b0Var = this.f184331d;
            baseSOSWebViewUI.f184245b4 = b0Var.f184346d;
            baseSOSWebViewUI.ra();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("isBackButtonClick", "1");
            hashMap.put("custom", baseSOSWebViewUI.N9());
            baseSOSWebViewUI.s9().d0(baseSOSWebViewUI.P9(), baseSOSWebViewUI.N9(), baseSOSWebViewUI.O9(), 1, b0Var.f184347e);
            if (android.text.TextUtils.isEmpty(baseSOSWebViewUI.N9())) {
                return;
            }
            su4.k2.k(baseSOSWebViewUI.Y3, baseSOSWebViewUI.B3, baseSOSWebViewUI.C3, true, baseSOSWebViewUI.N9(), baseSOSWebViewUI.f184244a4);
        }
    }
}
