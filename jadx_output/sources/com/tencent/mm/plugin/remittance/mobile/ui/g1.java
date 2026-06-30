package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Toast f156671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f156672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156673f;

    public g1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI, android.widget.Toast toast, com.tencent.mm.modelbase.m1 m1Var) {
        this.f156673f = mobileRemittanceUI;
        this.f156671d = toast;
        this.f156672e = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f156671d.cancel();
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "mobile_remit_verify_name_success dialog dismiss");
        if (((sw3.b) this.f156672e).f413462u == 2) {
            int i17 = com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI.f156612y0;
            com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = this.f156673f;
            mobileRemittanceUI.X6(true, true);
            mobileRemittanceUI.Y6(2, "");
        }
    }
}
