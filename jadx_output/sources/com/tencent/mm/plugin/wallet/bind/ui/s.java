package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes3.dex */
public class s extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI f178642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI walletBankcardManageUI) {
        super(false);
        this.f178642d = walletBankcardManageUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        this.f178642d.U6(null);
        com.tencent.mm.wallet_core.ui.r1.q0(19, 1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14422, 2);
    }
}
