package er3;

/* loaded from: classes4.dex */
public class f extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f256030d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f256031e;

    public f(java.lang.String str, boolean z17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.li6();
        lVar.f70665b = new r45.mi6();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/switchbrand";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.finder.q0.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f256031e = a17;
        r45.li6 li6Var = (r45.li6) a17.f70710a.f70684a;
        li6Var.f379505d = str;
        li6Var.f379506e = z17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f256030d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.brandservice.NetSceneSwitchBrand", "do scene");
        return dispatch(sVar, this.f256031e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.finder.q0.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f256030d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
