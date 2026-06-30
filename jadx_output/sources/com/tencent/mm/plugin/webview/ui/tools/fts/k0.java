package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f184485g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f184486h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f184487i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f184488m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f184489n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.r0 f184490o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI f184491p;

    public k0(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI, int i17, java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray, boolean z17, int i18, java.lang.Boolean bool, boolean z18, com.tencent.mm.plugin.webview.ui.tools.fts.r0 r0Var) {
        this.f184491p = baseSearchWebViewUI;
        this.f184482d = i17;
        this.f184483e = str;
        this.f184484f = str2;
        this.f184485g = jSONArray;
        this.f184486h = z17;
        this.f184487i = i18;
        this.f184488m = bool;
        this.f184489n = z18;
        this.f184490o = r0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = this.f184482d;
        if (i17 == 0) {
            hashMap.put("query", this.f184483e);
            hashMap.put("custom", this.f184484f);
            hashMap.put("tagList", this.f184485g);
            hashMap.put("isFromVoice", java.lang.Boolean.valueOf(this.f184486h));
        }
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = this.f184491p;
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(baseSearchWebViewUI.Y3));
        hashMap.put("isCancelButtonClick", java.lang.Integer.valueOf(i17));
        hashMap.put("isInputChange", java.lang.Integer.valueOf(this.f184487i));
        java.lang.Boolean bool = this.f184488m;
        if (bool != null) {
            hashMap.put("isBackToGuidePage", bool);
        }
        if (this.f184489n) {
            baseSearchWebViewUI.o9(new com.tencent.mm.plugin.webview.ui.tools.fts.j0(this, hashMap));
            return;
        }
        nw4.n nVar = baseSearchWebViewUI.f183844p0;
        if (nVar != null) {
            nVar.i0("onSearchInputChange", hashMap, null);
        }
        com.tencent.mm.plugin.webview.ui.tools.fts.r0 r0Var = this.f184490o;
        if (r0Var != null) {
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = ((com.tencent.mm.plugin.webview.ui.tools.fts.b) r0Var).f184342a;
            baseSOSWebViewUI.W4 = false;
            baseSOSWebViewUI.qa();
        }
    }
}
