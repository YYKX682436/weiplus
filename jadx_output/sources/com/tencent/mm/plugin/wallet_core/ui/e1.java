package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class e1 implements com.tencent.mm.plugin.wallet_core.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI f180244a;

    public e1(com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI walletBankcardIdUI) {
        this.f180244a = walletBankcardIdUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.a4
    public void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("Micromsg.WalletInputCardIDUI", "hy: clickable span on click");
        int i17 = com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.f179858r;
        com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI walletBankcardIdUI = this.f180244a;
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) walletBankcardIdUI.getContext().getSystemService("layout_inflater");
        android.widget.TextView textView = (android.widget.TextView) layoutInflater.inflate(com.tencent.mm.R.layout.f489177bk3, (android.view.ViewGroup) null);
        textView.setText(walletBankcardIdUI.getString(com.tencent.mm.R.string.kje));
        int dimensionPixelSize = layoutInflater.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        db5.e1.w(walletBankcardIdUI.getContext(), walletBankcardIdUI.getString(com.tencent.mm.R.string.kjd), walletBankcardIdUI.getString(com.tencent.mm.R.string.kmf), textView, new com.tencent.mm.plugin.wallet_core.ui.k1(walletBankcardIdUI));
    }
}
