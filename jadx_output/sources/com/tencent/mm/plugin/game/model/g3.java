package com.tencent.mm.plugin.game.model;

/* loaded from: classes5.dex */
public class g3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f140320d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f140321e;

    public g3(int i17, int i18, java.util.LinkedList linkedList, int i19, boolean z17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new m53.j2();
        lVar.f70665b = new m53.k2();
        lVar.f70666c = "/cgi-bin/mmgame-bin/newgetlibgamelist";
        lVar.f70667d = 1218;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f140321e = a17;
        m53.j2 j2Var = (m53.j2) a17.f70710a.f70684a;
        j2Var.f323811d = i17;
        j2Var.f323812e = i18;
        j2Var.f323813f = com.tencent.mm.sdk.platformtools.m2.d();
        j2Var.f323815h = com.tencent.mm.sdk.platformtools.t8.d0(com.tencent.mm.sdk.platformtools.x2.f193071a);
        j2Var.f323816i = i19;
        j2Var.f323814g = linkedList;
        j2Var.f323817m = z17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f140320d = u0Var;
        return dispatch(sVar, this.f140321e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1218;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetLibGameList", "errType = " + i18 + ", errCode = " + i19);
        this.f140320d.onSceneEnd(i18, i19, str, this);
    }
}
