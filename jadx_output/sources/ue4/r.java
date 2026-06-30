package ue4;

@j95.b(dependencies = {com.tencent.mm.plugin.zero.m1.class})
/* loaded from: classes12.dex */
public class r extends i95.w implements ue4.m {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sport.model.m f426920g;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sport.model.d[] f426917d = {null};

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sport.model.f[] f426918e = {null};

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.sport.model.s f426919f = new ue4.o(this);

    /* renamed from: h, reason: collision with root package name */
    public final android.content.BroadcastReceiver f426921h = new ue4.q(this);

    public com.tencent.mm.plugin.sport.model.f Ai() {
        if (this.f426918e[0] == null && gm0.j1.a()) {
            synchronized (this.f426918e) {
                com.tencent.mm.plugin.sport.model.f[] fVarArr = this.f426918e;
                if (fVarArr[0] == null) {
                    fVarArr[0] = new com.tencent.mm.plugin.sport.model.f();
                }
            }
        }
        return this.f426918e[0];
    }

    public com.tencent.mm.plugin.sport.model.m Bi() {
        if (com.tencent.mm.sdk.platformtools.x2.p() && this.f426920g == null) {
            this.f426920g = new com.tencent.mm.plugin.sport.model.m();
        }
        return this.f426920g;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        wi();
        Ai();
        com.tencent.mm.plugin.sport.model.s sVar = this.f426919f;
        com.tencent.mm.plugin.sport.model.t.f171815d = sVar;
        ue4.o oVar = (ue4.o) sVar;
        oVar.getClass();
        if (gm0.j1.a()) {
            oVar.f426914a.wi().b();
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.plugin.sport.uploadstep");
        boolean a17 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.f426921h;
        if (a17) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
        ot0.r.f348755a.add(new ue4.n(this));
        if (gm0.j1.a()) {
            ((ue4.r) i95.n0.c(ue4.r.class)).wi().c(com.tencent.mm.plugin.sport.model.t.c().toString());
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(this.f426921h);
        com.tencent.mm.plugin.sport.model.t.f171815d = null;
        synchronized (this.f426917d) {
            com.tencent.mm.plugin.sport.model.d dVar = this.f426917d[0];
            if (dVar != null) {
                dVar.f171776a.b();
                if (dVar.f171777b != null) {
                    gm0.j1.d().d(dVar.f171777b);
                }
                this.f426917d[0] = null;
            }
        }
        synchronized (this.f426918e) {
            com.tencent.mm.plugin.sport.model.f fVar = this.f426918e[0];
            if (fVar != null) {
                if (fVar.f171781a != null) {
                    gm0.j1.d().d(fVar.f171781a);
                }
                this.f426918e[0] = null;
            }
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        com.tencent.mm.plugin.sport.model.u uVar;
        com.tencent.mm.plugin.sport.model.u uVar2;
        java.lang.String str;
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            com.tencent.mm.plugin.sport.model.z zVar = com.tencent.mm.plugin.sport.model.z.f171826a;
            java.lang.String str2 = com.tencent.mm.plugin.sport.model.z.f171828c;
            if (com.tencent.mm.vfs.w6.j(str2)) {
                try {
                    uVar = new com.tencent.mm.plugin.sport.model.u(str2);
                } catch (java.lang.OutOfMemoryError e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Sport.SportKvStorage", e17, "", new java.lang.Object[0]);
                    java.lang.String str3 = com.tencent.mm.plugin.sport.model.z.f171828c;
                    com.tencent.mm.vfs.w6.h(str3);
                    uVar = new com.tencent.mm.plugin.sport.model.u(str3);
                }
                com.tencent.mm.plugin.sport.model.x xVar = new com.tencent.mm.plugin.sport.model.x();
                xVar.f171818a = uVar.d(202, 0L) * 10000;
                xVar.f171823f = uVar.d(201, 0L);
                xVar.f171822e = uVar.d(203, 0L);
                xVar.f171819b = uVar.d(204, 0L);
                xVar.f171821d = uVar.d(209, 0L);
                xVar.f171824g = xVar.f171823f;
                xVar.f171820c = xVar.f171819b;
                zVar.c().D("KEY_STEP_DETAIL_INFO", xVar.toString());
                java.lang.String str4 = com.tencent.mm.plugin.sport.model.z.f171828c;
                com.tencent.mm.vfs.w6.h(str4);
                com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportKvStorage", "compat first file:" + str4 + " detailInfo:" + xVar);
            }
            java.lang.String str5 = com.tencent.mm.plugin.sport.model.z.f171829d;
            if (com.tencent.mm.vfs.w6.j(str5)) {
                try {
                    uVar2 = new com.tencent.mm.plugin.sport.model.u(str5);
                } catch (java.lang.OutOfMemoryError e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Sport.SportKvStorage", e18, "", new java.lang.Object[0]);
                    java.lang.String str6 = com.tencent.mm.plugin.sport.model.z.f171829d;
                    com.tencent.mm.vfs.w6.h(str6);
                    uVar2 = new com.tencent.mm.plugin.sport.model.u(str6);
                }
                str = "";
                synchronized (uVar2) {
                    if (uVar2.i()) {
                        com.tencent.mm.storage.m3 m3Var = uVar2.f195049i;
                        str = m3Var.c(301, "") instanceof java.lang.String ? (java.lang.String) m3Var.c(301, "") : "";
                    } else {
                        try {
                            java.lang.Object a17 = uVar2.a(301);
                            if (a17 instanceof java.lang.String) {
                                str = (java.lang.String) a17;
                            }
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }
                com.tencent.mm.plugin.sport.model.x xVar2 = new com.tencent.mm.plugin.sport.model.x();
                kotlin.jvm.internal.o.d(str);
                xVar2.a(str);
                zVar.c().D("KEY_STEP_DETAIL_INFO", xVar2.toString());
                java.lang.String str7 = com.tencent.mm.plugin.sport.model.z.f171829d;
                com.tencent.mm.vfs.w6.h(str7);
                com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportKvStorage", "compat second file:" + str7 + " detailInfo:" + xVar2);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.mm.sdk.platformtools.x2.p()) {
            com.tencent.mm.plugin.sport.model.SportForegroundService.a();
        }
    }

    public com.tencent.mm.plugin.sport.model.d wi() {
        if (this.f426917d[0] == null && gm0.j1.a()) {
            synchronized (this.f426917d) {
                com.tencent.mm.plugin.sport.model.d[] dVarArr = this.f426917d;
                if (dVarArr[0] == null) {
                    dVarArr[0] = new com.tencent.mm.plugin.sport.model.d();
                }
            }
        }
        return this.f426917d[0];
    }
}
