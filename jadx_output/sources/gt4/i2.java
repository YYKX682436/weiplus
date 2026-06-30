package gt4;

/* loaded from: classes5.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget f275452d;

    public i2(com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        this.f275452d = walletSuccPageAwardWidget;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget = this.f275452d;
        try {
            if (walletSuccPageAwardWidget.f180735g.getVisibility() != 0 || walletSuccPageAwardWidget.f180733e.getRight() <= 0 || walletSuccPageAwardWidget.f180735g.getLeft() <= 0 || walletSuccPageAwardWidget.f180733e.getRight() < walletSuccPageAwardWidget.f180735g.getLeft() || com.tencent.mm.sdk.platformtools.t8.J0(walletSuccPageAwardWidget.f180733e.getText())) {
                return;
            }
            float textSize = walletSuccPageAwardWidget.f180733e.getTextSize();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "nameTv size exceed, nameTv.getRight(): %s, button.getLeft(): %s", java.lang.Integer.valueOf(walletSuccPageAwardWidget.f180733e.getRight()), java.lang.Integer.valueOf(walletSuccPageAwardWidget.f180735g.getLeft()));
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setTextSize(textSize);
            java.lang.String charSequence = walletSuccPageAwardWidget.f180733e.getText().toString();
            float left = walletSuccPageAwardWidget.f180735g.getLeft() - walletSuccPageAwardWidget.f180733e.getLeft();
            int i17 = 1;
            while (paint.measureText(charSequence.substring(0, (charSequence.length() - i17) - 1)) > left && i17 <= charSequence.length() - 1) {
                i17++;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "nameTv, exceed len, final search count: %s, text.length: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(charSequence.length()));
            java.lang.String substring = charSequence.substring(0, (charSequence.length() - i17) - 1);
            if (charSequence.length() > 9 && substring.length() < 9) {
                substring = charSequence.substring(0, 9);
            }
            walletSuccPageAwardWidget.f180733e.setText(substring);
            walletSuccPageAwardWidget.f180733e.append("...");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", e17, "calc nameTv len error: %s", e17.getMessage());
        }
    }
}
