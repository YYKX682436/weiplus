package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes4.dex */
public class y3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f189157d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f189158e;

    public y3(int i17, int i18, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.oe4();
        lVar.f70665b = new r45.pe4();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/getserviceapplist";
        lVar.f70667d = ad1.d.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f189158e = a17;
        r45.oe4 oe4Var = (r45.oe4) a17.f70710a.f70684a;
        oe4Var.f382196d = i17;
        oe4Var.f382197e = i18;
        oe4Var.f382198f = str;
        gm0.j1.i();
        oe4Var.f382199g = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue() + "";
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f189157d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetServiceAppList", "do scene");
        return dispatch(sVar, this.f189158e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return ad1.d.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f189157d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
