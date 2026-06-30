package d05;

/* loaded from: classes2.dex */
public class i extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f225592d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f225593e;

    public i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vo5();
        lVar.f70665b = new r45.wo5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/removevirtualbankcard";
        lVar.f70667d = 600;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 1;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f225593e = a17;
        r45.vo5 vo5Var = (r45.vo5) a17.f70710a.f70684a;
        vo5Var.f388409e = str;
        vo5Var.f388408d = com.tencent.mm.sdk.platformtools.t8.P(str2, 0);
        vo5Var.f388410f = at4.g0.c();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f225592d = u0Var;
        return dispatch(sVar, this.f225593e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 600;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        if (i18 == 0 && i19 == 0) {
        }
        this.f225592d.onSceneEnd(i18, i19, str, this);
    }
}
