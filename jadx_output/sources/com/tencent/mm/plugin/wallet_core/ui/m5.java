package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class m5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo f180497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180498e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI, com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo showInfo) {
        super(false);
        this.f180498e = walletOrderInfoNewUI;
        this.f180497d = showInfo;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo showInfo = this.f180497d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "onClick showInfo, jump url: %s", showInfo.f179812n);
        this.f180498e.g7(showInfo.f179812n);
    }
}
