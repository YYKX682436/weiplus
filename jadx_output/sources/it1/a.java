package it1;

/* loaded from: classes5.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f294496d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f294497e;

    /* renamed from: f, reason: collision with root package name */
    public final int f294498f;

    /* renamed from: g, reason: collision with root package name */
    public final xg3.q0 f294499g;

    public a(xg3.q0 q0Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.or();
        lVar.f70665b = new r45.pr();
        lVar.f70666c = "/cgi-bin/micromsg-bin/bypoplog";
        lVar.f70667d = 12607;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f294497e = a17;
        int i17 = q0Var.f454427f;
        this.f294498f = i17;
        this.f294499g = q0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBypOPLog", "opType: %d", java.lang.Integer.valueOf(i17));
        r45.or orVar = (r45.or) a17.f70710a.f70684a;
        orVar.set(1, java.lang.Integer.valueOf((int) q0Var.f454428g));
        orVar.set(2, java.lang.Integer.valueOf(i17));
        orVar.set(3, new com.tencent.mm.protobuf.g(q0Var.a()));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f294496d = u0Var;
        return dispatch(sVar, this.f294497e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.network.v0 getReqResp() {
        return this.f294497e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 12607;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBypOPLog", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, opType:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(this.f294498f));
        this.f294496d.onSceneEnd(i18, i19, str, this);
    }
}
