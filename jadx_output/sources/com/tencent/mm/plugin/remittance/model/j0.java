package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes2.dex */
public class j0 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156862d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pq4 f156863e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156864f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f156865g;

    public j0(java.lang.String str, long j17, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("Micromsg.NetSceneRemittanceMsgCheck", "transferID: %s, amount:%s msgCheckStr:%s", str, java.lang.Long.valueOf(j17), str2);
        this.f156865g = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.oq4();
        lVar.f70665b = new r45.pq4();
        lVar.f70667d = 6230;
        lVar.f70666c = "/cgi-bin/mmpay-bin/transfermsgcheck";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f156862d = a17;
        r45.oq4 oq4Var = (r45.oq4) a17.f70710a.f70684a;
        oq4Var.f382447d = str;
        oq4Var.f382448e = j17;
        oq4Var.f382449f = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f156864f = u0Var;
        return dispatch(sVar, this.f156862d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6230;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("Micromsg.NetSceneRemittanceMsgCheck", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.pq4 pq4Var = (r45.pq4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156863e = pq4Var;
        com.tencent.mars.xlog.Log.i("Micromsg.NetSceneRemittanceMsgCheck", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(pq4Var.f383310d), this.f156863e.f383311e);
        com.tencent.mm.modelbase.u0 u0Var = this.f156864f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
