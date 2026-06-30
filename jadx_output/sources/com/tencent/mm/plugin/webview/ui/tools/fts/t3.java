package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI f184625e;

    public t3(com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI, int i17) {
        this.f184625e = fTSWeAppBaseWebViewUI;
        this.f184624d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        if (this.f184625e.f183844p0 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String P9 = this.f184625e.P9();
            if (com.tencent.mm.sdk.platformtools.t8.K0(P9)) {
                P9 = this.f184625e.F4.getFtsEditText().getRecommendSearchHint();
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.fts.s3(this));
                i17 = 1;
            } else {
                i17 = 0;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(P9)) {
                return;
            }
            try {
                jSONObject.put("query", P9);
                jSONObject.put("custom", this.f184625e.N9());
                jSONObject.put("tagList", this.f184625e.O9());
                jSONObject.put("isBackButtonClick", this.f184624d);
                jSONObject.put("type", this.f184625e.I4);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f184625e.K4);
                jSONObject.put("isHomePage", 0);
                jSONObject.put("fromRecommendSearchQuery", i17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", e17, "", new java.lang.Object[0]);
            }
            this.f184625e.f183844p0.e0(jSONObject);
            if (android.text.TextUtils.isEmpty(this.f184625e.N9())) {
                return;
            }
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI = this.f184625e;
            su4.k2.k(fTSWeAppBaseWebViewUI.K4, fTSWeAppBaseWebViewUI.B3, fTSWeAppBaseWebViewUI.C3, fTSWeAppBaseWebViewUI.f184245b4 == 0, fTSWeAppBaseWebViewUI.N9(), this.f184625e.I4);
        }
    }
}
