package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class p0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI f156704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI mobileRemitResultUI) {
        super(false);
        this.f156704d = mobileRemitResultUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "mFinishBt click");
        this.f156704d.U6();
    }
}
