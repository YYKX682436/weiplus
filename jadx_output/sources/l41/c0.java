package l41;

/* loaded from: classes11.dex */
public class c0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315785d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315786e;

    /* renamed from: f, reason: collision with root package name */
    public final int f315787f;

    /* renamed from: g, reason: collision with root package name */
    public final xg3.q0 f315788g;

    public c0(xg3.q0 q0Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.z05();
        lVar.f70665b = new r45.a15();
        lVar.f70666c = "/cgi-bin/micromsg-bin/openimoplog";
        lVar.f70667d = 806;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315786e = a17;
        int i17 = q0Var.f454427f;
        this.f315787f = i17;
        this.f315788g = q0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneOpenIMOPLog", "type: %d", java.lang.Integer.valueOf(i17));
        r45.z05 z05Var = (r45.z05) a17.f70710a.f70684a;
        z05Var.f391570d = i17;
        z05Var.f391571e = new com.tencent.mm.protobuf.g(q0Var.a());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315785d = u0Var;
        return dispatch(sVar, this.f315786e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 806;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneOpenIMOPLog", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, opType:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(this.f315787f));
        this.f315785d.onSceneEnd(i18, i19, str, this);
    }
}
