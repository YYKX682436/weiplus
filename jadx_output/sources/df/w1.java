package df;

/* loaded from: classes7.dex */
public final class w1 implements ni1.f {
    public boolean A;
    public ff.e B;

    /* renamed from: e, reason: collision with root package name */
    public ze.n f229581e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.skyline.SkylineRuntime f229582f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f229583g;

    /* renamed from: h, reason: collision with root package name */
    public df.i f229584h;

    /* renamed from: i, reason: collision with root package name */
    public df.a0 f229585i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f229586m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f229589p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f229591r;

    /* renamed from: t, reason: collision with root package name */
    public yz5.a f229593t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f229595v;

    /* renamed from: w, reason: collision with root package name */
    public android.content.Context f229596w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f229598y;

    /* renamed from: d, reason: collision with root package name */
    public int f229580d = -1;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f229587n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f229588o = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f229590q = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f229592s = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.luggage.skyline.SkylineView$mAttachedActivityLifecycleListener$1 f229594u = new androidx.lifecycle.x() { // from class: com.tencent.luggage.skyline.SkylineView$mAttachedActivityLifecycleListener$1
        @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
        public final void onStop() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
            df.w1 w1Var = df.w1.this;
            sb6.append(w1Var.f229580d);
            sb6.append(", attached activity onStop");
            com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", sb6.toString(), new java.lang.Object[0]);
            w1Var.f229591r = true;
            df.a0 a0Var = w1Var.f229585i;
            if (a0Var == null) {
                return;
            }
            a0Var.h(true);
            df.p0 p0Var = a0Var instanceof df.p0 ? (df.p0) a0Var : null;
            if (p0Var == null) {
                return;
            }
            p0Var.f229535d = true;
        }
    };

    /* renamed from: x, reason: collision with root package name */
    public final df.o1 f229597x = new df.o1(this);

    /* renamed from: z, reason: collision with root package name */
    public final df.p1 f229599z = new df.p1();

    @Override // ni1.f
    public void P() {
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", "SkylineView(" + this.f229580d + ") restoreRendering", new java.lang.Object[0]);
        df.a0 a0Var = this.f229585i;
        if (a0Var != null) {
            a0Var.b(true);
        }
    }

    @Override // ni1.f
    public void V() {
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", "SkylineView(" + this.f229580d + ") pauseRendering", new java.lang.Object[0]);
        df.a0 a0Var = this.f229585i;
        if (a0Var != null) {
            a0Var.b(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(android.content.Context context) {
        androidx.lifecycle.o mo133getLifecycle;
        androidx.lifecycle.o mo133getLifecycle2;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object obj = this.f229596w;
        if (obj == null) {
            obj = null;
        } else if (obj == null) {
            kotlin.jvm.internal.o.o("context");
            throw null;
        }
        this.f229596w = context;
        df.a0 a0Var = this.f229585i;
        if (a0Var != null) {
            a0Var.i(context);
        }
        if (kotlin.jvm.internal.o.b(obj, context)) {
            return;
        }
        androidx.lifecycle.y yVar = obj instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) obj : null;
        com.tencent.luggage.skyline.SkylineView$mAttachedActivityLifecycleListener$1 skylineView$mAttachedActivityLifecycleListener$1 = this.f229594u;
        if (yVar != null && (mo133getLifecycle2 = yVar.mo133getLifecycle()) != null) {
            mo133getLifecycle2.c(skylineView$mAttachedActivityLifecycleListener$1);
        }
        androidx.lifecycle.y yVar2 = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar2 == null || (mo133getLifecycle = yVar2.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(skylineView$mAttachedActivityLifecycleListener$1);
    }

    public final void m() {
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", "id:" + this.f229580d + " detachFromActivity platformPlugin:" + this.B, new java.lang.Object[0]);
        ff.e eVar = this.B;
        if (eVar != null) {
            eVar.f261580b.setPlatformMessageHandler(null);
        }
        this.B = null;
        df.a0 a0Var = this.f229585i;
        if (a0Var != null) {
            a0Var.h(true);
        }
    }

    public final void s() {
        io.flutter.embedding.engine.plugins.PluginRegistry plugins;
        if (this.A) {
            return;
        }
        df.i iVar = this.f229584h;
        if (iVar == null) {
            com.tencent.mm.plugin.appbrand.utils.s3.a("SkylineView", "initFlutterEngine fail, skylineConstructArgs is null ", new java.lang.Object[0]);
            return;
        }
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", "initFlutterEngine", new java.lang.Object[0]);
        this.A = true;
        df.a1 a1Var = df.a1.f229421a;
        int i17 = this.f229580d;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        df.n1 n1Var = new df.n1(this);
        synchronized (a1Var) {
            java.lang.Object obj = df.a1.f229423c.get(java.lang.Long.valueOf(iVar.f229482a));
            if (obj == null) {
                com.tencent.mars.xlog.Log.e("SkylineManager", "waitFlutterReady id:" + i17 + " context:" + context + " args:" + iVar + ", may be release return");
                return;
            }
            synchronized (a1Var) {
                if (((df.x0) obj).f229608f.contains(java.lang.Integer.valueOf(i17))) {
                    if (((df.x0) obj).f229609g.contains(java.lang.Integer.valueOf(i17))) {
                        n1Var.invoke(java.lang.Boolean.TRUE);
                    } else {
                        df.a1.f229425e.put(java.lang.Integer.valueOf(i17), n1Var);
                    }
                    com.tencent.mars.xlog.Log.i("SkylineManager", "waitFlutterReady id:" + i17 + " context:" + context + " args:" + iVar + ", already preload");
                    return;
                }
                df.a1.f229424d.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(iVar.f229482a));
                df.x0 x0Var = (df.x0) obj;
                if (x0Var.f229606d) {
                    df.y0 y0Var = x0Var.f229604b;
                    y0Var.getClass();
                    y0Var.f229613a = java.lang.System.currentTimeMillis();
                } else {
                    java.util.HashMap hashMap = x0Var.f229605c;
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                    df.y0 y0Var2 = new df.y0();
                    y0Var2.f229613a = java.lang.System.currentTimeMillis();
                    hashMap.put(valueOf, y0Var2);
                }
                com.tencent.skyline.SkylineConfig skylineConfig = new com.tencent.skyline.SkylineConfig();
                skylineConfig.setId(i17);
                skylineConfig.setRuntimePtr(iVar.f229482a);
                skylineConfig.setCreateRuntime(iVar.f229483b);
                skylineConfig.setPreloadTaskRunner(true);
                android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                double d17 = iVar.f229484c;
                double d18 = displayMetrics.density;
                skylineConfig.setWindowWidth(d17 / d18);
                skylineConfig.setWindowHeight(iVar.f229485d / d18);
                skylineConfig.setLibraryURI("");
                yz5.a aVar = df.a1.f229426f;
                if (aVar != null) {
                    skylineConfig.setPerformanceMonitorConfig((com.tencent.skyline.SkylinePerformanceMonitorConfig) aVar.invoke());
                }
                java.lang.String i18 = com.tencent.mm.vfs.w6.i("wcf://WxaSkylineCache/", true);
                if (i18 != null) {
                    skylineConfig.setCacheDir(i18);
                }
                skylineConfig.setColorScheme(iVar.f229489h);
                f06.v[] vVarArr = gf.m0.f271125b;
                f06.v vVar = vVarArr[0];
                nf.r rVar = gf.m0.f271126c;
                gf.m0 m0Var = gf.m0.f271124a;
                skylineConfig.setDebugShowMaterialGrid(((java.lang.Boolean) rVar.b(m0Var, vVar)).booleanValue());
                skylineConfig.setShowPerformanceOverlay(((java.lang.Boolean) gf.m0.f271127d.b(m0Var, vVarArr[1])).booleanValue());
                skylineConfig.setCheckerboardRasterCacheImages(((java.lang.Boolean) gf.m0.f271128e.b(m0Var, vVarArr[2])).booleanValue());
                skylineConfig.setCheckerboardOffscreenLayers(((java.lang.Boolean) gf.m0.f271129f.b(m0Var, vVarArr[3])).booleanValue());
                skylineConfig.setShowSemanticsDebugger(((java.lang.Boolean) gf.m0.f271130g.b(m0Var, vVarArr[4])).booleanValue());
                skylineConfig.setUseSplashCache(iVar.f229486e);
                skylineConfig.setAppId(iVar.f229487f);
                skylineConfig.setPath(iVar.f229488g);
                skylineConfig.setEnableAutoClearFocus(true);
                boolean createFlutterEngine = com.tencent.skyline.SkylineLogic.createFlutterEngine(context, skylineConfig);
                com.tencent.mars.xlog.Log.i("SkylineManager", "waitFlutterReady id:" + i17 + " args:" + iVar + " isOk:" + createFlutterEngine);
                if (createFlutterEngine) {
                    io.flutter.embedding.engine.FlutterEngine flutterEngine = com.tencent.skyline.SkylineLogic.getFlutterEngine(i17);
                    if (df.a1.f229422b && flutterEngine != null) {
                        flutterEngine.setBackgroundExecutor(new df.z0(flutterEngine), false);
                    }
                    if (flutterEngine != null && (plugins = flutterEngine.getPlugins()) != null) {
                        plugins.add(new hf.d());
                        plugins.add(new vt5.a());
                    }
                    if (((df.x0) obj).f229606d) {
                        ((df.x0) obj).f229607e = i17;
                        ((df.x0) obj).f229606d = false;
                    }
                    ((df.x0) obj).f229608f.add(java.lang.Integer.valueOf(i17));
                    df.a1.f229425e.put(java.lang.Integer.valueOf(i17), n1Var);
                }
            }
        }
    }

    public final void t(java.lang.Integer num) {
        java.util.ArrayList arrayList = this.f229588o;
        if (num != null && arrayList.contains(num)) {
            arrayList.remove(num);
        }
        boolean z17 = this.f229589p & (arrayList.size() <= 0);
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", "id:" + this.f229580d + " call pause ,mResumedPages =" + arrayList + " switchPause=" + z17, new java.lang.Object[0]);
        if (z17) {
            this.f229589p = false;
            df.w0 w0Var = df.w0.f229569a;
            kotlin.jvm.internal.m0.a(df.w0.f229578j).remove(this.f229597x);
            df.a0 a0Var = this.f229585i;
            if (a0Var != null) {
                df.a0.c(a0Var, false, 1, null);
            }
            y(new df.i1(this));
        }
    }

    public final void u(boolean z17) {
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU u07;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig;
        this.f229598y = z17;
        ze.n nVar = this.f229581e;
        boolean c17 = (nVar == null || (u07 = nVar.u0()) == null || (halfScreenConfig = u07.L1) == null) ? false : halfScreenConfig.c();
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", "SkylineView(" + this.f229580d + ") change isAnimating:" + this.f229598y + ", isResumed:" + this.f229589p + ", halfScreenEnable:" + c17, new java.lang.Object[0]);
        df.a0 a0Var = this.f229585i;
        if (a0Var != null && this.f229589p) {
            if (this.f229598y || c17) {
                df.a0.c(a0Var, false, 1, null);
            } else {
                a0Var.a(false);
            }
        }
    }

    public final void y(yz5.a aVar) {
        if (this.f229586m) {
            if (com.tencent.mm.sdk.platformtools.u3.e()) {
                aVar.invoke();
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).B(new df.s1(aVar));
            return;
        }
        synchronized (this) {
            if (!this.f229586m) {
                this.f229587n.add(new df.v1(this, aVar));
                return;
            }
            if (com.tencent.mm.sdk.platformtools.u3.e()) {
                aVar.invoke();
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(new df.s1(aVar));
            }
        }
    }
}
