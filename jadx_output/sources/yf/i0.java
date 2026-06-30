package yf;

/* loaded from: classes7.dex */
public class i0 extends eg.a implements tf.w, androidx.lifecycle.y {
    public static ag.f T = ag.b.f4667g;
    public static boolean U = true;
    public static final tf.n V = tf.f0.b(tf.g0.f418810f);
    public com.tencent.mm.plugin.appbrand.utils.h4 B;
    public final tf.o D;
    public final qu5.a E;
    public volatile boolean I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f461359J;

    /* renamed from: g, reason: collision with root package name */
    public final ag.g f461360g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f461361h;

    /* renamed from: i, reason: collision with root package name */
    public yf.o f461362i;

    /* renamed from: m, reason: collision with root package name */
    public zf.e f461363m;

    /* renamed from: n, reason: collision with root package name */
    public zf.d f461364n;

    /* renamed from: o, reason: collision with root package name */
    public zf.c f461365o;

    /* renamed from: p, reason: collision with root package name */
    public sf.f f461366p;

    /* renamed from: q, reason: collision with root package name */
    public int f461367q;

    /* renamed from: r, reason: collision with root package name */
    public int f461368r;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f461370t;

    /* renamed from: u, reason: collision with root package name */
    public int f461371u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f461372v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f461373w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ScaleGestureDetector f461374x;

    /* renamed from: z, reason: collision with root package name */
    public final android.os.Handler f461376z;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f461369s = "";

    /* renamed from: y, reason: collision with root package name */
    public final yf.e1 f461375y = new yf.e1(this, null);
    public int A = 0;
    public final yf.c1 C = new yf.c1(this);
    public final androidx.lifecycle.b0 F = new androidx.lifecycle.b0(this, true);
    public volatile boolean G = false;
    public boolean H = false;
    public volatile sf.f K = null;
    public final android.view.ScaleGestureDetector.OnScaleGestureListener L = new yf.q0(this);
    public final android.view.ScaleGestureDetector.OnScaleGestureListener M = new yf.r0(this);
    public volatile boolean N = false;
    public java.lang.String P = "";
    public int Q = 0;
    public int R = 0;
    public final tf.d S = new yf.s0(this);

    public i0() {
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: yf.i0$$k
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0.this.F.i(androidx.lifecycle.n.STARTED);
            }
        });
        tf.o a17 = ((tf.f0) V).a();
        this.D = a17;
        a17.start();
        this.E = a17.getHandler();
        android.os.Handler handler = new android.os.Handler(com.tencent.mm.sdk.platformtools.x2.f193071a.getMainLooper());
        this.f461376z = handler;
        sc1.m1.a();
        yf.n1 n1Var = new yf.n1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f461362i = n1Var;
        n1Var.setPushListener(new yf.t0(this));
        this.f461362i.j(new yf.u0(this));
        this.f461362i.l(new yf.v0(this));
        this.f461360g = T.a(this, this.f461362i);
        com.tencent.mm.plugin.appbrand.utils.h4 h4Var = new com.tencent.mm.plugin.appbrand.utils.h4(com.tencent.mm.sdk.platformtools.x2.f193071a, new yf.w0(this));
        this.B = h4Var;
        h4Var.enable();
        z(y());
        handler.post(new java.lang.Runnable() { // from class: yf.i0$$l
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0 i0Var = yf.i0.this;
                i0Var.getClass();
                i0Var.f461374x = new android.view.ScaleGestureDetector(com.tencent.mm.sdk.platformtools.x2.f193071a, yf.i0.U ? i0Var.M : i0Var.L);
            }
        });
    }

    public final void A(float f17, float f18) {
        yf.o oVar = this.f461362i;
        if (oVar != null) {
            sc1.k1 focusPosition = oVar.setFocusPosition(f17, f18);
            this.f461360g.j().m(new android.graphics.PointF(f17, f18));
            com.tencent.mars.xlog.Log.i(x(), "onTouchFocusPosition, set focus(%s, %s), code:%d, info:%s", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(focusPosition.f405688a), focusPosition.f405689b);
        }
    }

    public final void B(org.json.JSONObject jSONObject) {
        if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE)) {
            this.f461369s = jSONObject.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, this.f461369s);
            this.f461370t = jSONObject.optString("filterImageMd5", null);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f461369s)) {
                try {
                    jSONObject.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, "");
                    return;
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.w(x(), "parseFilterImage, ignore exception:%s", e17);
                    return;
                }
            }
            if (this.f461369s.startsWith("http://") || this.f461369s.startsWith("https://")) {
                jSONObject.remove(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE);
            }
        }
    }

    public final void C(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        if (!jSONObject.has("position") || (optJSONObject = jSONObject.optJSONObject("position")) == null) {
            return;
        }
        this.f461367q = ik1.w.c(optJSONObject.optInt("width", 0));
        this.f461368r = ik1.w.c(optJSONObject.optInt("height", 0));
        com.tencent.mars.xlog.Log.i(x(), "parseHtmlPosition, size:[%d, %d]", java.lang.Integer.valueOf(this.f461367q), java.lang.Integer.valueOf(this.f461368r));
        r();
    }

    public final void D(sf.f fVar, org.json.JSONObject jSONObject) {
        if (jSONObject.has("needEvent")) {
            jSONObject.optBoolean("needEvent", false);
            if (H()) {
                bg1.q qVar = (bg1.q) this.f461364n;
                qVar.getClass();
                if (fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b) {
                    qVar.f19902a = (com.tencent.mm.plugin.appbrand.extendplugin.b) fVar;
                }
            }
        }
    }

    public final void E() {
        this.G = true;
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: yf.i0$$m
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0.this.F.i(androidx.lifecycle.n.DESTROYED);
            }
        });
        zf.c cVar = this.f461365o;
        if (cVar != null) {
            ((bg1.h) cVar).f(this, this.f461366p);
            bg1.h hVar = (bg1.h) this.f461365o;
            xf1.i d17 = hVar.d(this.f461366p);
            if (d17 != null && d17.f454239f == this) {
                d17.f454239f = null;
                com.tencent.mars.xlog.Log.i(d17.f454237d, "unregisterLivePusher:%s", g());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "clearVoipPageBackgroundButNotPipState");
            hVar.f19893d = false;
        }
        yf.o oVar = this.f461362i;
        if (oVar != null) {
            ((yf.n1) oVar).k();
            this.f461362i = null;
        }
        if (this.f461361h != null) {
            this.f461360g.k();
            this.f461361h.release();
            this.f461361h = null;
        }
        sf.f fVar = this.f461366p;
        if (fVar != null) {
            fVar.f();
        }
        com.tencent.mars.xlog.Log.i(x(), "LivePusher release handler thread");
        this.E.removeCallbacksAndMessages(null);
        this.D.a();
        gg.c cVar2 = this.f252499f;
        if (cVar2 == null) {
            return;
        }
        ((gg.a) cVar2).i(this.f252498e, this.f252497d);
    }

    public final void F(int i17) {
        if (this.f461363m != null) {
            ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(976L, i17, 1L, false);
        }
    }

    public final void G(java.lang.Runnable runnable) {
        this.E.post(runnable);
    }

    public final boolean H() {
        return this.f461364n != null;
    }

    @Override // eg.b
    public boolean b(sf.f fVar) {
        return true;
    }

    @Override // eg.a, eg.b
    public void c(final android.view.MotionEvent motionEvent) {
        G(new java.lang.Runnable() { // from class: yf.i0$$h
            @Override // java.lang.Runnable
            public final void run() {
                android.view.ScaleGestureDetector scaleGestureDetector;
                yf.i0 i0Var = yf.i0.this;
                java.lang.String x17 = i0Var.x();
                java.lang.String q17 = i0Var.q();
                android.view.MotionEvent motionEvent2 = motionEvent;
                com.tencent.mars.xlog.Log.i(x17, "*** handler(%s) handlePluginTouch(%s)", q17, motionEvent2);
                if (i0Var.f461372v || i0Var.f461373w) {
                    int pointerCount = motionEvent2.getPointerCount();
                    yf.e1 e1Var = i0Var.f461375y;
                    if (pointerCount == 1 && motionEvent2.getAction() == 0) {
                        com.tencent.mars.xlog.Log.i(i0Var.x(), "handlePluginTouch, 1 pointer action down");
                        e1Var.f461340d = motionEvent2;
                        com.tencent.mm.sdk.platformtools.u3.i(e1Var, 100L);
                    } else {
                        if (motionEvent2.getPointerCount() <= 1 || motionEvent2.getAction() != 2) {
                            return;
                        }
                        com.tencent.mars.xlog.Log.i(i0Var.x(), "handlePluginTouch, 2 pointer action move");
                        com.tencent.mm.sdk.platformtools.u3.l(e1Var);
                        i0Var.A(-1.0f, -1.0f);
                        if (!i0Var.f461373w || (scaleGestureDetector = i0Var.f461374x) == null) {
                            return;
                        }
                        scaleGestureDetector.onTouchEvent(motionEvent2);
                    }
                }
            }
        });
    }

    @Override // eg.a, eg.b
    public void e() {
        G(new java.lang.Runnable() { // from class: yf.i0$$j
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0 i0Var = yf.i0.this;
                com.tencent.mars.xlog.Log.i(i0Var.x(), "*** handler(%s) handlePluginDestroy", i0Var.q());
            }
        });
    }

    @Override // eg.b
    public java.lang.String f(final sf.f fVar) {
        if (this.f461360g.d(fVar)) {
            return null;
        }
        G(new java.lang.Runnable() { // from class: yf.i0$$a
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String[] strArr;
                java.lang.String[] strArr2;
                java.lang.String[] strArr3;
                int length;
                zf.c cVar;
                yf.i0 i0Var = yf.i0.this;
                sf.f fVar2 = fVar;
                i0Var.getClass();
                java.lang.String l17 = fVar2.l();
                if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
                    return;
                }
                org.json.JSONObject c17 = fVar2.c();
                com.tencent.mars.xlog.Log.i(i0Var.x(), "*** handler(%s) handleJsApi(%s), data:%s", i0Var.q(), l17, c17.toString());
                c17.toString();
                if (fVar2.m().q(com.tencent.mm.plugin.appbrand.wxassistant.q2.class) != null && ((com.tencent.mm.plugin.appbrand.wxassistant.q2) fVar2.m().q(com.tencent.mm.plugin.appbrand.wxassistant.q2.class)).g4()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.LivePusherPluginHandler", "wx assistant is enabled");
                    fVar2.g("fail");
                    return;
                }
                boolean contains = l17.contains("insert");
                jc1.d dVar = jc1.f.f298915d;
                if (contains) {
                    i0Var.F(5);
                    i0Var.f461360g.f(fVar2);
                    android.content.Context context = fVar2.getContext();
                    if (context instanceof android.app.Activity) {
                        i0Var.f461371u = 0;
                        i0Var.v((android.app.Activity) context, fVar2);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.LivePusherPluginHandler", "invokeInsertAfterRequestPermission, pageContext not activity");
                        fVar2.d("fail:internal error invalid android context", dVar);
                        si1.e1.c(fVar2.getAppId());
                    }
                } else {
                    boolean contains2 = l17.contains("update");
                    jc1.d dVar2 = jc1.f.f298912a;
                    boolean z17 = true;
                    if (contains2) {
                        i0Var.F(6);
                        i0Var.f461360g.l(fVar2);
                        if (i0Var.f461362i == null) {
                            com.tencent.mars.xlog.Log.i(i0Var.x(), "update, adapter is null");
                        } else {
                            org.json.JSONObject c18 = fVar2.c();
                            i0Var.D(fVar2, c18);
                            i0Var.C(c18);
                            if (c18.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE)) {
                                i0Var.f461372v = c18.optInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE, 0) != 0;
                            }
                            if (c18.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM)) {
                                i0Var.f461373w = c18.optBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, false);
                            }
                            i0Var.B(c18);
                            android.os.Bundle b17 = vf.a.b(c18);
                            if (i0Var.I) {
                                i0Var.f461359J = !b17.getBoolean("muted", false);
                                b17.putBoolean("muted", true);
                            }
                            sc1.k1 g17 = ((yf.n1) i0Var.f461362i).g(b17);
                            com.tencent.mars.xlog.Log.i(i0Var.x(), "update, code:%d info:%s", java.lang.Integer.valueOf(g17.f405688a), g17.f405689b);
                            if (g17.f405688a == 0) {
                                dVar = dVar2;
                            }
                            fVar2.b(dVar, g17.f405690c);
                            i0Var.s(fVar2);
                            i0Var.t(fVar2);
                            if (g17.f405688a == 0 && (cVar = i0Var.f461365o) != null) {
                                ((bg1.h) cVar).g(i0Var, i0Var.f461366p, b17);
                                zf.c cVar2 = i0Var.f461365o;
                                sf.f fVar3 = i0Var.f461366p;
                                bg1.h hVar = (bg1.h) cVar2;
                                hVar.f19890a = b17.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC, hVar.f19890a);
                                hVar.f19891b = b17.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA, hVar.f19891b);
                                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "updateForBackgroundVOIPIfNeed enableMic:%b, enableCamera:%b", java.lang.Boolean.valueOf(hVar.f19890a), java.lang.Boolean.valueOf(hVar.f19891b));
                                hVar.a();
                                xf1.i d17 = hVar.d(fVar3);
                                if (d17 != null) {
                                    d17.b(tf1.h.a(fVar3), hVar.f19890a);
                                }
                            }
                        }
                    } else if (l17.contains("operate")) {
                        i0Var.F(7);
                        if (i0Var.f461362i == null) {
                            com.tencent.mars.xlog.Log.i(i0Var.x(), "operate, adapter is null");
                        } else {
                            org.json.JSONObject c19 = fVar2.c();
                            java.lang.String optString = c19.optString("type");
                            com.tencent.mars.xlog.Log.i(i0Var.x(), "operate, type:%s", optString);
                            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                                fVar2.d("fail:missing operateType", dVar);
                            } else if (i0Var.f461362i == null) {
                                fVar2.a(dVar);
                            } else if (optString.equals(com.tencent.mm.plugin.appbrand.j0.f78445f)) {
                                ((yf.n1) i0Var.f461362i).e(new yf.k0(i0Var, fVar2));
                                sc1.k1 h17 = ((yf.n1) i0Var.f461362i).h(com.tencent.mm.plugin.appbrand.j0.f78445f, fVar2.c());
                                if (h17.f405688a != 0) {
                                    fVar2.b(dVar, h17.f405690c);
                                }
                            } else if (optString.equals("snapshotView")) {
                                if (i0Var.f461362i == null) {
                                    com.tencent.mars.xlog.Log.w(i0Var.x(), "operateSnapshotView, adapter is null");
                                    fVar2.a(dVar);
                                } else {
                                    com.tencent.mars.xlog.Log.i(i0Var.x(), "takeScreenshot");
                                    i0Var.K = fVar2;
                                    sf.i.b(i0Var.f252499f, i0Var.f252498e, i0Var.f252497d);
                                    com.tencent.mars.xlog.Log.i(i0Var.x(), "operateSnapshotView, success");
                                }
                            } else if (optString.equalsIgnoreCase("exitPictureInPicture")) {
                                i0Var.S.b(fVar2);
                            } else {
                                boolean equals = optString.equals("playBGM");
                                jc1.d dVar3 = jc1.f.f298919h;
                                if (equals) {
                                    zf.c cVar3 = i0Var.f461365o;
                                    if (cVar3 != null) {
                                        yf.l0 l0Var = new yf.l0(i0Var, c19);
                                        bg1.h hVar2 = (bg1.h) cVar3;
                                        if (fVar2 instanceof com.tencent.mm.plugin.appbrand.extendplugin.b) {
                                            com.tencent.mm.plugin.appbrand.extendplugin.b bVar = (com.tencent.mm.plugin.appbrand.extendplugin.b) fVar2;
                                            org.json.JSONObject c27 = bVar.c();
                                            java.lang.String optString2 = c27.has("url") ? c27.optString("url") : null;
                                            if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                                                com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operatePlayBgm, url is nil");
                                                fVar2.d("fail:url is nil", dVar3);
                                            } else {
                                                xf1.f.e(bVar.m(), optString2, false, null, new bg1.f(hVar2, l0Var, optString2));
                                            }
                                        }
                                        fVar2.a(dVar2);
                                    } else {
                                        fVar2.a(dVar);
                                    }
                                } else {
                                    if (!optString.equalsIgnoreCase("applyFilter") && !optString.equalsIgnoreCase("applySticker") && !optString.equalsIgnoreCase("applyMakeup")) {
                                        z17 = false;
                                    }
                                    if (!z17) {
                                        sc1.k1 h18 = ((yf.n1) i0Var.f461362i).h(optString, c19);
                                        com.tencent.mars.xlog.Log.i(i0Var.x(), "operate, type:%s, error:[%s, %s]", optString, java.lang.Integer.valueOf(h18.f405688a), h18.f405689b);
                                        if (h18.f405688a == 0) {
                                            dVar = dVar2;
                                        }
                                        fVar2.b(dVar, h18.f405690c);
                                        if (optString.equalsIgnoreCase("stop") && h18.f405688a == 0) {
                                            i0Var.S.k(fVar2);
                                            zf.c cVar4 = i0Var.f461365o;
                                            if (cVar4 != null) {
                                                ((bg1.h) cVar4).f(i0Var, i0Var.f461366p);
                                            }
                                        }
                                    } else if (i0Var.f461365o == null) {
                                        com.tencent.mars.xlog.Log.w(i0Var.x(), "convertResourcePathAndOperateLivePusher, customHandler is null");
                                        fVar2.a(dVar);
                                    } else {
                                        boolean equalsIgnoreCase = optString.equalsIgnoreCase("applyFilter");
                                        java.lang.String str = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH;
                                        if (equalsIgnoreCase) {
                                            java.lang.String optString3 = c19.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, null);
                                            if (com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
                                                com.tencent.mars.xlog.Log.i(i0Var.x(), "convertResourcePathAndOperateLivePusher, resourcePath is empty");
                                            } else {
                                                ((bg1.h) i0Var.f461365o).c(fVar2, optString3, c19.optString("md5", null), optString.equalsIgnoreCase("applySticker"), new yf.y0(i0Var, c19, fVar2, optString));
                                            }
                                        } else {
                                            com.tencent.mars.xlog.Log.i(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher");
                                            if (optString.equalsIgnoreCase("applySticker")) {
                                                org.json.JSONArray optJSONArray = c19.optJSONArray("stickers");
                                                if (optJSONArray == null || (length = optJSONArray.length()) == 0) {
                                                    com.tencent.mars.xlog.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher, stickersJsonArr is empty");
                                                    fVar2.d("fail:stickers is empty", dVar3);
                                                } else {
                                                    yf.d1 d1Var = new yf.d1(null);
                                                    d1Var.f461335a = length;
                                                    int i17 = 0;
                                                    while (true) {
                                                        if (i17 >= length) {
                                                            break;
                                                        }
                                                        org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                                                        if (optJSONObject == null) {
                                                            com.tencent.mars.xlog.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher1, stickerJsonObj(%d) is null", java.lang.Integer.valueOf(i17));
                                                            fVar2.d("fail:stickers is illegal", dVar3);
                                                            break;
                                                        }
                                                        java.lang.String optString4 = optJSONObject.optString(str, null);
                                                        if (com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
                                                            com.tencent.mars.xlog.Log.i(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher1, resourcePath(%d) is empty", java.lang.Integer.valueOf(i17));
                                                            fVar2.d("fail:stickers is illegal", dVar3);
                                                            break;
                                                        }
                                                        yf.d1 d1Var2 = d1Var;
                                                        ((bg1.h) i0Var.f461365o).c(fVar2, optString4, optJSONObject.optString("md5", null), true, new yf.z0(i0Var, i17, optJSONObject, fVar2, d1Var2, c19));
                                                        i17++;
                                                        str = str;
                                                        d1Var = d1Var2;
                                                        length = length;
                                                    }
                                                }
                                            } else if (optString.equalsIgnoreCase("applyMakeup")) {
                                                java.lang.String optString5 = c19.optString("makeupType", null);
                                                if (com.tencent.mm.sdk.platformtools.t8.K0(optString5)) {
                                                    com.tencent.mars.xlog.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher2, makeupTypeStr is empty");
                                                    fVar2.d("fail:makeupType is empty", dVar3);
                                                } else {
                                                    org.json.JSONObject optJSONObject2 = c19.optJSONObject("makeup");
                                                    if (optJSONObject2 == null) {
                                                        com.tencent.mars.xlog.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher2, makeupJsonObj is null");
                                                        fVar2.d("fail:makeup is null or undefined", dVar3);
                                                    } else if (optString5.equalsIgnoreCase("lipStick")) {
                                                        sc1.k1 h19 = ((yf.n1) i0Var.f461362i).h("applyMakeup", c19);
                                                        com.tencent.mars.xlog.Log.i(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher2, type:applyMakeup, error:[%s, %s]", java.lang.Integer.valueOf(h19.f405688a), h19.f405689b);
                                                        if (h19.f405688a == 0) {
                                                            dVar = dVar2;
                                                        }
                                                        fVar2.b(dVar, h19.f405690c);
                                                    } else if (optString5.equalsIgnoreCase("eyeShadow")) {
                                                        java.lang.String optString6 = optJSONObject2.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, null);
                                                        if (com.tencent.mm.sdk.platformtools.t8.K0(optString6)) {
                                                            com.tencent.mars.xlog.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher2, path is empty");
                                                            fVar2.d("fail:path is empty", dVar3);
                                                        } else {
                                                            java.lang.String optString7 = optJSONObject2.optString("pathMd5", null);
                                                            java.lang.String optString8 = optJSONObject2.optString("shimmerPosition", null);
                                                            if (com.tencent.mm.sdk.platformtools.t8.K0(optString8)) {
                                                                strArr = new java.lang.String[]{optString6};
                                                                strArr2 = new java.lang.String[]{optString7};
                                                                strArr3 = new java.lang.String[]{com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH};
                                                            } else {
                                                                strArr = new java.lang.String[]{optString6, optString8};
                                                                strArr2 = new java.lang.String[]{optString7, optJSONObject2.optString("shimmerPositionMD5", null)};
                                                                strArr3 = new java.lang.String[]{com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "shimmerPosition"};
                                                            }
                                                            i0Var.u(strArr, strArr2, strArr3, optJSONObject2, fVar2, c19);
                                                        }
                                                    } else if (optString5.equalsIgnoreCase("blusherStick") || optString5.equalsIgnoreCase("faceContour") || optString5.equalsIgnoreCase("eyeBrow")) {
                                                        java.lang.String optString9 = optJSONObject2.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, null);
                                                        if (com.tencent.mm.sdk.platformtools.t8.K0(optString9)) {
                                                            com.tencent.mars.xlog.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher2, path is empty");
                                                            fVar2.d("fail:path is empty", dVar3);
                                                        } else {
                                                            i0Var.u(new java.lang.String[]{optString9}, new java.lang.String[]{optJSONObject2.optString("pathMd5", null)}, new java.lang.String[]{com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH}, optJSONObject2, fVar2, c19);
                                                        }
                                                    } else {
                                                        com.tencent.mars.xlog.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher2, makeupTypeStr is illegal");
                                                        fVar2.d("fail:makeupType is illegal", dVar3);
                                                    }
                                                }
                                            } else {
                                                com.tencent.mars.xlog.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher, type is illegal");
                                                fVar2.a(dVar);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (l17.contains("remove")) {
                        i0Var.F(8);
                        i0Var.E();
                        fVar2.a(dVar2);
                        i0Var.S.k(fVar2);
                    }
                }
                if (i0Var.f461365o != null) {
                    org.json.JSONObject c28 = fVar2.c();
                    if (c28 == null) {
                        com.tencent.mars.xlog.Log.w(i0Var.x(), "handleAutoPlay, dataJsonObj is null");
                    } else if (c28.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH)) {
                        ((bg1.h) i0Var.f461365o).f19901l = c28.optBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH, false);
                    }
                }
                org.json.JSONObject c29 = fVar2.c();
                if (c29 == null) {
                    com.tencent.mars.xlog.Log.w(i0Var.x(), "handlePusherUrl, dataJsonObj is null");
                } else {
                    i0Var.P = c29.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_PUSH_URL, i0Var.P);
                }
                i0Var.S.j(fVar2, i0Var.P);
            }
        });
        return null;
    }

    @Override // tf.w
    public java.lang.String g() {
        return java.lang.String.format("%s_%s", this.f252498e, java.lang.Integer.valueOf(this.f252497d));
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.F;
    }

    @Override // eg.a, eg.b
    public void i(final android.view.Surface surface) {
        G(new java.lang.Runnable() { // from class: yf.i0$$i
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0 i0Var = yf.i0.this;
                com.tencent.mars.xlog.Log.i(i0Var.x(), "*** handler(%s) handlePluginReady", i0Var.q());
                android.view.Surface surface2 = surface;
                i0Var.f461361h = surface2;
                yf.o oVar = i0Var.f461362i;
                if (oVar != null) {
                    oVar.setSurface(surface2);
                    i0Var.f461360g.h(surface2);
                    i0Var.r();
                }
            }
        });
    }

    @Override // eg.a, eg.b
    public void k(android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i(x(), "*** handler(%s) handlePluginScreenshotTaken", q());
        sf.f fVar = this.K;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w(x(), "handlePluginScreenshotTaken4JsApiCall, invokeContext is null");
            return;
        }
        this.K = null;
        zf.c cVar = this.f461365o;
        if (cVar == null) {
            com.tencent.mars.xlog.Log.w(x(), "handlePluginScreenshotTaken4JsApiCall, customHandler is null");
        } else {
            ((bg1.h) cVar).e(fVar, bitmap);
        }
    }

    @Override // tf.w
    public void m() {
        G(new java.lang.Runnable() { // from class: yf.i0$$e
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0 i0Var = yf.i0.this;
                yf.o oVar = i0Var.f461362i;
                if (oVar != null) {
                    ((yf.n1) oVar).h("stop", new org.json.JSONObject());
                    ((yf.n1) i0Var.f461362i).a();
                }
            }
        });
    }

    @Override // tf.w
    public boolean o() {
        com.tencent.mars.xlog.Log.i(x(), "startIfForeground");
        if (this.N) {
            com.tencent.mars.xlog.Log.i(x(), "startIfForeground, not in foregound");
            return false;
        }
        G(new java.lang.Runnable() { // from class: yf.i0$$g
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0 i0Var = yf.i0.this;
                if (i0Var.f461362i != null) {
                    com.tencent.mars.xlog.Log.i(i0Var.x(), "startIfForeground, do start");
                    i0Var.f461362i.h("start", new org.json.JSONObject());
                }
            }
        });
        return true;
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        i(new android.view.Surface(surfaceTexture));
    }

    public final void r() {
        if (this.f461367q == 0 || this.f461368r == 0 || this.f461362i == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(x(), "adjustHtmlSize, size:[%d, %d]", java.lang.Integer.valueOf(this.f461367q), java.lang.Integer.valueOf(this.f461368r));
        if (this.S.a(this.f461366p) && this.N) {
            com.tencent.mars.xlog.Log.i(x(), "adjustHtmlSize, i am pip player, isWebViewInBackground");
            return;
        }
        ((yf.n1) this.f461362i).setSurfaceSize(this.f461367q, this.f461368r);
        this.f461360g.g(new android.util.Size(this.f461367q, this.f461368r));
    }

    public final void s(sf.f fVar) {
        zf.c cVar = this.f461365o;
        if (cVar != null) {
            yf.b1 b1Var = new yf.b1(this);
            bg1.h hVar = (bg1.h) cVar;
            hVar.getClass();
            if (fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b) {
                com.tencent.mm.plugin.appbrand.extendplugin.b bVar = (com.tencent.mm.plugin.appbrand.extendplugin.b) fVar;
                org.json.JSONObject c17 = bVar.c();
                java.lang.String optString = c17.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE) ? c17.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE) : null;
                java.lang.String optString2 = c17.optString("backgroundMD5");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    xf1.f.e(bVar.m(), optString, false, optString2, new bg1.c(hVar, b1Var, optString));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertBackgroundImageToLocalPath, url is null");
                    b1Var.b(optString, "");
                }
            }
        }
    }

    public final void t(sf.f fVar) {
        if (this.f461365o == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f461369s)) {
            return;
        }
        zf.c cVar = this.f461365o;
        java.lang.String str = this.f461369s;
        java.lang.String str2 = this.f461370t;
        yf.j0 j0Var = new yf.j0(this);
        bg1.h hVar = (bg1.h) cVar;
        hVar.getClass();
        if (fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b) {
            com.tencent.mm.plugin.appbrand.extendplugin.b bVar = (com.tencent.mm.plugin.appbrand.extendplugin.b) fVar;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertFilterImageToLocalPath, url is null");
            } else {
                xf1.f.e(bVar.m(), str, false, str2, new bg1.d(hVar, j0Var, str));
            }
        }
    }

    public final void u(java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String[] strArr3, org.json.JSONObject jSONObject, sf.f fVar, org.json.JSONObject jSONObject2) {
        int length = strArr.length;
        yf.d1 d1Var = new yf.d1(null);
        d1Var.f461335a = length;
        for (int i17 = 0; i17 < length; i17++) {
            ((bg1.h) this.f461365o).c(fVar, strArr[i17], strArr2[i17], false, new yf.a1(this, i17, jSONObject, strArr3, fVar, d1Var, jSONObject2));
        }
    }

    public final void v(android.app.Activity activity, final sf.f fVar) {
        zf.c cVar;
        int i17 = this.f461371u;
        this.f461371u = i17 + 1;
        if (i17 > 5) {
            com.tencent.mars.xlog.Log.i(x(), "doInvokeInsertAfterRequestPermission, avoid dead loop");
            com.tencent.mars.xlog.Log.i(x(), "doInvokeInsertAfterRequestPermission, invoke insertInternal");
            fVar.a(jc1.g.f298942n);
            return;
        }
        si1.e1.a(fVar.getAppId(), new yf.n0(this, activity, fVar));
        si1.e1.a(fVar.getAppId(), new yf.p0(this, activity, fVar));
        if (!nf.t.a(activity, fVar.m(), "android.permission.CAMERA", 117, "", "")) {
            com.tencent.mars.xlog.Log.i(x(), "doInvokeInsertAfterRequestPermission, no Camera Permission");
            return;
        }
        if (!nf.t.a(activity, fVar.m(), "android.permission.RECORD_AUDIO", 118, "", "")) {
            com.tencent.mars.xlog.Log.i(x(), "doInvokeInsertAfterRequestPermission, no Microphone Permission");
            return;
        }
        com.tencent.mars.xlog.Log.i(x(), "doInvokeInsertAfterRequestPermission, invoke insertInternal");
        if (this.f461362i == null) {
            com.tencent.mars.xlog.Log.i(x(), "insert, adapter is null");
            return;
        }
        com.tencent.rtmp.TXLiveBase.setAppVersion(java.lang.String.format("weixin_%s", fVar.getAppId()));
        this.f461366p = fVar;
        if (fVar.m() instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            this.N = !((com.tencent.mm.plugin.appbrand.page.v5) r10).l2();
        } else {
            com.tencent.mars.xlog.Log.w(x(), "insert, component is not AppBrandPageView");
        }
        fVar.e(new yf.x0(this));
        org.json.JSONObject c17 = fVar.c();
        D(fVar, c17);
        C(c17);
        if (c17.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE)) {
            this.f461372v = c17.optInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE, 0) != 0;
        }
        if (c17.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM)) {
            this.f461373w = c17.optBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, false);
        }
        B(c17);
        android.os.Bundle b17 = vf.a.b(c17);
        if (this.f461365o != null) {
            if (c17.optBoolean("muteOnAudioConflict", false)) {
                java.lang.String b18 = ((bg1.h) this.f461365o).b(true, this, this);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(b18)) {
                    com.tencent.mars.xlog.Log.w(x(), "mutePlayInHighPriorityTask|" + b18);
                    this.I = true;
                    this.f461359J = b17.getBoolean("muted", false) ^ true;
                    b17.putBoolean("muted", true);
                }
            } else {
                final java.lang.String b19 = ((bg1.h) this.f461365o).b(false, this, this);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(b19)) {
                    com.tencent.mars.xlog.Log.i(x(), "insert fail, message:%s", b19);
                    fVar.d("fail: can not insert LivePusher now", jc1.g.f298933e);
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: yf.i0$$o
                        @Override // java.lang.Runnable
                        public final void run() {
                            dp.a.makeText(sf.f.this.getContext(), b19, 0).show();
                        }
                    });
                    return;
                }
            }
        }
        sc1.k1 i18 = ((yf.n1) this.f461362i).i(b17);
        com.tencent.mars.xlog.Log.i(x(), "insert, code:%d info:%s", java.lang.Integer.valueOf(i18.f405688a), i18.f405689b);
        fVar.b(i18.f405688a == 0 ? jc1.f.f298912a : jc1.f.f298915d, i18.f405690c);
        s(fVar);
        t(fVar);
        if (i18.f405688a != 0 || (cVar = this.f461365o) == null) {
            return;
        }
        ((bg1.h) cVar).g(this, this.f461366p, b17);
    }

    public java.lang.String w() {
        return q() + "@" + hashCode();
    }

    public final java.lang.String x() {
        return java.lang.String.format("%s(%s)", "MicroMsg.SameLayer.LivePusherPluginHandler", q());
    }

    public final int y() {
        if (com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window") != null) {
            return ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay().getRotation();
        }
        com.tencent.mars.xlog.Log.e(x(), "getRotationAngle, window service is null");
        return 0;
    }

    public final boolean z(int i17) {
        if (i17 == this.A) {
            return false;
        }
        this.A = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.LivePusherPluginHandler", "notifyOrientationChanged, new angle:%s", java.lang.Integer.valueOf(i17));
        yf.o oVar = this.f461362i;
        if (oVar == null) {
            return false;
        }
        oVar.m(i17);
        this.f461360g.o().i(i17);
        return true;
    }
}
