package fa1;

/* loaded from: classes7.dex */
public class x extends ae.v {

    /* renamed from: i, reason: collision with root package name */
    public final fa1.a f260700i;

    /* renamed from: m, reason: collision with root package name */
    public final android.util.SparseIntArray f260701m;

    public x(com.tencent.luggage.sdk.jsapi.component.service.y yVar, com.tencent.mm.plugin.appbrand.jsruntime.j0 j0Var) {
        super(yVar, j0Var);
        this.f260701m = new android.util.SparseIntArray();
        this.f260700i = (fa1.a) yVar.A1();
    }

    public final void B(boolean z17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(370L, 40L, 1L, false);
        if (z17) {
            g0Var.idkeyStat(370L, 49L, 1L, false);
        } else {
            g0Var.idkeyStat(370L, 50L, 1L, false);
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public com.tencent.mm.plugin.appbrand.jsruntime.r b(java.lang.String str, int i17) {
        if (this.f260700i.P == null) {
            return null;
        }
        return super.b(str, i17);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public int e() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_common_lib_code_cache_type, 0);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public java.lang.String f(com.tencent.luggage.sdk.jsapi.component.service.y yVar, java.lang.String str) {
        java.lang.String f17 = super.f(yVar, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "beforeInjectUserScript(%s)", str);
        com.tencent.luggage.sdk.jsapi.component.service.y yVar2 = this.f47406d;
        com.tencent.mm.plugin.appbrand.game.preload.i e17 = com.tencent.mm.plugin.appbrand.game.preload.i.e(yVar2);
        e17.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals("game.js")) {
            com.tencent.mm.plugin.appbrand.game.preload.j.a().b(2000, (int) (java.lang.System.currentTimeMillis() - e17.f78211a.u0().I));
            com.tencent.mm.plugin.appbrand.game.preload.j.a().b(3001, e17.f78220j.intValue());
            com.tencent.mm.plugin.appbrand.game.preload.j.a().b(3003, e17.f78219i.intValue());
            com.tencent.mm.plugin.appbrand.game.preload.j.a().b(4001, e17.f78221k.intValue());
        }
        if (yVar2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals("game.js")) {
            fe.g a17 = fe.g.a(yVar2.getAppId());
            a17.getClass();
            a17.f261354b = android.os.SystemClock.elapsedRealtime();
        }
        return f17;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public int k(com.tencent.mm.plugin.appbrand.jsruntime.r rVar, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "hy: injectWxaScript from js context interface: %s %d", str, java.lang.Integer.valueOf(rVar.o()));
        android.util.SparseIntArray sparseIntArray = this.f260701m;
        java.util.List<com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo> list = null;
        if (sparseIntArray.get(rVar.o(), 0) <= 0) {
            com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f47406d;
            java.lang.String format = java.lang.String.format(java.util.Locale.US, ";if(typeof __wxConfig==='undefined'){var __wxConfig={};};Object.assign(__wxConfig, %s);", yVar.U0().toString());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            ((com.tencent.mm.plugin.appbrand.jsruntime.n) rVar).evaluateJavascript(format, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "ensureFullWxConfigInjected inject wxConfig, appId:%s, cost:%sms", yVar.getAppId(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            sparseIntArray.put(rVar.o(), 1);
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(this.f47406d.x().qe("injectGameContextPlugin")));
        com.tencent.mars.xlog.Log.i("MicroMsg.PkgABTest", "openMultiSplitPluginCode exp false");
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "injectGameContextPlugin :%b, abtest:%b", valueOf, java.lang.Boolean.FALSE);
        com.tencent.mars.xlog.Log.i("MicroMsg.PkgABTest", "openMultiSplitPluginCode exp false");
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "injectPluginCodeNewLogic");
        if (str.equals("game.js")) {
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap = this.f47406d.t3().E0().f305852r.f75404i;
            if (wxaRuntimeModulePluginListMap != null) {
                list = wxaRuntimeModulePluginListMap.b(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WAGameJsContextInterfaceWC", "pluginCodeList wxaRuntimeModulePluginListMap null");
            }
            if (list != null && list.size() > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "client inject pluginCode size:%s", java.lang.Integer.valueOf(list.size()));
                for (com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo : list) {
                    java.util.List<java.lang.Integer> list2 = wxaPluginPkgInfo.contexts;
                    if (list2 != null) {
                        list2.size();
                        java.util.Arrays.toString(list2.toArray());
                    }
                    if (list2 != null && list2.contains(0)) {
                        super.k(rVar, wxaPluginPkgInfo.prefixPath + com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.GAME_PLUGIN_SCRIPT);
                    }
                }
            }
        }
        super.k(rVar, str);
        return 1;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public java.lang.Object m(int i17) {
        fa1.a aVar = this.f260700i;
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = aVar.P;
        if (wxaPkgV8SnapshotInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WAGameJsContextInterfaceWC", "onAllocContextFromSnapshotStart, commLibSnapshotInfo is null");
            return null;
        }
        aVar.P0(new fa1.a$$a(com.tencent.mm.plugin.appbrand.v8_snapshot.t1.f90823d));
        return wxaPkgV8SnapshotInfo;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void n(int i17, java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        fa1.a aVar = this.f260700i;
        aVar.getClass();
        aVar.P0(new fa1.a$$b(com.tencent.mm.plugin.appbrand.v8_snapshot.t1.f90823d));
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void o(boolean z17) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.e(z17, this.f47406d);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void p() {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3 j3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onAllocEmptySubContextStart");
        }
        j3Var.d(com.tencent.mm.plugin.appbrand.v8_snapshot.g3.f90714f);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void q(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.f(this.f260700i.N, str, z17, this.f47406d);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void r(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.g(this.f260700i.N, str);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void s(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.k(this.f260700i.N, str, this.f47406d);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void t(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.l(this.f260700i.N, str);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void v(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.r(this.f260700i.N, str, str2, str3);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void w(int i17, java.util.ArrayList arrayList, long j17, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.m(this.f260700i.N, arrayList.size() == 1 ? (java.lang.String) arrayList.get(0) : java.util.Arrays.toString(arrayList.toArray(new java.lang.String[0])), arrayList2, arrayList3, this.f47406d);
    }

    @Override // ae.v, com.tencent.luggage.sdk.jsapi.component.service.f
    public void x(int i17, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.n(this.f260700i.N, str);
        super.x(i17, str);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public boolean y() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_read_comm_lib_by_fd, 1) == 1;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void z(com.tencent.luggage.sdk.jsapi.component.n nVar, boolean z17, long j17, long j18, java.lang.Object obj) {
        java.lang.String str;
        int i17;
        int i18;
        java.lang.String str2 = nVar.f47352i;
        if (!str2.endsWith("plugin.js")) {
            str = str2;
            if ("WAGameSubContext.js".equals(str)) {
                if (z17 && (this.f47406d.H0() || this.f47406d.isRunning())) {
                    cl.k1 k1Var = obj instanceof cl.k1 ? (cl.k1) obj : null;
                    com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct g17 = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a.g(this.f47406d);
                    g17.p(str);
                    g17.f62568p = nVar.f47354k;
                    g17.f62570r = (k1Var == null || (i18 = k1Var.codeCacheStatus) < 0 || i18 >= 7) ? 4L : com.tencent.mm.plugin.appbrand.jsruntime.l0.f84003t0[i18];
                    g17.f62571s = 1L;
                    g17.f62572t = k1Var != null ? k1Var.flatJSCompileCost : 0L;
                    g17.f62574v = k1Var != null ? k1Var.f42677c : 0L;
                    g17.f62563k = j17;
                    g17.f62564l = j18;
                    g17.f62561i = j18 - j17;
                    g17.k();
                }
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(778L, 17L, 1L, false);
                if (z17) {
                    g0Var.idkeyStat(778L, 19L, 1L, false);
                } else {
                    g0Var.idkeyStat(778L, 18L, 1L, false);
                    com.tencent.mm.plugin.appbrand.report.v0.m(this.f47406d.getAppId(), 24, 0);
                    com.tencent.mm.plugin.appbrand.report.v0.i(this.f47406d.getAppId(), this.f47406d.t3().E0().f305852r.pkgVersion, this.f47406d.t3().E0().f305852r.f75399d, 778, 18, 1);
                }
                if (this.f47406d.t3() != null) {
                    if (z17) {
                        com.tencent.mm.plugin.appbrand.keylogger.w.f(this.f47406d.getAppId(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectWAGameSubContext, "WAGameSubContext.js", j17, j18);
                    } else {
                        com.tencent.mm.plugin.appbrand.keylogger.w.d(this.f47406d.getAppId(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSWASubContext, "", "WAGameSubContext.js", j17, j18);
                    }
                }
            } else if (str.endsWith("game.js")) {
                if (this.f47406d.H0() || this.f47406d.isRunning()) {
                    cl.k1 k1Var2 = obj instanceof cl.k1 ? (cl.k1) obj : null;
                    ze.n t37 = this.f47406d.t3();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Integer.valueOf(t37 != null ? t37.hashCode() : -1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "[QualitySystem] app-service.js runtime.hashCode = [%d]", objArr);
                    com.tencent.mm.plugin.appbrand.report.quality.e.d(this.f47406d, nVar.f47352i, nVar.f47354k, "", 0, j17, t37 != null ? t37.hashCode() : -1, k1Var2);
                }
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.idkeyStat(778L, 21L, 1L, false);
                if (z17) {
                    g0Var2.idkeyStat(778L, 23L, 1L, false);
                    i17 = 0;
                } else {
                    g0Var2.idkeyStat(778L, 22L, 1L, false);
                    i17 = 0;
                    com.tencent.mm.plugin.appbrand.report.v0.m(this.f47406d.getAppId(), 24, 0);
                    com.tencent.mm.plugin.appbrand.report.v0.i(this.f47406d.getAppId(), this.f47406d.t3().E0().f305852r.pkgVersion, this.f47406d.t3().E0().f305852r.f75399d, 778, 22, 1);
                }
                this.f47406d.getAppId();
                java.util.List list = (java.util.List) ((java.util.HashMap) pj1.b.f354931a.f354932a).get(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.NAME);
                if (list != null && list.size() > 0) {
                    android.support.v4.media.f.a(list.get(i17));
                    throw null;
                }
                if (this.f47406d.t3() != null) {
                    com.tencent.mm.plugin.appbrand.performance.h.d(this.f47406d.t3(), 204, j18 - j17);
                    if (z17) {
                        com.tencent.mm.plugin.appbrand.keylogger.w.f(this.f47406d.getAppId(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSGame, str, j17, j18);
                        com.tencent.mm.plugin.appbrand.keylogger.w.e(this.f47406d.getAppId(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepServiceInit_Game);
                    } else {
                        com.tencent.mm.plugin.appbrand.keylogger.w.d(this.f47406d.getAppId(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSGame, "", str, j17, j18);
                        com.tencent.mm.plugin.appbrand.keylogger.w.b(this.f47406d.getAppId(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepServiceInit_Game);
                    }
                }
            }
        } else if (!z17) {
            str = str2;
            yd.q qVar = yd.q.ERROR;
            java.lang.String str3 = "plugin " + nVar.f76040a + " inject fail!";
            ae.q qVar2 = (ae.q) this.f47406d.z1(ae.q.class);
            if (qVar2 != null) {
                ((ae.a) qVar2).F0().a(qVar, str3);
            }
            B(false);
        } else if (this.f47406d.H0() || this.f47406d.isRunning()) {
            cl.k1 k1Var3 = obj instanceof cl.k1 ? (cl.k1) obj : null;
            ze.n t38 = this.f47406d.t3();
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = nVar.f47352i;
            objArr2[1] = java.lang.Integer.valueOf(t38 != null ? t38.hashCode() : -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "[QualitySystem] %s runtime.hashCode = [%d]", objArr2);
            str = str2;
            com.tencent.mm.plugin.appbrand.report.quality.e.d(this.f47406d, nVar.f47352i, nVar.f47354k, nVar.f76040a, nVar.f76041b, j17, t38 != null ? t38.hashCode() : -1, k1Var3);
            yd.q qVar3 = yd.q.INFO;
            java.lang.String str4 = "plugin " + nVar.f76040a + " inject success!";
            ae.q qVar4 = (ae.q) this.f47406d.z1(ae.q.class);
            if (qVar4 != null) {
                ((ae.a) qVar4).F0().a(qVar3, str4);
            }
            B(true);
        } else {
            str = str2;
        }
        if (z17) {
            com.tencent.mm.plugin.appbrand.performance.m.f(this.f47406d.getAppId(), "JsInject", j17, j18, java.lang.String.format("{ \"fileName\": \"%s\", \"fileSize\": %d }", str, java.lang.Long.valueOf(nVar.f47354k)));
        }
    }
}
