package zw1;

/* loaded from: classes15.dex */
public class j1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.k1 f476673d;

    public j1(zw1.k1 k1Var) {
        this.f476673d = k1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        zw1.k1 k1Var = this.f476673d;
        if (itemId == 1) {
            if (tw1.f.Di().Ri()) {
                com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = k1Var.f476687e;
                collectMainUI.f96414y0 &= -32769;
                gm0.j1.i();
                gm0.j1.u().c().w(147457, java.lang.Long.valueOf(collectMainUI.f96414y0));
                r45.no4 no4Var = new r45.no4();
                no4Var.f381559d = 2;
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(209, no4Var));
                tw1.f.Di().wi();
                dp.a.makeText(k1Var.f476687e.getContext(), com.tencent.mm.R.string.b_2, 1).show();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13944, 8);
                return;
            }
            com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI2 = k1Var.f476687e;
            collectMainUI2.f96414y0 |= 32768;
            gm0.j1.i();
            gm0.j1.u().c().w(147457, java.lang.Long.valueOf(collectMainUI2.f96414y0));
            r45.no4 no4Var2 = new r45.no4();
            no4Var2.f381559d = 1;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(209, no4Var2));
            tw1.f.Di().Ai();
            dp.a.makeText(k1Var.f476687e.getContext(), com.tencent.mm.R.string.b_d, 1).show();
            com.tencent.mm.plugin.collect.model.voice.m.d().k(false);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13944, 7);
            return;
        }
        int itemId2 = (menuItem.getItemId() - 1) - 1;
        if (itemId2 < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CollectMainUI", "illegal pos: %s", java.lang.Integer.valueOf(itemId2));
            return;
        }
        r45.uk4 uk4Var = (r45.uk4) k1Var.f476686d.get(itemId2);
        int i18 = uk4Var.f387431d;
        if (i18 == 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CollectMainUI", "wrong native type: %s", uk4Var.f387433f);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14526, 2, 1, uk4Var.f387432e, "", "", "", 2);
            return;
        }
        if (i18 == 2) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(uk4Var.f387433f)) {
                return;
            }
            com.tencent.mm.wallet_core.ui.r1.V(k1Var.f476687e.getContext(), uk4Var.f387433f, false);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14526, 2, 2, uk4Var.f387432e, "", "", uk4Var.f387433f, 2);
            return;
        }
        if (i18 == 3) {
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            java.lang.String str = uk4Var.f387434g;
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = str;
            java.lang.String str2 = uk4Var.f387435h;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            nxVar.f7467b = str2;
            nxVar.f7469d = 1072;
            nxVar.f7468c = 0;
            startAppBrandUIFromOuterEvent.e();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14526, 2, 3, uk4Var.f387432e, uk4Var.f387434g, uk4Var.f387435h, "", 2);
        }
    }
}
