package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes.dex */
public class e0 implements su4.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI f184392a;

    public e0(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI) {
        this.f184392a = baseSearchWebViewUI;
    }

    public void a(int i17, int i18) {
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = this.f184392a;
        if (baseSearchWebViewUI.s9() != null) {
            nw4.n s96 = baseSearchWebViewUI.s9();
            if (!s96.f340895i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchActionSheetClick fail, not ready");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onSearchActionSheetClick success, ready");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(ya.b.INDEX, java.lang.Integer.valueOf(i17));
            hashMap.put("actionSheetId", java.lang.Integer.valueOf(i18));
            com.tencent.mm.sdk.platformtools.u3.h(new nw4.w0(s96, nw4.x2.c("onSearchActionSheetClick", hashMap, s96.f340903q, s96.f340904r)));
        }
    }
}
