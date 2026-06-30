package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class a3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f140200f = com.tencent.mm.plugin.game.commlib.util.m.b(com.tencent.mm.plugin.game.commlib.util.l.PERMANENT) + "tabnav/";

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.modelbase.u0 f140201g = new com.tencent.mm.plugin.game.model.w2();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f140202d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f140203e;

    public a3() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new m53.b2();
        lVar.f70665b = new m53.c2();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getgameindex4tabnav";
        lVar.f70667d = 2641;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f140203e = lVar.a();
    }

    public static void H(java.util.List list, com.tencent.mm.plugin.game.model.z2 z2Var) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            if (z2Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGameIndex4TabNav", "nav icon download complete! save nav data");
                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().J0("game_index4_tab_nav", ((com.tencent.mm.plugin.game.model.x2) z2Var).f140521a);
                return;
            }
            return;
        }
        java.lang.String str = (java.lang.String) list.remove(0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGameIndex4TabNav", "iconUrl is null");
            H(list, z2Var);
            return;
        }
        java.lang.String str2 = f140200f + kk.k.g(str.getBytes());
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.f342082f = str2;
        n11.a.b().d(str, fVar.a(), new com.tencent.mm.plugin.game.model.y2(str, list, z2Var));
    }

    public static void I(m53.c2 c2Var) {
        if (c2Var == null) {
            return;
        }
        java.util.LinkedList linkedList = c2Var.f323598d;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGameIndex4TabNav", "nav list is null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            m53.g1 g1Var = (m53.g1) it.next();
            if (g1Var != null) {
                arrayList.add(g1Var.f323697i);
                arrayList.add(g1Var.f323698m);
            }
        }
        H(arrayList, new com.tencent.mm.plugin.game.model.x2(c2Var));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f140202d = u0Var;
        return dispatch(sVar, this.f140203e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2641;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGameIndex4TabNav", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        this.f140202d.onSceneEnd(i18, i19, str, this);
    }
}
