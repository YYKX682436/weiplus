package r01;

/* loaded from: classes4.dex */
public class o3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f368172d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f368173e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f368174f;

    public o3(r45.hk hkVar, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.p16();
        lVar.f70665b = new r45.q16();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/setbizenterpriseattr";
        lVar.f70667d = 1228;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f368173e = a17;
        r45.p16 p16Var = (r45.p16) a17.f70710a.f70684a;
        p16Var.f382667f = hkVar;
        p16Var.f382666e = i17;
        p16Var.f382665d = i18;
        this.f368174f = obj;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f368172d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSetBizEnterpriseAttr", "do scene");
        return dispatch(sVar, this.f368173e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1228;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f368172d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
