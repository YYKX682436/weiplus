package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class f3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f140312d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f140313e;

    public f3(java.lang.String str, java.util.LinkedList linkedList, com.tencent.mm.plugin.game.model.e1 e1Var, com.tencent.mm.plugin.game.model.e1 e1Var2, com.tencent.mm.plugin.game.model.e1 e1Var3, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "lang = " + str + ", installedApp list size: " + linkedList.size());
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "install id:[%s]", (java.lang.String) it.next());
        }
        m53.d2 d2Var = new m53.d2();
        d2Var.f323615d = str;
        d2Var.f323616e = linkedList;
        java.lang.String d17 = com.tencent.mm.plugin.game.model.f.d(com.tencent.mm.sdk.platformtools.x2.f193071a);
        d17 = com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.game.model.v.f140488a) ? com.tencent.mm.sdk.platformtools.t8.K0(d17) ? com.tencent.mm.sdk.platformtools.t8.d0(com.tencent.mm.sdk.platformtools.x2.f193071a) : d17 : com.tencent.mm.plugin.game.model.v.f140488a;
        d2Var.f323617f = d17;
        e1Var = e1Var == null ? e1Var2 != null ? e1Var2 : e1Var3 != null ? e1Var3 : null : e1Var;
        m53.h0 h0Var = new m53.h0();
        d2Var.f323618g = h0Var;
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
        d2Var.f323619h = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().d1();
        d2Var.f323620i = z17;
        d2Var.f323621m = com.tencent.mm.sdk.platformtools.a0.c() ? 1 : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "Country Code: %s", d17);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = d2Var;
        lVar.f70665b = new m53.e2();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getgameindexdownloadguidance";
        lVar.f70667d = 2586;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f140312d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f140313e = u0Var;
        return dispatch(sVar, this.f140312d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2586;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "errType = " + i18 + ", errCode = " + i19);
        this.f140313e.onSceneEnd(i18, i19, str, this);
    }
}
