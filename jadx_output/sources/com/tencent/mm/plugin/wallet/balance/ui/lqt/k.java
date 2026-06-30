package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.l f178230d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.wallet.balance.ui.lqt.l lVar) {
        super(2);
        this.f178230d = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        com.tencent.mm.plugin.wallet.balance.ui.lqt.a delegate = this.f178230d.getDelegate();
        if (delegate != null) {
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI = (com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI) delegate;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletKnowLqtFullScreenVideoUIUI", "onProgressChange, currentMs: " + longValue + ", totalMs: " + longValue2);
            int i17 = (int) ((((double) longValue) / ((double) longValue2)) * ((double) 100));
            android.widget.TextView textView = walletKnowLqtFullScreenVideoUI.f177924h;
            if (textView != null) {
                textView.setText(com.tencent.mm.wallet_core.ui.r1.r(walletKnowLqtFullScreenVideoUI.getContext().getString(com.tencent.mm.R.string.fcw), longValue));
            }
            android.widget.SeekBar seekBar = walletKnowLqtFullScreenVideoUI.f177922f;
            if (seekBar != null) {
                seekBar.setProgress(i17);
            }
        }
        return jz5.f0.f302826a;
    }
}
