package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class x0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitWelcomeUI f156740d;

    public x0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitWelcomeUI mobileRemitWelcomeUI) {
        this.f156740d = mobileRemitWelcomeUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitWelcomeUI", "click AlertDialog");
        this.f156740d.finish();
    }
}
