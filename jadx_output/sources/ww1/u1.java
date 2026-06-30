package ww1;

/* loaded from: classes4.dex */
public class u1 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f450303d;

    /* renamed from: e, reason: collision with root package name */
    public r45.sw f450304e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f450305f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f450306g;

    public u1(int i17, int i18, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rw();
        lVar.f70665b = new r45.sw();
        lVar.f70667d = 1317;
        lVar.f70666c = "/cgi-bin/mmpay-bin/getmdrcvvoice";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f450303d = a17;
        r45.rw rwVar = (r45.rw) a17.f70710a.f70684a;
        rwVar.f385230d = i17;
        rwVar.f385234h = i18;
        rwVar.f385233g = str;
        rwVar.f385231e = gVar;
        rwVar.f385232f = gVar2;
        this.f450306g = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMDRcvVoice", "amount: %d, outtradeno: %s", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f450305f = u0Var;
        return dispatch(sVar, this.f450303d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1317;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMDRcvVoice", "errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.sw swVar = (r45.sw) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f450304e = swVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(swVar.f385992d);
        r45.sw swVar2 = this.f450304e;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMDRcvVoice", "ret_code: %d, ret_msg: %s，voice_type: %d", valueOf, swVar2.f385993e, java.lang.Integer.valueOf(swVar2.f385995g));
        com.tencent.mm.modelbase.u0 u0Var = this.f450305f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
