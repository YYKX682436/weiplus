package l41;

/* loaded from: classes2.dex */
public class a0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315775d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315776e;

    public a0(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.lk3();
        lVar.f70665b = new r45.mk3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getopenurl";
        lVar.f70667d = 913;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315776e = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetOpenIMUrl", "NetSceneGetOpenIMUrl username: %s", str);
        ((r45.lk3) a17.f70710a.f70684a).f379542d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315775d = u0Var;
        return dispatch(sVar, this.f315776e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 913;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetOpenIMUrl", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            this.f315775d.onSceneEnd(i18, i19, str, this);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetOpenIMUrl", "openUrl %s", ((r45.mk3) this.f315776e.f70711b.f70700a).f380602d);
            this.f315775d.onSceneEnd(i18, i19, str, this);
        }
    }
}
