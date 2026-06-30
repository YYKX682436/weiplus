package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes10.dex */
public final class r implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI f178346d;

    public r(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI) {
        this.f178346d = walletKnowLqtFullScreenVideoUI;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.l lVar;
        int progress;
        if (seekBar == null || (lVar = this.f178346d.f177920d) == null || (progress = seekBar.getProgress()) >= 100 || progress < 0) {
            return;
        }
        lVar.getPlayer().seekTo((long) (lVar.getTotalLength() * (progress / 100.0d)));
    }
}
