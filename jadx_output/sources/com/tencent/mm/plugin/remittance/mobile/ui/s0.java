package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class s0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.tp6 f156716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI f156717e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI mobileRemitResultUI, r45.tp6 tp6Var) {
        super(false);
        this.f156717e = mobileRemitResultUI;
        this.f156716d = tp6Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "notice click!");
        com.tencent.mm.wallet_core.model.f0.c(this.f156717e.getContext(), this.f156716d.f386663h, null, new com.tencent.mm.plugin.remittance.mobile.ui.r0(this));
    }
}
