package kx5;

/* loaded from: classes15.dex */
public class n {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.Integer f313309n = 1000;

    /* renamed from: o, reason: collision with root package name */
    public static kx5.n f313310o;

    /* renamed from: a, reason: collision with root package name */
    public kx5.h f313311a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.FlutterEngineGroup f313312b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.FlutterEngine f313313c;

    /* renamed from: d, reason: collision with root package name */
    public int f313314d;

    /* renamed from: e, reason: collision with root package name */
    public mx5.b f313315e;

    /* renamed from: k, reason: collision with root package name */
    public kx5.j f313321k;

    /* renamed from: l, reason: collision with root package name */
    public kx5.i f313322l;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f313316f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f313317g = new android.util.SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f313318h = java.lang.Boolean.FALSE;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f313320j = new java.util.concurrent.atomic.AtomicInteger(f313309n.intValue());

    /* renamed from: m, reason: collision with root package name */
    public kx5.l f313323m = null;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f313319i = new android.os.Handler(android.os.Looper.getMainLooper());

    public static void a(kx5.n nVar, io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        io.flutter.embedding.engine.FlutterEngineGroup flutterEngineGroup;
        nVar.getClass();
        flutterEngine.destroy();
        if (nVar.f313317g.size() != 0 || (flutterEngineGroup = nVar.f313312b) == null) {
            return;
        }
        nVar.f313312b = null;
        nVar.f313319i.postDelayed(new kx5.d(nVar, flutterEngineGroup), 1000L);
    }

    public static kx5.n h() {
        if (f313310o == null) {
            synchronized (kx5.n.class) {
                f313310o = new kx5.n();
            }
        }
        return f313310o;
    }

    public boolean b() {
        if (this.f313313c == null || this.f313318h.booleanValue()) {
            return false;
        }
        if (g(this.f313314d) == this.f313313c) {
            return true;
        }
        nx5.c.b("WxaRouter.WxaRouter", "WxaRouter canReleasePreloadFlutterEngine error", new java.lang.Object[0]);
        return false;
    }

    public int c() {
        e(this.f313311a, false);
        int i17 = this.f313320j.get();
        nx5.c.c("WxaRouter.WxaRouter", "provideFlutterEngine defaultFlutterEngine: %d", java.lang.Integer.valueOf(i17));
        d(this.f313311a, true);
        return i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(kx5.h hVar, boolean z17) {
        io.flutter.embedding.engine.FlutterEngine createAndRunEngine;
        long j17;
        boolean z18;
        px5.a aVar = px5.b.f358957a;
        px5.b.f358958b.put(java.lang.String.valueOf(this.f313320j.toString()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        io.flutter.embedding.engine.loader.FlutterLoader flutterLoader = io.flutter.FlutterInjector.instance().flutterLoader();
        flutterLoader.startInitialization(this.f313311a.f313307e);
        io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint = new io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint(flutterLoader.findAppBundlePath(), this.f313311a.f313303a);
        this.f313311a.getClass();
        java.lang.String format = java.lang.String.format("%s-%s", "/", java.lang.Integer.valueOf(this.f313320j.get()));
        if (this.f313321k != null) {
            android.content.Context context = this.f313311a.f313307e;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.util.List<java.lang.String> list = hVar.f313308f;
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                e50.z0 z0Var = (e50.z0) ((f50.y) i95.n0.c(f50.y.class));
                pi0.q qVar = z0Var.f249558e;
                if (qVar != null) {
                    java.lang.Object ref = z0Var.f249567q;
                    kotlin.jvm.internal.o.g(ref, "ref");
                    synchronized (qVar.f354709m) {
                        z18 = qVar.f354709m.contains(ref);
                    }
                } else {
                    z18 = false;
                }
                if (z18) {
                    com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "WxaRouter delegate provide engine");
                    f50.y yVar = (f50.y) i95.n0.c(f50.y.class);
                    kotlin.jvm.internal.o.d(context);
                    kotlin.jvm.internal.o.d(bool);
                    e50.z0 z0Var2 = (e50.z0) yVar;
                    z0Var2.getClass();
                    createAndRunEngine = (io.flutter.embedding.engine.FlutterEngine) kotlinx.coroutines.l.f(null, new pi0.b(z0Var2.Ui(), context, dartEntrypoint, format, true, list, null), 1, null);
                    z0Var2.Ui().f(z0Var2.f249567q);
                }
            }
            com.tencent.mm.plugin.lite.o oVar2 = com.tencent.mm.plugin.lite.p.f144149a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "WxaRouter delegate provide engine has not ready engineGroup for liteapp");
            kx5.n h17 = h();
            h17.e(h17.f313311a, true);
            createAndRunEngine = h17.f313312b.createAndRunEngine(new io.flutter.embedding.engine.FlutterEngineGroup.Options(h17.f313311a.f313307e).setDartEntrypoint(dartEntrypoint).setInitialRoute(format).setAutomaticallyRegisterPlugins(true).setDartEntrypointArgs(list));
            kotlin.jvm.internal.o.f(createAndRunEngine, "originCreateFlutterEngine(...)");
        } else {
            createAndRunEngine = this.f313312b.createAndRunEngine(new io.flutter.embedding.engine.FlutterEngineGroup.Options(this.f313311a.f313307e).setDartEntrypoint(dartEntrypoint).setInitialRoute(format).setAutomaticallyRegisterPlugins(true).setDartEntrypointArgs(hVar.f313308f));
        }
        int i17 = this.f313320j.get();
        if (createAndRunEngine != null) {
            this.f313317g.put(i17, createAndRunEngine);
        } else {
            nx5.c.e("WxaRouter.WxaRouter", "engine is null.", new java.lang.Object[0]);
        }
        if (!z17 && this.f313313c == null) {
            this.f313313c = createAndRunEngine;
            this.f313314d = this.f313320j.get();
        }
        nx5.c.c("WxaRouter.WxaRouter", "create flutter engineId:%s", java.lang.Integer.valueOf(this.f313320j.get()));
        nx5.c.c("WxaRouter.WxaRouter", "registerPlugins by wxa router", new java.lang.Object[0]);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (this.f313322l != null) {
            io.flutter.plugin.common.MethodChannel.MethodCallHandler k0Var = j62.e.g().l("clicfg_liteapp_video_use_finder", false, true, true) ? new ha3.k0() : new x03.q1();
            java.util.HashSet hashSet2 = new java.util.HashSet();
            ((com.tencent.mm.feature.finder.live.m5) ((os5.s) i95.n0.c(os5.s.class))).getClass();
            hashSet2.add(new th2.b());
            hashSet2.add(new io.flutter.plugins.flutter.keyboard.patched.PatchedFlutterKeyboardVisibilityPlugin());
            hashSet2.add(new kx5.p());
            hashSet2.add(k0Var);
            hashSet2.add(new g03.a());
            hashSet2.add(new g03.b());
            hashSet2.add(new g03.c());
            hashSet2.add(new k03.h());
            hashSet2.add(new si0.f());
            hashSet2.add(new zc.b0());
            hashSet2.add(new com.tencent.mm.plugin.lite.ui.b2());
            hashSet2.add(new fa3.r());
            hashSet2.add(new ea3.b0());
            hashSet2.add(new la3.l());
            hashSet2.add(new ca3.t());
            hashSet2.add(new ma3.e());
            hashSet.addAll(hashSet2);
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            io.flutter.embedding.engine.plugins.FlutterPlugin flutterPlugin = (io.flutter.embedding.engine.plugins.FlutterPlugin) it.next();
            if (createAndRunEngine.getPlugins().has(flutterPlugin.getClass())) {
                nx5.c.e("WxaRouter.GeneratedPluginRegistrant", "plugin: " + flutterPlugin.toString() + " has registered.", new java.lang.Object[0]);
                createAndRunEngine.getPlugins().remove((java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin>) flutterPlugin.getClass());
            }
            createAndRunEngine.getPlugins().add(flutterPlugin);
        }
        i(createAndRunEngine);
        createAndRunEngine.getNavigationChannel().setInitialRoute(format);
        if (!createAndRunEngine.getDartExecutor().isExecutingDart()) {
            createAndRunEngine.getDartExecutor().executeDartEntrypoint(dartEntrypoint, hVar.f313308f);
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        px5.a aVar2 = px5.b.f358957a;
        java.lang.String key = this.f313320j.toString();
        kotlin.jvm.internal.o.g(key, "key");
        java.util.HashMap hashMap = px5.b.f358958b;
        if (hashMap.containsKey(key)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Object obj = hashMap.get(key);
            kotlin.jvm.internal.o.d(obj);
            j17 = currentTimeMillis - ((java.lang.Number) obj).longValue();
        } else {
            j17 = 0;
        }
        objArr[0] = java.lang.Long.valueOf(j17);
        nx5.c.c("WxaRouter.WxaRouter", "TimeRecord createFlutterEngine:%d", objArr);
        this.f313320j.addAndGet(1);
    }

    public final void e(kx5.h hVar, boolean z17) {
        if ((this.f313321k == null || z17) && this.f313312b == null) {
            nx5.c.c("WxaRouter.WxaRouter", "createFlutterEngineGroup", new java.lang.Object[0]);
            this.f313312b = new io.flutter.embedding.engine.FlutterEngineGroup(hVar.f313307e);
        }
    }

    public void f(int i17) {
        nx5.c.c("WxaRouter.WxaRouter", "destroyPreloadFlutterEngine engineId:%d default:%d defaultUsed:%b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f313314d), this.f313318h);
        if (i17 == 0 && (this.f313313c == null || this.f313318h.booleanValue())) {
            return;
        }
        if (i17 == 0) {
            i17 = this.f313314d;
        }
        io.flutter.embedding.engine.FlutterEngine g17 = g(i17);
        if (i17 == this.f313314d && g17 != this.f313313c) {
            nx5.c.b("WxaRouter.WxaRouter", "WxaRouter destroyPreloadFlutterEngine error", new java.lang.Object[0]);
        } else {
            j(i17, "destroyApp", new java.util.HashMap());
            p(i17);
        }
    }

    public io.flutter.embedding.engine.FlutterEngine g(int i17) {
        return (io.flutter.embedding.engine.FlutterEngine) this.f313317g.get(i17);
    }

    public void i(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        if (this.f313311a.f313304b == null) {
            nx5.c.c("WxaRouter.WxaRouter", "no method call handler.", new java.lang.Object[0]);
            return;
        }
        kx5.p pVar = (kx5.p) flutterEngine.getPlugins().get(kx5.p.class);
        if (pVar != null) {
            java.util.HashSet hashSet = this.f313311a.f313304b;
            java.util.HashSet hashSet2 = pVar.f313326e;
            if (hashSet2.contains(hashSet)) {
                nx5.c.c("WxaRouter.WxaRouterPlugin", "had add method call handler %s", java.lang.Integer.valueOf(hashSet.hashCode()));
            } else {
                hashSet2.addAll(hashSet);
            }
        }
    }

    public void j(int i17, java.lang.String str, java.lang.Object obj) {
        if (this.f313317g.indexOfKey(i17) <= -1) {
            nx5.c.e("WxaRouter.WxaRouter", "engine is null.", new java.lang.Object[0]);
            return;
        }
        kx5.p pVar = (kx5.p) g(i17).getPlugins().get(kx5.p.class);
        if (pVar != null) {
            pVar.f313325d.a(str, obj, null);
        }
    }

    public void k(int i17, java.lang.String str, java.lang.Object obj, io.flutter.plugin.common.MethodChannel.Result result) {
        if (this.f313317g.indexOfKey(i17) <= -1) {
            nx5.c.e("WxaRouter.WxaRouter", "engine is null.", new java.lang.Object[0]);
            return;
        }
        kx5.p pVar = (kx5.p) g(i17).getPlugins().get(kx5.p.class);
        if (pVar != null) {
            pVar.f313325d.a(str, obj, result);
        }
    }

    public boolean l() {
        return this.f313311a != null;
    }

    public void m() {
        if (this.f313313c == null || this.f313318h.booleanValue()) {
            e(this.f313311a, false);
            this.f313313c = null;
            this.f313318h = java.lang.Boolean.FALSE;
            d(this.f313311a, false);
        }
    }

    public void n(kx5.k kVar) {
        kx5.j jVar = this.f313321k;
        if (jVar == null) {
            e(this.f313311a, false);
            return;
        }
        ((com.tencent.mm.plugin.lite.m) jVar).getClass();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(b17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new com.tencent.mm.plugin.lite.l(kVar, null), 2, null);
        } else {
            com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "WxaRouter delegate prepareFlutterEngineGroup isn't in MainProcess!");
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    public int o(boolean z17, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.LOAD_FLUTTER_ENGINE);
        }
        e(this.f313311a, false);
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f313313c;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f313320j;
        if (flutterEngine == null) {
            if (!z17) {
                this.f313318h = java.lang.Boolean.TRUE;
            }
            if (liteAppReporter != null) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.FLUTTER_ENGINE_NOT_PRELOADED);
            }
            int i17 = atomicInteger.get();
            nx5.c.c("WxaRouter.WxaRouter", "provideFlutterEngine defaultFlutterEngine: %d", java.lang.Integer.valueOf(i17));
            d(this.f313311a, false);
            return i17;
        }
        if (this.f313318h.booleanValue()) {
            if (z17) {
                this.f313313c = null;
                this.f313318h = java.lang.Boolean.FALSE;
            }
            if (liteAppReporter != null) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.FLUTTER_ENGINE_NOT_PRELOADED);
            }
            int i18 = atomicInteger.get();
            d(this.f313311a, false);
            nx5.c.c("WxaRouter.WxaRouter", "provideFlutterEngine createEngineId:%d", java.lang.Integer.valueOf(i18));
            return i18;
        }
        nx5.c.c("WxaRouter.WxaRouter", "provideFlutterEngine prepare defaultFlutterEngine: %d", java.lang.Integer.valueOf(this.f313314d));
        if (!z17) {
            this.f313318h = java.lang.Boolean.TRUE;
        }
        if (this.f313321k != null) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                e50.z0 z0Var = (e50.z0) ((f50.y) i95.n0.c(f50.y.class));
                pi0.q qVar = z0Var.f249558e;
                if (qVar != null) {
                    qVar.f(z0Var.f249567q);
                }
            } else {
                com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "WxaRouter delegate finishHoldEngineGroup isn't in MainProcess!");
            }
        }
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.FLUTTER_ENGINE_PRELOADED);
        }
        return this.f313314d;
    }

    public void p(int i17) {
        nx5.c.c("WxaRouter.WxaRouter", "releaseEngine start: %d", java.lang.Integer.valueOf(i17));
        io.flutter.embedding.engine.FlutterEngine g17 = g(i17);
        if (g17 == null) {
            nx5.c.b("WxaRouter.WxaRouter", "WxaRouter releaseEngine engine is nil", new java.lang.Object[0]);
            return;
        }
        if (g17 == this.f313313c) {
            this.f313318h = java.lang.Boolean.FALSE;
            this.f313313c = null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("engineId", java.lang.Integer.valueOf(i17));
        kx5.c cVar = new kx5.c(this, i17, g17);
        kx5.f fVar = new kx5.f(this, cVar, "releaseEngine", 3000);
        h().k(i17, "releaseEngine", hashMap, new kx5.g(this, fVar, "releaseEngine", cVar));
        this.f313319i.postDelayed(fVar, 3000);
        this.f313317g.remove(i17);
    }
}
