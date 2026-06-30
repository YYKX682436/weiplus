package com.tencent.mm.ui.brandservice;

/* loaded from: classes11.dex */
public class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.brandservice.BrandServiceNotifyUI f198047d;

    public g(com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI) {
        this.f198047d = brandServiceNotifyUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI = this.f198047d;
        if (itemId == 1) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(brandServiceNotifyUI.f198028o, true);
            if (n17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BrandServiceConversationUI", "changed biz stick status failed, contact is null, talker = " + brandServiceNotifyUI.f198028o);
                return;
            }
            if (n17.w2()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13307, n17.d1(), 1, 2, 2);
                c01.e2.B0(brandServiceNotifyUI.f198028o, true, true);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13307, n17.d1(), 1, 1, 2);
                c01.e2.t0(brandServiceNotifyUI.f198028o, true, true);
            }
            com.tencent.mm.autogen.events.BizPlaceTopChangeEvent bizPlaceTopChangeEvent = new com.tencent.mm.autogen.events.BizPlaceTopChangeEvent();
            bizPlaceTopChangeEvent.f54004g.f8048a = n17.d1();
            bizPlaceTopChangeEvent.e();
            return;
        }
        if (itemId == 2) {
            com.tencent.mm.ui.tools.n1.b(r01.q3.cj().b1(brandServiceNotifyUI.f198028o), brandServiceNotifyUI, ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(brandServiceNotifyUI.f198028o, true), false, null, 2);
            return;
        }
        if (itemId != 3) {
            if (itemId != 4) {
                return;
            }
            com.tencent.mm.ui.o3.b(brandServiceNotifyUI, new com.tencent.mm.ui.brandservice.f(this));
            return;
        }
        java.lang.String str = brandServiceNotifyUI.f198028o;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandServiceConversationUI", "Delete Conversation and messages fail because username is null or nil.");
            return;
        }
        com.tencent.mm.storage.f9 r66 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).r6(str);
        r45.ac0 ac0Var = new r45.ac0();
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str == null ? "" : str;
        du5Var.f372757e = true;
        ac0Var.f369912d = du5Var;
        ac0Var.f369914f = r66.I0();
        ((e21.z0) c01.d9.b().w()).c(new xg3.p0(8, ac0Var));
        brandServiceNotifyUI.f198034u = false;
        c01.w9.h(str, new com.tencent.mm.ui.brandservice.e(brandServiceNotifyUI, db5.e1.Q(brandServiceNotifyUI, brandServiceNotifyUI.getString(com.tencent.mm.R.string.f490573yv), brandServiceNotifyUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.brandservice.d(brandServiceNotifyUI))));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.g1.I(str, 15);
        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(str);
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(str);
        if (n18 != null && !com.tencent.mm.sdk.platformtools.t8.K0(n18.d1())) {
            n18.setType(n18.getType() & (-2049));
            ((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(str, n18);
        }
        if (p17 != null) {
            if (p17.d2(4194304) || (n18 != null && n18.k2() && !n18.r2() && p17.w0() < r01.q3.rj())) {
                c01.d9.e().g(new com.tencent.mm.modelsimple.e0(str, null));
            }
        }
    }
}
