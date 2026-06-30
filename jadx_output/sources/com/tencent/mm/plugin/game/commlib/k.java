package com.tencent.mm.plugin.game.commlib;

/* loaded from: classes8.dex */
public class k extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f139386d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f139387e;

    public k(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new m53.u1();
        lVar.f70665b = new com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getgamecenterglobalsetting";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.pay.s.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f139387e = a17;
        m53.u1 u1Var = (m53.u1) a17.f70710a.f70684a;
        u1Var.f324085d = com.tencent.mm.sdk.platformtools.m2.d();
        ((com.tencent.mm.plugin.game.h0) m33.a1.a()).getClass();
        java.lang.String d17 = com.tencent.mm.plugin.game.model.f.d(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.f324086e = com.tencent.mm.sdk.platformtools.t8.K0(d17) ? com.tencent.mm.sdk.platformtools.t8.d0(com.tencent.mm.sdk.platformtools.x2.f193071a) : d17;
        u1Var.f324087f = com.tencent.mm.sdk.platformtools.a0.f192439b;
        m53.g gVar = new m53.g();
        u1Var.f324088g = gVar;
        gVar.f323687d = android.os.Build.VERSION.SDK_INT;
        gVar.f323688e = y7.c.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.f324089h = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetGameGlobalConfig", "lang=%s, country=%s, releaseChannel=%s, osVersion = %d, deviceLevel = %d, scene:%d", u1Var.f324085d, u1Var.f324086e, java.lang.Integer.valueOf(u1Var.f324087f), java.lang.Integer.valueOf(u1Var.f324088g.f323687d), java.lang.Integer.valueOf(u1Var.f324088g.f323688e), java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f139386d = u0Var;
        return dispatch(sVar, this.f139387e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.pay.s.CTRL_INDEX;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r4, int r5, int r6, java.lang.String r7, com.tencent.mm.network.v0 r8, byte[] r9) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.commlib.k.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
