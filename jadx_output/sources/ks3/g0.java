package ks3;

/* loaded from: classes2.dex */
public class g0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f311676d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f311677e;

    public g0() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3889;
        lVar.f70664a = new ks3.t0();
        lVar.f70665b = new ks3.u0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/unbindxmail";
        this.f311676d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f311677e = u0Var;
        return dispatch(sVar, this.f311676d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3889;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f311677e.onSceneEnd(i18, i19, str, this);
    }
}
