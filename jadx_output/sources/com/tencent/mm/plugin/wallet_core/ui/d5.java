package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes5.dex */
public class d5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180237e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI, java.lang.String str) {
        super(false);
        this.f180237e = walletOrderInfoNewUI;
        this.f180236d = str;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = this.f180237e;
        g0Var.d(22110, 1, walletOrderInfoNewUI.f180032p);
        com.tencent.mm.wallet_core.ui.r1.X(walletOrderInfoNewUI, this.f180236d, true);
    }
}
