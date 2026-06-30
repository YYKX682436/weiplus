package hv4;

/* loaded from: classes8.dex */
public final class o implements hv4.b {

    /* renamed from: d, reason: collision with root package name */
    public final hv4.l f285326d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ck6 f285327e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f285328f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f285329g;

    /* renamed from: h, reason: collision with root package name */
    public final gv4.a f285330h;

    /* renamed from: i, reason: collision with root package name */
    public final gv4.e f285331i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.websearch.webview.WebSearchWebView f285332m;

    public o(hv4.l dialog, r45.ck6 homeContext, hv4.a listener, android.view.View dialogView) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        kotlin.jvm.internal.o.g(homeContext, "homeContext");
        kotlin.jvm.internal.o.g(listener, "listener");
        kotlin.jvm.internal.o.g(dialogView, "dialogView");
        this.f285326d = dialog;
        this.f285327e = homeContext;
        this.f285328f = "MicroMsg.WebSearch.TagSearchMoreTab";
        this.f285329g = dialogView.findViewById(com.tencent.mm.R.id.jrs);
        android.view.View findViewById = dialogView.findViewById(com.tencent.mm.R.id.f485984js2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        gv4.a aVar = new gv4.a(this);
        this.f285330h = aVar;
        this.f285331i = new gv4.e(this);
        com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView = new com.tencent.mm.plugin.websearch.webview.WebSearchWebView(H());
        this.f285332m = webSearchWebView;
        webSearchWebView.J0(new aw4.s(), new aw4.u(6));
        webSearchWebView.addJavascriptInterface(aVar, "tagWebSearchJSApi");
        ((android.widget.FrameLayout) findViewById).addView(webSearchWebView);
    }

    @Override // aw4.p
    public void C4(java.lang.String query, boolean z17) {
        kotlin.jvm.internal.o.g(query, "query");
    }

    @Override // hv4.b
    public void D(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        this.f285326d.F(id6);
    }

    @Override // aw4.q
    public android.content.Context H() {
        android.content.Context context = this.f285326d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    @Override // hv4.b
    public void M5(r45.sn3 shareContent, android.graphics.Bitmap bitmap, java.lang.String str) {
        kotlin.jvm.internal.o.g(shareContent, "shareContent");
        this.f285326d.D(shareContent, bitmap, str);
    }

    @Override // hv4.b
    public void a5(java.lang.String tag, java.lang.String sessionId, java.lang.String searchId, java.lang.String requestId) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(searchId, "searchId");
        kotlin.jvm.internal.o.g(requestId, "requestId");
    }

    @Override // aw4.q
    public aw4.l b() {
        return this.f285330h;
    }

    @Override // aw4.q
    public aw4.a c() {
        return this.f285331i;
    }

    @Override // av4.j
    public com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView getWebView() {
        return this.f285332m;
    }

    @Override // aw4.q
    public void hideVKB() {
    }

    @Override // aw4.q
    public java.lang.Object m4() {
        return this.f285327e;
    }

    @Override // hv4.b
    public void r1(r45.ck6 moreContext) {
        kotlin.jvm.internal.o.g(moreContext, "moreContext");
        com.tencent.mars.xlog.Log.i(this.f285328f, "start to load url %s", this.f285327e.f371625g);
        this.f285332m.loadUrl(this.f285327e.f371625g);
        android.view.View view = this.f285329g;
        if (view.getX() == 0.0f) {
            view.setX(i65.a.B(H()));
        }
        view.animate().translationX(0.0f).setStartDelay(200L).setDuration(300L).start();
        android.view.View view2 = this.f285329g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/websearch/tagsearch/ui/TagSearchMoreTab", "startMoreTab", "(Lcom/tencent/mm/protocal/protobuf/TagSearchHomeContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/websearch/tagsearch/ui/TagSearchMoreTab", "startMoreTab", "(Lcom/tencent/mm/protocal/protobuf/TagSearchHomeContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // aw4.q
    public void showVKB() {
    }

    @Override // aw4.o, aw4.q
    public aw4.w b() {
        return this.f285330h;
    }

    @Override // aw4.o, aw4.q
    public aw4.v c() {
        return this.f285331i;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.b0 b() {
        return this.f285330h;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.y c() {
        return this.f285331i;
    }

    @Override // hv4.b, aw4.p, aw4.o, aw4.q
    public gv4.a b() {
        return this.f285330h;
    }

    @Override // hv4.b, aw4.p, aw4.o, aw4.q
    public gv4.e c() {
        return this.f285331i;
    }
}
