package com.tencent.mm.plugin.webview.fts.ui;

/* loaded from: classes8.dex */
public class FtsWebVideoView extends android.widget.RelativeLayout {
    public static final /* synthetic */ int V = 0;
    public boolean A;
    public kw4.e B;
    public kw4.t C;
    public boolean D;
    public boolean E;
    public int F;
    public java.lang.String G;
    public lw4.j H;
    public lw4.e I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f182066J;
    public int K;
    public boolean L;
    public boolean M;
    public android.widget.ImageView N;
    public java.lang.String P;
    public long Q;
    public android.view.View R;
    public android.view.View S;
    public kw4.v T;
    public final android.content.BroadcastReceiver U;

    /* renamed from: d, reason: collision with root package name */
    public kw4.u f182067d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper f182068e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f182069f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar f182070g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f182071h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f182072i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f182073m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.websearch.widget.WebSearchDotPercentIndicator f182074n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f182075o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f182076p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f182077q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f182078r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f182079s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f182080t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f182081u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f182082v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f182083w;

    /* renamed from: x, reason: collision with root package name */
    public int f182084x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f182085y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f182086z;

    public FtsWebVideoView(android.content.Context context, boolean z17) {
        super(context);
        this.f182067d = kw4.u.AUTO;
        this.T = kw4.v.UNKNOWN;
        this.U = new kw4.o(this);
        setAutoPlay(z17);
        c(context);
    }

    private java.lang.String getNetUnavailableTip() {
        java.lang.String str;
        if (this.K == 0) {
            return getContext().getString(com.tencent.mm.R.string.k7t);
        }
        android.content.Context context = getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        long j17 = this.K;
        if (j17 < 0) {
            str = "";
        } else {
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal(j17);
            float floatValue = bigDecimal.divide(new java.math.BigDecimal(1048576), 2, 0).floatValue();
            if (floatValue > 1.0f) {
                str = ((int) floatValue) + "M";
            } else {
                str = ((int) bigDecimal.divide(new java.math.BigDecimal(1024), 2, 0).floatValue()) + "K";
            }
        }
        objArr[0] = str;
        return context.getString(com.tencent.mm.R.string.k7s, objArr);
    }

    private int getSystemVolume() {
        return ((android.media.AudioManager) getContext().getSystemService("audio")).getStreamVolume(3);
    }

    private void setCover(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(this.G)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setCover mCoverUrl not null");
    }

    public final void a(boolean z17) {
        lw4.j jVar = this.H;
        if (jVar == null) {
            return;
        }
        java.lang.String str = this.f182067d == kw4.u.PORTRAIT ? "vertical" : "horizontal";
        int i17 = this.f182084x;
        jVar.getClass();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange videoPlayerId=%d isFullScreen=%b direction:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), str);
            org.json.JSONObject h17 = jVar.h();
            h17.put("fullScreen", z17);
            h17.put(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, str);
            jVar.j(jVar.g(5, h17));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange e=%s", e17);
        }
        l();
    }

    public final boolean b(android.content.Context context) {
        kw4.v vVar = this.T;
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
            if (this.L || com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
                return true;
            }
            i();
            this.T = kw4.v.MOBILE_NET;
            this.f182070g.setVisibility(8);
            o(getNetUnavailableTip(), context.getString(com.tencent.mm.R.string.k6o), context.getString(com.tencent.mm.R.string.k6f));
            return false;
        }
        kw4.v vVar2 = kw4.v.NO_NET;
        if (vVar == vVar2) {
            android.view.View view = this.R;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.S;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f182071h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            postDelayed(new kw4.p(this, context), 200L);
        } else {
            this.T = vVar2;
            i();
            o(context.getString(com.tencent.mm.R.string.k7r), context.getString(com.tencent.mm.R.string.f493446k80), null);
        }
        return false;
    }

    public final void c(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bda, this);
        this.f182068e = (com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper) findViewById(com.tencent.mm.R.id.p0x);
        this.f182069f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lbi);
        this.f182071h = findViewById(com.tencent.mm.R.id.o__);
        this.f182072i = findViewById(com.tencent.mm.R.id.oa8);
        this.f182073m = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f482762nc);
        this.f182074n = (com.tencent.mm.plugin.websearch.widget.WebSearchDotPercentIndicator) findViewById(com.tencent.mm.R.id.f482763nd);
        this.f182075o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.n_);
        this.f182076p = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f482761nb);
        this.f182077q = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.cki);
        this.R = findViewById(com.tencent.mm.R.id.ozc);
        this.S = findViewById(com.tencent.mm.R.id.oa9);
        this.f182074n.setDotsNum(8);
        this.f182078r = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.cko);
        this.f182079s = findViewById(com.tencent.mm.R.id.cld);
        this.f182081u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o_a);
        this.f182080t = (android.widget.Button) findViewById(com.tencent.mm.R.id.o_b);
        this.f182082v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o_d);
        this.N = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.djo);
        this.f182081u.setOnClickListener(new kw4.k(this));
        this.N.setOnClickListener(new kw4.l(this));
        this.f182080t.setOnClickListener(new kw4.m(this));
        this.f182079s.setOnClickListener(new kw4.n(this));
        this.B = new kw4.e(getContext(), this, new kw4.q(this));
        this.f182068e.setIMMVideoViewCallback(new kw4.r(this));
        com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar = new com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar(getContext());
        this.f182070g = webSearchWebVideoViewControlBar;
        webSearchWebVideoViewControlBar.setVisibility(8);
        this.f182070g.setEnterFullScreenBtnClickListener(new kw4.s(this));
        this.f182070g.setExitFullScreenBtnClickListener(new kw4.f(this));
        this.f182070g.setMuteBtnOnClickListener(new kw4.g(this));
        this.f182070g.setIplaySeekCallback(new kw4.h(this));
        this.f182070g.setOnPlayButtonClickListener(new kw4.i(this));
        this.f182070g.setStatePorter(new kw4.j(this));
        this.f182068e.setVideoFooterView(this.f182070g);
        context.registerReceiver(this.U, new android.content.IntentFilter(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
        m();
    }

    public boolean d() {
        kw4.t tVar = this.C;
        if (tVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FtsWebVideoView", "isInFullScreen mFullScreenDelegate null");
            return false;
        }
        lw4.c cVar = (lw4.c) tVar;
        kw4.c0 c0Var = cVar.f321649c.f321654c;
        int i17 = c0Var.f313159e;
        int i18 = cVar.f321647a;
        return i17 == i18 || c0Var.f313158d == i18;
    }

    public final boolean e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "isLive %b %b", java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(this.f182068e.j()));
        return this.D || this.f182068e.j();
    }

    public void f() {
        if (this.f182066J || getSystemVolume() != 0) {
            return;
        }
        setMute(true);
    }

    public void g() {
        if (!this.f182066J || getSystemVolume() <= 0) {
            return;
        }
        setMute(false);
    }

    public lw4.j getCallback() {
        return this.H;
    }

    public java.lang.String getCookieData() {
        return this.f182083w;
    }

    public int getCurrPosMs() {
        return this.f182068e.getCurrPosMs();
    }

    public int getCurrPosSec() {
        return this.f182068e.getCurrPosSec();
    }

    public lw4.e getUiLifecycleListener() {
        return this.I;
    }

    public int getVideoSizeByte() {
        return this.K;
    }

    public int getmVideoPlayerId() {
        return this.f182084x;
    }

    public void h(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "operateFullScreen toFullScreen=%b", java.lang.Boolean.valueOf(z17));
        if (this.C == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FtsWebVideoView", "operateFullScreen mFullScreenDelegate null");
            return;
        }
        if (z17 == d()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "operateFullScreen current same");
            return;
        }
        if (!z17) {
            lw4.c cVar = (lw4.c) this.C;
            kw4.c0 c0Var = cVar.f321649c.f321654c;
            int i17 = cVar.f321647a;
            c0Var.getClass();
            kw4.a0 a0Var = new kw4.a0(c0Var, 1000L, java.lang.Boolean.FALSE, i17);
            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                ((java.lang.Boolean) a0Var.a(null)).booleanValue();
            } else {
                ((java.lang.Boolean) a0Var.a(c0Var.f313156b)).booleanValue();
            }
            com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar = this.f182070g;
            webSearchWebVideoViewControlBar.N = false;
            webSearchWebVideoViewControlBar.w();
            return;
        }
        kw4.t tVar = this.C;
        boolean z18 = this.f182067d != kw4.u.PORTRAIT;
        lw4.c cVar2 = (lw4.c) tVar;
        kw4.c0 c0Var2 = cVar2.f321649c.f321654c;
        int i18 = cVar2.f321647a;
        lw4.a aVar = cVar2.f321648b;
        c0Var2.getClass();
        kw4.z zVar = new kw4.z(c0Var2, 1000L, java.lang.Boolean.FALSE, i18, aVar, z18);
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            ((java.lang.Boolean) zVar.a(null)).booleanValue();
        } else {
            ((java.lang.Boolean) zVar.a(c0Var2.f313156b)).booleanValue();
        }
        com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar2 = this.f182070g;
        webSearchWebVideoViewControlBar2.N = true;
        webSearchWebVideoViewControlBar2.w();
        a(true);
    }

    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "pause");
        m();
        if (this.f182068e.isPlaying()) {
            this.f182068e.pause();
        }
    }

    public void j(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "seek to position=%d current=%d isLive=%b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f182068e.getCurrPosSec()), java.lang.Boolean.valueOf(this.D));
        if (e()) {
            return;
        }
        if (z17) {
            this.f182068e.a(i17, z17);
        } else {
            this.f182068e.b(i17);
        }
    }

    public void k(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setCover coverUrl=%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.G = str;
        l01.d0.f314761a.b(this.f182077q, str, null, null);
    }

    public final void l() {
        if (d()) {
            this.N.setVisibility(0);
        } else {
            this.N.setVisibility(8);
        }
    }

    public final void m() {
        android.view.View view = this.f182071h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "setCoverGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "setCoverGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void n(java.lang.String str, boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setVideoPath path=%s isLive=%s", str, java.lang.Boolean.valueOf(z17));
        this.P = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        q();
        this.D = z17;
        this.f182068e.h(z17, str, i17);
        com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar = this.f182070g;
        if (webSearchWebVideoViewControlBar != null) {
            webSearchWebVideoViewControlBar.setVideoTotalTime(i17);
        }
        int i18 = this.F;
        if (i18 > 0) {
            this.f182068e.b(i18);
        }
        if (this.f182085y) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setVideoPath autoPlay");
            p(false);
        }
        if (str.startsWith("wxfile://")) {
            setCover(str);
        }
    }

    public final void o(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        m();
        android.view.View view = this.R;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.S;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f182070g.setVisibility(8);
        android.view.View view3 = this.f182071h;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (android.text.TextUtils.isEmpty(str)) {
            this.f182082v.setVisibility(8);
        } else {
            this.f182082v.setText(str);
            this.f182082v.setVisibility(0);
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            this.f182080t.setVisibility(8);
        } else {
            this.f182080t.setText(str2);
            this.f182080t.setVisibility(0);
        }
        android.view.View view4 = this.f182072i;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f182079s;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f182081u.setVisibility(8);
        l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r21.f182071h.getVisibility() == 0) == false) goto L18;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "start");
        m();
        if (z17 && !b(getContext())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "start network is not wifi");
            return;
        }
        this.T = kw4.v.UNKNOWN;
        if (this.f182068e.isPlaying()) {
            return;
        }
        if (this.f182086z) {
            com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar = this.f182070g;
            if (webSearchWebVideoViewControlBar.M == null) {
                webSearchWebVideoViewControlBar.M = new com.tencent.mm.sdk.platformtools.b4(new bw4.h(webSearchWebVideoViewControlBar), true);
            }
            webSearchWebVideoViewControlBar.A();
            webSearchWebVideoViewControlBar.M.d();
            webSearchWebVideoViewControlBar.M.c(500L, 500L);
        }
        this.f182068e.start();
        if (this.Q == 0) {
            this.Q = java.lang.System.currentTimeMillis();
        } else {
            this.Q = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
    }

    public void q() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "stop");
        if (this.f182068e.isPlaying()) {
            this.f182068e.stop();
            com.tencent.mm.sdk.platformtools.b4 b4Var = this.f182070g.M;
            if (b4Var != null) {
                b4Var.d();
            }
        }
    }

    public void setAllowMobileNetPlay(boolean z17) {
        this.L = z17;
    }

    public void setAppId(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setAppId appid=%s", str);
    }

    public void setAutoPlay(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setAutoPlay =%b", java.lang.Boolean.valueOf(z17));
        this.f182085y = z17;
    }

    public void setCallback(lw4.j jVar) {
        this.H = jVar;
    }

    public void setCookieData(java.lang.String str) {
        this.f182083w = str;
    }

    public void setDisableScroll(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setDisableScroll isDisableScroll=%b", java.lang.Boolean.valueOf(z17));
    }

    public void setDuration(int i17) {
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setDuration error duration=%d", java.lang.Integer.valueOf(i17));
        }
    }

    public void setFullScreenDelegate(kw4.t tVar) {
        this.C = tVar;
    }

    public void setFullScreenDirection(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setFullScreenDirection %s", str);
        if ("horizontal".equalsIgnoreCase(str)) {
            this.f182067d = kw4.u.LANDSCAPE;
        } else if ("vertical".equalsIgnoreCase(str)) {
            this.f182067d = kw4.u.PORTRAIT;
        } else {
            this.f182067d = kw4.u.AUTO;
        }
    }

    public void setInitialTime(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setInitialTime initialTime=%d", java.lang.Integer.valueOf(i17));
        this.F = i17;
    }

    public void setIsShowBasicControls(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setIsShowBasicControls isShowBasicControls=%b", java.lang.Boolean.valueOf(z17));
        this.f182086z = z17;
    }

    public void setLoop(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setLoop loop=%b", java.lang.Boolean.valueOf(z17));
        this.E = z17;
    }

    public void setMute(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setMute isMute=%b", java.lang.Boolean.valueOf(z17));
        this.f182066J = z17;
        this.f182068e.setMute(z17);
        if (z17) {
            this.f182070g.F.setImageResource(com.tencent.mm.R.drawable.c6f);
        } else {
            this.f182070g.F.setImageResource(com.tencent.mm.R.drawable.c6c);
        }
    }

    public void setObjectFit(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setObjectFit objectFit=%s", str);
        if ("fill".equalsIgnoreCase(str)) {
            this.f182068e.setScaleType(com.tencent.mm.pluginsdk.ui.e1.FILL);
            this.f182077q.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        } else if ("cover".equalsIgnoreCase(str)) {
            this.f182068e.setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
            this.f182077q.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        } else {
            this.f182068e.setScaleType(com.tencent.mm.pluginsdk.ui.e1.CONTAIN);
            this.f182077q.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        }
    }

    public void setPageGesture(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "setPageGesture pageGesture=%b", java.lang.Boolean.valueOf(z17));
        this.A = z17;
    }

    public void setUiLifecycleListener(lw4.e eVar) {
        this.I = eVar;
    }

    public void setVideoPlayerId(int i17) {
        this.f182084x = i17;
    }

    public void setVideoSizeByte(int i17) {
        this.K = i17;
    }

    public FtsWebVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f182067d = kw4.u.AUTO;
        this.T = kw4.v.UNKNOWN;
        this.U = new kw4.o(this);
        c(context);
    }

    public FtsWebVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f182067d = kw4.u.AUTO;
        this.T = kw4.v.UNKNOWN;
        this.U = new kw4.o(this);
        c(context);
    }
}
