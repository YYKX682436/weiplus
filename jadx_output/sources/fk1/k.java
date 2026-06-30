package fk1;

/* loaded from: classes8.dex */
public final class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263277d;

    public k(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        this.f263277d = wAGameRecordShareUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
            com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263277d;
            m33.k1 k1Var = wAGameRecordShareUI.f90183f;
            fk1.h hVar = new fk1.h(wAGameRecordShareUI);
            com.tencent.mm.plugin.game.p0 p0Var = (com.tencent.mm.plugin.game.p0) l1Var;
            p0Var.getClass();
            n53.b.b(k1Var.f323303a, 3L, 103, 2, 0, k1Var.f323306d, k1Var.f323310h, k1Var.f323309g);
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.v0(p0Var, k1Var, hVar, wAGameRecordShareUI));
            return;
        }
        if (itemId == 1) {
            m33.l1 l1Var2 = (m33.l1) i95.n0.c(m33.l1.class);
            com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI2 = this.f263277d;
            ((com.tencent.mm.plugin.game.p0) l1Var2).Ri(wAGameRecordShareUI2, wAGameRecordShareUI2.f90183f, 1, new fk1.i(wAGameRecordShareUI2));
            return;
        }
        if (itemId != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WAGameRecordShareUI", "bottom sheet,error itemId");
            return;
        }
        m33.l1 l1Var3 = (m33.l1) i95.n0.c(m33.l1.class);
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI3 = this.f263277d;
        ((com.tencent.mm.plugin.game.p0) l1Var3).Ri(wAGameRecordShareUI3, wAGameRecordShareUI3.f90183f, 2, new fk1.j(wAGameRecordShareUI3));
    }
}
