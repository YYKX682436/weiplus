package yu4;

/* loaded from: classes8.dex */
public final class o implements yu4.p {

    /* renamed from: d, reason: collision with root package name */
    public final yu4.k f465906d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xi0 f465907e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f465908f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f465909g;

    /* renamed from: h, reason: collision with root package name */
    public final xu4.d f465910h;

    /* renamed from: i, reason: collision with root package name */
    public final xu4.h f465911i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.websearch.webview.WebSearchWebView f465912m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f465913n;

    public o(yu4.k dialog, r45.xi0 homeContext, ur.l listener, android.view.View dialogView) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        kotlin.jvm.internal.o.g(homeContext, "homeContext");
        kotlin.jvm.internal.o.g(listener, "listener");
        kotlin.jvm.internal.o.g(dialogView, "dialogView");
        this.f465906d = dialog;
        this.f465907e = homeContext;
        this.f465908f = "MicroMsg.WebSearch.EmojiSearchMoreTab";
        this.f465909g = dialogView.findViewById(com.tencent.mm.R.id.jrs);
        android.view.View findViewById = dialogView.findViewById(com.tencent.mm.R.id.f485984js2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        xu4.d dVar = new xu4.d(this);
        this.f465910h = dVar;
        this.f465911i = new xu4.h(this);
        com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView = new com.tencent.mm.plugin.websearch.webview.WebSearchWebView(H());
        this.f465912m = webSearchWebView;
        webSearchWebView.J0(new aw4.s(), new aw4.u(10));
        boolean z17 = this.f465907e.f390127s == 1;
        this.f465913n = z17;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.EmojiSearchMoreTab", "init: forceDarkMode");
            webSearchWebView.setBackgroundColor(0);
            webSearchWebView.getBackground().setAlpha(0);
            webSearchWebView.getSettings().B(2);
        }
        webSearchWebView.addJavascriptInterface(dVar, "emojiWebSearchJSApi");
        frameLayout.addView(webSearchWebView);
    }

    @Override // aw4.p
    public void C4(java.lang.String query, boolean z17) {
        kotlin.jvm.internal.o.g(query, "query");
    }

    @Override // yu4.p
    public void D(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        this.f465906d.E(id6);
    }

    @Override // aw4.q
    public android.content.Context H() {
        android.content.Context context = this.f465906d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    @Override // yu4.p
    public void O2(r45.sn3 shareContent, java.lang.String str) {
        kotlin.jvm.internal.o.g(shareContent, "shareContent");
        this.f465906d.D(shareContent, str);
    }

    @Override // aw4.q
    public aw4.l b() {
        return this.f465910h;
    }

    @Override // yu4.p
    public void b4(r45.lw5 emoticon, r45.rn3 request, byte[] bArr) {
        kotlin.jvm.internal.o.g(emoticon, "emoticon");
        kotlin.jvm.internal.o.g(request, "request");
        this.f465906d.F(emoticon, request, bArr);
    }

    @Override // aw4.q
    public aw4.a c() {
        return this.f465911i;
    }

    @Override // yu4.p
    public void g5(r45.xi0 moreContext) {
        kotlin.jvm.internal.o.g(moreContext, "moreContext");
        com.tencent.mars.xlog.Log.i(this.f465908f, "start to load url %s", this.f465907e.f390118g);
        this.f465912m.loadUrl(this.f465907e.f390118g);
        android.view.View view = this.f465909g;
        if (view.getX() == 0.0f) {
            view.setX(i65.a.B(H()));
        }
        view.animate().translationX(0.0f).setStartDelay(200L).setDuration(300L).start();
        android.view.View view2 = this.f465909g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/websearch/emojisearch/ui/EmojiSearchMoreTab", "startMoreTab", "(Lcom/tencent/mm/protocal/protobuf/EmojiSearchHomeContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/websearch/emojisearch/ui/EmojiSearchMoreTab", "startMoreTab", "(Lcom/tencent/mm/protocal/protobuf/EmojiSearchHomeContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // av4.j
    public com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView getWebView() {
        return this.f465912m;
    }

    @Override // aw4.q
    public void hideVKB() {
    }

    @Override // aw4.q
    public java.lang.Object m4() {
        return this.f465907e;
    }

    @Override // aw4.q
    public void showVKB() {
    }

    @Override // aw4.o, aw4.q
    public aw4.w b() {
        return this.f465910h;
    }

    @Override // aw4.o, aw4.q
    public aw4.v c() {
        return this.f465911i;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.b0 b() {
        return this.f465910h;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.y c() {
        return this.f465911i;
    }

    @Override // yu4.p, aw4.p, aw4.o, aw4.q
    public xu4.d b() {
        return this.f465910h;
    }

    @Override // yu4.p, aw4.p, aw4.o, aw4.q
    public xu4.h c() {
        return this.f465911i;
    }
}
