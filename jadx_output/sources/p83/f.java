package p83;

/* loaded from: classes2.dex */
public class f extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f352743d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rr3 f352744e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f352745f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f352746g;

    public f(java.lang.String str, java.lang.String str2) {
        this.f352743d = null;
        this.f352745f = true;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            this.f352745f = true;
            str2 = "";
        } else {
            this.f352745f = false;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.qr3();
        lVar.f70665b = new r45.rr3();
        lVar.f70667d = com.tencent.wxmm.v2helper.EMethodGetNetworkQuality;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getwcoproductlist";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f352743d = a17;
        r45.qr3 qr3Var = (r45.qr3) a17.f70710a.f70684a;
        qr3Var.f384223d = str;
        qr3Var.f384224e = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallGetProductList", "NetSceneIPCallGetProductList");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f352746g = u0Var;
        return dispatch(sVar, this.f352743d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.wxmm.v2helper.EMethodGetNetworkQuality;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallGetProductList", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f352744e = (r45.rr3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f352746g;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
