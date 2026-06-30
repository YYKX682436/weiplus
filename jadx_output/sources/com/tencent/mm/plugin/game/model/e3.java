package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class e3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f140303d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f140304e;

    public e3(java.lang.String str, java.util.LinkedList linkedList, com.tencent.mm.plugin.game.model.e1 e1Var, com.tencent.mm.plugin.game.model.e1 e1Var2, com.tencent.mm.plugin.game.model.e1 e1Var3, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetGameIndex4", "lang = " + str + ", installedApp list size: " + linkedList.size());
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetGameIndex4", "install id:[%s]", (java.lang.String) it.next());
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new m53.z1();
        lVar.f70665b = new m53.a2();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getgameindex4";
        lVar.f70667d = 2994;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f140304e = a17;
        m53.z1 z1Var = (m53.z1) a17.f70710a.f70684a;
        z1Var.f324219d = str;
        z1Var.f324220e = linkedList;
        java.lang.String d17 = com.tencent.mm.plugin.game.model.f.d(com.tencent.mm.sdk.platformtools.x2.f193071a);
        d17 = com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.game.model.v.f140488a) ? com.tencent.mm.sdk.platformtools.t8.K0(d17) ? com.tencent.mm.sdk.platformtools.t8.d0(com.tencent.mm.sdk.platformtools.x2.f193071a) : d17 : com.tencent.mm.plugin.game.model.v.f140488a;
        z1Var.f324221f = d17;
        e1Var = e1Var == null ? e1Var2 != null ? e1Var2 : e1Var3 != null ? e1Var3 : null : e1Var;
        m53.h0 h0Var = new m53.h0();
        z1Var.f324222g = h0Var;
        if (e1Var != null) {
            h0Var.f323737d = e1Var.f140279d2.f140410a;
            h0Var.f323738e = e1Var.field_appId;
            h0Var.f323740g = e1Var.T2;
            h0Var.f323741h = e1Var.S2;
        }
        if (e1Var2 != null) {
            h0Var.f323739f |= 1;
        }
        if (e1Var3 != null) {
            h0Var.f323739f |= 2;
        }
        z1Var.f324223h = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().d1();
        z1Var.f324224i = z17;
        z1Var.f324225m = com.tencent.mm.sdk.platformtools.a0.c() ? 1 : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetGameIndex4", "Country Code: %s", d17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(z1Var.f324221f) || "CN".equalsIgnoreCase(z1Var.f324221f)) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(860L, 7L, 1L, false);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f140303d = u0Var;
        return dispatch(sVar, this.f140304e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2994;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetGameIndex4", "errType = " + i18 + ", errCode = " + i19);
        this.f140303d.onSceneEnd(i18, i19, str, this);
    }
}
