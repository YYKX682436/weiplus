package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.b0 f184736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI f184737f;

    public z0(com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI, int i17, com.tencent.mm.plugin.webview.ui.tools.fts.b0 b0Var) {
        this.f184737f = fTSBaseWebViewUI;
        this.f184735d = i17;
        this.f184736e = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        if (this.f184737f.f183844p0 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String P9 = this.f184737f.P9();
            if (com.tencent.mm.sdk.platformtools.t8.K0(P9)) {
                P9 = this.f184737f.F4.getFtsEditText().getRecommendSearchHint();
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.fts.y0(this));
                i17 = 1;
            } else {
                i17 = 0;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(P9)) {
                return;
            }
            try {
                jSONObject.put("query", P9);
                jSONObject.put("custom", this.f184737f.N9());
                jSONObject.put("tagList", this.f184737f.O9());
                jSONObject.put("isBackButtonClick", this.f184735d);
                com.tencent.mm.plugin.webview.ui.tools.fts.b0 b0Var = this.f184736e;
                jSONObject.put("type", b0Var != null ? b0Var.f184346d : this.f184737f.I4);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f184737f.K4);
                jSONObject.put("isHomePage", 0);
                jSONObject.put("fromRecommendSearchQuery", i17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.FTSBaseWebViewUI", e17, "", new java.lang.Object[0]);
            }
            this.f184737f.f183844p0.e0(jSONObject);
            if (android.text.TextUtils.isEmpty(this.f184737f.N9())) {
                return;
            }
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI = this.f184737f;
            su4.k2.k(fTSBaseWebViewUI.K4, fTSBaseWebViewUI.B3, fTSBaseWebViewUI.C3, fTSBaseWebViewUI.f184245b4 == 0, fTSBaseWebViewUI.N9(), this.f184737f.I4);
        }
    }
}
