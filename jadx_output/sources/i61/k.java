package i61;

/* loaded from: classes8.dex */
public class k extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f288929d;

    /* renamed from: e, reason: collision with root package name */
    public r45.d0 f288930e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f288931f;

    public k(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.c0();
        lVar.f70665b = new r45.d0();
        lVar.f70667d = 1695;
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaaquerydetail";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f288929d = a17;
        r45.c0 c0Var = (r45.c0) a17.f70710a.f70684a;
        c0Var.f371187d = str;
        c0Var.f371188e = i17;
        c0Var.f371189f = str2;
        if (i17 == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAAQueryDetail", "set sign and ver");
            c0Var.f371190g = str3;
            c0Var.f371191h = i18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAAQueryDetail", "NetSceneAAQueryDetail, billNo: %s, scene: %s, groupId: %s", str, java.lang.Integer.valueOf(i17), str2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAAQueryDetail", "doScene");
        this.f288931f = u0Var;
        return dispatch(sVar, this.f288929d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1695;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAAQueryDetail", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.d0 d0Var = (r45.d0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f288930e = d0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAAQueryDetail", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(d0Var.f371955d), this.f288930e.f371956e);
        com.tencent.mm.modelbase.u0 u0Var = this.f288931f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
