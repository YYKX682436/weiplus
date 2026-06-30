package dp3;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f242219d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f242220e;

    public l(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ml0();
        lVar.f70665b = new r45.nl0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/evaluateorder";
        lVar.f70667d = 583;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 1;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f242220e = a17;
        r45.ml0 ml0Var = (r45.ml0) a17.f70710a.f70684a;
        ml0Var.f380622d = str;
        ml0Var.f380623e = str2;
        ml0Var.f380624f = i17;
        ml0Var.f380625g = at4.g0.c();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f242219d = u0Var;
        return dispatch(sVar, this.f242220e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 583;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        if (i18 == 0 && i19 == 0) {
        }
        this.f242219d.onSceneEnd(i18, i19, str, this);
    }
}
