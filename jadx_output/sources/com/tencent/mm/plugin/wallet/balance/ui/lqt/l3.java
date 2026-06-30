package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class l3 implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f178257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178258e;

    public l3(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f178258e = walletLqtPlanAddUI;
        this.f178257d = bankcard;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.k3(this, bitmap));
    }
}
