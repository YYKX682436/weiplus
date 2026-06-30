package hv4;

/* loaded from: classes8.dex */
public final class n implements hv4.b, tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public final hv4.l f285318d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ck6 f285319e;

    /* renamed from: f, reason: collision with root package name */
    public final hv4.a f285320f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f285321g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.search.FTSEditTextView f285322h;

    /* renamed from: i, reason: collision with root package name */
    public final gv4.a f285323i;

    /* renamed from: m, reason: collision with root package name */
    public final gv4.e f285324m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.websearch.webview.WebSearchWebView f285325n;

    public n(hv4.l dialog, r45.ck6 homeContext, hv4.a listener, android.view.View dialogView) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        kotlin.jvm.internal.o.g(homeContext, "homeContext");
        kotlin.jvm.internal.o.g(listener, "listener");
        kotlin.jvm.internal.o.g(dialogView, "dialogView");
        this.f285318d = dialog;
        this.f285319e = homeContext;
        this.f285320f = listener;
        this.f285321g = "MicroMsg.WebSearch.TagSearchMainTab";
        android.view.View findViewById = dialogView.findViewById(com.tencent.mm.R.id.j9b);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = dialogView.findViewById(com.tencent.mm.R.id.gfl);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = (com.tencent.mm.ui.search.FTSEditTextView) findViewById2;
        this.f285322h = fTSEditTextView;
        gv4.a aVar = new gv4.a(this);
        this.f285323i = aVar;
        this.f285324m = new gv4.e(this);
        com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView = new com.tencent.mm.plugin.websearch.webview.WebSearchWebView(H());
        this.f285325n = webSearchWebView;
        fTSEditTextView.g();
        fTSEditTextView.setFtsEditTextListener(this);
        fTSEditTextView.m();
        fTSEditTextView.t();
        fTSEditTextView.setHint(fTSEditTextView.getContext().getResources().getString(com.tencent.mm.R.string.f490549y8));
        webSearchWebView.J0(new aw4.s(), new aw4.u(6));
        webSearchWebView.addJavascriptInterface(aVar, "tagWebSearchJSApi");
        ((android.widget.FrameLayout) findViewById).addView(webSearchWebView);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.TagSearchMainTab", "start to load url %s", homeContext.f371625g);
        aw4.m0 m0Var = aw4.n0.f14901a;
        android.content.Context context = dialog.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        m0Var.c(context, 6);
        webSearchWebView.loadUrl(homeContext.f371625g);
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        if (oVar == tj5.o.UserInput || oVar == tj5.o.ClearText) {
            com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f285322h;
            java.lang.String totalQuery = fTSEditTextView.getTotalQuery();
            kotlin.jvm.internal.o.f(totalQuery, "getTotalQuery(...)");
            java.lang.String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
            kotlin.jvm.internal.o.f(inEditTextQuery, "getInEditTextQuery(...)");
            this.f285323i.r(totalQuery, inEditTextQuery);
        }
    }

    @Override // aw4.p
    public void C4(java.lang.String query, boolean z17) {
        kotlin.jvm.internal.o.g(query, "query");
        tj5.o oVar = z17 ? tj5.o.UserInput : tj5.o.SetText;
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f285322h;
        fTSEditTextView.o(query, null, oVar);
        if (!z17) {
            fTSEditTextView.d();
            fTSEditTextView.h();
            return;
        }
        fTSEditTextView.m();
        fTSEditTextView.s();
        java.lang.String totalQuery = fTSEditTextView.getTotalQuery();
        kotlin.jvm.internal.o.f(totalQuery, "getTotalQuery(...)");
        java.lang.String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
        kotlin.jvm.internal.o.f(inEditTextQuery, "getInEditTextQuery(...)");
        this.f285323i.r(totalQuery, inEditTextQuery);
    }

    @Override // hv4.b
    public void D(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        this.f285318d.F(id6);
    }

    @Override // tj5.n
    public boolean G0() {
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f285322h;
        java.lang.String totalQuery = fTSEditTextView.getTotalQuery();
        if (totalQuery != null) {
            java.lang.String obj = r26.n0.u0(totalQuery).toString();
            if (!(!(obj == null || obj.length() == 0))) {
                totalQuery = null;
            }
            if (totalQuery != null) {
                java.lang.String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
                kotlin.jvm.internal.o.f(inEditTextQuery, "getInEditTextQuery(...)");
                this.f285323i.s(totalQuery, inEditTextQuery, 0);
                fTSEditTextView.h();
            }
        }
        return false;
    }

    @Override // aw4.q
    public android.content.Context H() {
        android.content.Context context = this.f285318d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    @Override // hv4.b
    public void M5(r45.sn3 shareContent, android.graphics.Bitmap bitmap, java.lang.String str) {
        kotlin.jvm.internal.o.g(shareContent, "shareContent");
        this.f285318d.D(shareContent, bitmap, str);
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (z17) {
            com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f285322h;
            java.lang.String totalQuery = fTSEditTextView.getTotalQuery();
            kotlin.jvm.internal.o.f(totalQuery, "getTotalQuery(...)");
            java.lang.String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
            kotlin.jvm.internal.o.f(inEditTextQuery, "getInEditTextQuery(...)");
            this.f285323i.r(totalQuery, inEditTextQuery);
        }
    }

    @Override // hv4.b
    public void a5(java.lang.String tag, java.lang.String sessionId, java.lang.String searchId, java.lang.String requestId) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(searchId, "searchId");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        pm0.v.X(new hv4.m(this, tag));
        com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchShareActionReportStruct wCTopicSearchShareActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchShareActionReportStruct();
        wCTopicSearchShareActionReportStruct.f62168d = 4L;
        wCTopicSearchShareActionReportStruct.f62169e = c01.id.e();
        wCTopicSearchShareActionReportStruct.f62170f = 2L;
        wCTopicSearchShareActionReportStruct.f62171g = wCTopicSearchShareActionReportStruct.b("ResultQuery", tag, true);
        r45.ck6 ck6Var = this.f285319e;
        wCTopicSearchShareActionReportStruct.f62172h = com.tencent.mm.storage.z3.R4(ck6Var.f371630o) ? 2L : 1L;
        wCTopicSearchShareActionReportStruct.f62173i = wCTopicSearchShareActionReportStruct.b("ShareSceneId", ck6Var.f371630o, true);
        wCTopicSearchShareActionReportStruct.f62174j = wCTopicSearchShareActionReportStruct.b("ShareSessionId", sessionId, true);
        wCTopicSearchShareActionReportStruct.f62175k = wCTopicSearchShareActionReportStruct.b("ShareSearchId", searchId, true);
        wCTopicSearchShareActionReportStruct.f62176l = wCTopicSearchShareActionReportStruct.b("ShareRequestId", requestId, true);
        wCTopicSearchShareActionReportStruct.f62177m = wCTopicSearchShareActionReportStruct.b("ShareDocId", "", true);
        wCTopicSearchShareActionReportStruct.k();
        su4.k3.m(wCTopicSearchShareActionReportStruct);
    }

    @Override // aw4.q
    public aw4.l b() {
        return this.f285323i;
    }

    @Override // aw4.q
    public aw4.a c() {
        return this.f285324m;
    }

    @Override // av4.j
    public com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView getWebView() {
        return this.f285325n;
    }

    @Override // aw4.q
    public void hideVKB() {
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f285322h;
        fTSEditTextView.m();
        fTSEditTextView.h();
    }

    @Override // aw4.q
    public java.lang.Object m4() {
        return this.f285319e;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f285322h;
        fTSEditTextView.m();
        fTSEditTextView.s();
    }

    @Override // hv4.b
    public void r1(r45.ck6 moreContext) {
        kotlin.jvm.internal.o.g(moreContext, "moreContext");
        hv4.l lVar = this.f285318d;
        lVar.getClass();
        pm0.v.X(new hv4.k(lVar, moreContext));
    }

    @Override // aw4.q
    public void showVKB() {
        this.f285322h.s();
    }

    @Override // aw4.o, aw4.q
    public aw4.w b() {
        return this.f285323i;
    }

    @Override // aw4.o, aw4.q
    public aw4.v c() {
        return this.f285324m;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.b0 b() {
        return this.f285323i;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.y c() {
        return this.f285324m;
    }

    @Override // hv4.b, aw4.p, aw4.o, aw4.q
    public gv4.a b() {
        return this.f285323i;
    }

    @Override // hv4.b, aw4.p, aw4.o, aw4.q
    public gv4.e c() {
        return this.f285324m;
    }
}
