package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f140270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.f0 f140271e;

    public e0(com.tencent.mm.plugin.game.model.f0 f0Var, com.tencent.mm.modelbase.m1 m1Var) {
        this.f140271e = f0Var;
        this.f140270d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        boolean z17 = com.tencent.mm.plugin.game.model.f0.f140305e;
        com.tencent.mm.plugin.game.model.f0 f0Var = this.f140271e;
        f0Var.f140308d += 20;
        r45.sw5 sw5Var = (r45.sw5) ((com.tencent.mm.plugin.game.model.j3) this.f140270d).f140346e.f70711b.f70700a;
        if (sw5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSearchGameList", "resp == null");
            str = null;
        } else {
            str = sw5Var.f385996d;
        }
        com.tencent.mm.plugin.game.model.u uVar = new com.tencent.mm.plugin.game.model.u(str);
        org.json.JSONObject jSONObject = uVar.f140433a;
        java.util.LinkedList a17 = com.tencent.mm.plugin.game.model.s.a(jSONObject.optJSONArray("items"));
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.game.model.b bVar = (com.tencent.mm.plugin.game.model.b) it.next();
            bVar.M = bVar.f140207j2;
            bVar.A = true;
        }
        r53.n.c(a17);
        java.util.LinkedList linkedList = com.tencent.mm.plugin.game.model.f0.f140306f;
        linkedList.add(uVar);
        int optInt = jSONObject.optInt("remainingCount");
        com.tencent.mars.xlog.Log.i("MicroMsg.GameListUpdater", "remainingCount: %d", java.lang.Integer.valueOf(optInt));
        if (optInt > 0) {
            gm0.j1.d().g(new com.tencent.mm.plugin.game.model.j3(f0Var.f140308d, 20));
            return;
        }
        com.tencent.mm.plugin.game.model.f0.f140305e = false;
        com.tencent.mm.plugin.game.model.f0.f140307g.quit();
        gm0.j1.d().q(1215, f0Var);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_SEARCH_LIST_UPDATE_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return;
        }
        gm0.j1.e().j(new com.tencent.mm.plugin.game.model.t(linkedList));
    }
}
