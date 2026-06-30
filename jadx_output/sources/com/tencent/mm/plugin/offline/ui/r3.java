package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class r3 extends com.tencent.mm.plugin.offline.ui.h3 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152701g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(walletOfflineCoinPurseUI);
        this.f152701g = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.plugin.offline.ui.h3
    public void a() {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152701g;
        walletOfflineCoinPurseUI.U = (android.widget.LinearLayout) walletOfflineCoinPurseUI.findViewById(com.tencent.mm.R.id.pcw);
        this.f152635d = (android.widget.TextView) walletOfflineCoinPurseUI.U.findViewById(com.tencent.mm.R.id.dm6);
        this.f152636e = (android.widget.TextView) walletOfflineCoinPurseUI.U.findViewById(com.tencent.mm.R.id.dm8);
        this.f152637f = (android.widget.ImageView) walletOfflineCoinPurseUI.U.findViewById(com.tencent.mm.R.id.dm7);
        walletOfflineCoinPurseUI.U.setOnClickListener(new com.tencent.mm.plugin.offline.ui.q3(this));
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return "facingreceivereddot";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f152701g.U;
    }
}
