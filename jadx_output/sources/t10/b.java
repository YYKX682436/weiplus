package t10;

/* loaded from: classes9.dex */
public final class b extends com.tencent.unit_rc.BaseObject implements y02.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final t10.c f414549d;

    public b(t10.c router) {
        kotlin.jvm.internal.o.g(router, "router");
        this.f414549d = router;
    }

    @Override // y02.f0
    public void Y2(bw5.x7 jumpInfo, y02.d0 d0Var, bw5.l8 preloadConfig, yz5.l lVar) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(preloadConfig, "preloadConfig");
        t10.d dVar = new t10.d();
        t10.c cVar = this.f414549d;
        java.lang.String str = cVar.f414550a;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        dVar.f414552a = str;
        dVar.f414553b = "preload";
        dVar.f414554c = jumpInfo;
        dVar.f414555d = lVar;
        cVar.c(a(d0Var), jumpInfo, preloadConfig, dVar);
    }

    public final pq.a a(y02.d0 d0Var) {
        pq.a aVar;
        java.lang.String str;
        io.flutter.embedding.engine.plugins.PluginRegistry plugins;
        if (d0Var != null) {
            aVar = r10.j.b(d0Var);
        } else {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            aVar = new pq.a(context);
        }
        if (d0Var != null) {
            y02.e0 e0Var = (y02.e0) d0Var;
            y02.z a17 = e0Var.a();
            if ((a17 != null ? ((y02.a0) a17).a() : null) == bw5.k8.EcsOpenPlatform_Flutter) {
                y02.z a18 = e0Var.a();
                if (a18 != null) {
                    y02.a0 a0Var = (y02.a0) a18;
                    synchronized (a0Var) {
                        if (a0Var.f458592d[1]) {
                            str = a0Var.f458594f;
                        } else {
                            str = urgen.ur_E2DE.UR_49D9.UR_B5EC(a0Var.getCppPointer());
                            synchronized (a0Var) {
                                a0Var.f458594f = str;
                                a0Var.f458592d[1] = true;
                            }
                        }
                    }
                } else {
                    str = null;
                }
                if (str == null) {
                    com.tencent.mars.xlog.Log.w("ECS_O.BaseRouter", "handlerOpen From Flutter, but engineId is null");
                } else {
                    io.flutter.embedding.engine.FlutterEngine flutterEngine = io.flutter.embedding.engine.FlutterEngineCache.getInstance().get(str);
                    io.flutter.embedding.engine.plugins.FlutterPlugin flutterPlugin = (flutterEngine == null || (plugins = flutterEngine.getPlugins()) == null) ? null : plugins.get(pi0.t.class);
                    pi0.t tVar = flutterPlugin instanceof pi0.t ? (pi0.t) flutterPlugin : null;
                    android.app.Activity activity = tVar != null ? tVar.f354726d : null;
                    if (activity == null) {
                        com.tencent.mars.xlog.Log.w("ECS_O.BaseRouter", "handlerOpen From Flutter, but activity is null");
                    } else {
                        aVar.f357551a = new java.lang.ref.WeakReference(activity);
                    }
                }
            }
        }
        return aVar;
    }

    @Override // y02.f0
    public void j0(bw5.x7 jumpInfo, y02.d0 d0Var, yz5.l lVar) {
        y02.z a17;
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        java.lang.String str = null;
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, 0, s00.a.class, null);
        if (d0Var != null && (a17 = ((y02.e0) d0Var).a()) != null) {
            str = java.lang.Long.valueOf(((y02.a0) a17).d()).toString();
        }
        z20.e eVar = z20.e.f469543e;
        z20.b bVar = new z20.b();
        bVar.f469537a = eVar;
        bw5.q9 q9Var = new bw5.q9();
        q9Var.f31999d = "ecso_open";
        q9Var.f32013u[1] = true;
        q9Var.c(java.lang.System.currentTimeMillis());
        q9Var.b(2);
        bVar.f469538b = q9Var;
        bVar.f(str);
        bVar.c("native_handler_start");
        bVar.b("native_handler");
        bVar.a();
        t10.d dVar = new t10.d();
        t10.c cVar = this.f414549d;
        java.lang.String str2 = cVar.f414550a;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        dVar.f414552a = str2;
        dVar.f414553b = "open";
        dVar.f414554c = jumpInfo;
        dVar.f414555d = new t10.a(lVar, str);
        cVar.b(a(d0Var), jumpInfo, dVar);
    }

    @Override // y02.f0
    public java.lang.String name() {
        return this.f414549d.f414550a;
    }

    @Override // y02.f0
    public boolean r6(bw5.x7 jumpInfo, y02.d0 d0Var) {
        pq.a aVar;
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        if (d0Var != null) {
            aVar = r10.j.b(d0Var);
        } else {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            aVar = new pq.a(context);
        }
        return this.f414549d.a(aVar, jumpInfo);
    }
}
