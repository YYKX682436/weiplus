package p83;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f352728d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ge5 f352729e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f352730f = null;

    public a(int i17, long j17, java.lang.String str, java.lang.String str2, int i18, long j18) {
        this.f352728d = null;
        this.f352729e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ge5();
        lVar.f70665b = new r45.he5();
        lVar.f70667d = gd1.s.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/micromsg-bin/pstncancelinvite";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f352728d = a17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.ge5 ge5Var = (r45.ge5) a17.f70710a.f70684a;
        this.f352729e = ge5Var;
        ge5Var.f375169d = i17;
        ge5Var.f375170e = j17;
        ge5Var.f375171f = str;
        ge5Var.f375172g = currentTimeMillis;
        ge5Var.f375173h = i18;
        ge5Var.f375174i = str2;
        ge5Var.f375175m = j18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f352730f = u0Var;
        return dispatch(sVar, this.f352728d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return gd1.s.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallCancel", "errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.u0 u0Var = this.f352730f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
