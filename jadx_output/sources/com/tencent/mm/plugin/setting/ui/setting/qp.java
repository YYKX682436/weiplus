package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class qp implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.rp f161487d;

    public qp(com.tencent.mm.plugin.setting.ui.setting.rp rpVar) {
        this.f161487d = rpVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.pay.x.CTRL_INDEX, this.f161487d.f161522d.f160781v);
        com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = this.f161487d.f161522d;
        java.util.HashSet hashSet = unfamiliarContactDetailUI.f160780u;
        unfamiliarContactDetailUI.V6(true);
        if (i17 == 0) {
            com.tencent.mm.plugin.setting.ui.setting.fq.f161049d += hashSet.size();
        } else if (i17 == 1) {
            com.tencent.mm.plugin.setting.ui.setting.fq.f161048c += hashSet.size();
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.setting.ui.setting.jp(unfamiliarContactDetailUI, hashSet, i17));
        com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.T6(this.f161487d.f161522d, false);
        com.tencent.mm.plugin.setting.ui.setting.xp xpVar = this.f161487d.f161522d.f160776q;
        if (xpVar != null) {
            xpVar.notifyDataSetChanged();
        }
    }
}
