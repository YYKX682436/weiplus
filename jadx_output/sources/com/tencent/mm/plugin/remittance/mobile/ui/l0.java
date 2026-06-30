package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.m0 f156689d;

    public l0(com.tencent.mm.plugin.remittance.mobile.ui.m0 m0Var) {
        this.f156689d = m0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.remittance.mobile.ui.m0 m0Var = this.f156689d;
        if (itemId >= m0Var.f156692d.f156586r.f381582i.size() || menuItem.getItemId() < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "menuItem click menuItem.getItemId() illegal");
        } else {
            com.tencent.mm.wallet_core.model.f0.c(m0Var.f156692d.getContext(), (r45.n34) m0Var.f156692d.f156586r.f381582i.get(menuItem.getItemId()), null, new com.tencent.mm.plugin.remittance.mobile.ui.k0(this));
            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "menuItem click JumpItem:%s", com.tencent.mm.wallet_core.model.f0.e((r45.n34) m0Var.f156692d.f156586r.f381582i.get(menuItem.getItemId())));
        }
    }
}
