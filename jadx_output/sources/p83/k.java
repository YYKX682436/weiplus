package p83;

/* loaded from: classes4.dex */
public class k extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f352760d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.pe5 f352761e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qe5 f352762f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f352763g = null;

    public k(int i17, long j17, long j18) {
        this.f352760d = null;
        this.f352761e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pe5();
        lVar.f70665b = new r45.qe5();
        lVar.f70667d = 726;
        lVar.f70666c = "/cgi-bin/micromsg-bin/pstnredirect";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f352760d = a17;
        r45.pe5 pe5Var = (r45.pe5) a17.f70710a.f70684a;
        this.f352761e = pe5Var;
        pe5Var.f382983d = i17;
        pe5Var.f382984e = j17;
        pe5Var.f382985f = j18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f352763g = u0Var;
        return dispatch(sVar, this.f352760d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 726;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallRedirect", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f352762f = (r45.qe5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f352763g;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
