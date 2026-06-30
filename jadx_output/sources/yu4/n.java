package yu4;

/* loaded from: classes8.dex */
public final class n implements yu4.p, tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public final yu4.k f465895d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.xi0 f465896e;

    /* renamed from: f, reason: collision with root package name */
    public final ur.l f465897f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f465898g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f465899h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.search.FTSEditTextView f465900i;

    /* renamed from: m, reason: collision with root package name */
    public final xu4.d f465901m;

    /* renamed from: n, reason: collision with root package name */
    public final xu4.h f465902n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f465903o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f465904p;

    /* renamed from: q, reason: collision with root package name */
    public int f465905q;

    public n(yu4.k dialog, r45.xi0 homeContext, ur.l listener, android.view.View dialogView) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        kotlin.jvm.internal.o.g(homeContext, "homeContext");
        kotlin.jvm.internal.o.g(listener, "listener");
        kotlin.jvm.internal.o.g(dialogView, "dialogView");
        this.f465895d = dialog;
        this.f465896e = homeContext;
        this.f465897f = listener;
        this.f465898g = "MicroMsg.WebSearch.EmojiSearchMainTab";
        android.view.View findViewById = dialogView.findViewById(com.tencent.mm.R.id.j9b);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f465899h = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = dialogView.findViewById(com.tencent.mm.R.id.gfl);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = (com.tencent.mm.ui.search.FTSEditTextView) findViewById2;
        this.f465900i = fTSEditTextView;
        this.f465901m = new xu4.d(this);
        this.f465902n = new xu4.h(this);
        this.f465903o = jz5.h.b(new yu4.m(this));
        fTSEditTextView.g();
        fTSEditTextView.setFtsEditTextListener(this);
        if (com.tencent.mm.sdk.platformtools.t8.K0(homeContext.f390124p) && homeContext.f390126r == 1) {
            fTSEditTextView.m();
            fTSEditTextView.t();
        }
        fTSEditTextView.setHint(fTSEditTextView.getContext().getResources().getString(com.tencent.mm.R.string.m6k));
        boolean z17 = homeContext.f390127s == 1;
        this.f465904p = z17;
        if (z17) {
            fTSEditTextView.setClearBtnIconColor(dialog.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        }
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        if (oVar == tj5.o.UserInput || oVar == tj5.o.ClearText) {
            com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f465900i;
            java.lang.String totalQuery = fTSEditTextView.getTotalQuery();
            kotlin.jvm.internal.o.f(totalQuery, "getTotalQuery(...)");
            java.lang.String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
            kotlin.jvm.internal.o.f(inEditTextQuery, "getInEditTextQuery(...)");
            this.f465901m.r(totalQuery, inEditTextQuery);
        }
    }

    @Override // aw4.p
    public void C4(java.lang.String query, boolean z17) {
        kotlin.jvm.internal.o.g(query, "query");
        tj5.o oVar = z17 ? tj5.o.UserInput : tj5.o.SetText;
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f465900i;
        fTSEditTextView.o(query, null, oVar);
        if (!z17) {
            fTSEditTextView.d();
            fTSEditTextView.h();
            return;
        }
        fTSEditTextView.m();
        fTSEditTextView.s();
        xu4.d dVar = this.f465901m;
        if (dVar != null) {
            java.lang.String totalQuery = fTSEditTextView.getTotalQuery();
            kotlin.jvm.internal.o.f(totalQuery, "getTotalQuery(...)");
            java.lang.String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
            kotlin.jvm.internal.o.f(inEditTextQuery, "getInEditTextQuery(...)");
            dVar.r(totalQuery, inEditTextQuery);
        }
    }

    @Override // yu4.p
    public void D(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        this.f465895d.E(id6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if ((r4 == null || r4.length() == 0) == false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    @Override // tj5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean G0() {
        /*
            r6 = this;
            r0 = 0
            com.tencent.mm.ui.search.FTSEditTextView r1 = r6.f465900i
            if (r1 == 0) goto L9b
            java.lang.String r2 = r1.getTotalQuery()
            r3 = 1
            if (r2 == 0) goto L15
            boolean r4 = r26.n0.N(r2)
            if (r4 == 0) goto L13
            goto L15
        L13:
            r4 = r0
            goto L16
        L15:
            r4 = r3
        L16:
            if (r4 != 0) goto L19
            goto L1a
        L19:
            r2 = 0
        L1a:
            android.widget.EditText r4 = r1.getEditText()
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L31
            int r4 = r4.length()
            if (r4 != 0) goto L2f
            goto L31
        L2f:
            r4 = r0
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 == 0) goto L47
            java.lang.String r4 = r1.getRecommendSearchHint()
            if (r4 == 0) goto L43
            int r4 = r4.length()
            if (r4 != 0) goto L41
            goto L43
        L41:
            r4 = r0
            goto L44
        L43:
            r4 = r3
        L44:
            if (r4 != 0) goto L47
            goto L48
        L47:
            r3 = r0
        L48:
            if (r3 == 0) goto L59
            java.lang.String r2 = r1.getRecommendSearchHint()
            java.lang.String r4 = r1.getRecommendSearchHint()
            java.util.List r5 = r1.getTagList()
            r1.n(r4, r5)
        L59:
            if (r2 == 0) goto L9b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onSearchKeyDown: totalquery="
            r4.<init>(r5)
            java.lang.String r5 = r1.getTotalQuery()
            r4.append(r5)
            java.lang.String r5 = ", useRecommend="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = ", recommend="
            r4.append(r5)
            java.lang.String r5 = r1.getRecommendSearchHint()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = r6.f465898g
            com.tencent.mars.xlog.Log.i(r5, r4)
            java.lang.String r4 = r1.getInEditTextQuery()
            java.lang.String r5 = "getInEditTextQuery(...)"
            kotlin.jvm.internal.o.f(r4, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            xu4.d r5 = r6.f465901m
            r5.s(r2, r4, r3)
            r1.h()
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yu4.n.G0():boolean");
    }

    @Override // aw4.q
    public android.content.Context H() {
        android.content.Context context = this.f465895d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    @Override // yu4.p
    public void O2(r45.sn3 shareContent, java.lang.String str) {
        kotlin.jvm.internal.o.g(shareContent, "shareContent");
        this.f465895d.D(shareContent, str);
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (z17) {
            com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f465900i;
            java.lang.String totalQuery = fTSEditTextView.getTotalQuery();
            kotlin.jvm.internal.o.f(totalQuery, "getTotalQuery(...)");
            java.lang.String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
            kotlin.jvm.internal.o.f(inEditTextQuery, "getInEditTextQuery(...)");
            this.f465901m.r(totalQuery, inEditTextQuery);
        }
    }

    @Override // yu4.p
    public void W1(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f465900i;
        if (fTSEditTextView != null) {
            fTSEditTextView.setRecommendSearchHint(text);
        }
    }

    public final com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView a() {
        return (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) ((jz5.n) this.f465903o).getValue();
    }

    @Override // yu4.p
    public java.lang.String a4() {
        java.lang.String inEditTextQuery = this.f465900i.getInEditTextQuery();
        kotlin.jvm.internal.o.f(inEditTextQuery, "getInEditTextQuery(...)");
        return inEditTextQuery;
    }

    @Override // aw4.q
    public aw4.l b() {
        return this.f465901m;
    }

    @Override // yu4.p
    public void b4(r45.lw5 emoticon, r45.rn3 request, byte[] bArr) {
        kotlin.jvm.internal.o.g(emoticon, "emoticon");
        kotlin.jvm.internal.o.g(request, "request");
        this.f465895d.F(emoticon, request, bArr);
    }

    @Override // aw4.q
    public aw4.a c() {
        return this.f465902n;
    }

    @Override // yu4.p
    public void g5(r45.xi0 moreContext) {
        kotlin.jvm.internal.o.g(moreContext, "moreContext");
        yu4.k kVar = this.f465895d;
        kVar.getClass();
        pm0.v.X(new yu4.j(kVar, moreContext));
    }

    @Override // av4.j
    public com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView getWebView() {
        return a();
    }

    @Override // aw4.q
    public void hideVKB() {
        this.f465900i.h();
    }

    @Override // aw4.q
    public java.lang.Object m4() {
        return this.f465896e;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f465900i;
        fTSEditTextView.m();
        fTSEditTextView.s();
    }

    @Override // aw4.q
    public void showVKB() {
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f465900i;
        fTSEditTextView.m();
        fTSEditTextView.s();
    }

    @Override // av4.j
    public int z2() {
        return this.f465905q;
    }

    @Override // aw4.o, aw4.q
    public aw4.w b() {
        return this.f465901m;
    }

    @Override // aw4.o, aw4.q
    public aw4.v c() {
        return this.f465902n;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.b0 b() {
        return this.f465901m;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.y c() {
        return this.f465902n;
    }

    @Override // yu4.p, aw4.p, aw4.o, aw4.q
    public xu4.d b() {
        return this.f465901m;
    }

    @Override // yu4.p, aw4.p, aw4.o, aw4.q
    public xu4.h c() {
        return this.f465902n;
    }
}
