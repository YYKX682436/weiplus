package fa1;

/* loaded from: classes7.dex */
public class a extends ae.a implements fa1.s {

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.d7 f260667J;
    public final java.util.concurrent.ConcurrentHashMap K;
    public final com.tencent.mm.plugin.appbrand.report.i L;
    public wd.c M;
    public com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader N;
    public com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo P;
    public boolean Q;
    public java.lang.Boolean R;
    public volatile com.tencent.mm.plugin.appbrand.game.WAGameMISSignatureManager S;
    public boolean T;
    public long U;
    public java.lang.Boolean W;

    public a(com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        super(c0Var);
        this.f260667J = new com.tencent.mm.plugin.appbrand.service.d7((com.tencent.mm.plugin.appbrand.e9) F(), 0);
        this.K = new java.util.concurrent.ConcurrentHashMap();
        this.N = null;
        this.P = null;
        this.Q = false;
        this.R = null;
        this.W = null;
        this.S = null;
        this.T = false;
        this.U = -1L;
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_disable_node_js, 0) == 1;
        this.f47370q = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "[no-node] ctor, mIsNodeDisabled = %b", java.lang.Boolean.valueOf(z17));
        this.L = new com.tencent.mm.plugin.appbrand.report.i();
    }

    @Override // ae.a
    public ud.b A0(boolean z17, com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        return new fa1.j(this, ((com.tencent.mm.plugin.appbrand.service.c0) F()).getF147807d(), tVar, z17);
    }

    @Override // ae.a
    public ae.l C0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "fetchLibBootstrap, mainContextIsSnapshot: %b", java.lang.Boolean.valueOf(this.Q));
        if (!this.Q) {
            return super.C0();
        }
        P0(new fa1.a$$a(com.tencent.mm.plugin.appbrand.v8_snapshot.t1.f90823d));
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3 j3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.N;
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.P;
        java.util.Objects.requireNonNull(wxaPkgV8SnapshotInfo);
        j3Var.j(iCommLibReader, wxaPkgV8SnapshotInfo);
        ae.l lVar = new ae.l();
        lVar.f3356a = "WAGameReady.js";
        lVar.f3357b = ";WeixinSnapshot.snapshotContextReady();";
        return lVar;
    }

    @Override // ae.a
    public java.lang.String D0() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mmv8_disable_codecache, false)) {
            return null;
        }
        return com.tencent.mm.plugin.appbrand.jsruntime.u1.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r0 == null) goto L12;
     */
    @Override // ae.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String E0() {
        /*
            r3 = this;
            java.lang.String r0 = super.E0()
            com.tencent.mm.plugin.appbrand.profile.o r1 = r3.f47371r
            if (r1 == 0) goto L37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            com.tencent.mm.plugin.appbrand.profile.o r0 = r3.f47371r
            com.tencent.mm.plugin.appbrand.jsapi.l r2 = r3.F()
            com.tencent.mm.plugin.appbrand.e9 r2 = (com.tencent.mm.plugin.appbrand.e9) r2
            boolean r0 = r0.f87695d
            if (r0 == 0) goto L2e
            if (r2 == 0) goto L2b
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r0 = r2.x()
            if (r0 == 0) goto L2b
            java.lang.String r2 = "WAServiceRemoteDebug.js"
            java.lang.String r0 = r0.M(r2)
            goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r0 != 0) goto L30
        L2e:
            java.lang.String r0 = ""
        L30:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fa1.a.E0():java.lang.String");
    }

    @Override // ae.a
    /* renamed from: F0 */
    public boolean mo0F0() {
        if (this.W == null) {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            boolean z17 = false;
            if (e0Var != null) {
                if (((h62.d) e0Var).rj(e42.c0.clicfg_android_wxa_enable_cronet_http_binding, 0) > 0) {
                    z17 = true;
                }
            }
            this.W = java.lang.Boolean.valueOf(z17);
        }
        return this.W.booleanValue();
    }

    @Override // ae.a
    public ae.v G0(com.tencent.luggage.sdk.jsapi.component.service.y yVar, com.tencent.mm.plugin.appbrand.jsruntime.j0 j0Var) {
        return new fa1.x((com.tencent.mm.plugin.appbrand.service.c0) yVar, j0Var);
    }

    @Override // ae.a
    public int H0() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_common_lib_code_cache_type, 0);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void I(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("clientVersion", o45.wf.f343029g);
            com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = ((com.tencent.mm.plugin.appbrand.service.c0) F()).getF147808e();
            jSONObject.put("JSEngineName", f147808e instanceof com.tencent.mm.plugin.appbrand.jsruntime.g ? "J2V8-Package" : f147808e instanceof com.tencent.mm.plugin.appbrand.jsruntime.o0 ? "NodeJS" : com.eclipsesource.mmv8.Platform.UNKNOWN);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandGameServiceLogicImpWC", e17, "attachCommonConfig error", new java.lang.Object[0]);
        }
    }

    @Override // ae.a
    public boolean I0() {
        if (this.R == null) {
            this.R = java.lang.Boolean.valueOf(com.tencent.mm.plugin.appbrand.networking.j0.f86092a.a());
        }
        return this.R.booleanValue();
    }

    @Override // ae.a, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void J() {
        super.J();
        com.tencent.mm.plugin.appbrand.report.i iVar = this.L;
        iVar.f87868h.post(new com.tencent.mm.plugin.appbrand.report.g(iVar));
        this.f260667J.d();
        java.util.Iterator it = this.K.values().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.service.d7) it.next()).d();
        }
        if (this.S != null) {
            this.S.b();
        }
    }

    @Override // ae.a
    public void J0(boolean z17, java.lang.String str, cl.k1 k1Var) {
        if (!this.Q) {
            com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.h(this.N, str, z17, k1Var, (com.tencent.luggage.sdk.jsapi.component.service.y) F());
            return;
        }
        P0(new fa1.a$$b(com.tencent.mm.plugin.appbrand.v8_snapshot.t1.f90823d));
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3 j3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.N;
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.P;
        java.util.Objects.requireNonNull(wxaPkgV8SnapshotInfo);
        j3Var.i(iCommLibReader, wxaPkgV8SnapshotInfo, z17, k1Var, (com.tencent.luggage.sdk.jsapi.component.service.y) F());
        jz5.g gVar = com.tencent.mm.plugin.appbrand.utils.s.f90548a;
        if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.appbrand.utils.s.f90549b).getValue()).booleanValue()) {
            e0();
        }
    }

    @Override // ae.a, com.tencent.luggage.sdk.jsapi.component.service.a0
    public com.tencent.mm.plugin.appbrand.jsruntime.t K() {
        this.U = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.jsruntime.t K = super.K();
        this.f260667J.a(K);
        com.tencent.mm.plugin.appbrand.jsruntime.e0 e0Var = (com.tencent.mm.plugin.appbrand.jsruntime.e0) K.h0(com.tencent.mm.plugin.appbrand.jsruntime.e0.class);
        if (e0Var != null) {
            this.T = true;
            ((com.tencent.mm.plugin.appbrand.jsruntime.b) e0Var).s0(new fa1.c(this, ((com.tencent.mm.plugin.appbrand.service.c0) F()).H0(), ((com.tencent.mm.plugin.appbrand.service.c0) F()).getAppId()));
        }
        return K;
    }

    @Override // ae.a
    public void K0(java.lang.String str, java.lang.String str2) {
        try {
            ((com.tencent.mm.plugin.appbrand.o6) S()).R2.f88201c = str + "\n" + str2;
        } catch (java.lang.NullPointerException unused) {
        }
        if (this.Q) {
            com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.r(this.N, "game:main", str, str2);
        }
    }

    @Override // ae.a
    public void L0(int i17) {
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(((com.tencent.mm.plugin.appbrand.service.c0) F()).getAppId(), true);
        if (b17 == null) {
            return;
        }
        b17.C.f88269a = com.tencent.mm.plugin.appbrand.report.quality.p1.values()[i17];
    }

    @Override // ae.a
    public void M0() {
        new ja1.f().b();
    }

    @Override // ae.a
    public boolean O0() {
        return !((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_appbrand_game_disable_gfx, false);
    }

    public final void P0(final fa1.h hVar) {
        final com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) F();
        if (c0Var == null) {
            return;
        }
        if ((com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadOnProcessCreated == c0Var.w1()) || (wxaPkgV8SnapshotInfo = this.P) == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).r(new java.lang.Runnable() { // from class: fa1.a$$d
            @Override // java.lang.Runnable
            public final void run() {
                fa1.h.this.a(wxaPkgV8SnapshotInfo);
            }
        }, "WxaCommLibV8SnapshotClient#flushSnapshotInfo");
    }

    public void Q0(dl3.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "setWxAudioOutputListener %s", bVar);
        if (bVar != null) {
            this.E.setAudioOutputListener(bVar);
        } else {
            this.E.removeAudioOutputListener();
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public java.lang.String R(java.lang.String str) {
        if (!a0()) {
            return "";
        }
        com.tencent.mm.plugin.appbrand.o6 t37 = ((com.tencent.mm.plugin.appbrand.service.c0) F()).t3();
        if (!t37.s2()) {
            return "";
        }
        java.lang.String p17 = com.tencent.mm.plugin.appbrand.appcache.la.p(t37, str + ".map");
        if (com.tencent.mm.sdk.platformtools.t8.K0(p17)) {
            return "";
        }
        try {
            return java.lang.String.format("\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,%s", new java.lang.String(android.util.Base64.encode(p17.getBytes(), 2), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugUtil", "execGameExternalScript Base64.encode %s", e17.getMessage());
            return "";
        }
    }

    public final boolean R0() {
        boolean booleanValue = ((java.lang.Boolean) ha1.q.f279784c.e()).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "hy: isUseNodeFromConfig: %b", java.lang.Boolean.valueOf(booleanValue));
        return booleanValue;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public java.lang.String T() {
        return com.tencent.mm.plugin.appbrand.jsruntime.d2.a();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public final int U() {
        int i17;
        if (com.tencent.mm.sdk.platformtools.x2.i() != null && (i17 = com.tencent.mm.sdk.platformtools.x2.i().getInt("appbrand_wasm_opt", -2)) != -2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "wasm opt set to %d by cmd", java.lang.Integer.valueOf(i17));
            return i17;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_wasm_opt_state, -2);
        if (Ni == -2) {
            return -2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "wasm opt set to %d by abtest", java.lang.Integer.valueOf(Ni));
        return Ni;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean Y() {
        return com.tencent.mm.plugin.appbrand.service.k7.f88707a;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean Z() {
        if (this.Q) {
            return false;
        }
        return super.Z();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean a0() {
        return ((com.tencent.mm.plugin.appbrand.service.c0) F()).t3() != null && ((com.tencent.mm.plugin.appbrand.service.c0) F()).t3().s2();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean b0() {
        return (mo0F0() || (F() instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f)) ? false : true;
    }

    @Override // ae.a, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void g0() {
        super.g0();
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) F();
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = c0Var != null ? c0Var.getF147808e() : null;
        if (c0Var == null || f147808e == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.report.k0.a(c0Var, f147808e);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void h0(int i17, java.lang.String str) {
        if (i17 <= 0) {
            this.f260667J.c(str);
        } else {
            com.tencent.mm.plugin.appbrand.service.d7 d7Var = (com.tencent.mm.plugin.appbrand.service.d7) this.K.get(java.lang.Integer.valueOf(i17));
            if (d7Var != null) {
                d7Var.c(str);
            }
        }
        com.tencent.mm.plugin.appbrand.profile.o oVar = this.f47371r;
        if (oVar instanceof com.tencent.mm.plugin.appbrand.profile.v) {
            oVar.b(str);
        }
    }

    @Override // ae.a, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void j0() {
        super.j0();
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) F();
        com.tencent.mm.weapp_core.JsThreadMonitor jsThreadMonitor = com.tencent.mm.plugin.appbrand.report.k0.f87890a;
        if (jsThreadMonitor != null) {
            jsThreadMonitor.setAppBackground(c0Var.getAppId());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsThreadHangMonitor", "onRuntimePause appId:%s", c0Var.getAppId());
        }
        if (this.S != null) {
            this.S.c();
        }
    }

    @Override // ae.a, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void k0() {
        super.k0();
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) F();
        com.tencent.mm.weapp_core.JsThreadMonitor jsThreadMonitor = com.tencent.mm.plugin.appbrand.report.k0.f87890a;
        if (jsThreadMonitor != null) {
            jsThreadMonitor.setAppForeground(c0Var.getAppId());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsThreadHangMonitor", "onRuntimeResume appId:%s", c0Var.getAppId());
        }
        if (this.S != null) {
            this.S.d();
        }
    }

    @Override // ae.a, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void l0(int i17, long j17, long j18, long j19) {
        super.l0(i17, j17, j18, j19);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.K;
        if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            throw new java.lang.RuntimeException("workerId already exists");
        }
        com.tencent.mm.plugin.appbrand.jsruntime.t V = V(i17);
        com.tencent.mm.plugin.appbrand.service.d7 d7Var = new com.tencent.mm.plugin.appbrand.service.d7((com.tencent.mm.plugin.appbrand.e9) F(), i17);
        d7Var.a(V);
        d7Var.b();
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), d7Var);
    }

    @Override // ae.a, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void m0(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.K;
        com.tencent.mm.plugin.appbrand.service.d7 d7Var = (com.tencent.mm.plugin.appbrand.service.d7) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (d7Var != null) {
            d7Var.d();
        }
        concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        super.m0(i17);
    }

    @Override // ae.a, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void n0() {
        super.n0();
        wd.c cVar = this.M;
        if (cVar != null) {
            cVar.f444676c.removeDecodeEventListener(cVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.MBImageDecodeRegistry", "MBImageDecodeRegistry unregister appid:%s,game:%b", cVar.f444677d, java.lang.Boolean.valueOf(cVar.f444674a));
        }
        com.tencent.mm.plugin.appbrand.profile.o oVar = this.f47371r;
        if (oVar != null) {
            oVar.d();
        }
    }

    @Override // ae.a, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void o0() {
        super.o0();
        this.f260667J.b();
        if (this.f47371r == null) {
            if (S() != null && S().s2()) {
                if (!android.text.TextUtils.isEmpty(com.tencent.luggage.sdk.jsapi.component.service.h2.f47439a.c(com.tencent.luggage.sdk.jsapi.component.service.z1.f47567a))) {
                    this.f47371r = new com.tencent.mm.plugin.appbrand.profile.y();
                    sj1.l.d(P() + "", true);
                }
            }
            this.f47371r = new com.tencent.mm.plugin.appbrand.profile.v();
            sj1.l.d(P() + "", false);
        }
        com.tencent.mm.plugin.appbrand.profile.o oVar = this.f47371r;
        if (oVar != null) {
            oVar.a((com.tencent.mm.plugin.appbrand.e9) F());
        }
        if (this.T) {
            return;
        }
        this.T = true;
        com.tencent.mm.plugin.appbrand.report.quality.e.f88172a.l(((com.tencent.mm.plugin.appbrand.service.c0) F()).H0() ? com.tencent.mm.plugin.appbrand.task.x0.WAGAME : null, ((com.tencent.mm.plugin.appbrand.service.c0) F()).getAppId(), this.U, com.tencent.mm.plugin.appbrand.report.j0.MMV8);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public final java.util.Map p() {
        return (java.util.Map) cf.i.a("AppBrandGameServiceLogicImpWC.onCreateJsApiPool()", new fa1.e(this));
    }

    @Override // ae.a, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void p0(org.json.JSONObject jSONObject) {
        super.p0(jSONObject);
        ((com.tencent.mm.plugin.appbrand.service.c0) F()).K0(jSONObject, "statusBarHeight", java.lang.Integer.valueOf(he.b.a((com.tencent.luggage.sdk.jsapi.component.service.y) F())));
        k91.a3 a3Var = (k91.a3) i95.n0.c(k91.a3.class);
        int i17 = 1;
        if (a3Var != null) {
            k91.r0 Di = ((k91.u0) a3Var).Di(((com.tencent.mm.plugin.appbrand.service.c0) F()).getAppId());
            if (Di != null) {
                java.util.Map map = Di.f305757a;
                java.util.Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    k91.m0 m0Var = (k91.m0) ((java.util.Map.Entry) it.next()).getValue();
                    java.util.Iterator it6 = m0Var.f305674c.values().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        if (!((k91.q0) it6.next()).f305729a) {
                            m0Var.f305672a = true;
                            m0Var.f305673b = 100.0f;
                            break;
                        }
                    }
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(map.size()));
                for (java.util.Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((k91.m0) entry.getValue()).a());
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(kz5.b1.e(new jz5.l("packageLoadInfo", linkedHashMap)));
                java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    ((com.tencent.mm.plugin.appbrand.service.c0) F()).K0(jSONObject, next, jSONObject2.opt(next));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "postProcessConfigAfterBasic: injected packageLoadInfo for appId=%s, json=%s", ((com.tencent.mm.plugin.appbrand.service.c0) F()).getAppId(), jSONObject2.toString());
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap(6);
        int[] a17 = com.tencent.mm.plugin.appbrand.utils.f5.a((com.tencent.mm.plugin.appbrand.jsapi.d0) F());
        int i18 = a17[0];
        int i19 = a17[1];
        android.graphics.Rect safeAreaInsets = ((com.tencent.mm.plugin.appbrand.service.c0) F()).getWindowAndroid().getSafeAreaInsets();
        if (safeAreaInsets != null) {
            int e17 = ik1.w.e(safeAreaInsets.left);
            int e18 = ik1.w.e(safeAreaInsets.top);
            int e19 = ik1.w.e(java.lang.Math.min(safeAreaInsets.right, i18));
            int e27 = ik1.w.e(java.lang.Math.min(safeAreaInsets.bottom, i19));
            hashMap.put("left", java.lang.Integer.valueOf(e17));
            hashMap.put("top", java.lang.Integer.valueOf(e18));
            hashMap.put("right", java.lang.Integer.valueOf(e19));
            hashMap.put("bottom", java.lang.Integer.valueOf(e27));
            hashMap.put("width", java.lang.Integer.valueOf(e19 - e17));
            hashMap.put("height", java.lang.Integer.valueOf(e27 - e18));
            ((com.tencent.mm.plugin.appbrand.service.c0) F()).K0(jSONObject, "safeArea", hashMap);
        }
        try {
            org.json.JSONObject jSONObject3 = (jSONObject.has("network") && (jSONObject.get("network") instanceof org.json.JSONObject)) ? jSONObject.getJSONObject("network") : new org.json.JSONObject();
            if (!I0()) {
                i17 = 0;
            }
            jSONObject3.put("wssVersion", i17);
            jSONObject.put("network", jSONObject3);
        } catch (org.json.JSONException unused) {
        }
    }

    @Override // ae.a, com.tencent.luggage.sdk.jsapi.component.service.a0
    public void q0(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        super.q0(appBrandRuntime);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "hy: wc post runtime ready");
        fa1.f fVar = new fa1.f(this);
        com.tencent.mm.plugin.appbrand.report.i iVar = this.L;
        iVar.f87868h.post(new com.tencent.mm.plugin.appbrand.report.f(iVar, appBrandRuntime, fVar));
        t0(new fa1.g(this));
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJniParams r0() {
        com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJniParams r07 = super.r0();
        if (r07 == null) {
            return null;
        }
        boolean z17 = true;
        if (!com.tencent.mm.plugin.appbrand.service.k7.f88707a) {
            int i17 = sj1.l.f408371a;
            if (!(i17 == 0 || 3 == i17)) {
                z17 = false;
            }
        }
        r07.enableInspector = z17;
        return r07;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public synchronized boolean w0() {
        ym0.l.f463130a = new fa1.b(this);
        ym0.c.f463127a = new fa1.a$$c();
        return super.w0();
    }

    @Override // ae.a
    public void x0(com.tencent.mm.plugin.appbrand.profile.b bVar) {
        com.tencent.mm.plugin.appbrand.profile.o oVar = this.f47371r;
        if (oVar instanceof com.tencent.mm.plugin.appbrand.profile.y) {
            ((com.tencent.mm.plugin.appbrand.profile.y) oVar).f87715o = bVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    @Override // ae.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.appbrand.jsruntime.t y0(java.lang.String r9, byte[] r10) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fa1.a.y0(java.lang.String, byte[]):com.tencent.mm.plugin.appbrand.jsruntime.t");
    }
}
