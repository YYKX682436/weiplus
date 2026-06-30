package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes8.dex */
public class w extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f157045d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f157046e;

    public w(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.tw();
        lVar.f70665b = new r45.uw();
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.x4.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/mmpay-bin/f2fpaycheck";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f157045d = a17;
        r45.tw twVar = (r45.tw) a17.f70710a.f70684a;
        twVar.f386826d = str;
        twVar.f386827e = str2;
        twVar.f386828f = str3;
        twVar.f386829g = str4;
        twVar.f386830h = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f157046e = u0Var;
        return dispatch(sVar, this.f157045d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.x4.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2fPayCheck", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f157046e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
