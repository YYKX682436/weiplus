package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes8.dex */
public class WebViewStubService extends android.app.Service implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int B = 0;
    public final com.tencent.mm.sdk.event.IListener A;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f183481d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.stub.t0 f183482e = new com.tencent.mm.plugin.webview.stub.s(this);

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f183483f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f183484g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f183485h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f183486i;

    /* renamed from: m, reason: collision with root package name */
    public int f183487m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f183488n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader.model.g1 f183489o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.m0 f183490p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.k0 f183491q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.l0 f183492r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.network.s0 f183493s;

    /* renamed from: t, reason: collision with root package name */
    public uh4.i0 f183494t;

    /* renamed from: u, reason: collision with root package name */
    public m33.w1 f183495u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Set f183496v;

    /* renamed from: w, reason: collision with root package name */
    public int f183497w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f183498x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f183499y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f183500z;

    public WebViewStubService() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f183484g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.stub.WebViewStubService.2
            {
                this.__eventId = 812146647;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
                com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService;
                java.util.Map map;
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
                if ((recogQBarOfImageFileResultEvent2 instanceof com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent) && ((map = (webViewStubService = com.tencent.mm.plugin.webview.stub.WebViewStubService.this).f183483f) == null || map.containsKey(recogQBarOfImageFileResultEvent2.f54661g.f6368a))) {
                    java.util.Map map2 = webViewStubService.f183483f;
                    if (map2 != null) {
                        map2.remove(recogQBarOfImageFileResultEvent2.f54661g.f6368a);
                    }
                    com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a;
                    java.lang.String e17 = s6Var.e(recogQBarOfImageFileResultEvent2);
                    int c17 = s6Var.c(recogQBarOfImageFileResultEvent2);
                    int d17 = s6Var.d(recogQBarOfImageFileResultEvent2);
                    try {
                        java.util.Iterator it = ((java.util.ArrayList) webViewStubService.f183486i).iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper = (com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next();
                            int i17 = webViewStubCallbackWrapper.f183796e;
                            if (com.tencent.mm.plugin.webview.stub.WebViewStubService.b(webViewStubService, webViewStubCallbackWrapper)) {
                                webViewStubCallbackWrapper.f183795d.t3(recogQBarOfImageFileResultEvent2.f54661g.f6368a, e17, c17, d17);
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewStubService", e18, "", new java.lang.Object[0]);
                    }
                    com.tencent.mm.vfs.w6.h(recogQBarOfImageFileResultEvent2.f54661g.f6368a);
                }
                return false;
            }
        };
        this.f183485h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.stub.WebViewStubService.3
            {
                this.__eventId = 1700407223;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent2 = recogQBarOfImageFileFailedEvent;
                com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService = com.tencent.mm.plugin.webview.stub.WebViewStubService.this;
                java.util.Map map = webViewStubService.f183483f;
                if (map != null && !map.containsKey(recogQBarOfImageFileFailedEvent2.f54660g.f6278a)) {
                    return false;
                }
                java.util.Map map2 = webViewStubService.f183483f;
                if (map2 != null) {
                    map2.remove(recogQBarOfImageFileFailedEvent2.f54660g.f6278a);
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewStubService", "delete qb recog fail: %s", recogQBarOfImageFileFailedEvent2.f54660g.f6278a);
                com.tencent.mm.vfs.w6.h(recogQBarOfImageFileFailedEvent2.f54660g.f6278a);
                return false;
            }
        };
        this.f183486i = new java.util.ArrayList();
        this.f183487m = 0;
        this.f183496v = new java.util.HashSet();
        this.f183497w = -1;
        this.f183498x = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.webview.stub.WebViewStubService.4
            {
                this.__eventId = 1121981664;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent onFinderFeedInfoUpdatedEvent) {
                com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent onFinderFeedInfoUpdatedEvent2 = onFinderFeedInfoUpdatedEvent;
                java.lang.String str = onFinderFeedInfoUpdatedEvent2.f54571g.f7718a;
                ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
                com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b bVar = com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186984a;
                android.os.Bundle bundle = new android.os.Bundle();
                am.qm qmVar = onFinderFeedInfoUpdatedEvent2.f54571g;
                bundle.putString("localFeedId", qmVar.f7718a);
                bundle.putBoolean("isLike", qmVar.f7719b);
                bundle.putBoolean("isFav", qmVar.f7721d);
                bundle.putInt("likeCount", qmVar.f7720c);
                bundle.putInt("favCount", qmVar.f7722e);
                bVar.b(bundle);
                return false;
            }
        };
        this.f183499y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnExitFinderFullscreenEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.webview.stub.WebViewStubService.5
            {
                this.__eventId = 1342273228;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OnExitFinderFullscreenEvent onExitFinderFullscreenEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "onExitFinderFullscreenEvent");
                ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
                com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186984a.d(2, onExitFinderFullscreenEvent);
                return false;
            }
        };
        this.f183500z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnEnterFinderFullscreenEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.webview.stub.WebViewStubService.6
            {
                this.__eventId = -97019376;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OnEnterFinderFullscreenEvent onEnterFinderFullscreenEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "onEnterFinderFullscreenEvent");
                ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
                com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186984a.d(1, onEnterFinderFullscreenEvent);
                return false;
            }
        };
        this.A = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewImagePreviewPositionChangedEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.stub.WebViewStubService.7
            {
                this.__eventId = 193090981;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WebViewImagePreviewPositionChangedEvent webViewImagePreviewPositionChangedEvent) {
                com.tencent.mm.autogen.events.WebViewImagePreviewPositionChangedEvent webViewImagePreviewPositionChangedEvent2 = webViewImagePreviewPositionChangedEvent;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(webViewImagePreviewPositionChangedEvent2.f54985g.f7317b);
                am.m20 m20Var = webViewImagePreviewPositionChangedEvent2.f54985g;
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "onImagePreviewPositionChanged pos: %s, webViewId: %s", valueOf, java.lang.Integer.valueOf(m20Var.f7316a));
                try {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("key_webview_id", m20Var.f7316a);
                    bundle.putInt("key_image_pos", m20Var.f7317b);
                    java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.plugin.webview.stub.WebViewStubService.this.f183486i).iterator();
                    while (it.hasNext()) {
                        ((com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next()).f183795d.callback(121003, bundle);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewStubService", e17, "onImagePreviewPositionChanged exception", new java.lang.Object[0]);
                }
                return false;
            }
        };
    }

    public static void a(com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService, int i17, android.os.Bundle bundle, int i18) {
        com.tencent.mm.plugin.webview.stub.z0 z0Var;
        java.util.Iterator it = ((java.util.ArrayList) webViewStubService.f183486i).iterator();
        com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper = null;
        while (it.hasNext()) {
            com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper2 = (com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next();
            if (webViewStubCallbackWrapper2 != null && webViewStubCallbackWrapper2.f183796e == i18) {
                webViewStubCallbackWrapper = webViewStubCallbackWrapper2;
            }
        }
        if (webViewStubCallbackWrapper == null || (z0Var = webViewStubCallbackWrapper.f183795d) == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(webViewStubService, (java.lang.Class<?>) com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI.class);
        intent.putExtras(bundle);
        intent.putExtra("proxyui_action_code_key", i17);
        intent.putExtra("webview_stub_callbacker_key", webViewStubCallbackWrapper);
        intent.putExtra("webview_binder_id", i18);
        intent.putExtra("screen_orientation", webViewStubService.f183497w);
        intent.addFlags(268435456);
        com.tencent.mm.plugin.webview.ui.tools.a1.e(intent.getExtras(), "webview", ".stub.WebViewStubProxyUI", z0Var, new com.tencent.mm.plugin.webview.stub.i0(webViewStubService, intent));
    }

    public static boolean b(com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService, com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper) {
        webViewStubService.getClass();
        if (webViewStubCallbackWrapper == null) {
            return false;
        }
        android.os.IBinder asBinder = webViewStubCallbackWrapper.f183795d.asBinder();
        return asBinder.isBinderAlive() && asBinder.pingBinder();
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "WebViewStubService onBind");
        return this.f183482e;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "WebViewStubService onCreate");
        this.f183488n = new com.tencent.mm.sdk.platformtools.n3();
        this.f183489o = new com.tencent.mm.plugin.webview.stub.k0(this);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().a(this.f183489o);
        this.f183490p = new com.tencent.mm.plugin.webview.stub.l0(this);
        this.f183498x.alive();
        this.f183491q = new com.tencent.mm.plugin.webview.stub.c0(this);
        this.f183499y.alive();
        this.f183500z.alive();
        this.f183492r = new com.tencent.mm.plugin.webview.stub.d0(this);
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b bVar = com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186984a;
        com.tencent.mm.plugin.webview.model.k0 listener = this.f183491q;
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.ArrayList arrayList = com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186985b;
        synchronized (arrayList) {
            arrayList.size();
            arrayList.add(listener);
        }
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        bVar.a(this.f183492r);
        this.A.alive();
        this.f183493s = new com.tencent.mm.plugin.webview.stub.e0(this);
        gm0.j1.n().a(this.f183493s);
        this.f183494t = new com.tencent.mm.plugin.webview.stub.f0(this);
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(this.f183494t);
        if (gm0.j1.a() && com.tencent.mm.plugin.webview.modeltools.z.bj() != null) {
            com.tencent.mm.plugin.webview.modeltools.z.bj().b(this.f183490p);
        }
        com.tencent.mm.plugin.webview.stub.g0 g0Var = new com.tencent.mm.plugin.webview.stub.g0(this);
        this.f183495u = g0Var;
        m33.s0.f323330a.add(g0Var);
    }

    @Override // android.app.Service
    public void onDestroy() {
        java.util.List list = this.f183486i;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "WebViewStubService onDestroy");
        super.onDestroy();
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().s(this.f183489o);
        if (gm0.j1.a()) {
            com.tencent.mm.plugin.webview.model.i4 bj6 = com.tencent.mm.plugin.webview.modeltools.z.bj();
            com.tencent.mm.plugin.webview.model.m0 m0Var = this.f183490p;
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = bj6.f182938e;
            if (copyOnWriteArraySet != null && m0Var != null) {
                copyOnWriteArraySet.remove(m0Var);
            }
        }
        try {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next()).f183795d.callback(1000000, new android.os.Bundle());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewStubService", e17, "onDestroy exception", new java.lang.Object[0]);
        }
        gm0.j1.n().d(this.f183493s);
        ((uh4.c0) i95.n0.c(uh4.c0.class)).tc(this.f183494t);
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b bVar = com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186984a;
        com.tencent.mm.plugin.webview.model.k0 listener = this.f183491q;
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.ArrayList arrayList = com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186985b;
        synchronized (arrayList) {
            arrayList.remove(listener);
        }
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        com.tencent.mm.plugin.webview.model.l0 listener2 = this.f183492r;
        kotlin.jvm.internal.o.g(listener2, "listener");
        java.util.ArrayList arrayList2 = com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186986c;
        synchronized (arrayList2) {
            arrayList2.remove(listener2);
        }
        this.f183498x.dead();
        this.f183499y.dead();
        this.f183500z.dead();
        this.A.dead();
        this.f183493s = null;
        this.f183489o = null;
        this.f183494t = null;
        ((java.util.ArrayList) list).clear();
        m33.w1 w1Var = this.f183495u;
        if (w1Var != null) {
            m33.s0.f323330a.remove(w1Var);
        } else {
            java.util.LinkedList linkedList = m33.s0.f323330a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0320 A[Catch: Exception -> 0x035f, TryCatch #0 {Exception -> 0x035f, blocks: (B:100:0x031c, B:102:0x0320, B:103:0x0328, B:104:0x032e, B:106:0x0334, B:108:0x033c, B:111:0x0341), top: B:99:0x031c }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0334 A[Catch: Exception -> 0x035f, TryCatch #0 {Exception -> 0x035f, blocks: (B:100:0x031c, B:102:0x0320, B:103:0x0328, B:104:0x032e, B:106:0x0334, B:108:0x033c, B:111:0x0341), top: B:99:0x031c }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0446 A[Catch: Exception -> 0x0481, TryCatch #5 {Exception -> 0x0481, blocks: (B:177:0x0442, B:179:0x0446, B:180:0x044e, B:181:0x0454, B:183:0x045a, B:185:0x0462, B:188:0x0467), top: B:176:0x0442 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x045a A[Catch: Exception -> 0x0481, TryCatch #5 {Exception -> 0x0481, blocks: (B:177:0x0442, B:179:0x0446, B:180:0x044e, B:181:0x0454, B:183:0x045a, B:185:0x0462, B:188:0x0467), top: B:176:0x0442 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ff  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r19, int r20, java.lang.String r21, com.tencent.mm.modelbase.m1 r22) {
        /*
            Method dump skipped, instructions count: 1179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.stub.WebViewStubService.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        android.util.SparseArray sparseArray;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "WebViewStubService onUnbind");
        android.util.SparseArray sparseArray2 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.f185237a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandlerHolder", "detach");
        synchronized (com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.class) {
            int i17 = 0;
            while (true) {
                sparseArray = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.f185237a;
                if (i17 >= sparseArray.size()) {
                    break;
                }
                sparseArray.keyAt(i17);
                i17++;
            }
            sparseArray.clear();
        }
        if (com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.f185238b != null) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.f185238b = null;
        }
        ((java.util.HashMap) com.tencent.mm.plugin.webview.model.c6.f182828a).clear();
        return super.onUnbind(intent);
    }
}
