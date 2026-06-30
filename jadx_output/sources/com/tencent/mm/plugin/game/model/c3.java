package com.tencent.mm.plugin.game.model;

/* loaded from: classes4.dex */
public class c3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f140251d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f140252e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f140253f;

    public c3(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.d63();
        lVar.f70665b = new r45.e63();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamecentersearchrecommend";
        lVar.f70667d = 1329;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        if (str2 == null) {
            this.f140253f = "";
        } else {
            this.f140253f = str2.trim();
        }
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f140252e = a17;
        r45.d63 d63Var = (r45.d63) a17.f70710a.f70684a;
        d63Var.f372173f = str;
        d63Var.f372171d = str2;
        d63Var.f372172e = linkedList;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f140251d = u0Var;
        return dispatch(sVar, this.f140252e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1329;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGameSearchRecmd", "errType = " + i18 + ", errCode = " + i19);
        this.f140251d.onSceneEnd(i18, i19, str, this);
    }
}
