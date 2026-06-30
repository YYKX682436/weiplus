package com.tencent.mm.plugin.webview.ui.tools.fts.uic;

/* loaded from: classes8.dex */
public final class FTSFlutterSearchUIC extends wm3.a implements qx4.a {

    /* renamed from: d, reason: collision with root package name */
    public int f184640d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f184641e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f184642f;

    /* renamed from: g, reason: collision with root package name */
    public final long f184643g;

    /* renamed from: h, reason: collision with root package name */
    public final tg0.r1 f184644h;

    /* renamed from: i, reason: collision with root package name */
    public final tg0.q1 f184645i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC$onFullScreenEvent$1 f184646m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f184647n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f184648o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC$onFullScreenEvent$1] */
    public FTSFlutterSearchUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f184643g = java.lang.System.currentTimeMillis();
        this.f184644h = (tg0.r1) i95.n0.c(tg0.r1.class);
        this.f184645i = new rx4.e(activity, this);
        this.f184646m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebSearchHalfScreenEnterFullScreenEvent>() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC$onFullScreenEvent$1
            {
                super(androidx.appcompat.app.AppCompatActivity.this);
                this.__eventId = 1712514994;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WebSearchHalfScreenEnterFullScreenEvent webSearchHalfScreenEnterFullScreenEvent) {
                com.tencent.mm.autogen.events.WebSearchHalfScreenEnterFullScreenEvent event = webSearchHalfScreenEnterFullScreenEvent;
                kotlin.jvm.internal.o.g(event, "event");
                androidx.appcompat.app.AppCompatActivity appCompatActivity = androidx.appcompat.app.AppCompatActivity.this;
                com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI mMFTSSearchTabWebViewUI = appCompatActivity instanceof com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI) appCompatActivity : null;
                if (!(mMFTSSearchTabWebViewUI != null && mMFTSSearchTabWebViewUI.M3)) {
                    return true;
                }
                if (event.f54981g.f6896a != ((com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI) appCompatActivity).f184266x4) {
                    return false;
                }
                ((ku5.t0) ku5.t0.f312615d).B(rx4.g.f401154d);
                return true;
            }
        };
        this.f184648o = new rx4.f(this);
    }

    public final void T6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "Hide flutter");
        this.f184647n = false;
        android.view.ViewGroup viewGroup = this.f184641e;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).removeCallbacks(this.f184648o);
        ((sg0.w2) this.f184644h).nj(false, java.lang.Long.valueOf(this.f184643g));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x02c3, code lost:
    
        if (r8 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02e0, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02de, code lost:
    
        if (r8 == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(java.lang.String r28, boolean r29, boolean r30, java.util.Map r31) {
        /*
            Method dump skipped, instructions count: 1203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC.U6(java.lang.String, boolean, boolean, java.util.Map):void");
    }

    public final void V6(java.lang.String query, boolean z17, java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showFlutterAndStartSearch visibility ");
        android.view.ViewGroup viewGroup = this.f184641e;
        sb6.append(viewGroup != null ? java.lang.Integer.valueOf(viewGroup.getVisibility()) : null);
        sb6.append(" flutterInit ");
        sb6.append(this.f184642f);
        sb6.append(" query ");
        sb6.append(query);
        sb6.append(" cgiParams ");
        sb6.append(map);
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", sb6.toString());
        U6(query, z17, false, map);
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f184643g);
        sg0.w2 w2Var = (sg0.w2) this.f184644h;
        w2Var.getClass();
        kotlin.jvm.internal.o.g(query, "query");
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        kotlinx.coroutines.l.d(b17, null, null, new sg0.q2(w2Var, valueOf, query, z17, map, b17, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        jz5.f0 f0Var;
        alive();
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onCreate");
        if (bundle != null) {
            this.f184640d = bundle.getInt("ftsbizscene", 0);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f184640d = getActivity().getIntent().getIntExtra("ftsbizscene", 0);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.cg7);
        if (frameLayout != null) {
            float f17 = getActivity().getResources().getDisplayMetrics().density;
            android.view.View inflate = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.efd, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
            frameLayout.addView(viewGroup);
            this.f184641e = viewGroup;
            viewGroup.setVisibility(8);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate, add flutter container, width: ");
            android.view.ViewGroup viewGroup2 = this.f184641e;
            sb6.append(viewGroup2 != null ? java.lang.Integer.valueOf(viewGroup2.getWidth()) : null);
            sb6.append(", height: ");
            android.view.ViewGroup viewGroup3 = this.f184641e;
            sb6.append(viewGroup3 != null ? java.lang.Integer.valueOf(viewGroup3.getHeight()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", sb6.toString());
        }
        ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).aj(0);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onDestroy");
        dead();
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "Destroy flutter");
        long j17 = this.f184643g;
        sg0.w2 w2Var = (sg0.w2) this.f184644h;
        w2Var.getClass();
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        kotlinx.coroutines.l.d(b17, null, null, new sg0.l2(j17, w2Var, b17, null), 3, null);
        new android.os.Handler(android.os.Looper.getMainLooper()).removeCallbacks(this.f184648o);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onPause");
        this.f184644h.getClass();
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onResume");
        ((sg0.w2) this.f184644h).f407853q = java.lang.Long.valueOf(this.f184643g);
        com.tencent.mm.plugin.lite.LiteAppCenter.setJsApiContextForAppId(null, "wxalite13df24d39cdd33868c7c01a247000f87");
    }
}
