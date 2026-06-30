package com.tencent.mm.wallet_core.model;

/* loaded from: classes8.dex */
public class b1 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f213863d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f213864e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f213865f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f213866g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f213867h;

    public b1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.dc5();
        lVar.f70665b = new r45.ec5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/preparepurchase";
        lVar.f70667d = com.tencent.wxmm.v2helper.EMethodOutputVolumeGainEnable;
        lVar.f70668e = 214;
        lVar.f70669f = 1000000214;
        lVar.f70678o = 1;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f213863d = a17;
        r45.dc5 dc5Var = (r45.dc5) a17.f70710a.f70684a;
        this.f213865f = str;
        dc5Var.f372308d = str;
        this.f213867h = str2;
        dc5Var.f372309e = str2;
        this.f213866g = str3;
        dc5Var.f372310f = str3;
        dc5Var.f372311g = i18;
        dc5Var.f372313i = i17;
        dc5Var.f372312h = str4;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f213864e = u0Var;
        return dispatch(sVar, this.f213863d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.wxmm.v2helper.EMethodOutputVolumeGainEnable;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.NetScenePreparePurchase", "ErrType:" + i18 + ",errCode:" + i19 + ",errMsg:" + str);
        if (i18 == 0 && i19 == 0) {
            this.f213864e.onSceneEnd(i18, i19, str, this);
        } else {
            this.f213864e.onSceneEnd(i18, i19, str, this);
        }
    }

    public b1(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.dc5();
        lVar.f70665b = new r45.ec5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/preparepurchase";
        lVar.f70667d = com.tencent.wxmm.v2helper.EMethodOutputVolumeGainEnable;
        lVar.f70668e = 214;
        lVar.f70669f = 1000000214;
        lVar.f70678o = 1;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f213863d = a17;
        r45.dc5 dc5Var = (r45.dc5) a17.f70710a.f70684a;
        this.f213865f = str;
        dc5Var.f372308d = str;
        this.f213867h = str2;
        dc5Var.f372309e = str2;
        dc5Var.f372311g = i17;
    }
}
