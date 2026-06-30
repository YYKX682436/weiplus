package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f184359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184360f;

    public c(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI, int i17, boolean z17) {
        this.f184360f = baseSOSWebViewUI;
        this.f184358d = i17;
        this.f184359e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = this.f184360f;
        if (baseSOSWebViewUI.s9() != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (baseSOSWebViewUI.ja() != 0) {
                hashMap.put("sugClickType", java.lang.Integer.valueOf(baseSOSWebViewUI.ja()));
                hashMap.put("sugId", baseSOSWebViewUI.ka());
            }
            hashMap.put("fromRecommendSearchQuery", java.lang.Integer.valueOf(this.f184358d));
            hashMap.put("isFromVoice", java.lang.Boolean.valueOf(baseSOSWebViewUI.f184247d4));
            hashMap.put("isKeyboard", java.lang.Boolean.valueOf(this.f184359e));
            nw4.n s96 = baseSOSWebViewUI.s9();
            java.lang.String P9 = baseSOSWebViewUI.P9();
            java.lang.String N9 = baseSOSWebViewUI.N9();
            org.json.JSONArray O9 = baseSOSWebViewUI.O9();
            s96.getClass();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.putAll(hashMap);
            hashMap2.put("query", P9);
            hashMap2.put("custom", N9);
            hashMap2.put("tagList", O9);
            s96.i0("onSearchInputConfirm", hashMap2, null);
            if (android.text.TextUtils.isEmpty(baseSOSWebViewUI.N9())) {
                return;
            }
            su4.k2.k(baseSOSWebViewUI.Z3, baseSOSWebViewUI.B3, baseSOSWebViewUI.C3, true, baseSOSWebViewUI.N9(), baseSOSWebViewUI.f184245b4);
        }
    }
}
