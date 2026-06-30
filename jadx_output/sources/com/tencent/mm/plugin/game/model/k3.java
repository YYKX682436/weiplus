package com.tencent.mm.plugin.game.model;

/* loaded from: classes4.dex */
public class k3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f140353d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f140354e;

    public k3(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new m53.j5();
        lVar.f70665b = new m53.k5();
        lVar.f70666c = "/cgi-bin/mmgame-bin/newsubscribenewgame";
        lVar.f70667d = 1219;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f140354e = a17;
        m53.j5 j5Var = (m53.j5) a17.f70710a.f70684a;
        j5Var.f323826e = str;
        j5Var.f323825d = str2;
        j5Var.f323827f = str3;
        j5Var.f323829h = z17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f140353d = u0Var;
        return dispatch(sVar, this.f140354e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1219;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGameSubscription", "errType = " + i18 + ", errCode = " + i19);
        this.f140353d.onSceneEnd(i18, i19, str, this);
    }
}
