package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes8.dex */
public class k extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156870d;

    /* renamed from: e, reason: collision with root package name */
    public r45.so f156871e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156872f;

    public k(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, com.tencent.mm.protobuf.g gVar, java.lang.String str4) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ro();
        lVar.f70665b = new r45.so();
        lVar.f70667d = 1680;
        lVar.f70666c = "/cgi-bin/mmpay-bin/busif2factqry";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f156870d = a17;
        r45.ro roVar = (r45.ro) a17.f70710a.f70684a;
        roVar.f385035f = str3;
        roVar.f385033d = str;
        roVar.f385034e = str2;
        roVar.f385036g = i17;
        roVar.f385037h = gVar;
        roVar.f385038i = str4;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fActQry", "NetSceneBusiF2fPayCheck, f2fId: %s, transId: %s, amount: %s", str, str2, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f156872f = u0Var;
        return dispatch(sVar, this.f156870d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1680;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fActQry", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.so soVar = (r45.so) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156871e = soVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fActQry", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(soVar.f385875d), this.f156871e.f385876e);
        com.tencent.mm.modelbase.u0 u0Var = this.f156872f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
