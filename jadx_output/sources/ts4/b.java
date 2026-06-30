package ts4;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f421715d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f421716e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f421717f;

    /* renamed from: g, reason: collision with root package name */
    public int f421718g = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.h65 h65Var = new r45.h65();
        gm0.j1.i();
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN, java.lang.Boolean.FALSE);
        h65Var.f375881d = m17 != null ? ((java.lang.Boolean) m17).booleanValue() : 0;
        lVar.f70664a = h65Var;
        lVar.f70665b = new r45.i65();
        lVar.f70666c = "/cgi-bin/mmpay-bin/payibggetjumpurl";
        lVar.f70667d = 1564;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f421716e = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f421715d = u0Var;
        return dispatch(sVar, this.f421716e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1564;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg jump url raw net errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.i65 i65Var = (r45.i65) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg pay jump url. biz_errcode: %d, biz_errmsg: %s", java.lang.Integer.valueOf(i65Var.f376763d), i65Var.f376764e);
            str = i65Var.f376764e;
            i19 = i65Var.f376763d;
            this.f421717f = i65Var.f376765f;
            this.f421718g = i65Var.f376766g;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg pay jump url failed");
            this.f421717f = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkk);
        }
        this.f421715d.onSceneEnd(i18, i19, str, this);
    }
}
