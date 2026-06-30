package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes5.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI f180595d;

    public r1(com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI walletBindCardResultUI) {
        this.f180595d = walletBindCardResultUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI walletBindCardResultUI = this.f180595d;
        if (walletBindCardResultUI.f179891z.getVisibility() != 0 || walletBindCardResultUI.f179888w.getRight() < walletBindCardResultUI.f179891z.getLeft() || com.tencent.mm.sdk.platformtools.t8.J0(walletBindCardResultUI.f179888w.getText())) {
            return;
        }
        float textSize = walletBindCardResultUI.f179888w.getTextSize();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindCardResultUI", "tinyAppDescTv size exceed, tinyAppDescTv.getRight(): %s, tinyAppButton.getLeft(): %s", java.lang.Integer.valueOf(walletBindCardResultUI.f179888w.getRight()), java.lang.Integer.valueOf(walletBindCardResultUI.f179891z.getLeft()));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(textSize);
        java.lang.String charSequence = walletBindCardResultUI.f179888w.getText().toString();
        float measureText = paint.measureText(charSequence) - (walletBindCardResultUI.f179888w.getRight() - walletBindCardResultUI.f179891z.getLeft());
        int i17 = 1;
        while (paint.measureText(charSequence.substring(0, (charSequence.length() - i17) - 1)) > measureText && i17 <= charSequence.length() - 1) {
            i17++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindCardResultUI", "tinyAppDescTv, exceed len, final search count: %s, text.length: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(charSequence.length()));
        walletBindCardResultUI.f179888w.setText(charSequence.substring(0, (charSequence.length() - i17) - 1));
        walletBindCardResultUI.f179888w.append("...");
    }
}
