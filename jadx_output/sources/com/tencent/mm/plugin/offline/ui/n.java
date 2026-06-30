package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class n extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at4.r0 f152675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.OfflineAlertView f152676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView, at4.r0 r0Var) {
        super(false);
        this.f152676e = offlineAlertView;
        this.f152675d = r0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        at4.r0 r0Var = this.f152675d;
        int i17 = r0Var.f13936b;
        if (i17 == 2) {
            com.tencent.mm.wallet_core.ui.r1.V(this.f152676e.getContext(), r0Var.f13939e, true);
        } else if (i17 == 3) {
            com.tencent.mm.wallet_core.ui.r1.b0(r0Var.f13937c, r0Var.f13938d, 0, 1000);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20258, 2);
    }
}
