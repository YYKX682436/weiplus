package xt1;

/* loaded from: classes8.dex */
public class f0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456475d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456476e;

    public f0() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.xb3();
        lVar.f70665b = new r45.yb3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getcardcount";
        lVar.f70667d = 1088;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        this.f456475d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456476e = u0Var;
        return dispatch(sVar, this.f456475d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1088;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCardCount", "onGYNetEnd, errType = " + i18 + " errCode = " + i19);
        if (i18 == 0 && i19 == 0) {
            r45.yb3 yb3Var = (r45.yb3) this.f456475d.f70711b.f70700a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCardCount", "has_card_item:" + yb3Var.f390947e + " has_share_card:" + yb3Var.f390948f);
            if (yb3Var.f390947e > 0) {
                lu1.a0.J();
                if (android.text.TextUtils.isEmpty((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_LAYOUT_BUF_DATA_STRING_SYNC, null))) {
                    xt1.t0.wi().a(1);
                }
            }
            if (yb3Var.f390948f > 0) {
                lu1.a0.K();
                java.lang.Long l17 = (java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_REQUENCE_LONG_SYNC, 0L);
                if (l17 != null && l17.longValue() == 0) {
                    xt1.t0.mj().a();
                }
            }
        }
        gm0.j1.u().c().w(282882, java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000)));
        this.f456476e.onSceneEnd(i18, i19, str, this);
    }
}
