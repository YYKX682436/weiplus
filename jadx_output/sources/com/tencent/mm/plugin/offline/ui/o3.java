package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class o3 extends com.tencent.mm.plugin.offline.ui.h3 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(walletOfflineCoinPurseUI);
        this.f152689g = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.plugin.offline.ui.h3
    public void a() {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152689g;
        walletOfflineCoinPurseUI.Y = (android.widget.LinearLayout) walletOfflineCoinPurseUI.findViewById(com.tencent.mm.R.id.pct);
        this.f152635d = (android.widget.TextView) walletOfflineCoinPurseUI.Y.findViewById(com.tencent.mm.R.id.adp);
        this.f152636e = (android.widget.TextView) walletOfflineCoinPurseUI.Y.findViewById(com.tencent.mm.R.id.ads);
        this.f152637f = (android.widget.ImageView) walletOfflineCoinPurseUI.Y.findViewById(com.tencent.mm.R.id.adr);
        walletOfflineCoinPurseUI.Y.setOnClickListener(new com.tencent.mm.plugin.offline.ui.n3(this));
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return "transfertoreddot";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f152689g.Y;
    }
}
