package i81;

/* loaded from: classes7.dex */
public class b0 implements i81.l0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f289525b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.service.c0 f289526c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.c f289527d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f289529f;

    /* renamed from: g, reason: collision with root package name */
    public long f289530g;

    /* renamed from: a, reason: collision with root package name */
    public final bm5.z0 f289524a = new bm5.z0(new i81.b0$$b());

    /* renamed from: e, reason: collision with root package name */
    public int f289528e = 9;

    /* renamed from: h, reason: collision with root package name */
    public long f289531h = 0;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f289532i = false;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f289533j = false;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f289534k = false;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f289535l = false;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f289536m = null;

    public b0(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.c cVar) {
        this.f289525b = o6Var;
        this.f289527d = cVar;
    }

    public static boolean i(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        return i81.a0.a(o6Var).f289576t == 1;
    }

    public final void a() {
        final com.tencent.mm.plugin.appbrand.ui.wc f17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkAllFinished, isSplashAdFinished:%s, canLoadingSplashFinish:%s", java.lang.Boolean.valueOf(this.f289533j), java.lang.Boolean.valueOf(this.f289534k));
        if (this.f289533j && this.f289534k && (f17 = f()) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkAllFinished, remove AdLoadingSplash");
            if (com.tencent.mm.plugin.appbrand.utils.g0.a()) {
                f17.m();
            } else if (i(this.f289525b)) {
                h(new yz5.a() { // from class: i81.b0$$a
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        com.tencent.mm.plugin.appbrand.ui.wc.this.m();
                        return null;
                    }
                });
            } else {
                f17.m();
            }
            yz5.a aVar = this.f289536m;
            if (aVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "call splash hide listener, which is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "call splash hide listener");
            this.f289536m = null;
            aVar.invoke();
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkShowAdPrepareProcessReady   isResourceReady=" + this.f289535l + " isSplashAdFinished=" + this.f289533j);
    }

    public void c(final boolean z17, final java.lang.String str, int i17, final com.tencent.mm.plugin.appbrand.ui.yc ycVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "closeSplashAd, source: %s, closeType: %d", str, java.lang.Integer.valueOf(i17));
        int i18 = this.f289528e;
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f289525b;
        if (10 != i18) {
            this.f289528e = 10;
            com.tencent.mm.plugin.appbrand.report.quality.e.g(o6Var, false, i17);
        }
        o6Var.m(new java.lang.Runnable() { // from class: i81.b0$$e
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.ui.wc f17;
                i81.b0 b0Var = i81.b0.this;
                boolean z18 = z17;
                java.lang.String str2 = str;
                com.tencent.mm.plugin.appbrand.ui.yc ycVar2 = ycVar;
                b0Var.getClass();
                if (com.tencent.mm.plugin.appbrand.utils.g0.a() && b0Var.f289534k && (f17 = b0Var.f()) != null) {
                    android.view.View view = f17.getInternalLoadingSplash().getView();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ad/AppBrandSplashAdLogic", "hideLoadingSplashImmediately", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ad/AppBrandSplashAdLogic", "hideLoadingSplashImmediately", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mm.plugin.appbrand.ui.wc f18 = b0Var.f();
                if (f18 != null) {
                    f18.e(z18, str2, ycVar2);
                }
            }
        });
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "closeSplashAdImmediately");
        this.f289525b.m(new java.lang.Runnable() { // from class: i81.b0$$g
            @Override // java.lang.Runnable
            public final void run() {
                i81.b0 b0Var = i81.b0.this;
                com.tencent.mm.plugin.appbrand.ui.wc f17 = b0Var.f();
                if (f17 != null) {
                    f17.a();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "onSplashAdViewContainerHideImmediately");
                b0Var.j();
                b0Var.f289533j = true;
                if (b0Var.g() != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "destroyServiceAdComponentView");
                    b0Var.g().M1();
                }
                b0Var.b();
                b0Var.a();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                b0Var.f289531h = java.lang.System.currentTimeMillis();
            }
        });
    }

    public final com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct e(jz5.l lVar, com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct appBrandSplashAdWorkerReportStruct, int i17, long j17, java.lang.String str) {
        appBrandSplashAdWorkerReportStruct.f55156g = ((java.lang.Long) lVar.f302833d).longValue();
        appBrandSplashAdWorkerReportStruct.f55157h = ((java.lang.Long) lVar.f302834e).longValue();
        appBrandSplashAdWorkerReportStruct.f55159j = i17;
        appBrandSplashAdWorkerReportStruct.f55160k = j17;
        if (str == null) {
            str = "";
        }
        appBrandSplashAdWorkerReportStruct.f55162m = appBrandSplashAdWorkerReportStruct.b("AdWorkerCreateFailErrorMsg", str, true);
        return appBrandSplashAdWorkerReportStruct;
    }

    public final com.tencent.mm.plugin.appbrand.ui.wc f() {
        com.tencent.mm.plugin.appbrand.ui.vc vcVar = this.f289525b.f74811t;
        if (vcVar instanceof com.tencent.mm.plugin.appbrand.ui.wc) {
            return (com.tencent.mm.plugin.appbrand.ui.wc) vcVar;
        }
        return null;
    }

    public final com.tencent.mm.plugin.appbrand.service.c0 g() {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f289526c;
        if (c0Var != null) {
            return c0Var;
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f289525b;
        if (o6Var != null) {
            return o6Var.C0();
        }
        return null;
    }

    public void h(yz5.a aVar) {
        com.tencent.mm.plugin.appbrand.ui.wc f17 = f();
        if (f17 == null) {
            if (aVar != null) {
                aVar.invoke();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "[hideLoadingSplash] listener invoke3");
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.ui.vc internalLoadingSplash = f17.getInternalLoadingSplash();
        android.view.View view = internalLoadingSplash.getView();
        if (view == null || view.getParent() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "[hideLoadingSplash] listener invoke1");
            if (aVar != null) {
                aVar.invoke();
            }
        }
        internalLoadingSplash.n(new i81.c0(this, aVar));
    }

    public final void j() {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "reportSplashAd %s", this.f289525b.f74803n);
        com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct c17 = i81.a0.c(this.f289525b);
        cm.e0 e0Var = null;
        if (c17 != null) {
            c17.f55168s = this.f289524a.a() ? 1L : 0L;
            if (i(this.f289525b) && (c0Var = this.f289526c) != null && c0Var.c1() != null) {
                em1.c cVar = this.f289526c.c1().f92386f;
                if (cVar.f255017b == null) {
                    cVar = null;
                }
                if (cVar != null) {
                    em1.c cVar2 = this.f289526c.c1().f92386f;
                    if (cVar2.f255017b == null) {
                        cVar2 = null;
                    }
                    long j17 = cVar2.f255025j;
                    em1.c cVar3 = this.f289526c.c1().f92386f;
                    if (cVar3.f255017b == null) {
                        cVar3 = null;
                    }
                    long j18 = cVar3.f255024i;
                    if (j17 == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "WorkerCreateEarlyTime: -2");
                        c17.f55169t = -2L;
                    } else if (j18 == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "WorkerCreateEarlyTime: -3");
                        c17.f55169t = -3L;
                    } else if (j17 < j18) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "WorkerCreateEarlyTime: -4");
                        c17.f55169t = -4L;
                    } else {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WorkerCreateEarlyTime: ");
                        long j19 = j17 - j18;
                        sb6.append(j19);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", sb6.toString());
                        c17.f55169t = j19;
                    }
                }
            }
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f289525b;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17 = com.tencent.mm.plugin.appbrand.report.quality.e.a(o6Var);
        if (a17 != null) {
            i81.e a18 = i81.a0.a(o6Var);
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplashAdStruct weAppQualitySplashAdStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplashAdStruct();
            java.lang.String str = a17.f88134d;
            weAppQualitySplashAdStruct.f62681d = weAppQualitySplashAdStruct.b("InstanceId", str, true);
            weAppQualitySplashAdStruct.f62682e = weAppQualitySplashAdStruct.b("AppId", a17.f88135e, true);
            weAppQualitySplashAdStruct.f62683f = a17.f88139i;
            int i17 = a17.f88136f;
            if (i17 == 1) {
                e0Var = cm.e0.release;
            } else if (i17 == 2) {
                e0Var = cm.e0.debug;
            } else if (i17 == 3) {
                e0Var = cm.e0.demo;
            }
            weAppQualitySplashAdStruct.f62684g = e0Var;
            weAppQualitySplashAdStruct.f62685h = a17.f88137g;
            weAppQualitySplashAdStruct.f62687j = a17.f88138h;
            long j27 = a18.f289563g;
            weAppQualitySplashAdStruct.f62688k = j27;
            long j28 = a18.f289566j;
            weAppQualitySplashAdStruct.f62689l = j28;
            weAppQualitySplashAdStruct.f62686i = j28 - j27;
            weAppQualitySplashAdStruct.f62690m = o6Var.A2 != null ? r2.f289528e : 9;
            weAppQualitySplashAdStruct.f62691n = j27;
            weAppQualitySplashAdStruct.f62692o = j28;
            weAppQualitySplashAdStruct.f62693p = j28 - j27;
            long j29 = a18.f289568l;
            weAppQualitySplashAdStruct.f62694q = j29;
            long j37 = a18.f289569m;
            weAppQualitySplashAdStruct.f62695r = j37;
            weAppQualitySplashAdStruct.f62696s = j37 - j29;
            long j38 = a18.f289570n;
            weAppQualitySplashAdStruct.f62697t = j38;
            long j39 = a18.f289571o;
            weAppQualitySplashAdStruct.f62698u = j39;
            weAppQualitySplashAdStruct.f62699v = j39 - j38;
            weAppQualitySplashAdStruct.f62700w = i81.d.c();
            long j47 = a18.f289565i;
            long j48 = a18.f289564h;
            weAppQualitySplashAdStruct.B = j47 - j48;
            weAppQualitySplashAdStruct.f62701x = j48;
            weAppQualitySplashAdStruct.f62702y = j48 - a18.f289563g;
            weAppQualitySplashAdStruct.f62703z = j47;
            weAppQualitySplashAdStruct.A = a18.f289566j - j47;
            weAppQualitySplashAdStruct.C = o6Var.u0() != null ? o6Var.u0().f77301n2 : -1;
            weAppQualitySplashAdStruct.D = 0L;
            weAppQualitySplashAdStruct.E = a18.f289567k;
            long j49 = a18.f289572p;
            weAppQualitySplashAdStruct.F = j49;
            long j57 = a18.f289573q;
            weAppQualitySplashAdStruct.G = j57;
            long j58 = a18.f289574r;
            weAppQualitySplashAdStruct.H = j58;
            long j59 = a18.f289575s;
            weAppQualitySplashAdStruct.I = j59;
            weAppQualitySplashAdStruct.f62680J = j59 - j49;
            weAppQualitySplashAdStruct.K = j58 - j57;
            weAppQualitySplashAdStruct.M = a18.f289561e;
            weAppQualitySplashAdStruct.L = i81.d.c();
            weAppQualitySplashAdStruct.N = 1L;
            weAppQualitySplashAdStruct.O = o6Var.S2(false) != null ? o6Var.S2(false).i() : 0L;
            weAppQualitySplashAdStruct.P = weAppQualitySplashAdStruct.b("networkType", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
            weAppQualitySplashAdStruct.Q = a18.f289576t;
            weAppQualitySplashAdStruct.S = a18.f289562f;
            weAppQualitySplashAdStruct.T = a18.f289582z;
            weAppQualitySplashAdStruct.k();
            weAppQualitySplashAdStruct.n();
            com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct c18 = i81.a0.c(o6Var);
            if (c18 != null) {
                c18.f55154e = c18.b("InstanceId", str, true);
                c18.f55161l = a18.f289566j - a18.f289563g;
                c18.f55163n = o6Var.A2 != null ? r2.f289528e : 9;
                com.tencent.mm.plugin.appbrand.c cVar4 = o6Var.D2;
                c18.f55158i = a18.f289576t;
                c18.f55170u = a18.f289577u;
                if (cVar4 != null) {
                    c18.f55164o = cVar4.f77021g;
                    c18.f55165p = cVar4.f77022h;
                }
                c18.k();
            }
        }
        if (!i(this.f289525b) || c17 == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.report.quality.e.h(1754L, 200L, c17.f55166q);
        com.tencent.mm.plugin.appbrand.report.quality.e.h(1755L, 500L, c17.f55167r);
    }

    public final void k(final int i17) {
        em1.c cVar;
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f289525b;
        i81.z zVar = i81.a0.f289516c;
        i81.a0 a17 = zVar.a(o6Var);
        if (!this.f289525b.v0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, can not show ad, reason: %d, appId:%s", java.lang.Integer.valueOf(this.f289525b.C2), this.f289525b.f74803n);
            this.f289528e = 0;
            return;
        }
        com.tencent.mm.plugin.appbrand.task.e0 a18 = com.tencent.mm.plugin.appbrand.task.r.f89160a.a(com.tencent.mm.plugin.appbrand.task.x0.d(this.f289525b.q2()));
        i81.e eVar = a17.f289519a;
        eVar.f289582z = i17;
        final com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct appBrandSplashAdWorkerReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        appBrandSplashAdWorkerReportStruct.f55155f = java.lang.System.currentTimeMillis();
        appBrandSplashAdWorkerReportStruct.f55153d = appBrandSplashAdWorkerReportStruct.b("Appid", this.f289525b.f74803n, true);
        com.tencent.mm.plugin.appbrand.o6 runtime = this.f289525b;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        zVar.a(runtime).f289520b = appBrandSplashAdWorkerReportStruct;
        com.tencent.mm.plugin.appbrand.service.c0 C0 = i17 == 2 ? this.f289525b.C0() : com.tencent.mm.plugin.appbrand.task.r.f(com.tencent.mm.plugin.appbrand.task.x0.d(this.f289525b.u0().k()));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdIfNeed, displayMode:%s  appId:%s, may show ad, preloadedService:%s", java.lang.Integer.valueOf(i17), this.f289525b.f74803n, C0);
        this.f289526c = C0;
        if (C0 != null) {
            cVar = C0.c1().f92386f;
            if (cVar.f255017b == null) {
                cVar = null;
            }
            if (cVar != null) {
                eVar.f289576t = i17 == 2 ? 3 : 2;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, [preload] adWorker is ready");
            } else {
                eVar.f289576t = 4;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, [preload] adWorker is not ready");
            }
        } else {
            eVar.f289576t = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, [not preload] waiting ad worker ready");
            cVar = null;
        }
        this.f289528e = 6;
        com.tencent.mm.plugin.appbrand.report.quality.e.f(this.f289525b);
        if (cVar == null) {
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f289527d.d(new com.tencent.mm.plugin.appbrand.pc() { // from class: i81.b0$$f
                @Override // com.tencent.mm.plugin.appbrand.pc
                public final void a(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, jz5.l lVar, java.lang.String str) {
                    com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct appBrandSplashAdWorkerReportStruct2 = appBrandSplashAdWorkerReportStruct;
                    i81.b0 b0Var = i81.b0.this;
                    b0Var.getClass();
                    long longValue = ((java.lang.Long) lVar.f302834e).longValue() - ((java.lang.Long) lVar.f302833d).longValue();
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    com.tencent.mm.plugin.appbrand.o6 o6Var2 = b0Var.f289525b;
                    i81.e a19 = i81.a0.a(o6Var2);
                    if (a19 != null) {
                        a19.f289562f = currentTimeMillis2;
                    }
                    boolean z19 = false;
                    if (c0Var == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, ad worker obtain fail");
                        b0Var.m("obtainAdWorkerFail");
                        java.lang.Long l17 = -1L;
                        java.lang.Long l18 = -1L;
                        appBrandSplashAdWorkerReportStruct2.f55156g = l17.longValue();
                        appBrandSplashAdWorkerReportStruct2.f55157h = l18.longValue();
                        appBrandSplashAdWorkerReportStruct2.f55159j = 0;
                        appBrandSplashAdWorkerReportStruct2.f55160k = currentTimeMillis2;
                        if (str == null) {
                            str = "";
                        }
                        appBrandSplashAdWorkerReportStruct2.f55162m = appBrandSplashAdWorkerReportStruct2.b("AdWorkerCreateFailErrorMsg", str, true);
                        appBrandSplashAdWorkerReportStruct2.k();
                        b0Var.f289528e = 22;
                        com.tencent.mm.plugin.appbrand.report.quality.e.f(o6Var2);
                        b0Var.d();
                        return;
                    }
                    com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct c17 = i81.a0.c(o6Var2);
                    if (c17 != null) {
                        c17.f55166q = longValue;
                    }
                    b0Var.e(lVar, appBrandSplashAdWorkerReportStruct2, 0, currentTimeMillis2, "");
                    com.tencent.mm.sdk.platformtools.b4 b4Var = b0Var.f289529f;
                    if (b4Var != null && b4Var.e()) {
                        z19 = true;
                    }
                    if (z19) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, ad worker is ready but timeout");
                        com.tencent.mm.plugin.appbrand.report.quality.e.f(o6Var2);
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, ad worker is ready");
                    if (i81.b0.i(o6Var2)) {
                        b0Var.f289526c = (com.tencent.mm.plugin.appbrand.service.c0) b0Var.f289527d.f77020f;
                    }
                    com.tencent.mm.plugin.appbrand.service.c0 c0Var2 = b0Var.f289526c;
                    c0Var2.s1(o6Var2);
                    c0Var2.d2(true);
                    com.tencent.mm.plugin.appbrand.ad.jsapi.n nVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.n();
                    nVar.f74919i = "launch";
                    nVar.f74920m = i17;
                    nVar.x(c0Var2, null, c0Var);
                    b0Var.f289528e = 8;
                    com.tencent.mm.plugin.appbrand.report.quality.e.f(o6Var2);
                }
            });
            l(i17, eVar);
            this.f289528e = 7;
            i81.j.b(this.f289525b, a18, false);
            return;
        }
        this.f289527d.f(cVar);
        l(i17, eVar);
        this.f289528e = 8;
        com.tencent.mm.plugin.appbrand.report.quality.e.f(this.f289525b);
        cl.q0 engine = cVar.f255017b;
        kotlin.jvm.internal.o.g(engine, "engine");
        com.tencent.mm.plugin.appbrand.b bVar = new com.tencent.mm.plugin.appbrand.b(engine);
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f289526c;
        c0Var.s1(this.f289525b);
        c0Var.d2(true);
        com.tencent.mm.plugin.appbrand.ad.jsapi.n nVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.n();
        nVar.f74919i = "launch";
        nVar.f74920m = i17;
        nVar.x(c0Var, null, bVar);
        e(cVar.f255018c, appBrandSplashAdWorkerReportStruct, 1, 0L, null);
        i81.j.b(this.f289525b, a18, true);
    }

    public final void l(int i17, i81.e eVar) {
        int c17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f289530g = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f289529f;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f289529f = new com.tencent.mm.sdk.platformtools.b4("AppBrandSplashAdLogic.checkShowAdTimeoutTask#" + this.f289525b.f74803n, new com.tencent.mm.sdk.platformtools.a4() { // from class: i81.b0$$i
            @Override // com.tencent.mm.sdk.platformtools.a4
            public final boolean onTimerExpired() {
                final i81.b0 b0Var = i81.b0.this;
                if (b0Var.f289532i) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkShowAdTimer, timer already stopped");
                    return false;
                }
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkShowAdTimer timeOut, realTime:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - b0Var.f289530g));
                if (b0Var.f289528e == 7) {
                    b0Var.f289528e = 21;
                } else {
                    b0Var.f289528e = 3;
                }
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: i81.b0$$j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i81.b0.this.d();
                    }
                });
                com.tencent.mm.sdk.platformtools.b4 b4Var2 = b0Var.f289529f;
                if (b4Var2 == null) {
                    return false;
                }
                b4Var2.d();
                return false;
            }
        }, false);
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "RESUME SHOW");
            c17 = i81.d.d();
            if (c17 <= 0) {
                c17 = 1500;
            }
        } else if (eVar.f289576t != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "NOT PRELOAD SHOW");
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            e42.d0 d0Var = e42.d0.clicfg_appbrand_ad_not_preload_timeout_interval;
            this.f289525b.getClass();
            c17 = ((h62.d) e0Var).Ni(d0Var, i81.d.c());
            if (c17 <= 0) {
                this.f289525b.getClass();
                c17 = i81.d.c();
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "PRELOAD SHOW");
            this.f289525b.getClass();
            c17 = i81.d.c();
        }
        eVar.f289561e = c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkShowAdTimer start, timeThreshold:%s", java.lang.Integer.valueOf(c17));
        this.f289532i = false;
        long j17 = c17;
        this.f289529f.c(j17, j17);
    }

    public final void m(java.lang.String str) {
        if (this.f289529f != null) {
            java.lang.String str2 = this.f289525b.f74803n;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "stopCheckShowAdTimeoutTick, appId:%s, reason:%s, realTime:%s", str2, str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f289530g));
            this.f289532i = true;
            this.f289529f.d();
            this.f289529f = null;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f289529f;
        if (b4Var != null) {
            b4Var.d();
        }
    }
}
