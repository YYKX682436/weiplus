package ks3;

/* loaded from: classes2.dex */
public class e0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f311661d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f311662e;

    public e0(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3848;
        ks3.l0 l0Var = new ks3.l0();
        l0Var.f311714d = str;
        lVar.f70664a = l0Var;
        lVar.f70665b = new ks3.m0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/preparebindxmail";
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePrepareBindXmail", "bindQQMail %s", str);
        this.f311661d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f311662e = u0Var;
        return dispatch(sVar, this.f311661d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3848;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f311662e.onSceneEnd(i18, i19, str, this);
    }
}
