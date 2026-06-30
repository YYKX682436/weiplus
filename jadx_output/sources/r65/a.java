package r65;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f393067d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f393068e;

    public a(int i17) {
        int i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vp3();
        lVar.f70665b = new r45.wp3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getupdateinfo";
        lVar.f70667d = 113;
        lVar.f70668e = 35;
        lVar.f70669f = 1000000035;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f393067d = a17;
        r45.vp3 vp3Var = (r45.vp3) a17.f70710a.f70684a;
        vp3Var.f388419d = i17;
        vp3Var.f388420e = com.tencent.mm.sdk.platformtools.a0.f192439b;
        if (10012 == x51.o1.f452064q && (i18 = x51.o1.f452065r) > 0) {
            vp3Var.f388420e = i18;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 3L, 1L, true);
        } else if (i17 == 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 4L, 1L, true);
        } else if (i17 == 3) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 5L, 1L, true);
        } else if (i17 == 4) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 6L, 1L, true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetUpdateInfo", "summerupdate dkchan NetSceneGetUpdateInfo updateType:%d channel:%d release:%d, stack[%s]", java.lang.Integer.valueOf(vp3Var.f388419d), java.lang.Integer.valueOf(vp3Var.f388420e), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.a0.f192439b), new com.tencent.mm.sdk.platformtools.z3());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f393068e = u0Var;
        return dispatch(sVar, this.f393067d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 11;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken GetUpdateInfo onGYNetEnd errType[%d], errCode[%d], errMsg[%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 7L, 1L, true);
        } else {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(405L, 8L, 1L, true);
            if (i18 == 4) {
                g0Var.idkeyStat(405L, 9L, 1L, true);
                if (i19 == -16) {
                    g0Var.idkeyStat(405L, 10L, 1L, true);
                } else if (i19 == -17) {
                    g0Var.idkeyStat(405L, 11L, 1L, true);
                } else if (i19 == -18) {
                    g0Var.idkeyStat(405L, 12L, 1L, true);
                }
            }
        }
        this.f393068e.onSceneEnd(i18, i19, str, this);
        java.lang.String str2 = ((r45.wp3) this.f393067d.f70711b.f70700a).f389370m;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchXml is null!");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 14L, 1L, true);
            return;
        }
        uk.m a17 = uk.m.a(str2);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchInfo is null patchXml[%s]", str2);
            return;
        }
        int i27 = a17.f428508c;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchVersionCode[%d]", java.lang.Integer.valueOf(i27));
        gm0.j1.n().f273288b.g(new com.tencent.mm.modelsimple.n1(com.tencent.mm.sdk.platformtools.x2.f193072b, i27));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 13L, 1L, true);
    }
}
