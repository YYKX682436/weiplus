package s01;

/* loaded from: classes2.dex */
public class n0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f401907d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f401908e;

    public n0(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ci5();
        lVar.f70665b = new r45.di5();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/quitbizchat";
        lVar.f70667d = 1358;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f401908e = a17;
        r45.ci5 ci5Var = (r45.ci5) a17.f70710a.f70684a;
        ci5Var.f371577d = str;
        ci5Var.f371578e = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f401907d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.brandservice.NetSceneQuitBizChat", "do scene");
        return dispatch(sVar, this.f401908e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1358;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f401907d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
