package wt4;

/* loaded from: classes2.dex */
public class b extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f449531d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f449532e;

    public b(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.e75();
        lVar.f70665b = new r45.f75();
        lVar.f70666c = "/cgi-bin/mmpay-bin/payudeluserroll";
        lVar.f70667d = 1544;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f449532e = a17;
        r45.e75 e75Var = (r45.e75) a17.f70710a.f70684a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        e75Var.f373077d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f449531d = u0Var;
        return dispatch(sVar, this.f449532e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1544;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        this.f449531d.onSceneEnd(i18, i19, str, this);
    }
}
