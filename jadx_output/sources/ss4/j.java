package ss4;

/* loaded from: classes2.dex */
public class j extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412068d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412069e;

    /* renamed from: f, reason: collision with root package name */
    public r45.u65 f412070f;

    public j() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.t65 t65Var = new r45.t65();
        t65Var.f386171d = c01.id.c();
        lVar.f70664a = t65Var;
        lVar.f70665b = new r45.u65();
        lVar.f70667d = 1820;
        lVar.f70666c = "/cgi-bin/mmpay-bin/getpayplugin";
        this.f412068d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f412069e = u0Var;
        return dispatch(sVar, this.f412068d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1820;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetPayPlugin", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f412070f = (r45.u65) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        }
        this.f412069e.onSceneEnd(i18, i19, str, this);
    }
}
