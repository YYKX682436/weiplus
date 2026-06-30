package dp3;

/* loaded from: classes8.dex */
public class m extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f242221d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f242222e;

    public m(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.w55();
        lVar.f70665b = new r45.x55();
        lVar.f70666c = "/cgi-bin/micromsg-bin/paydeluserroll";
        lVar.f70667d = nd1.p1.CTRL_INDEX;
        lVar.f70668e = 187;
        lVar.f70669f = 1000000187;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f242222e = a17;
        r45.w55 w55Var = (r45.w55) a17.f70710a.f70684a;
        w55Var.f388899d = i17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            w55Var.f388900e = str;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            w55Var.f388902g = str2;
        }
        w55Var.f388903h = at4.g0.c();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f242221d = u0Var;
        return dispatch(sVar, this.f242222e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return nd1.p1.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        this.f242221d.onSceneEnd(i18, i19, str, this);
    }
}
