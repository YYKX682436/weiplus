package ww1;

/* loaded from: classes4.dex */
public class o1 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f450255d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f450256e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bw f450257f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f450258g;

    /* renamed from: h, reason: collision with root package name */
    public final int f450259h;

    /* renamed from: i, reason: collision with root package name */
    public final long f450260i;

    /* renamed from: m, reason: collision with root package name */
    public long f450261m;

    /* renamed from: n, reason: collision with root package name */
    public final long f450262n;

    public o1(int i17, int i18, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, java.lang.String str, int i19, long j17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.aw();
        lVar.f70665b = new r45.bw();
        lVar.f70667d = tb1.n0.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/mmpay-bin/getf2frcvvoice";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f450255d = a17;
        r45.aw awVar = (r45.aw) a17.f70710a.f70684a;
        awVar.f370288d = i17;
        awVar.f370292h = i18;
        awVar.f370291g = str;
        awVar.f370289e = gVar;
        awVar.f370290f = gVar2;
        this.f450258g = str;
        this.f450259h = i19;
        this.f450260i = j17;
        this.f450262n = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2FRcvVoice", "amount: %d, outtradeno: %s", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f450256e = u0Var;
        return dispatch(sVar, this.f450255d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return tb1.n0.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2FRcvVoice", "errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.bw bwVar = (r45.bw) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f450257f = bwVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(bwVar.f371088d);
        r45.bw bwVar2 = this.f450257f;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2FRcvVoice", "ret_code: %d, ret_msg: %s，voice_type: %d", valueOf, bwVar2.f371089e, java.lang.Integer.valueOf(bwVar2.f371091g));
        this.f450261m = java.lang.System.currentTimeMillis() - this.f450262n;
        com.tencent.mm.modelbase.u0 u0Var = this.f450256e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
