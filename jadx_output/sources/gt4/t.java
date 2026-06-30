package gt4;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView f275555d;

    public t(com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView walletAwardShakeAnimView) {
        this.f275555d = walletAwardShakeAnimView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView walletAwardShakeAnimView = this.f275555d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletAwardShakeAnimView", "delayNotifyClick, isInvokeCallback: %s", java.lang.Boolean.valueOf(walletAwardShakeAnimView.f180707i));
        if (walletAwardShakeAnimView.f180707i) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(walletAwardShakeAnimView.f180710o)) {
            walletAwardShakeAnimView.f180703e.setText(walletAwardShakeAnimView.getContext().getString(com.tencent.mm.R.string.kzv));
        } else {
            walletAwardShakeAnimView.f180703e.setText(walletAwardShakeAnimView.f180710o);
        }
        int i17 = walletAwardShakeAnimView.f180711p;
        if (i17 != 0) {
            walletAwardShakeAnimView.f180703e.setTextColor(i17);
        }
    }
}
