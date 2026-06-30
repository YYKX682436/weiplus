package com.tencent.mm.plugin.game.model;

/* loaded from: classes5.dex */
public class h3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f140328d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f140329e;

    public h3(int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetMoreGameList", "offset: %d, limit: %d, type: %d, cat: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new m53.m2();
        lVar.f70665b = new m53.n2();
        lVar.f70666c = "/cgi-bin/mmgame-bin/newgetmoregamelist";
        lVar.f70667d = 1220;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f140329e = a17;
        m53.m2 m2Var = (m53.m2) a17.f70710a.f70684a;
        m2Var.f323896d = i17;
        m2Var.f323897e = i18;
        m2Var.f323898f = com.tencent.mm.sdk.platformtools.m2.d();
        m2Var.f323899g = i19;
        m2Var.f323900h = i27;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f140328d = u0Var;
        return dispatch(sVar, this.f140329e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1220;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetMoreGameList", "errType = " + i18 + ", errCode = " + i19);
        this.f140328d.onSceneEnd(i18, i19, str, this);
    }
}
