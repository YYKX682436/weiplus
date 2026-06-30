package ss4;

/* loaded from: classes2.dex */
public class l extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412085d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412086e;

    /* renamed from: f, reason: collision with root package name */
    public r45.pm3 f412087f;

    public l() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.om3 om3Var = new r45.om3();
        om3Var.f382357d = c01.id.c();
        lVar.f70664a = om3Var;
        lVar.f70665b = new r45.pm3();
        lVar.f70667d = 2860;
        lVar.f70666c = "/cgi-bin/mmpay-bin/getreceiptassisplugin";
        this.f412085d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f412086e = u0Var;
        return dispatch(sVar, this.f412085d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2860;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetReceipAssistPlugin", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f412087f = (r45.pm3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        }
        this.f412086e.onSceneEnd(i18, i19, str, this);
    }
}
