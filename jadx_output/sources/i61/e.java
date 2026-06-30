package i61;

/* loaded from: classes4.dex */
public class e extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f288904d;

    /* renamed from: e, reason: collision with root package name */
    public r45.g f288905e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f288906f;

    /* renamed from: g, reason: collision with root package name */
    public final int f288907g;

    public e(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.f();
        lVar.f70665b = new r45.g();
        lVar.f70667d = 1530;
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaaclose";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f288904d = a17;
        r45.f fVar = (r45.f) a17.f70710a.f70684a;
        fVar.f373860f = str2;
        fVar.f373858d = str;
        fVar.f373859e = i17;
        this.f288907g = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAAClose", "doScene");
        this.f288906f = u0Var;
        return dispatch(sVar, this.f288904d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1530;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAAClose", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.g gVar = (r45.g) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f288905e = gVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAAClose", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(gVar.f374756d), this.f288905e.f374757e);
        com.tencent.mm.modelbase.u0 u0Var = this.f288906f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
