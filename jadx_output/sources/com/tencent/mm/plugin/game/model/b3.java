package com.tencent.mm.plugin.game.model;

/* loaded from: classes4.dex */
public class b3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f140233d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f140234e;

    public b3(java.lang.String str, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.g63();
        lVar.f70665b = new r45.h63();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamecentersearch";
        lVar.f70667d = zd1.e.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f140234e = a17;
        r45.g63 g63Var = (r45.g63) a17.f70710a.f70684a;
        g63Var.f374914f = str;
        g63Var.f374912d = linkedList;
        g63Var.f374913e = linkedList2;
        g63Var.f374916h = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f140233d = u0Var;
        return dispatch(sVar, this.f140234e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return zd1.e.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGameCenterSearch", "errType = " + i18 + ", errCode = " + i19);
        this.f140233d.onSceneEnd(i18, i19, str, this);
    }
}
