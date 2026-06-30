package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class j3 extends com.tencent.mm.plugin.offline.ui.h3 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152656g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(walletOfflineCoinPurseUI);
        this.f152656g = walletOfflineCoinPurseUI;
    }

    @Override // com.tencent.mm.plugin.offline.ui.h3
    public void a() {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152656g;
        walletOfflineCoinPurseUI.V = (android.widget.LinearLayout) walletOfflineCoinPurseUI.findViewById(com.tencent.mm.R.id.pcs);
        this.f152635d = (android.widget.TextView) walletOfflineCoinPurseUI.V.findViewById(com.tencent.mm.R.id.f482302aq);
        this.f152636e = (android.widget.TextView) walletOfflineCoinPurseUI.V.findViewById(com.tencent.mm.R.id.f482312b1);
        this.f152637f = (android.widget.ImageView) walletOfflineCoinPurseUI.V.findViewById(com.tencent.mm.R.id.f482311b0);
        walletOfflineCoinPurseUI.V.setOnClickListener(new com.tencent.mm.plugin.offline.ui.i3(this));
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return "grouppayreddot";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f152656g.V;
    }
}
