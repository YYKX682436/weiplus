package p83;

/* loaded from: classes4.dex */
public class h extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f352750d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ke5 f352751e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f352752f = null;

    public h(int i17, long j17, long j18) {
        this.f352750d = null;
        this.f352751e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ke5();
        lVar.f70665b = new r45.le5();
        lVar.f70667d = 824;
        lVar.f70666c = "/cgi-bin/micromsg-bin/pstnheartbeat";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f352750d = a17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.ke5 ke5Var = (r45.ke5) a17.f70710a.f70684a;
        this.f352751e = ke5Var;
        ke5Var.f378625d = i17;
        ke5Var.f378626e = j17;
        ke5Var.f378628g = j18;
        ke5Var.f378627f = currentTimeMillis;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f352752f = u0Var;
        return dispatch(sVar, this.f352750d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 824;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallHeartBeat", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.u0 u0Var = this.f352752f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
