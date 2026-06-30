package v13;

/* loaded from: classes12.dex */
public final class a extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v13.e f432516n;

    public a(v13.e eVar) {
        this.f432516n = eVar;
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.o oVar = ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137381f;
        dm.i3.createTable(oVar.l());
        p75.n0 n0Var = dm.i3.f237554g;
        this.f432516n.f432531f = n0Var.h(dm.i3.f237555h.h()).a().n(oVar.l());
        java.util.List list = com.tencent.mm.plugin.fts.ui.y2.f138380a;
        s50.k0 k0Var = (s50.k0) ((u50.w) i95.n0.c(u50.w.class));
        k0Var.getClass();
        if (!jm0.g.class.isAssignableFrom(v13.e.class)) {
            throw new java.lang.IllegalArgumentException(s50.k0.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(k0Var.getViewModel(), new jm0.e(k0Var)).a(v13.e.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            com.tencent.mm.plugin.fts.o oVar2 = ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137381f;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            p75.m0 t17 = dm.i3.f237556i.t("'net@%'");
            linkedList3.add(dm.i3.f237557m.u());
            p75.i0 g17 = n0Var.g(linkedList2);
            g17.f352657d = t17;
            g17.d(linkedList3);
            g17.b(linkedList4);
            g17.c(30, 0);
            java.util.Iterator it = ((java.util.ArrayList) g17.a().k(oVar2.l(), dm.i3.class)).iterator();
            while (it.hasNext()) {
                dm.i3 i3Var = (dm.i3) it.next();
                r45.cw5 cw5Var = new r45.cw5();
                cw5Var.f371870d = i3Var.u0();
                cw5Var.f371873g = ((int) i3Var.t0()) == 1;
                cw5Var.f371871e = i3Var.v0();
                linkedList.add(cw5Var);
            }
        } catch (com.tencent.wcdb.database.SQLiteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTSQueryClickRecallPLC", e17, "getLatestQueryClickRecallInfo error", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.fts.ui.y2.f138380a = linkedList;
        com.tencent.mm.plugin.fts.ui.y2.f138381b = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSSearchPrefixUserInfo", "initLatestSearchClickHistory Success, latestSearchClickHistory=" + com.tencent.mm.plugin.fts.ui.y2.f138380a.toString());
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "currentDictCount:" + this.f432516n.f432531f;
    }
}
