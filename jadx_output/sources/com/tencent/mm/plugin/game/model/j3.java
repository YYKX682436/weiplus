package com.tencent.mm.plugin.game.model;

/* loaded from: classes2.dex */
public class j3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f140345d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f140346e;

    public j3(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchGameList", "offset: %d, limit: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rw5();
        lVar.f70665b = new r45.sw5();
        lVar.f70666c = "/cgi-bin/mmgame-bin/searchgamelist";
        lVar.f70667d = 1215;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f140346e = a17;
        r45.rw5 rw5Var = (r45.rw5) a17.f70710a.f70684a;
        rw5Var.f385245d = i17;
        rw5Var.f385246e = i18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f140345d = u0Var;
        return dispatch(sVar, this.f140346e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1215;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchGameList", "errType = " + i18 + ", errCode = " + i19);
        this.f140345d.onSceneEnd(i18, i19, str, this);
    }
}
