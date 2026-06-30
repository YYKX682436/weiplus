package p83;

/* loaded from: classes8.dex */
public class o extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f352771d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ve5 f352772e;

    /* renamed from: f, reason: collision with root package name */
    public r45.we5 f352773f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f352774g;

    public o(int i17, long j17, int i18, long j18, boolean z17) {
        this.f352771d = null;
        this.f352772e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ve5();
        lVar.f70665b = new r45.we5();
        lVar.f70667d = 819;
        lVar.f70666c = "/cgi-bin/micromsg-bin/pstnsync";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f352771d = a17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.ve5 ve5Var = (r45.ve5) a17.f70710a.f70684a;
        this.f352772e = ve5Var;
        ve5Var.f388166d = c01.z1.r();
        ve5Var.f388167e = i17;
        ve5Var.f388168f = j17;
        ve5Var.f388169g = currentTimeMillis;
        ve5Var.f388170h = i18;
        ve5Var.f388171i = j18;
        if (z17) {
            ve5Var.f388172m = 1;
        } else {
            ve5Var.f388172m = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallSync", "roomId: %d, roomKey: %d, syncKey: %d, callSeq: %d,dataFlag: %d, timestamp: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(ve5Var.f388172m), java.lang.Long.valueOf(currentTimeMillis));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f352774g = u0Var;
        return dispatch(sVar, this.f352771d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 819;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallSync", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f352773f = (r45.we5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f352774g.onSceneEnd(i18, i19, str, this);
    }
}
