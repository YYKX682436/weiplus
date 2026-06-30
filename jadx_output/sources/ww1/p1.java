package ww1;

/* loaded from: classes2.dex */
public class p1 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f450266d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f450267e;

    /* renamed from: f, reason: collision with root package name */
    public r45.tv f450268f;

    public p1() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.sv();
        lVar.f70665b = new r45.tv();
        lVar.f70667d = 1256;
        lVar.f70666c = "/cgi-bin/mmpay-bin/f2fannounce";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f450266d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f450267e = u0Var;
        return dispatch(sVar, this.f450266d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1256;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2fAnnouce", "errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f450268f = (r45.tv) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f450267e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
