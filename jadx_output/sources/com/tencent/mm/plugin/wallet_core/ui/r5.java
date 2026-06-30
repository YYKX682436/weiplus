package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes5.dex */
public class r5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180600d;

    public r5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI) {
        this.f180600d = walletOrderInfoNewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = this.f180600d;
        try {
            if (walletOrderInfoNewUI.W.getVisibility() != 0 || walletOrderInfoNewUI.T.getRight() <= 0 || walletOrderInfoNewUI.W.getLeft() <= 0 || walletOrderInfoNewUI.T.getRight() < walletOrderInfoNewUI.W.getLeft() || com.tencent.mm.sdk.platformtools.t8.J0(walletOrderInfoNewUI.T.getText())) {
                return;
            }
            float textSize = walletOrderInfoNewUI.T.getTextSize();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "tinyAppDescTv size exceed, tinyAppDescTv.getRight(): %s, tinyAppButton.getLeft(): %s", java.lang.Integer.valueOf(walletOrderInfoNewUI.T.getRight()), java.lang.Integer.valueOf(walletOrderInfoNewUI.W.getLeft()));
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setTextSize(textSize);
            java.lang.String charSequence = walletOrderInfoNewUI.T.getText().toString();
            float left = walletOrderInfoNewUI.W.getLeft() - walletOrderInfoNewUI.T.getLeft();
            int i17 = 1;
            while (paint.measureText(charSequence.substring(0, (charSequence.length() - i17) - 1)) > left && i17 <= charSequence.length() - 1) {
                i17++;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "tinyAppDescTv, exceed len, final search count: %s, text.length: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(charSequence.length()));
            java.lang.String substring = charSequence.substring(0, (charSequence.length() - i17) - 1);
            if (charSequence.length() > 9 && substring.length() < 9) {
                substring = charSequence.substring(0, 9);
            }
            walletOrderInfoNewUI.T.setText(substring);
            walletOrderInfoNewUI.T.append("...");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletOrderInfoNewUI", e17, "calc tinyapp name error: %s", e17.getMessage());
        }
    }
}
