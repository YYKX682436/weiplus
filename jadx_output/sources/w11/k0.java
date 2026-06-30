package w11;

/* loaded from: classes12.dex */
public class k0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f442071d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.StringBuilder f442072e;

    /* renamed from: f, reason: collision with root package name */
    public final x11.t f442073f;

    public k0(com.tencent.mm.modelbase.v0 v0Var, android.content.Context context) {
        java.lang.String valueOf;
        int i17;
        long j17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        this.f442072e = sb6;
        x11.t tVar = new x11.t(this);
        this.f442073f = tVar;
        trackState().h(1000);
        t4.a.a("NewInitAll", 10086);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "NetSceneInit hash:%d stack:%s", valueOf2, new com.tencent.mm.sdk.platformtools.z3());
        sb6.append("stack:" + new com.tencent.mm.sdk.platformtools.z3() + " time:" + com.tencent.mm.sdk.platformtools.t8.i1());
        this.f442071d = new java.lang.ref.WeakReference(v0Var);
        x11.f0 a17 = tVar.a();
        a17.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        a17.f451365f = elapsedRealtime;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            valueOf = activity.getIntent().getStringExtra("KEY_NEWINIT_LOGIN_IN_SESSION_ID");
            if (valueOf == null || r26.n0.N(valueOf)) {
                valueOf = java.lang.String.valueOf(a17.f451365f);
            } else {
                activity.getIntent().removeExtra("KEY_NEWINIT_LOGIN_IN_SESSION_ID");
            }
        } else {
            valueOf = java.lang.String.valueOf(elapsedRealtime);
        }
        a17.f451366g = valueOf;
        try {
            try {
                i17 = java.lang.Runtime.getRuntime().availableProcessors();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneInit.dkInit", th6, "getCpuCoreNum err", new java.lang.Object[0]);
                i17 = -1;
            }
            try {
                java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
                ((android.app.ActivityManager) systemService).getMemoryInfo(memoryInfo);
                j17 = memoryInfo.totalMem;
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneInit.dkInit", th7, "getMemorySize err", new java.lang.Object[0]);
                j17 = -1;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "recordInitStart() called sessionId:" + a17.f451366g + " cpuCoreNum:" + i17 + " memorySize:" + j17);
            com.tencent.mm.autogen.mmdata.rpt.NewInitPerformanceStruct newInitPerformanceStruct = new com.tencent.mm.autogen.mmdata.rpt.NewInitPerformanceStruct();
            newInitPerformanceStruct.f59687d = newInitPerformanceStruct.b("reversion", com.tencent.mm.sdk.platformtools.z.f193109e, true);
            newInitPerformanceStruct.f59700q = newInitPerformanceStruct.b("sessionid", a17.f451366g, true);
            newInitPerformanceStruct.f59701r = (long) i17;
            newInitPerformanceStruct.f59702s = j17;
            x11.e0[] e0VarArr = x11.e0.f451357d;
            newInitPerformanceStruct.f59699p = 1;
            x11.b0.f451350a.a(newInitPerformanceStruct, null);
            newInitPerformanceStruct.k();
        } catch (java.lang.Throwable th8) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneInit.dkInit", th8, "report err", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int H(com.tencent.mm.network.s sVar, r45.cu5 cu5Var, r45.cu5 cu5Var2) {
        int i17;
        this.f442072e.append(" lastd:" + this.lastdispatch + " dotime:" + com.tencent.mm.sdk.platformtools.t8.i1() + " net:" + com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a));
        x11.z zVar = new x11.z();
        x11.t tVar = this.f442073f;
        tVar.getClass();
        if (cu5Var2 == null) {
            java.lang.Object l17 = gm0.j1.u().c().l(8198, null);
            cu5Var2 = x51.j1.a(com.tencent.mm.sdk.platformtools.t8.h(l17 instanceof java.lang.String ? (java.lang.String) l17 : null));
        }
        if (cu5Var == null) {
            java.lang.Object l18 = gm0.j1.u().c().l(8197, null);
            cu5Var = x51.j1.a(com.tencent.mm.sdk.platformtools.t8.h(l18 instanceof java.lang.String ? (java.lang.String) l18 : null));
        }
        o45.zg reqObj = zVar.getReqObj();
        if (reqObj != null) {
            java.lang.Object l19 = gm0.j1.u().c().l(16, null);
            if (com.tencent.mm.sdk.platformtools.t8.q1(l19 instanceof java.lang.Integer ? (java.lang.Integer) l19 : null) == 0 || (cu5Var != null && cu5Var.f371839d > 0)) {
                i17 = (w11.c2.f441991a.a().length == 0) != false ? 3 : 4;
            } else {
                i17 = 7;
            }
            reqObj.setSceneStatus(i17);
        }
        r45.iu4 iu4Var = tVar.f451396m;
        iu4Var.f377336e = cu5Var;
        iu4Var.f377337f = cu5Var2;
        x11.g gVar = x11.t.D;
        iu4Var.f377339h = gVar.c() ? 1 : 0;
        int wi6 = ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).wi();
        if (wi6 != 0) {
            iu4Var.f377340i = wi6;
        }
        o45.zg reqObj2 = zVar.getReqObj();
        o45.vh vhVar = reqObj2 instanceof o45.vh ? (o45.vh) reqObj2 : null;
        if (vhVar != null) {
            vhVar.f343022a = iu4Var;
        }
        ((jz5.n) x11.t.f451389J).getValue();
        java.lang.String str = "onNewInitDoScene isGetExptBeforeInit:" + gVar.b() + " ForceToInitContact:" + iu4Var.f377339h + " hash:%d time:%d count:%d user%s lan:%s status:%d cur[%s] max[%s] syncFlag:[%s]";
        java.lang.Object[] objArr = new java.lang.Object[9];
        objArr[0] = java.lang.Integer.valueOf(tVar.hashCode());
        objArr[1] = java.lang.Long.valueOf(tVar.a().a());
        objArr[2] = java.lang.Integer.valueOf(tVar.f451391e);
        objArr[3] = iu4Var.f377335d;
        objArr[4] = iu4Var.f377338g;
        o45.zg reqObj3 = zVar.getReqObj();
        objArr[5] = reqObj3 != null ? java.lang.Integer.valueOf(reqObj3.getSceneStatus()) : null;
        objArr[6] = com.tencent.mm.sdk.platformtools.t8.l(x51.j1.d(iu4Var.f377336e));
        objArr[7] = com.tencent.mm.sdk.platformtools.t8.l(x51.j1.d(iu4Var.f377337f));
        objArr[8] = java.lang.Integer.valueOf(iu4Var.f377340i);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", str, objArr);
        tVar.f451407x = java.lang.System.currentTimeMillis();
        tVar.f451391e++;
        trackState().h(1002);
        t4.a.a("NewInitNetwork", zVar.hashCode());
        return dispatch(sVar, zVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneInit.dkInit", "init cancel by :%s", new com.tencent.mm.sdk.platformtools.z3());
        super.cancel();
        this.f442073f.f451395i = true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        trackState().h(1001);
        x11.t tVar = this.f442073f;
        tVar.getClass();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().o0(true);
        x11.f0 a17 = tVar.a();
        a17.getClass();
        a17.f451362c = new fp.j();
        a17.f451363d = android.os.SystemClock.elapsedRealtime();
        a17.f451364e = 0L;
        java.lang.Object l17 = gm0.j1.u().c().l(2, null);
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        r45.iu4 iu4Var = tVar.f451396m;
        iu4Var.f377335d = str;
        iz5.a.g("by DK: req.UserName is null", !com.tencent.mm.sdk.platformtools.t8.K0(str));
        iu4Var.f377338g = com.tencent.mm.sdk.platformtools.m2.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "onNewInitStartScene() called");
        tVar.f451394h = u0Var;
        return H(sVar, null, null);
    }

    @Override // com.tencent.mm.modelbase.m1
    public java.lang.String getInfo() {
        return this.f442072e.toString();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getPriority() {
        return 99;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 139;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        boolean z17;
        boolean z18;
        t4.a.b("NewInitNetwork", v0Var.hashCode());
        trackState().h(1010);
        boolean z19 = gm0.j1.e().a() == android.os.Looper.myLooper();
        this.f442072e.append(" endtime:" + com.tencent.mm.sdk.platformtools.t8.i1());
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "summerinit onGYNetEnd [%d, %d, %s], tid:%d isWorker:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z19));
        x11.t tVar = this.f442073f;
        tVar.getClass();
        tVar.f451406w += java.lang.System.currentTimeMillis() - tVar.f451407x;
        if (i18 == 4 && (i19 == -100 || i19 == -2023)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd ERROR hash:%d [%d,%d] KICK OUT : %s", java.lang.Integer.valueOf(tVar.hashCode()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
            tVar.c(i18, i19, str);
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17) {
            w11.k0 k0Var = tVar.f451390d;
            if ((i18 == 0 && i19 == 0) || (i18 == 4 && i19 == -17)) {
                tVar.f451392f = 0;
                z18 = false;
            } else {
                int i27 = tVar.f451392f + 1;
                tVar.f451392f = i27;
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd ERROR consecutiveFailCount:%d hash:%d [%d,%d] %s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(tVar.hashCode()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                if (tVar.f451392f >= 3) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd ERROR consecutive fail reached max:%d, give up", 3);
                    tVar.c(3, -1, "");
                } else if (k0Var.H(k0Var.dispatcher(), null, null) == -1) {
                    tVar.c(3, -1, "");
                }
                z18 = true;
            }
            if (!z18) {
                o45.ah respObj = v0Var.getRespObj();
                o45.wh whVar = respObj instanceof o45.wh ? (o45.wh) respObj : null;
                r45.ju4 ju4Var = whVar != null ? whVar.f343035a : null;
                if (ju4Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneInit.dkInit", "resp is null");
                } else {
                    tVar.f451397n += ju4Var.f378115h;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "onProcessResp hash:%d time:%d cmdSum:%d doscenecount:%d conFlag:%d", java.lang.Integer.valueOf(tVar.hashCode()), java.lang.Long.valueOf(tVar.a().a()), java.lang.Integer.valueOf(tVar.f451397n), java.lang.Integer.valueOf(tVar.f451391e), java.lang.Integer.valueOf(ju4Var.f378113f));
                    java.util.Iterator it = ju4Var.f378116i.iterator();
                    while (it.hasNext()) {
                        r45.b50 b50Var = (r45.b50) it.next();
                        try {
                            if (b50Var.f370530d == 208) {
                                r45.aj6 aj6Var = new r45.aj6();
                                aj6Var.parseFrom(x51.j1.d(b50Var.f370531e));
                                int i28 = aj6Var.f370057d;
                                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SYNC_CONTROL_USE_INIT_CONTACT_INT_SYNC, java.lang.Integer.valueOf(i28));
                                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "processSyncControl() useInitContact:%s", java.lang.Integer.valueOf(i28));
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneInit.dkInit", th6, "processSyncControl() err", new java.lang.Object[0]);
                        }
                    }
                    mm.h hVar = mm.h.f328485a;
                    r45.ju4 ju4Var2 = ju4Var;
                    tVar.f(new x11.x(i18, i19, str, ju4Var, 0, 16, null));
                    if ((ju4Var2.f378113f & 7) == 0 || k0Var.securityLimitCountReach()) {
                        boolean b17 = tVar.b();
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "NewInit FINISH onGYNetEnd hash:%d time:%d netCnt:%d isNeedBatchGetContact:" + b17 + " initCount:" + tVar.f451391e + " initDoSceneCost:" + tVar.f451406w, java.lang.Integer.valueOf(tVar.hashCode()), java.lang.Long.valueOf(tVar.a().a()), java.lang.Integer.valueOf(tVar.f451391e));
                        if (b17) {
                            x11.f0 a17 = tVar.a();
                            a17.getClass();
                            try {
                                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "recordSupportInitRsp() called sessionId:" + a17.f451366g);
                                com.tencent.mm.autogen.mmdata.rpt.NewInitPerformanceStruct newInitPerformanceStruct = new com.tencent.mm.autogen.mmdata.rpt.NewInitPerformanceStruct();
                                newInitPerformanceStruct.f59687d = newInitPerformanceStruct.b("reversion", com.tencent.mm.sdk.platformtools.z.f193109e, true);
                                newInitPerformanceStruct.f59700q = newInitPerformanceStruct.b("sessionid", a17.f451366g, true);
                                x11.e0[] e0VarArr = x11.e0.f451357d;
                                newInitPerformanceStruct.f59699p = 2;
                                newInitPerformanceStruct.f59688e = a17.b();
                                x11.b0.f451350a.a(newInitPerformanceStruct, null);
                                newInitPerformanceStruct.k();
                            } catch (java.lang.Throwable th7) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneInit.dkInit", th7, "recordSupportInitRsp err", new java.lang.Object[0]);
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "tryBatchGetContact() called");
                            java.util.concurrent.ExecutorService newFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(1, x11.r.f451386d);
                            kotlin.jvm.internal.o.d(newFixedThreadPool);
                            kotlinx.coroutines.g2 g2Var = new kotlinx.coroutines.g2(newFixedThreadPool);
                            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
                            if (lifecycleScope != null) {
                                kotlinx.coroutines.l.d(lifecycleScope, g2Var, null, new x11.q(tVar, g2Var, null), 2, null);
                            }
                        } else {
                            tVar.e(true);
                        }
                    } else if (k0Var.H(k0Var.dispatcher(), ju4Var2.f378111d, ju4Var2.f378112e) == -1) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneInit.dkInit", "doScene Failed stop init");
                        tVar.e(false);
                    }
                }
            }
        }
        trackState().h(1011);
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean profileEnabled() {
        return q01.a1.f359259a.b();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 4000;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean uniqueInNetsceneQueue() {
        return true;
    }
}
