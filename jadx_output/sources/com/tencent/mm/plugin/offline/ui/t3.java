package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class t3 extends com.tencent.mm.plugin.offline.ui.h3 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152724g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(walletOfflineCoinPurseUI);
        this.f152724g = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.plugin.offline.ui.h3
    public void a() {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152724g;
        walletOfflineCoinPurseUI.W = (android.widget.LinearLayout) walletOfflineCoinPurseUI.findViewById(com.tencent.mm.R.id.pcx);
        this.f152635d = (android.widget.TextView) walletOfflineCoinPurseUI.W.findViewById(com.tencent.mm.R.id.dlx);
        this.f152636e = (android.widget.TextView) walletOfflineCoinPurseUI.W.findViewById(com.tencent.mm.R.id.dlz);
        this.f152637f = (android.widget.ImageView) walletOfflineCoinPurseUI.W.findViewById(com.tencent.mm.R.id.dly);
        walletOfflineCoinPurseUI.W.setOnClickListener(new com.tencent.mm.plugin.offline.ui.s3(this));
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return "f2fhongbaoreddot";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f152724g.W;
    }
}
