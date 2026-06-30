package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class x3 extends com.tencent.mm.plugin.offline.ui.h3 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152762g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(walletOfflineCoinPurseUI);
        this.f152762g = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.plugin.offline.ui.h3
    public void a() {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152762g;
        walletOfflineCoinPurseUI.X = (android.widget.LinearLayout) walletOfflineCoinPurseUI.findViewById(com.tencent.mm.R.id.f487665pd4);
        this.f152635d = (android.widget.TextView) walletOfflineCoinPurseUI.X.findViewById(com.tencent.mm.R.id.leq);
        this.f152636e = (android.widget.TextView) walletOfflineCoinPurseUI.X.findViewById(com.tencent.mm.R.id.les);
        this.f152637f = (android.widget.ImageView) walletOfflineCoinPurseUI.X.findViewById(com.tencent.mm.R.id.ler);
        walletOfflineCoinPurseUI.X.setOnClickListener(new com.tencent.mm.plugin.offline.ui.w3(this));
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return "rewardcodereddot";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f152762g.X;
    }
}
