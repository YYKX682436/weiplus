package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class t extends com.tencent.mm.wallet_core.model.d1 implements np5.d, com.tencent.mm.wallet_core.model.t {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f157014d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ip f157015e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f157016f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f157017g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f157018h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f157019i;

    public t(r45.an6 an6Var, r45.k6 k6Var, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.hp();
        lVar.f70665b = new r45.ip();
        lVar.f70667d = 2682;
        lVar.f70666c = "/cgi-bin/mmpay-bin/busif2fzerocallback";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f157014d = a17;
        r45.hp hpVar = (r45.hp) a17.f70710a.f70684a;
        hpVar.f376348e = k6Var;
        hpVar.f376347d = an6Var;
        hpVar.f376349f = str;
        hpVar.f376350g = i17;
        hpVar.f376351h = str2;
        this.f157019i = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fZeroCallback", "NetSceneBusiF2fZeroCallback, token %s AfterPlaceOrderCommReq %s zero_pay_extend: %s", str2, com.tencent.mm.plugin.remittance.model.a.b(k6Var), str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f157016f = u0Var;
        return dispatch(sVar, this.f157014d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2682;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fZeroCallback", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.ip ipVar = (r45.ip) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f157015e = ipVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fZeroCallback", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(ipVar.f377226d), this.f157015e.f377227e);
        com.tencent.mm.modelbase.u0 u0Var = this.f157016f;
        if (u0Var != null) {
            this.f157017g = this.f157015e.f377228f == 1;
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
