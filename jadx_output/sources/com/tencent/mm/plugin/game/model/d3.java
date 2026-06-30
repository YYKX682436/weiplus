package com.tencent.mm.plugin.game.model;

/* loaded from: classes4.dex */
public class d3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f140264d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f140265e;

    public d3(java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new m53.v1();
        lVar.f70665b = new m53.w1();
        lVar.f70666c = "/cgi-bin/mmgame-bin/newgetgamedetail";
        lVar.f70667d = 1217;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f140265e = a17;
        m53.v1 v1Var = (m53.v1) a17.f70710a.f70684a;
        v1Var.f324118d = str;
        v1Var.f324119e = str2;
        v1Var.f324120f = z17;
        v1Var.f324123i = z18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f140264d = u0Var;
        return dispatch(sVar, this.f140265e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1217;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetGameDetailNew", "errType = " + i18 + ", errCode = " + i19);
        this.f140264d.onSceneEnd(i18, i19, str, this);
    }
}
