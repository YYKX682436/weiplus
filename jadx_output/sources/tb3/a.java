package tb3;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f416978d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f416979e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vn0 f416980f;

    public a(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.un0();
        lVar.f70665b = new r45.vn0();
        lVar.f70667d = 1987;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70666c = "/cgi-bin/mmpay-bin/ftfhb/ffclearwxhb";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f416978d = a17;
        ((r45.un0) a17.f70710a.f70684a).f387487d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f416979e = u0Var;
        return dispatch(sVar, this.f416978d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1987;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        this.f416980f = (r45.vn0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("NetSceneF2FLuckyMoneyClear", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f416980f.f388392d), this.f416980f.f388393e);
        com.tencent.mm.modelbase.u0 u0Var = this.f416979e;
        if (u0Var != null) {
            r45.vn0 vn0Var = this.f416980f;
            u0Var.onSceneEnd(i18, vn0Var.f388392d, vn0Var.f388393e, this);
        }
    }
}
