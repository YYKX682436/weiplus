package r01;

/* loaded from: classes4.dex */
public class i3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f368116d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f368117e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f368118f;

    public i3(java.lang.String str, int i17, java.lang.Object obj) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fb3();
        lVar.f70665b = new r45.gb3();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/getbizenterpriseattr";
        lVar.f70667d = 1343;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f368117e = a17;
        r45.fb3 fb3Var = (r45.fb3) a17.f70710a.f70684a;
        fb3Var.f374166d = str;
        fb3Var.f374167e = i17;
        fb3Var.f374168f = com.tencent.mm.sdk.platformtools.m2.d().equals("zh_CN") ? 2 : 1;
        this.f368118f = obj;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f368116d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBizEnterpriseAttr", "do scene");
        return dispatch(sVar, this.f368117e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1343;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f368116d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
