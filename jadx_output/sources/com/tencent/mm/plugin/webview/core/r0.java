package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public abstract class r0 extends com.tencent.xweb.h1 implements com.tencent.mm.plugin.webview.permission.a, zg0.q2 {
    public static final com.tencent.mm.plugin.webview.core.c Q0 = new com.tencent.mm.plugin.webview.core.c(null);
    public static final java.lang.String[] R0 = {"https://statres.quickapp.cn/quickapp/js/routerinline.min.js", "http://fastappjump-drcn.hispace.hicloud.com/", "http://thefatherofsalmon.com/", "http://v2.thefatherofsalmon.com/"};
    public com.tencent.mm.plugin.webview.stub.v0 A;
    public final java.util.concurrent.ConcurrentLinkedDeque A0;
    public android.content.Intent B;
    public final java.util.concurrent.ConcurrentSkipListSet B0;
    public java.lang.String C;
    public final java.util.concurrent.ConcurrentSkipListSet C0;
    public java.lang.String D;
    public final java.util.concurrent.ConcurrentSkipListSet D0;
    public java.lang.String E;
    public final java.util.concurrent.ConcurrentSkipListSet E0;
    public java.lang.String F;
    public final boolean F0;
    public java.lang.String G;
    public com.tencent.mm.plugin.webview.core.x0 G0;
    public java.lang.String H;
    public final jz5.g H0;
    public java.lang.String I;
    public final jz5.g I0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f181915J;
    public boolean J0;
    public boolean K;
    public final java.util.concurrent.CopyOnWriteArrayList K0;
    public boolean L;
    public gg.c L0;
    public boolean M;
    public com.tencent.mm.plugin.webview.core.a1 M0;
    public final jz5.g N;
    public boolean N0;
    public final jz5.g O;
    public final jz5.g O0;
    public final jz5.g P;
    public final jz5.g P0;
    public final jz5.g Q;
    public final com.tencent.mm.plugin.webview.permission.w R;
    public final java.util.Map S;
    public final jz5.g T;
    public final com.tencent.mm.plugin.webview.core.j3 U;
    public final hy4.k0 V;
    public final jz5.g W;
    public final java.util.concurrent.ConcurrentLinkedDeque X;
    public final java.util.concurrent.ConcurrentLinkedDeque Y;
    public final java.util.concurrent.ConcurrentLinkedDeque Z;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f181916a;

    /* renamed from: a0, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f181917a0;

    /* renamed from: b, reason: collision with root package name */
    public final zg0.k2 f181918b;

    /* renamed from: b0, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f181919b0;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f181920c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f181921c0;

    /* renamed from: d, reason: collision with root package name */
    public final nw4.j f181922d;

    /* renamed from: d0, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.core.z0 f181923d0;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f181924e;

    /* renamed from: e0, reason: collision with root package name */
    public final android.view.View.OnTouchListener f181925e0;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.BaseWebViewController$sendDataToH5Listener$1 f181926f;

    /* renamed from: f0, reason: collision with root package name */
    public final jz5.g f181927f0;

    /* renamed from: g, reason: collision with root package name */
    public final zw4.d f181928g;

    /* renamed from: g0, reason: collision with root package name */
    public final int f181929g0;

    /* renamed from: h, reason: collision with root package name */
    public final cx4.q f181930h;

    /* renamed from: h0, reason: collision with root package name */
    public final int f181931h0;

    /* renamed from: i, reason: collision with root package name */
    public java.util.HashMap f181932i;

    /* renamed from: i0, reason: collision with root package name */
    public final int f181933i0;

    /* renamed from: j, reason: collision with root package name */
    public hy4.l0 f181934j;

    /* renamed from: j0, reason: collision with root package name */
    public final int f181935j0;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f181936k;

    /* renamed from: k0, reason: collision with root package name */
    public final int f181937k0;

    /* renamed from: l, reason: collision with root package name */
    public final pw4.c f181938l;

    /* renamed from: l0, reason: collision with root package name */
    public final int f181939l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f181940m;

    /* renamed from: m0, reason: collision with root package name */
    public final int f181941m0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f181942n;

    /* renamed from: n0, reason: collision with root package name */
    public final int f181943n0;

    /* renamed from: o, reason: collision with root package name */
    public android.app.Dialog f181944o;

    /* renamed from: o0, reason: collision with root package name */
    public final int f181945o0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f181946p;

    /* renamed from: p0, reason: collision with root package name */
    public final int f181947p0;

    /* renamed from: q, reason: collision with root package name */
    public int f181948q;

    /* renamed from: q0, reason: collision with root package name */
    public final int f181949q0;

    /* renamed from: r, reason: collision with root package name */
    public long f181950r;

    /* renamed from: r0, reason: collision with root package name */
    public final int f181951r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f181952s;

    /* renamed from: s0, reason: collision with root package name */
    public final int f181953s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f181954t;

    /* renamed from: t0, reason: collision with root package name */
    public final int f181955t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f181956u;

    /* renamed from: u0, reason: collision with root package name */
    public final int f181957u0;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f181958v;

    /* renamed from: v0, reason: collision with root package name */
    public final java.util.Set f181959v0;

    /* renamed from: w, reason: collision with root package name */
    public cx4.n f181960w;

    /* renamed from: w0, reason: collision with root package name */
    public final java.util.Set f181961w0;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f181962x;

    /* renamed from: x0, reason: collision with root package name */
    public final boolean f181963x0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f181964y;

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.List f181965y0;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f181966z;

    /* renamed from: z0, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f181967z0;

    /* JADX WARN: Type inference failed for: r12v1, types: [com.tencent.mm.plugin.webview.core.BaseWebViewController$sendDataToH5Listener$1] */
    public r0(com.tencent.mm.ui.widget.MMWebView viewWV, zg0.k2 options, java.util.Set set, nw4.j jVar) {
        kotlin.jvm.internal.o.g(viewWV, "viewWV");
        kotlin.jvm.internal.o.g(options, "options");
        this.f181916a = viewWV;
        this.f181918b = options;
        this.f181920c = set;
        this.f181922d = jVar;
        this.f181924e = jz5.h.b(new com.tencent.mm.plugin.webview.core.a(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f181926f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.webview.model.SendDataToH5Event>(a0Var) { // from class: com.tencent.mm.plugin.webview.core.BaseWebViewController$sendDataToH5Listener$1
            {
                this.__eventId = -739196989;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.webview.model.SendDataToH5Event sendDataToH5Event) {
                com.tencent.mm.plugin.webview.model.SendDataToH5Event event = sendDataToH5Event;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.webview.core.r0 r0Var = com.tencent.mm.plugin.webview.core.r0.this;
                if (event.f182728g != r0Var.U()) {
                    return false;
                }
                r0Var.g0().p(event.f182729h, event.f182730i);
                return true;
            }
        };
        this.f181928g = new zw4.d();
        this.f181930h = new cx4.q();
        this.f181936k = jz5.h.b(new com.tencent.mm.plugin.webview.core.q(this));
        this.f181938l = new pw4.c();
        this.f181958v = jz5.h.b(new com.tencent.mm.plugin.webview.core.i0(this));
        this.f181960w = cx4.n.f224638e;
        this.f181962x = jz5.h.b(new com.tencent.mm.plugin.webview.core.n0(this));
        this.f181966z = jz5.h.b(new com.tencent.mm.plugin.webview.core.f(this));
        this.C = "";
        this.D = "";
        this.E = "";
        this.F = "";
        this.G = "";
        this.H = "";
        this.I = "";
        this.M = true;
        this.N = jz5.h.b(new com.tencent.mm.plugin.webview.core.a0(this));
        this.O = jz5.h.b(new com.tencent.mm.plugin.webview.core.b0(this));
        this.P = jz5.h.b(new com.tencent.mm.plugin.webview.core.r(this));
        this.Q = jz5.h.b(com.tencent.mm.plugin.webview.core.z.f182027d);
        this.R = new com.tencent.mm.plugin.webview.permission.w(new com.tencent.mm.plugin.webview.core.q0(this));
        this.S = new java.util.concurrent.ConcurrentHashMap();
        this.T = jz5.h.b(new com.tencent.mm.plugin.webview.core.k0(this));
        this.U = new com.tencent.mm.plugin.webview.core.l0(this);
        this.V = new hy4.k0();
        this.W = jz5.h.b(new com.tencent.mm.plugin.webview.core.h0(this));
        this.X = new java.util.concurrent.ConcurrentLinkedDeque();
        this.Y = new java.util.concurrent.ConcurrentLinkedDeque();
        this.Z = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f181917a0 = new java.util.concurrent.ConcurrentHashMap();
        this.f181919b0 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f181923d0 = new com.tencent.mm.plugin.webview.core.z0();
        this.f181925e0 = new com.tencent.mm.plugin.webview.core.p0(this);
        this.f181927f0 = jz5.h.b(new com.tencent.mm.plugin.webview.core.v(this));
        this.f181929g0 = -1;
        this.f181931h0 = -2;
        this.f181933i0 = -3;
        this.f181935j0 = -10;
        this.f181937k0 = -5;
        this.f181939l0 = 1;
        this.f181941m0 = 2;
        this.f181943n0 = 3;
        this.f181945o0 = 4;
        this.f181947p0 = 6;
        this.f181949q0 = 7;
        this.f181951r0 = 10;
        this.f181953s0 = 11;
        this.f181955t0 = 12;
        this.f181957u0 = 13;
        this.f181959v0 = kz5.z.D0(new java.lang.Integer[]{11, 12, 10, 13});
        this.f181961w0 = kz5.z.D0(new java.lang.Integer[]{3, 4, 6});
        this.f181963x0 = true;
        this.f181965y0 = kz5.c0.k(new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction() { // from class: com.tencent.mm.plugin.webview.core.BaseWebViewController$Init
            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction
            public boolean verify() {
                return waitFor(getController().f181929g0);
            }
        }, new com.tencent.mm.plugin.webview.core.h(this)), new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction() { // from class: com.tencent.mm.plugin.webview.core.BaseWebViewController$PageLoadEndForCommitNotSupport
            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction
            public boolean verify(java.lang.String url) {
                kotlin.jvm.internal.o.g(url, "url");
                com.tencent.mm.plugin.webview.core.r0 controller = getController();
                return waitFor(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.webview.core.BaseWebViewController$Start.class)) && waitFor(controller.f181953s0, url) && waitFor(controller.f181957u0, url);
            }
        }, new com.tencent.mm.plugin.webview.core.i(this)), new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction() { // from class: com.tencent.mm.plugin.webview.core.BaseWebViewController$Inject
            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction
            public boolean verify(java.lang.String url) {
                kotlin.jvm.internal.o.g(url, "url");
                com.tencent.mm.plugin.webview.core.r0 controller = getController();
                return ((controller.f181916a.f211371t || waitFor(controller.f181951r0, url) || waitFor(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.webview.core.BaseWebViewController$PageLoadEndForCommitNotSupport.class), url)) && waitFor(controller.f181931h0) && (controller.f181918b.f472752e || controller.R.e(url) || waitFor(controller.f181939l0, url))) || controller.b1();
            }
        }, new com.tencent.mm.plugin.webview.core.j(this)), new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction() { // from class: com.tencent.mm.plugin.webview.core.BaseWebViewController$Bind
            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction
            public boolean verify() {
                com.tencent.mm.plugin.webview.core.r0 controller = getController();
                return waitFor(controller.f181933i0) && waitFor(controller.f181931h0);
            }
        }, new com.tencent.mm.plugin.webview.core.k(this)), new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction() { // from class: com.tencent.mm.plugin.webview.core.BaseWebViewController$Auth
            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction
            public boolean verify(java.lang.String url) {
                kotlin.jvm.internal.o.g(url, "url");
                com.tencent.mm.plugin.webview.core.r0 controller = getController();
                return waitFor(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.webview.core.BaseWebViewController$Inject.class), url) && waitFor(controller.f181931h0) && (controller.f181918b.f472752e || controller.R.e(url) || waitFor(controller.f181939l0, url));
            }
        }, new com.tencent.mm.plugin.webview.core.l(this)), new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction() { // from class: com.tencent.mm.plugin.webview.core.BaseWebViewController$Ready
            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction
            public boolean verify(java.lang.String url) {
                kotlin.jvm.internal.o.g(url, "url");
                com.tencent.mm.plugin.webview.core.r0 controller = getController();
                return (waitFor(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.webview.core.BaseWebViewController$Start.class)) && waitFor(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.webview.core.BaseWebViewController$Auth.class), url) && (waitFor(controller.f181953s0, url) || controller.f181916a.f211371t)) || controller.c1();
            }
        }, new com.tencent.mm.plugin.webview.core.m(this)), new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction() { // from class: com.tencent.mm.plugin.webview.core.BaseWebViewController$Start
            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction
            public boolean verify() {
                com.tencent.mm.plugin.webview.core.r0 controller = getController();
                if (!waitFor(controller.f181933i0)) {
                    return false;
                }
                if (controller.A0() && !waitFor(controller.f181931h0)) {
                    return false;
                }
                if (!(controller.i().length() > 0)) {
                    java.lang.String str = (java.lang.String) ((jz5.n) controller.f181927f0).getValue();
                    if (str == null || r26.n0.N(str)) {
                        return false;
                    }
                }
                return true;
            }
        }, new com.tencent.mm.plugin.webview.core.n(this)), new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction() { // from class: com.tencent.mm.plugin.webview.core.BaseWebViewController$SPAUpdated
            private final boolean keep = true;

            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$WebAction
            public boolean getKeep() {
                return this.keep;
            }

            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction
            public boolean verify(java.lang.String url) {
                kotlin.jvm.internal.o.g(url, "url");
                return waitFor(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.webview.core.BaseWebViewController$Ready.class), url) && waitFor(getController().f181955t0, url);
            }
        }, new com.tencent.mm.plugin.webview.core.o(this)), new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction() { // from class: com.tencent.mm.plugin.webview.core.BaseWebViewController$ProgressBarStart
            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction
            public boolean verify(java.lang.String url) {
                kotlin.jvm.internal.o.g(url, "url");
                com.tencent.mm.plugin.webview.core.r0 controller = getController();
                return waitFor(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.webview.core.BaseWebViewController$Start.class)) && ((!controller.p0(controller.f181937k0) && (waitFor(controller.f181945o0, url) || waitFor(controller.f181943n0, url))) || (!waitFor(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.webview.core.BaseWebViewController$ProgressBarEnd.class), url) && controller.p0(controller.f181937k0) && waitFor(controller.f181947p0, url)));
            }
        }, new com.tencent.mm.plugin.webview.core.p(this)), new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction() { // from class: com.tencent.mm.plugin.webview.core.BaseWebViewController$ProgressBarEnd
            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction
            public boolean verify(java.lang.String url) {
                kotlin.jvm.internal.o.g(url, "url");
                com.tencent.mm.plugin.webview.core.r0 controller = getController();
                return controller.X() && (controller.c1() || waitFor(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.webview.core.BaseWebViewController$Ready.class), url) || waitFor(controller.f181953s0, url) || waitFor(controller.f181951r0, url) || waitFor(controller.f181941m0, url));
            }
        }, new com.tencent.mm.plugin.webview.core.g(this)));
        this.f181967z0 = new java.util.concurrent.ConcurrentLinkedDeque();
        this.A0 = new java.util.concurrent.ConcurrentLinkedDeque();
        this.B0 = new java.util.concurrent.ConcurrentSkipListSet();
        this.C0 = new java.util.concurrent.ConcurrentSkipListSet();
        this.D0 = new java.util.concurrent.ConcurrentSkipListSet();
        this.E0 = new java.util.concurrent.ConcurrentSkipListSet();
        this.F0 = O().f183381a.size() > 0;
        this.H0 = jz5.h.b(com.tencent.mm.plugin.webview.core.o0.f181900d);
        this.I0 = jz5.h.b(com.tencent.mm.plugin.webview.core.c0.f181765d);
        this.K0 = new java.util.concurrent.CopyOnWriteArrayList();
        this.O0 = jz5.h.b(com.tencent.mm.plugin.webview.core.g0.f181835d);
        this.P0 = jz5.h.b(com.tencent.mm.plugin.webview.core.f0.f181826d);
    }

    public static /* synthetic */ com.tencent.mm.plugin.webview.permission.i W0(com.tencent.mm.plugin.webview.core.r0 r0Var, java.lang.String str, boolean z17, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startGetA8Key");
        }
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        if ((i18 & 4) != 0) {
            i17 = r0Var.P(str);
        }
        return r0Var.V0(str, z17, i17);
    }

    @Override // com.tencent.xweb.h1
    public final boolean A(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var) {
        com.tencent.mm.plugin.webview.core.h3 h3Var;
        if (x0Var == null || webView == null) {
            return false;
        }
        java.lang.String T = T();
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.net.Uri url = x0Var.getUrl();
        objArr[0] = url != null ? url.toString() : null;
        com.tencent.mars.xlog.Log.i(T, "shouldOverrideUrlLoading url: %s", objArr);
        java.util.Iterator it = this.X.iterator();
        while (true) {
            if (!it.hasNext()) {
                h3Var = new com.tencent.mm.plugin.webview.core.h3(false, false);
                break;
            }
            h3Var = ((com.tencent.mm.plugin.webview.core.i3) it.next()).q(webView, x0Var);
            if (h3Var.f181845a) {
                break;
            }
        }
        if (h3Var.f181845a ? h3Var.f181846b : false) {
            return true;
        }
        return super.A(webView, x0Var);
    }

    public abstract boolean A0();

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (r12 == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    @Override // com.tencent.xweb.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(com.tencent.xweb.WebView r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = r11.T()
            java.lang.String r1 = "shouldOverrideUrlLoading: "
            java.lang.String r1 = r1.concat(r13)
            com.tencent.mars.xlog.Log.i(r0, r1)
            r11.T()
            boolean r12 = r11.I0(r12, r13)
            r0 = 1
            if (r12 == 0) goto L26
            goto Lc2
        L26:
            int r12 = r11.P(r13)
            r1 = 2
            r2 = 0
            if (r12 != r1) goto L88
            com.tencent.mm.plugin.webview.permission.d r12 = r11.O()
            r12.getClass()
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r13)
            if (r3 != 0) goto L83
            int r3 = r12.m()
            if (r3 > 0) goto L42
            goto L83
        L42:
            char[] r3 = com.tencent.mm.sdk.platformtools.w2.f193046a
            byte[] r3 = r13.getBytes()
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.w2.b(r3)
            java.util.HashMap r4 = r12.f183382b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r4.getOrDefault(r3, r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r13}
            java.lang.String r5 = "MicroMsg.LuggageGetA8Key"
            java.lang.String r6 = "isRedirectLimit currentCnt:%d url:%s "
            com.tencent.mars.xlog.Log.i(r5, r6, r4)
            int r12 = r12.m()
            if (r3 < r12) goto L73
            r12 = r0
            goto L74
        L73:
            r12 = r2
        L74:
            if (r12 == 0) goto L84
            com.tencent.mm.plugin.report.service.g0 r3 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r4 = 1653(0x675, double:8.167E-321)
            r6 = 14
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            goto L84
        L83:
            r12 = r2
        L84:
            if (r12 != 0) goto L88
            r12 = r0
            goto L89
        L88:
            r12 = r2
        L89:
            java.lang.String r3 = r11.T()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "doShouldOverrideUrlLoading needForceGetA8key:"
            r4.<init>(r5)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r3, r4)
            boolean r12 = r11.U0(r13, r12)
            if (r12 == 0) goto Lc1
            zg0.k2 r12 = r11.f181918b
            boolean r12 = r12.f472752e
            if (r12 != 0) goto Lbd
            int r12 = r11.P(r13)
            if (r12 == 0) goto Lb8
            if (r12 == r1) goto Lb8
            r1 = 8
            if (r12 == r1) goto Lb8
            r12 = r2
            goto Lb9
        Lb8:
            r12 = r0
        Lb9:
            if (r12 == 0) goto Lbd
            r12 = r0
            goto Lbe
        Lbd:
            r12 = r2
        Lbe:
            if (r12 == 0) goto Lc1
            goto Lc2
        Lc1:
            r0 = r2
        Lc2:
            if (r0 != 0) goto Lcd
            com.tencent.mm.plugin.webview.core.z0 r12 = new com.tencent.mm.plugin.webview.core.z0
            r12.<init>()
            r11.f181923d0 = r12
            r11.f181964y = r13
        Lcd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.core.r0.B(com.tencent.xweb.WebView, java.lang.String):boolean");
    }

    public final java.lang.String B0(java.lang.String str) {
        return ((str == null || r26.n0.N(str)) || nf.e.c(str, "about:blank", true) || nf.e.c(str, "data:text/html;charset=utf-8", true)) ? this.C : str;
    }

    public void C(com.tencent.mm.plugin.webview.core.o1 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.Y;
        if (concurrentLinkedDeque.contains(listener)) {
            return;
        }
        concurrentLinkedDeque.add(listener);
    }

    public abstract void C0();

    public synchronized void D(com.tencent.mm.plugin.webview.core.f3 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        if (!this.Z.contains(listener)) {
            listener.f181833a = this;
            this.Z.add(listener);
            if (this.E0.contains(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.webview.core.BaseWebViewController$Bind.class).g())) {
                com.tencent.mars.xlog.Log.i(T(), "Abe-Debug Patch Call onBind");
                listener.e();
            }
        }
    }

    public abstract void D0();

    public final void E(com.tencent.mm.plugin.webview.core.i3 interceptor) {
        kotlin.jvm.internal.o.g(interceptor, "interceptor");
        this.X.add(interceptor);
        com.tencent.mm.plugin.webview.core.o1 b17 = interceptor.b();
        if (b17 != null) {
            C(b17);
        }
        com.tencent.mm.plugin.webview.core.f3 d17 = interceptor.d();
        if (d17 != null) {
            D(d17);
        }
        interceptor.f181851a = this;
        interceptor.h();
    }

    public final void E0() {
        java.lang.String T = T();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinish ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i(T, sb6.toString());
        java.util.Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.core.f3) it.next()).f();
        }
    }

    public final boolean F(int i17, java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return kotlin.jvm.internal.o.b(url, this.D) || i17 == this.f181949q0 || (this.f181959v0.contains(java.lang.Integer.valueOf(i17)) && kotlin.jvm.internal.o.b(url, this.F)) || this.f181961w0.contains(java.lang.Integer.valueOf(i17));
    }

    public abstract void F0();

    public boolean G(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (x51.o1.f452062o) {
            com.tencent.mars.xlog.Log.w(T(), "skipLoadUrlCheck");
            return true;
        }
        if (this.f181918b.f472749b) {
            com.tencent.mars.xlog.Log.i(T(), "albie: trust this url(%s)", url);
            return true;
        }
        if (!nf.e.c(url, "file://", true) || y0(url)) {
            return true;
        }
        if (!y0(i())) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(T(), "canLoadUrl rawUrl(%s) is in fileUrlWhiteList, url: %s", i(), url);
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public void e(int i17, java.lang.String reqUrl, java.lang.String fullUrl, r45.s83 response) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(fullUrl, "fullUrl");
        kotlin.jvm.internal.o.g(response, "response");
        T();
        U();
        if (v0()) {
            T();
            return;
        }
        this.H = fullUrl;
        com.tencent.mm.protocal.JsapiPermissionWrapper h17 = O().h(reqUrl);
        com.tencent.mm.protocal.GeneralControlWrapper e17 = O().e(reqUrl);
        com.tencent.mm.plugin.webview.permission.w wVar = this.R;
        wVar.g(reqUrl, h17, e17);
        wVar.g(fullUrl, O().h(fullUrl), O().e(fullUrl));
        java.util.Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.core.f3) it.next()).k(i17, reqUrl, response);
        }
        int i18 = this.f181939l0;
        J(i18, reqUrl);
        J(i18, fullUrl);
        if (!this.f181954t) {
            com.tencent.mm.protocal.GeneralControlWrapper b17 = wVar.b();
            this.f181954t = b17 != null && (b17.f192177d & 8388608) > 0;
        }
        if (!this.f181956u) {
            r45.v83 v83Var = O().E;
            this.f181956u = v83Var != null && v83Var.f387986f == 1;
        }
        if (kotlin.jvm.internal.o.b(reqUrl, this.F)) {
            J(this.f181955t0, reqUrl);
            com.tencent.mars.xlog.Log.i(T(), "WebAction:Ready onPermissionUpdated Patch: " + this.F);
        }
    }

    public abstract boolean H(java.lang.String str);

    public abstract void H0();

    public final synchronized void I(int i17) {
        if (v0()) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.core.t(i17, this));
    }

    public abstract boolean I0(com.tencent.xweb.WebView webView, java.lang.String str);

    public final synchronized void J(int i17, java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (!v0() && !r26.n0.N(url)) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.core.u(i17, this, url));
            return;
        }
        com.tencent.mars.xlog.Log.w(T(), "checkStatus return url=".concat(url));
    }

    public void J0() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
        if (mMWebView == null || com.tencent.mm.sdk.platformtools.t8.K0(mMWebView.getUrl())) {
            return;
        }
        for (com.tencent.mm.plugin.webview.core.i3 i3Var : this.X) {
            java.lang.String url = mMWebView.getUrl();
            kotlin.jvm.internal.o.f(url, "getUrl(...)");
            if (i3Var.m(W(url))) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(T(), "reload");
        mMWebView.reload();
    }

    public final void K(com.tencent.xweb.WebView webView, java.lang.String str) {
        if (webView != null && this.f181921c0 && webView.canGoBack()) {
            com.tencent.mars.xlog.Log.i(T(), "clearHistory :" + str);
            webView.clearHistory();
            if (com.tencent.mm.sdk.platformtools.t8.D0(str, "about:blank")) {
                return;
            }
            this.f181921c0 = false;
        }
    }

    public void K0(com.tencent.mm.plugin.webview.core.o1 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.Y;
        if (concurrentLinkedDeque.contains(listener)) {
            concurrentLinkedDeque.remove(listener);
        }
    }

    public final void L(java.lang.String script, yz5.l lVar) {
        kotlin.jvm.internal.o.g(script, "script");
        pm0.v.X(new com.tencent.mm.plugin.webview.core.y(this, script, lVar));
    }

    public synchronized void L0(com.tencent.mm.plugin.webview.core.f3 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        if (this.Z.contains(listener)) {
            this.Z.remove(listener);
        }
    }

    public final boolean M() {
        boolean remove;
        synchronized (this) {
            int i17 = this.f181937k0;
            synchronized (this) {
                this.C0.remove(java.lang.Integer.valueOf(i17));
            }
            return remove;
        }
        int i18 = this.f181935j0;
        synchronized (this) {
            remove = this.C0.remove(java.lang.Integer.valueOf(i18));
        }
        return remove;
    }

    public final void M0(com.tencent.mm.plugin.webview.core.i3 interceptor) {
        kotlin.jvm.internal.o.g(interceptor, "interceptor");
        this.X.remove(interceptor);
        com.tencent.mm.plugin.webview.core.o1 b17 = interceptor.b();
        if (b17 != null) {
            K0(b17);
        }
        com.tencent.mm.plugin.webview.core.f3 d17 = interceptor.d();
        if (d17 != null) {
            L0(d17);
        }
    }

    public final boolean N(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (G(url)) {
            return false;
        }
        com.tencent.mars.xlog.Log.f(T(), "forceQuitOnUrlForbidden, canLoadUrl fail, url = ".concat(url));
        java.util.Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.core.f3) it.next()).h();
        }
        return true;
    }

    public final void N0(boolean z17) {
        try {
            e0();
            if (!z17) {
                e0().A5(U());
            }
            e0().Md(U(), z17);
            com.tencent.mars.xlog.Log.i(T(), "removeInvoker ok");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(T(), "onDestroy, remove callback and invoke event on webview destroy, ex = " + e17);
        }
    }

    public final com.tencent.mm.plugin.webview.permission.d O() {
        return (com.tencent.mm.plugin.webview.permission.d) this.f181966z.getValue();
    }

    public final void O0(int i17) {
        java.lang.String Z = Z();
        boolean z17 = false;
        if ((Z == null || r26.n0.N(Z)) || H(Z) || !p0(this.f181933i0)) {
            return;
        }
        int i18 = O().E.f387989i;
        if (i18 <= 0) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        if ((i18 > 0) && (!r26.n0.N(i())) && !h0().c(i17)) {
            zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
            if (a0Var != null && !((yq1.z) a0Var).o(Z)) {
                z17 = true;
            }
            if (z17) {
                h0().a(this.f181916a, Z, i(), O(), i17, true);
            }
        }
    }

    public final int P(java.lang.String str) {
        java.util.Iterator it = this.X.iterator();
        while (it.hasNext()) {
            int a17 = ((com.tencent.mm.plugin.webview.core.i3) it.next()).a(str);
            if (a17 != -1) {
                return a17;
            }
        }
        return O().l(str, false);
    }

    public void P0(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (Y0(value)) {
            T();
            this.E = value;
        }
    }

    public abstract int Q();

    public final void Q0(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (Z0(value)) {
            T();
            this.D = value;
        }
    }

    public final void R0() {
        if (this.L0 != null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(T(), "WebView-Trace setWebViewPluginClient");
        ((yg0.w3) ((zg0.e3) i95.n0.c(zg0.e3.class))).getClass();
        if (dy4.k.f244679d == null) {
            dy4.k.f244679d = new dy4.k();
        }
        dy4.k kVar = dy4.k.f244679d;
        this.L0 = sf.i.a(this.f181916a, gg.b.getInstance(), kVar, null);
    }

    public java.util.List S() {
        return this.f181965y0;
    }

    public void S0(boolean z17) {
        T0(z17, null);
    }

    public final java.lang.String T() {
        return (java.lang.String) ((jz5.n) this.f181924e).getValue();
    }

    public abstract void T0(boolean z17, android.content.Context context);

    public int U() {
        return ((java.lang.Number) ((jz5.n) this.P).getValue()).intValue();
    }

    public boolean U0(java.lang.String url, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        return W0(this, url, z17, 0, 4, null) == com.tencent.mm.plugin.webview.permission.i.WILL_GET;
    }

    public abstract java.lang.String V(java.lang.String str);

    public final com.tencent.mm.plugin.webview.permission.i V0(java.lang.String url, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(url, "url");
        if (this.f181918b.f472752e) {
            com.tencent.mars.xlog.Log.w(T(), "startGetA8Key neverGetA8Key ".concat(url));
            return com.tencent.mm.plugin.webview.permission.i.NO_NEED;
        }
        java.util.Iterator it = this.X.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.plugin.webview.core.i3) it.next()).j(url, z17, i17)) {
                return com.tencent.mm.plugin.webview.permission.i.INTERCEPTED;
            }
        }
        if (this.f181948q > 0) {
            com.tencent.mm.plugin.webview.permission.d O = O();
            r45.w83 w83Var = new r45.w83();
            w83Var.f388962d = this.f181948q;
            w83Var.f388963e = (int) (java.lang.System.currentTimeMillis() - this.f181950r);
            com.tencent.mars.xlog.Log.i(T(), "GetA8KeySecurityInfo KeyBackCounts=" + w83Var.f388962d + ", KeyBackTimes=" + w83Var.f388963e);
            O.C = w83Var;
        }
        java.lang.String stringExtra = d0().getStringExtra("KTemplateId");
        java.lang.String stringExtra2 = d0().getStringExtra("srcUsername");
        boolean k17 = com.tencent.xweb.a3.k(2029);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(stringExtra);
        jz5.g gVar = this.f181962x;
        if (!K0 || !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) || ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() || k17) {
            com.tencent.mm.plugin.webview.permission.d O2 = O();
            r45.u83 u83Var = new r45.u83();
            u83Var.f387132d = stringExtra2;
            u83Var.f387133e = stringExtra;
            u83Var.f387134f = ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() ? 1 : 0;
            u83Var.f387135g = k17 ? 1 : 0;
            com.tencent.mars.xlog.Log.i(T(), "GetA8KeySceneNote tmpl_appid=" + u83Var.f387132d + ", tmpl_id=" + u83Var.f387133e + ", share_middle_page=" + u83Var.f387134f + ", can_fetch_video=" + u83Var.f387135g);
            O2.B = u83Var;
        }
        return O().t(url, z17, i17, (com.tencent.mm.plugin.webview.permission.s) ((jz5.n) this.f181936k).getValue());
    }

    public final java.lang.String W(java.lang.String str) {
        if (!Y0(str)) {
            str = this.E;
        }
        return (r26.n0.N(str) && p0(this.f181933i0)) ? i() : str;
    }

    public boolean X() {
        return this.f181963x0;
    }

    public final void X0(java.lang.String str) {
        boolean contains;
        nw4.n g07;
        if (!((java.lang.Boolean) ((jz5.n) this.H0).getValue()).booleanValue() || this.f181916a.f211371t || p0(this.f181935j0) || str == null || r26.i0.y(str, "file:", false)) {
            return;
        }
        synchronized (this) {
            contains = this.D0.contains(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.webview.core.BaseWebViewController$Inject.class).g());
        }
        if (contains || (g07 = g0()) == null) {
            return;
        }
        g07.f340903q = true;
        java.lang.String Y = com.tencent.mm.sdk.platformtools.t8.Y(16);
        g07.f340904r = Y;
        g07.f340887a.setRandomStr(Y);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "WebView-Trace js digest updateDgtVerify randomStr = %s, hashCode: %d", g07.f340904r, java.lang.Integer.valueOf(g07.hashCode()));
    }

    public final android.content.Context Y() {
        android.content.Context activityContextIfHas = this.f181916a.getActivityContextIfHas();
        kotlin.jvm.internal.o.f(activityContextIfHas, "getActivityContextIfHas(...)");
        return activityContextIfHas;
    }

    public boolean Y0(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if ((!r26.n0.N(url)) && !r26.i0.y(url, "data:text/html;charset=utf-8", false) && !r26.i0.y(url, "about:blank", false)) {
            if (!p0(this.f181935j0)) {
                return true;
            }
            java.lang.String HARDCODE_URL = ax4.a.f15114a;
            kotlin.jvm.internal.o.f(HARDCODE_URL, "HARDCODE_URL");
            if (!r26.i0.y(url, HARDCODE_URL, false)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String Z() {
        return r26.n0.N(this.F) ? this.E : this.F;
    }

    public boolean Z0(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void a(int i17, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
            com.tencent.xweb.z0 settings = mMWebView.getSettings();
            if (settings != null) {
                settings.E(false);
            }
            mMWebView.loadData(str2, "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:2:0x0000, B:4:0x000a, B:9:0x0016, B:10:0x001f, B:14:0x001b), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:2:0x0000, B:4:0x000a, B:9:0x0016, B:10:0x001f, B:14:0x001b), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a0() {
        /*
            r4 = this;
            com.tencent.mm.plugin.webview.permission.d r0 = r4.O()     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = r4.Z()     // Catch: java.lang.Exception -> L28
            if (r1 == 0) goto L13
            boolean r1 = r26.n0.N(r1)     // Catch: java.lang.Exception -> L28
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            if (r1 == 0) goto L1b
            java.lang.String r1 = r4.i()     // Catch: java.lang.Exception -> L28
            goto L1f
        L1b:
            java.lang.String r1 = r4.Z()     // Catch: java.lang.Exception -> L28
        L1f:
            r45.x83 r0 = r0.f(r1)     // Catch: java.lang.Exception -> L28
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Exception -> L28
            return r0
        L28:
            r0 = move-exception
            java.lang.String r1 = r4.T()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "saveLiveBarResp ex "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.mars.xlog.Log.w(r1, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.core.r0.a0():byte[]");
    }

    public final synchronized void a1(java.lang.Iterable iterable, java.util.Set set, java.lang.String str) {
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            com.tencent.mm.plugin.webview.core.BaseWebViewController$WebAction baseWebViewController$WebAction = (com.tencent.mm.plugin.webview.core.BaseWebViewController$WebAction) lVar.f302833d;
            yz5.a aVar = (yz5.a) lVar.f302834e;
            boolean z17 = false;
            if (baseWebViewController$WebAction instanceof com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction) {
                if (str != null && ((com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction) baseWebViewController$WebAction).verify(str)) {
                    z17 = true;
                }
            } else if (baseWebViewController$WebAction instanceof com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction) {
                z17 = ((com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction) baseWebViewController$WebAction).verify();
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i(T(), "verify WebAction: " + kotlin.jvm.internal.i0.a(baseWebViewController$WebAction.getClass()).g() + " start");
                if (!baseWebViewController$WebAction.getKeep()) {
                    it.remove();
                }
                aVar.invoke();
                java.lang.String g17 = kotlin.jvm.internal.i0.a(baseWebViewController$WebAction.getClass()).g();
                if (g17 == null) {
                    g17 = "";
                }
                set.add(g17);
                T();
                kotlin.jvm.internal.i0.a(baseWebViewController$WebAction.getClass()).g();
            }
        }
    }

    public final com.tencent.mm.sdk.platformtools.n3 b0() {
        return (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.Q).getValue();
    }

    public boolean b1() {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void c(int i17, java.lang.String reqUrl, int i18, int i19, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        if (i17 == -1 || i17 == 0) {
            this.f181964y = null;
        }
        this.H = reqUrl;
        J(this.f181941m0, reqUrl);
        java.util.Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.core.f3) it.next()).b(i17, reqUrl, i18, i19, errMsg);
        }
    }

    public com.tencent.mm.protocal.JsapiPermissionWrapper c0(zg0.k2 options) {
        kotlin.jvm.internal.o.g(options, "options");
        return null;
    }

    public boolean c1() {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void d(int i17, java.lang.String reqUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        this.V.a("getA8KeyStart", java.lang.System.currentTimeMillis());
        if (i17 != 5) {
            J(this.f181945o0, reqUrl);
        }
        if (kotlin.jvm.internal.o.b(this.F, reqUrl)) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.core.e0(this, i17, reqUrl));
    }

    public final android.content.Intent d0() {
        android.content.Intent intent = this.B;
        if (intent != null) {
            return intent;
        }
        kotlin.jvm.internal.o.o("intent");
        throw null;
    }

    public com.tencent.mm.plugin.webview.stub.v0 e0() {
        com.tencent.mm.plugin.webview.stub.v0 v0Var = this.A;
        if (v0Var != null) {
            return v0Var;
        }
        kotlin.jvm.internal.o.o("invoker");
        throw null;
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void f(int i17, java.lang.String reqUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        this.V.a("getA8KeyEnd", java.lang.System.currentTimeMillis());
        java.util.Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.core.f3) it.next()).a(i17, reqUrl);
        }
    }

    public final nw4.v2 f0() {
        return (nw4.v2) ((jz5.n) this.N).getValue();
    }

    public final nw4.n g0() {
        return (nw4.n) ((jz5.n) this.O).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0045  */
    @Override // com.tencent.mm.plugin.webview.permission.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(int r7, boolean r8, java.lang.String r9, java.lang.String r10, java.lang.Object r11) {
        /*
            r6 = this;
            r45.s83 r11 = (r45.s83) r11
            java.lang.String r0 = "reqUrl"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "fullUrl"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "response"
            kotlin.jvm.internal.o.g(r11, r0)
            boolean r0 = r6.N(r10)
            if (r0 == 0) goto L27
            java.lang.String r8 = r6.T()
            java.lang.String r0 = "processGetA8Key qrcode, canLoadUrl fail, url = "
            java.lang.String r0 = r0.concat(r10)
            com.tencent.mars.xlog.Log.f(r8, r0)
            goto L3f
        L27:
            java.util.concurrent.ConcurrentLinkedDeque r0 = r6.X
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.webview.core.i3 r1 = (com.tencent.mm.plugin.webview.core.i3) r1
            boolean r1 = r1.s(r7, r8, r9, r10)
            if (r1 == 0) goto L2d
        L3f:
            r8 = 1
            goto L42
        L41:
            r8 = 0
        L42:
            if (r8 == 0) goto L45
            goto L68
        L45:
            r6.T()
            java.util.Map r2 = r6.S
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r6
            r1 = r10
            zg0.q2.b(r0, r1, r2, r3, r4, r5)
            java.util.concurrent.ConcurrentLinkedDeque r8 = r6.Z
            java.util.Iterator r8 = r8.iterator()
        L58:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L68
            java.lang.Object r10 = r8.next()
            com.tencent.mm.plugin.webview.core.f3 r10 = (com.tencent.mm.plugin.webview.core.f3) r10
            r10.q(r7, r9, r11)
            goto L58
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.core.r0.h(int, boolean, java.lang.String, java.lang.String, java.lang.Object):void");
    }

    public final cx4.m h0() {
        return (cx4.m) ((jz5.n) this.I0).getValue();
    }

    @Override // zg0.q2
    public java.lang.String i() {
        try {
            return Q0.a(d0());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(T(), java.lang.String.valueOf(e17.getMessage()));
            E0();
            return "";
        }
    }

    public final com.tencent.mm.plugin.webview.core.h1 i0() {
        return (com.tencent.mm.plugin.webview.core.h1) ((jz5.n) this.W).getValue();
    }

    public abstract void j(android.content.Intent intent);

    public final int j0() {
        if (w0()) {
            return this.f181952s ? 2 : 1;
        }
        return 0;
    }

    public abstract int k0(java.lang.String str);

    public final java.lang.String l0() {
        com.tencent.mm.plugin.webview.permission.d O = O();
        java.lang.String Z = Z();
        return O.p(Z == null || r26.n0.N(Z) ? i() : Z());
    }

    public final java.lang.String m0() {
        return this.f181942n;
    }

    public final boolean n0() {
        return this.f181956u;
    }

    public java.lang.Object o0(nw4.n jsapi) {
        kotlin.jvm.internal.o.g(jsapi, "jsapi");
        if (jsapi.F == null) {
            jsapi.F = new nw4.b3();
        }
        nw4.b3 b3Var = jsapi.F;
        b3Var.getClass();
        b3Var.f340804a = jsapi;
        nw4.b3 b3Var2 = jsapi.F;
        kotlin.jvm.internal.o.f(b3Var2, "getWebTransApi(...)");
        return b3Var2;
    }

    @Override // com.tencent.xweb.h1
    public void p(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        if (fp.h.c(23)) {
            return;
        }
        com.tencent.mars.xlog.Log.i(T(), "WebView-Trace onReceivedError-old#" + U() + ", errCode:" + i17 + ", description:" + str + ", failingUrl:" + str2);
        if (!p0(this.f181933i0)) {
            com.tencent.mars.xlog.Log.i(T(), "onReceivedError, intent not ready");
            return;
        }
        if (p0(this.f181931h0)) {
            com.tencent.mm.plugin.webview.core.h1 i07 = i0();
            java.lang.String V = V(Z());
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
            i07.c(i17, str, str2, V, mMWebView == null ? 0 : mMWebView.isXWalkKernel() ? 2 : 3, j0(), true);
        }
        for (com.tencent.mm.plugin.webview.core.o1 o1Var : this.Y) {
            if (x0()) {
                o1Var.i(webView, i17, str, str2);
            }
        }
    }

    public final synchronized boolean p0(int i17) {
        return this.C0.contains(java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.xweb.h1
    public void q(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, com.tencent.xweb.w0 w0Var) {
        if (x0Var == null || w0Var == null || fp.h.a(23)) {
            return;
        }
        int b17 = w0Var.b();
        java.lang.CharSequence a17 = w0Var.a();
        java.lang.String obj = a17 != null ? a17.toString() : null;
        android.net.Uri url = x0Var.getUrl();
        java.lang.String uri = url != null ? url.toString() : null;
        com.tencent.mars.xlog.Log.i(T(), "WebView-Trace onReceivedError#" + U() + ", errCode:" + b17 + ", description:" + obj + ", failingUrl:" + uri);
        if (!p0(this.f181933i0)) {
            com.tencent.mars.xlog.Log.i(T(), "onReceivedError, intent not ready");
            return;
        }
        if (p0(this.f181931h0)) {
            com.tencent.mm.plugin.webview.core.h1 i07 = i0();
            java.lang.String V = V(Z());
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
            i07.c(b17, obj, uri, V, mMWebView == null ? 0 : mMWebView.isXWalkKernel() ? 2 : 3, j0(), x0Var.isForMainFrame());
        }
        for (com.tencent.mm.plugin.webview.core.o1 o1Var : this.Y) {
            if (x0()) {
                o1Var.j(webView, x0Var, w0Var);
            }
        }
    }

    public void q0() {
        synchronized (this) {
            com.tencent.mars.xlog.Log.i(T(), "resetActions");
            this.C0.clear();
            this.E0.clear();
            this.f181967z0.clear();
            this.B0.clear();
            this.D0.clear();
            this.A0.clear();
            try {
                java.lang.System.currentTimeMillis();
                for (com.tencent.mm.plugin.webview.core.e eVar : S()) {
                    com.tencent.mm.plugin.webview.core.BaseWebViewController$WebAction baseWebViewController$WebAction = eVar.f181787a;
                    baseWebViewController$WebAction.setController(this);
                    if (baseWebViewController$WebAction instanceof com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction) {
                        this.f181967z0.add(new jz5.l(baseWebViewController$WebAction, eVar.f181788b));
                    } else if (baseWebViewController$WebAction instanceof com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction) {
                        this.A0.add(new jz5.l(baseWebViewController$WebAction, eVar.f181788b));
                    }
                }
                T();
                java.lang.System.currentTimeMillis();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i(T(), "resetActions ex" + e17.getMessage());
            }
        }
        I(this.f181929g0);
        this.f181916a.E.add(new com.tencent.mm.plugin.webview.core.d(this));
        nw4.n g07 = g0();
        g07.getClass();
        g07.f340901o = this;
        int U = U();
        ox4.b bVar = g07.A;
        bVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewExtEventHandler", "setWebViewId: " + U);
        bVar.f349790a = U;
        g07.f340906t = g07.f340901o.U();
    }

    @Override // com.tencent.xweb.h1
    public void r(com.tencent.xweb.WebView webView, com.tencent.xweb.u handler, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(handler, "handler");
        handler.cancel();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(155L, 35L, 1L);
    }

    public abstract void r0();

    @Override // com.tencent.xweb.h1
    public void s(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, com.tencent.xweb.y0 y0Var) {
        java.lang.String T = T();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WebView-Trace onReceivedHttpError#");
        sb6.append(U());
        sb6.append(", errCode:");
        sb6.append(y0Var != null ? java.lang.Integer.valueOf(y0Var.f220623c) : null);
        sb6.append(", description:");
        sb6.append(y0Var != null ? y0Var.f220624d : null);
        sb6.append(", failingUrl:");
        sb6.append(x0Var != null ? x0Var.getUrl() : null);
        com.tencent.mars.xlog.Log.i(T, sb6.toString());
        if (!p0(this.f181933i0)) {
            com.tencent.mars.xlog.Log.i(T(), "onReceivedHttpError, intent not ready");
            return;
        }
        if (p0(this.f181931h0)) {
            com.tencent.mm.plugin.webview.core.h1 i07 = i0();
            java.lang.String V = V(Z());
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
            int i17 = mMWebView == null ? 0 : mMWebView.isXWalkKernel() ? 2 : 3;
            int j07 = j0();
            if (i07.d() && x0Var != null) {
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.webview.core.e1(x0Var, i07, y0Var, V, i17, j07), "MicroMsg.WebPageErrorMonitor");
            }
        }
        for (com.tencent.mm.plugin.webview.core.o1 o1Var : this.Y) {
            if (x0()) {
                o1Var.k(webView, x0Var, y0Var);
            }
        }
    }

    public final void s0(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        try {
            if (e0().lb()) {
                qk.j9 j9Var = (qk.j9) i95.n0.c(qk.j9.class);
                android.content.Context Y = Y();
                com.tencent.mm.plugin.webview.stub.v0 e07 = e0();
                ((cw4.v0) j9Var).getClass();
                z0(hy4.b0.b(Y, e07, url));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(T(), "initFont, ex = " + e17.getMessage());
        }
    }

    public final void t0(android.content.Intent intent, long j17, long j18, boolean z17, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        hy4.k0 k0Var = this.V;
        k0Var.getClass();
        k0Var.f286133o = str;
        k0Var.f286134p = z17;
        java.lang.String controllerId = java.lang.String.valueOf(U());
        k0Var.getClass();
        kotlin.jvm.internal.o.g(controllerId, "controllerId");
        k0Var.f286139u = controllerId;
        k0Var.f286137s = j17;
        k0Var.f286140v = j18;
        k0Var.f286135q = j17 <= 0 ? cx4.n.f224638e : ((km0.c) gm0.j1.p().a()).f308991e.f308986f - j17 > 0 ? cx4.n.f224639f : cx4.n.f224640g;
        k0Var.f286136r = cx4.s.b();
        k0Var.a("onCreate", k0Var.f286140v);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPerformanceHelper", "initPerformanceHelper#" + controllerId + " start: " + j17 + ", create: " + j18 + ", reCreateUI: " + k0Var.f286134p + ", processBootType: " + k0Var.f286135q);
        k0Var.f286142x = intent != null ? intent.getIntExtra("KPageScene", 0) : 0;
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("KPageInfo") : null;
        java.lang.String str2 = stringExtra != null ? stringExtra : "";
        k0Var.getClass();
        k0Var.f286141w = str2;
    }

    @Override // com.tencent.xweb.h1
    public boolean u(com.tencent.xweb.WebView webView, com.tencent.xweb.j0 j0Var) {
        com.tencent.mm.plugin.webview.core.a1 a1Var = this.M0;
        if (a1Var != null) {
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = ((com.tencent.mm.plugin.webview.ui.tools.cc) a1Var).f184084a;
            if (webViewUI.f183819g2 || webViewUI.f183816f2 || webViewUI.isFinishing()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "WebView-Trace RenderProcess has destroyed");
            } else {
                if (webViewUI.isPaused()) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_web_view_render_recover_from_background, 0) == 1) {
                        webViewUI.C1 = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "WebView-Trace onRenderProcessGone in backgroud");
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "WebView-Trace RenderProcess has pause, skip foreground recovery");
                } else {
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_web_view_render_recover, 0) == 1)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "WebView-Trace RenderProcess recover mode not enable");
                    } else if (webViewUI.f183859t3) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "WebView-Trace RenderProcessGone, hasCallRenderProcessGone, return");
                    } else {
                        webViewUI.f183859t3 = true;
                        webViewUI.j7(true);
                    }
                }
            }
            this.N0 = true;
        }
        return true;
    }

    public abstract com.tencent.xweb.y0 u0(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, android.os.Bundle bundle);

    public final boolean v0() {
        return this.L || this.K;
    }

    @Override // com.tencent.xweb.h1
    public final boolean w(com.tencent.xweb.WebView webview, int i17, java.lang.String description, java.lang.String failingUrl) {
        int i18;
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(description, "description");
        kotlin.jvm.internal.o.g(failingUrl, "failingUrl");
        com.tencent.mars.xlog.Log.e(T(), "shouldInterceptLoadError, failingUrl = %s, errorCode = %d, desc = %s", failingUrl, java.lang.Integer.valueOf(i17), description);
        java.lang.String V = V(Z());
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
        if (mMWebView == null) {
            i18 = 0;
        } else {
            i18 = mMWebView.isXWalkKernel() ? 2 : 3;
        }
        com.tencent.mm.plugin.webview.core.h1 i07 = i0();
        int j07 = j0();
        if (i07.d()) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.webview.core.c1(failingUrl, i17, i07, description, V, i18, j07), "MicroMsg.WebPageErrorMonitor");
        }
        java.util.Iterator it = this.X.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.plugin.webview.core.i3) it.next()).g(webview, i17, description, failingUrl)) {
                return true;
            }
        }
        return false;
    }

    public boolean w0() {
        return p0(this.f181935j0) && kotlin.jvm.internal.o.b(this.C, this.E);
    }

    @Override // com.tencent.xweb.h1
    public final com.tencent.xweb.y0 x(com.tencent.xweb.WebView webview, com.tencent.xweb.x0 request) {
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.xweb.y0 u07 = u0(webview, request, null);
        return u07 == null ? super.x(webview, request) : u07;
    }

    public final synchronized boolean x0() {
        return this.E0.contains(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.webview.core.BaseWebViewController$Start.class).g());
    }

    @Override // com.tencent.xweb.h1
    public final com.tencent.xweb.y0 y(com.tencent.xweb.WebView webview, com.tencent.xweb.x0 request, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.xweb.y0 u07 = u0(webview, request, bundle);
        if (u07 == null) {
            return null;
        }
        return u07;
    }

    public final boolean y0(java.lang.String str) {
        java.util.Iterator it = ((java.util.Set) ((jz5.n) ((com.tencent.mm.plugin.webview.core.e3) this).f181802d1).getValue()).iterator();
        while (it.hasNext()) {
            if (nf.e.c(str, (java.lang.String) it.next(), true)) {
                return true;
            }
        }
        return false;
    }

    public void z0(int i17) {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
        if ((mMWebView != null ? mMWebView.getSettings() : null) == null) {
            return;
        }
        if (i17 < 1) {
            i17 = 2;
        }
        com.tencent.mars.xlog.Log.i(T(), "localSetFontSize, fontSize = " + i17);
        switch (i17) {
            case 1:
                mMWebView.getSettings().O(80);
                break;
            case 2:
                mMWebView.getSettings().O(100);
                break;
            case 3:
                mMWebView.getSettings().O(110);
                break;
            case 4:
                mMWebView.getSettings().O(112);
                break;
            case 5:
                mMWebView.getSettings().O(113);
                break;
            case 6:
                mMWebView.getSettings().O(140);
                break;
            case 7:
                mMWebView.getSettings().O(155);
                break;
            case 8:
                mMWebView.getSettings().O(165);
                break;
            default:
                mMWebView.getSettings().O(100);
                break;
        }
        int f17 = mMWebView.getSettings().f();
        pw4.c cVar = this.f181938l;
        cVar.f358718g = i17;
        cVar.f358719h = f17;
    }

    public com.tencent.mm.plugin.webview.permission.d a() {
        return O();
    }
}
