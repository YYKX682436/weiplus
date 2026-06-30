package wf;

/* loaded from: classes7.dex */
public class b extends eg.a implements tf.w, tf.q, androidx.lifecycle.y {
    public volatile boolean A;
    public volatile boolean B;
    public volatile boolean C;
    public final tf.o D;
    public final qu5.a E;
    public final com.tencent.mm.sdk.platformtools.n3 F;
    public boolean G;
    public volatile boolean H;
    public java.util.concurrent.atomic.AtomicBoolean I;

    /* renamed from: J, reason: collision with root package name */
    public volatile sf.f f445415J;
    public final tf.c K;
    public final tf.d L;
    public java.lang.String M;
    public tf.m0 N;
    public int P;
    public volatile boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final tf.q U;
    public final java.util.concurrent.atomic.AtomicBoolean V;
    public volatile java.lang.String W;
    public volatile java.lang.String X;
    public volatile tf.m Y;
    public volatile android.graphics.Bitmap Z;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f445416g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f445417h;

    /* renamed from: i, reason: collision with root package name */
    public wf.a f445418i;

    /* renamed from: m, reason: collision with root package name */
    public xf.c f445419m;

    /* renamed from: n, reason: collision with root package name */
    public xf.b f445420n;

    /* renamed from: o, reason: collision with root package name */
    public xf.a f445421o;

    /* renamed from: p, reason: collision with root package name */
    public sf.f f445422p;

    /* renamed from: p0, reason: collision with root package name */
    public volatile uf.o1 f445423p0;

    /* renamed from: q, reason: collision with root package name */
    public int f445424q;

    /* renamed from: r, reason: collision with root package name */
    public int f445425r;

    /* renamed from: u, reason: collision with root package name */
    public boolean f445428u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f445429v;

    /* renamed from: x0, reason: collision with root package name */
    public volatile boolean f445432x0;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.media.x7 f445434z;

    /* renamed from: y0, reason: collision with root package name */
    public static final tf.n f445414y0 = tf.f0.b(tf.g0.f418809e);

    /* renamed from: l1, reason: collision with root package name */
    public static uf.i f445413l1 = zf1.a.f472626a;

    /* renamed from: s, reason: collision with root package name */
    public int f445426s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f445427t = 0;

    /* renamed from: w, reason: collision with root package name */
    public sd1.c f445430w = null;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f445431x = null;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.lifecycle.b0 f445433y = new androidx.lifecycle.b0(this, true);

    public b() {
        yz5.a aVar = new yz5.a() { // from class: wf.b$$j
            @Override // yz5.a
            public final java.lang.Object invoke() {
                sf.f fVar = wf.b.this.f445422p;
                if (fVar != null) {
                    return fVar.m();
                }
                return null;
            }
        };
        this.f445434z = new com.tencent.mm.plugin.appbrand.jsapi.media.x7(new com.tencent.mm.plugin.appbrand.jsapi.media.v7(aVar), new wf.i(this));
        this.A = false;
        this.F = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.G = false;
        this.H = false;
        this.I = null;
        this.f445415J = null;
        this.K = new wf.o(this, this, new wf.n(this));
        this.L = new wf.p(this);
        this.M = "";
        this.N = null;
        this.P = -1;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = new tf.l0();
        this.V = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.f445423p0 = null;
        this.f445432x0 = false;
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: wf.b$$k
            @Override // java.lang.Runnable
            public final void run() {
                wf.b.this.f445433y.i(androidx.lifecycle.n.STARTED);
            }
        });
        tf.o a17 = ((tf.f0) f445414y0).a();
        this.D = a17;
        a17.start();
        this.E = a17.getHandler();
        sc1.m1.a();
        wf.r rVar = new wf.r(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f445418i = rVar;
        rVar.setPlayListener(new wf.j(this));
        ((wf.r) this.f445418i).h(new wf.k(this));
    }

    public static void r(final wf.b bVar) {
        com.tencent.mars.xlog.Log.i(bVar.w(), "muteIfIsUnMuted");
        if (bVar.y()) {
            return;
        }
        bVar.C("mute", new java.lang.Runnable() { // from class: wf.b$$q
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar2 = wf.b.this;
                com.tencent.mars.xlog.Log.i(bVar2.w(), "muteIfIsUnMuted, set passive mute");
                bVar2.A = true;
            }
        });
    }

    public final void A(boolean z17, boolean z18) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.V;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.LivePlayerPluginHandler", "JustPlayAudio set: false");
            atomicBoolean.set(false);
            wf.a aVar = this.f445418i;
            if (aVar != null) {
                aVar.setSurface(this.f445416g);
            }
            this.T = false;
            xf.b bVar = this.f445420n;
            if (bVar != null) {
                ((yf1.k) bVar).b(this.f252497d, false);
                return;
            }
            return;
        }
        wf.a aVar2 = this.f445418i;
        if (aVar2 != null && !aVar2.isPlaying()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.LivePlayerPluginHandler", "JustPlayAudio set: true");
            atomicBoolean.set(true);
            this.f445418i.setSurface(null);
        } else if (z18) {
            atomicBoolean.set(true);
        }
        this.T = true;
        xf.b bVar2 = this.f445420n;
        if (bVar2 != null) {
            ((yf1.k) bVar2).b(this.f252497d, true);
        }
    }

    public final void B(java.lang.String str) {
        boolean z17 = true;
        if (str.equalsIgnoreCase("pause")) {
            tf.m0 m0Var = this.N;
            if (m0Var != null) {
                m0Var.onPause();
            } else {
                this.P = 4;
            }
            xf.a aVar = this.f445421o;
            if (aVar != null) {
                ((yf1.e) aVar).c(this.f252497d, com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_END, null);
            }
        } else if (str.equalsIgnoreCase("stop")) {
            tf.m0 m0Var2 = this.N;
            if (m0Var2 != null) {
                m0Var2.onStop();
            } else {
                this.P = 6;
            }
            xf.a aVar2 = this.f445421o;
            if (aVar2 != null) {
                ((yf1.e) aVar2).c(this.f252497d, com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_END, null);
            }
        } else {
            z17 = false;
            if (str.equalsIgnoreCase("mute")) {
                com.tencent.mars.xlog.Log.i(w(), "operate, reset passive mute");
                this.A = false;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i(w(), "operate " + str + ", abandonFocus");
            this.f445434z.a();
        }
    }

    public final void C(final java.lang.String str, final java.lang.Runnable runnable) {
        L(new java.lang.Runnable() { // from class: wf.b$$b
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar = wf.b.this;
                wf.a aVar = bVar.f445418i;
                if (aVar == null) {
                    com.tencent.mars.xlog.Log.w(bVar.w(), "run#operate, adapter is null");
                    return;
                }
                java.lang.String str2 = str;
                aVar.n(str2, null);
                bVar.B(str2);
                java.lang.Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013c, code lost:
    
        if (r0 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0195, code lost:
    
        if (r0 == false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0458  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(sf.f r25) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.b.D(sf.f):void");
    }

    public final void E(sf.f fVar) {
        java.lang.String optString = fVar.c().optString("type");
        com.tencent.mars.xlog.Log.i(w(), "operateBackground, type:%s", optString);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || this.f445418i == null) {
            fVar.a(jc1.f.f298915d);
            return;
        }
        boolean z17 = false;
        if (optString.equals("stop")) {
            u(fVar, false);
            if (this.G) {
                com.tencent.mars.xlog.Log.i(w(), "operateBackground, isRuntimeInBackground, setPlayingWhenEnterBackground false");
                this.I = new java.util.concurrent.atomic.AtomicBoolean(false);
                return;
            }
            return;
        }
        if (!optString.equalsIgnoreCase("pause") && !optString.equalsIgnoreCase("resume") && !optString.equalsIgnoreCase(com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
            com.tencent.mars.xlog.Log.i(w(), "call operate");
            D(fVar);
            return;
        }
        com.tencent.mars.xlog.Log.i(w(), "operateBackground call backgroundManager:".concat(optString));
        tf1.f a17 = tf.k.a(fVar);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w(w(), "operateBackground PAUSE, audioOfVideoBackgroundPlayManager is null. use demote logic.");
            D(fVar);
            return;
        }
        if (optString.equalsIgnoreCase("pause")) {
            a17.u(optString);
            com.tencent.mars.xlog.Log.i(w(), "operateBackground pauseBackgroundAudioPlay:".concat(optString));
            A(false, true);
        } else {
            boolean isPlaying = ((wf.r) this.f445418i).isPlaying();
            boolean i17 = ((wf.r) this.f445418i).i();
            if ((optString.equalsIgnoreCase("resume") && isPlaying) || (optString.equalsIgnoreCase(com.tencent.tav.core.AssetExtension.SCENE_PLAY) && !i17)) {
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i(w(), "operateBackground startBackgroundAudioPlay:%s, isPlaying:%b, isPause:%b", optString, java.lang.Boolean.valueOf(isPlaying), java.lang.Boolean.valueOf(i17));
            if (z17) {
                a17.w(optString);
                A(true, true);
            } else {
                D(fVar);
            }
        }
        fVar.a(jc1.f.f298912a);
    }

    public final void F(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        if (!jSONObject.has("position") || (optJSONObject = jSONObject.optJSONObject("position")) == null) {
            return;
        }
        this.f445424q = ik1.w.c(optJSONObject.optInt("width", 0));
        this.f445425r = ik1.w.c(optJSONObject.optInt("height", 0));
        com.tencent.mars.xlog.Log.i(w(), "parseHtmlPosition, size:[%d, %d]", java.lang.Integer.valueOf(this.f445424q), java.lang.Integer.valueOf(this.f445425r));
        s();
    }

    public final void G(sf.f fVar, org.json.JSONObject jSONObject) {
        if (jSONObject.has("needEvent")) {
            jSONObject.optBoolean("needEvent", false);
            xf.b bVar = this.f445420n;
            if (bVar != null) {
                yf1.k kVar = (yf1.k) bVar;
                kVar.getClass();
                if (fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b) {
                    kVar.f461644a = (com.tencent.mm.plugin.appbrand.extendplugin.b) fVar;
                }
            }
        }
    }

    public void H() {
        wf.a aVar = this.f445418i;
        if (aVar == null || aVar.isPlaying()) {
            return;
        }
        C(com.tencent.tav.core.AssetExtension.SCENE_PLAY, null);
    }

    public final void I(org.json.JSONObject jSONObject) {
        if (!this.H || this.L.a(this.f445422p)) {
            return;
        }
        com.tencent.mars.xlog.Log.i(w(), "insert, webView in background");
        try {
            jSONObject.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY, false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.w(w(), "insert, put isInForeground fail since " + e17.toString());
        }
        this.I = new java.util.concurrent.atomic.AtomicBoolean(jSONObject.optBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY, false));
    }

    public final void J() {
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: wf.b$$p
            @Override // java.lang.Runnable
            public final void run() {
                wf.b.this.f445433y.i(androidx.lifecycle.n.DESTROYED);
            }
        });
        xf.a aVar = this.f445421o;
        if (aVar != null) {
            yf1.e eVar = (yf1.e) aVar;
            com.tencent.mm.plugin.appbrand.AppBrandRuntime a17 = tf1.h.a(this.f445422p);
            if (a17 != null) {
                a17.N.c(eVar.f461643f);
                xf1.i iVar = (xf1.i) a17.k(xf1.i.class);
                if (iVar != null) {
                    wf.b bVar = eVar.f461638a;
                    iVar.f454240g.remove(bVar);
                    com.tencent.mars.xlog.Log.i(iVar.f454237d, "unregisterLivePlayer:%s", bVar.g());
                }
                if (eVar.f461641d) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayerRelease, is voip mode");
                } else if (eVar.f461638a == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayerRelease, pluginHandler is null");
                } else {
                    tf1.f fVar = (tf1.f) a17.k(tf1.f.class);
                    if (fVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayerRelease, audioOfVideoBackgroundPlayManager is null");
                    } else {
                        fVar.o(eVar.f461638a);
                    }
                }
            }
            eVar.f461642e = true;
        }
        wf.a aVar2 = this.f445418i;
        if (aVar2 != null) {
            ((wf.r) aVar2).e();
            this.f445418i = null;
        }
        uf.o1 o1Var = this.f445423p0;
        this.f445423p0 = null;
        if (o1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "handleDestroy");
            uf.o0 q17 = o1Var.q();
            com.tencent.mm.sdk.platformtools.b4 b4Var = q17.f427065h;
            if (!b4Var.e()) {
                b4Var.d();
                q17.f427064g = true;
            }
            o1Var.q().b();
            o1Var.s(uf.b.f426971d);
        }
        android.view.Surface surface = this.f445416g;
        if (surface != null) {
            surface.release();
            this.f445416g = null;
        }
        sf.f fVar2 = this.f445422p;
        if (fVar2 != null) {
            fVar2.f();
        }
        com.tencent.mars.xlog.Log.i(w(), "LivePlayer release handler thread");
        this.E.removeCallbacksAndMessages(null);
        this.D.a();
        com.tencent.mars.xlog.Log.i(w(), "release, abandonFocus");
        this.f445434z.a();
        gg.c cVar = this.f252499f;
        if (cVar == null) {
            return;
        }
        ((gg.a) cVar).i(this.f252498e, this.f252497d);
    }

    public final void K(int i17) {
        if (this.f445419m != null) {
            ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(976L, i17, 1L, false);
        }
    }

    public final void L(java.lang.Runnable runnable) {
        this.E.post(runnable);
    }

    public void M(java.lang.Class cls, tf.r rVar) {
        com.tencent.mars.xlog.Log.i(w(), "setAddOn for ".concat(cls.getSimpleName()));
        java.util.Map map = ((tf.l0) this.U).f418836d;
        if (rVar == null) {
            ((java.util.concurrent.ConcurrentHashMap) map).remove(cls);
        } else {
            ((java.util.concurrent.ConcurrentHashMap) map).put(cls, rVar);
        }
    }

    public final boolean N(android.view.Surface surface) {
        wf.a aVar = this.f445418i;
        if (aVar != null) {
            aVar.setSurface(surface);
            return true;
        }
        com.tencent.mars.xlog.Log.w(w(), "setSurface, Adapter is null");
        return false;
    }

    public final void O(sf.f fVar, org.json.JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("enableCasting", this.f445432x0);
        this.f445432x0 = optBoolean;
        uf.o1 o1Var = this.f445423p0;
        if (optBoolean && o1Var == null) {
            o1Var = f445413l1.a(this.f252497d, fVar);
            this.f445423p0 = o1Var;
        }
        if (o1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "toggleCastEnableState, enable: " + optBoolean);
            o1Var.s(optBoolean ? uf.b.f426972e : uf.b.f426971d);
            java.lang.String value = this.M;
            kotlin.jvm.internal.o.g(value, "value");
            java.lang.String str = o1Var.f427076h;
            o1Var.f427076h = value;
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "onVideoPathUpdate, old: " + str + ", new: " + value);
            if (kotlin.jvm.internal.o.b(value, str) || r26.n0.N(value) || uf.b.f426973f != o1Var.r()) {
                return;
            }
            o1Var.s(uf.b.f426974g);
            uf.o0 q17 = o1Var.q();
            uf.i1 i1Var = new uf.i1(o1Var);
            q17.getClass();
            q17.f427062e.c().e(new uf.n0(q17, i1Var));
            uf.o0 q18 = o1Var.q();
            if (q18.f427068k != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "onCastSrcChange, curAction not null");
            } else {
                q18.f427068k = uf.a.f426964n;
            }
        }
    }

    public final void P() {
        com.tencent.mars.xlog.Log.i(w(), "unMuteIfIsMuted");
        if (y()) {
            C("mute", null);
        }
    }

    @Override // eg.b
    public boolean b(sf.f fVar) {
        return true;
    }

    @Override // eg.a, eg.b
    public void e() {
        L(new java.lang.Runnable() { // from class: wf.b$$m
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar = wf.b.this;
                com.tencent.mars.xlog.Log.i(bVar.w(), "*** handler(%s) handlePluginDestroy", bVar.q());
            }
        });
    }

    @Override // eg.b
    public java.lang.String f(final sf.f fVar) {
        L(new java.lang.Runnable() { // from class: wf.b$$a
            /* JADX WARN: Code restructure failed: missing block: B:172:0x00dc, code lost:
            
                if (r5.equalsIgnoreCase("pause") == false) goto L48;
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x043a  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1130
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b$$a.run():void");
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
        return this.f445433y;
    }

    @Override // tf.q
    public java.lang.String getName() {
        return v();
    }

    @Override // tf.q
    public tf.r h(java.lang.Class cls) {
        com.tencent.mars.xlog.Log.i(w(), "getAddOn for ".concat(cls.getSimpleName()));
        return ((tf.l0) this.U).h(cls);
    }

    @Override // eg.a, eg.b
    public void i(final android.view.Surface surface) {
        L(new java.lang.Runnable() { // from class: wf.b$$l
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar = wf.b.this;
                com.tencent.mars.xlog.Log.i(bVar.w(), "*** handler(%s) handlePluginReady", bVar.q());
                bVar.f445416g = surface;
                if (bVar.f445418i != null) {
                    if (bVar.V.get()) {
                        com.tencent.mars.xlog.Log.i(bVar.w(), "setSurface, JustPlayAudio");
                    } else {
                        bVar.f445418i.setSurface(bVar.f445416g);
                    }
                    bVar.s();
                }
            }
        });
    }

    @Override // eg.a, eg.b
    public void k(android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i(w(), "*** handler(%s) handlePluginScreenshotTaken", q());
        sf.f fVar = this.f445415J;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w(w(), "handlePluginScreenshotTaken4JsApiCall, invokeContext is null");
            return;
        }
        this.f445415J = null;
        xf.a aVar = this.f445421o;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w(w(), "handlePluginScreenshotTaken4JsApiCall, customHandler is null");
        } else {
            ((yf1.e) aVar).d(fVar, bitmap);
        }
    }

    @Override // tf.w
    public void m() {
        L(new java.lang.Runnable() { // from class: wf.b$$e
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar = wf.b.this;
                wf.a aVar = bVar.f445418i;
                if (aVar != null) {
                    aVar.n("stop", null);
                    bVar.B("stop");
                    bVar.f445418i.a();
                }
            }
        });
    }

    @Override // tf.w
    public boolean o() {
        com.tencent.mars.xlog.Log.i(w(), "startIfForeground");
        if (this.H || this.G) {
            com.tencent.mars.xlog.Log.i(w(), "startIfForeground, not in foregound");
            return false;
        }
        L(new java.lang.Runnable() { // from class: wf.b$$d
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar = wf.b.this;
                if (bVar.f445418i != null) {
                    com.tencent.mars.xlog.Log.i(bVar.w(), "startIfForeground, do start");
                    bVar.f445418i.n(com.tencent.tav.core.AssetExtension.SCENE_PLAY, null);
                    bVar.B(com.tencent.tav.core.AssetExtension.SCENE_PLAY);
                }
            }
        });
        return true;
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        i(new android.view.Surface(surfaceTexture));
    }

    public final void s() {
        if (this.f445424q == 0 || this.f445425r == 0 || this.f445418i == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(w(), "adjustHtmlSize, size:[%d, %d]", java.lang.Integer.valueOf(this.f445424q), java.lang.Integer.valueOf(this.f445425r));
        if (this.L.a(this.f445422p) && this.H) {
            com.tencent.mars.xlog.Log.i(w(), "adjustHtmlSize, i am pip player, isWebViewInBackground");
            return;
        }
        ((wf.r) this.f445418i).setSurfaceSize(this.f445424q, this.f445425r);
    }

    public final boolean t() {
        sf.f fVar = this.f445422p;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w(w(), "amIBackgroundAudioPlayer, mInsertInvokeContext is null");
            return false;
        }
        tf1.f a17 = tf.k.a(fVar);
        if (a17 != null) {
            return a17.a(this);
        }
        com.tencent.mars.xlog.Log.w(w(), "amIBackgroundAudioPlayer, audioOfVideoBackgroundPlayManager is null");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(sf.f r4, boolean r5) {
        /*
            r3 = this;
            r3.w()
            boolean r0 = r3.R
            if (r0 == 0) goto L16
            java.lang.String r5 = r3.w()
            java.lang.String r0 = "disableBackgroundPlayAudio, mIsRTCMode"
            com.tencent.mars.xlog.Log.w(r5, r0)
            jc1.d r5 = jc1.g.f298939k
            r4.a(r5)
            return
        L16:
            r3.w()
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L28
            java.lang.String r5 = r3.w()
            java.lang.String r2 = "disableBackgroundPlayAudioInternal, invokeContext is null"
            com.tencent.mars.xlog.Log.w(r5, r2)
        L26:
            r5 = r1
            goto L3c
        L28:
            tf1.f r2 = tf.k.a(r4)
            if (r2 != 0) goto L38
            java.lang.String r5 = r3.w()
            java.lang.String r2 = "disableBackgroundPlayAudio, audioOfVideoBackgroundPlayManager is null"
            com.tencent.mars.xlog.Log.w(r5, r2)
            goto L26
        L38:
            r2.c(r3, r5)
            r5 = r0
        L3c:
            if (r5 == 0) goto L42
            r3.A(r1, r0)
            goto L43
        L42:
            r0 = r1
        L43:
            java.lang.String r5 = r3.w()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "disableBackgroundPlayAudio, result:%s"
            com.tencent.mars.xlog.Log.i(r5, r2, r1)
            if (r0 == 0) goto L59
            jc1.d r5 = jc1.f.f298912a
            goto L5b
        L59:
            jc1.d r5 = jc1.f.f298915d
        L5b:
            r4.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.b.u(sf.f, boolean):void");
    }

    public java.lang.String v() {
        return q() + "@" + hashCode();
    }

    public final java.lang.String w() {
        return java.lang.String.format("%s(%s)", "MicroMsg.SameLayer.LivePlayerPluginHandler", q());
    }

    public final void x(tf.m mVar) {
        com.tencent.mars.xlog.Log.i(w(), "getSnapshotAsync");
        if (this.f445418i == null) {
            com.tencent.mars.xlog.Log.w(w(), "getSnapshotAsync, mAdapter is null");
            mVar.a(null);
        } else {
            this.Y = mVar;
            this.f445418i.l(true, new wf.f(this));
        }
    }

    public final boolean y() {
        wf.a aVar = this.f445418i;
        return aVar != null && aVar.isMuted();
    }

    public final boolean z() {
        wf.a aVar = this.f445418i;
        return aVar != null && aVar.isPlaying();
    }
}
