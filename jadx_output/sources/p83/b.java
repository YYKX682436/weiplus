package p83;

/* loaded from: classes8.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f352731d;

    /* renamed from: e, reason: collision with root package name */
    public r45.je5 f352732e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f352733f;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        this.f352731d = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ie5();
        lVar.f70665b = new r45.je5();
        lVar.f70667d = 807;
        lVar.f70666c = "/cgi-bin/micromsg-bin/pstnchecknumber";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f352731d = a17;
        r45.ie5 ie5Var = (r45.ie5) a17.f70710a.f70684a;
        ie5Var.f376970d = str;
        ie5Var.f376972f = str2;
        ie5Var.f376974h = str3;
        ie5Var.f376973g = str4;
        ie5Var.f376975i = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallCheckNumber", "NetSceneIPCallCheckNumber pureNumber:%s,lastCountry:%s,osCountry:%s,simCountry:%s,dialScene:%d", str, str2, str3, str4, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f352733f = u0Var;
        return dispatch(sVar, this.f352731d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 807;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallCheckNumber", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f352732e = (r45.je5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f352733f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
