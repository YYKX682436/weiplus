package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class r4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.AnonymousClass1 f142996d;

    public r4(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.AnonymousClass1 anonymousClass1) {
        this.f142996d = anonymousClass1;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean booleanValue = ((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IPCALL_RECHARGE_SHOW_REDDOT_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.AnonymousClass1 anonymousClass1 = this.f142996d;
        if (booleanValue) {
            com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.this.f142692f.setVisibility(0);
        } else {
            com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.this.f142692f.setVisibility(8);
        }
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.this.f142691e.setText((java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERFINO_IPCALL_RECHARGE_STRING, ""));
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.this.f142694h.setText((java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IPCALL_PACKAGE_PURCHASE_STRING, ""));
    }
}
