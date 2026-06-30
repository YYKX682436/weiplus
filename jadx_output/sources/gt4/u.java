package gt4;

/* loaded from: classes9.dex */
public class u extends q35.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView f275559g;

    public u(com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView walletAwardShakeAnimView) {
        this.f275559g = walletAwardShakeAnimView;
    }

    @Override // q35.c
    public void a() {
    }

    @Override // q35.c
    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletAwardShakeAnimView", "onShake");
        com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView walletAwardShakeAnimView = this.f275559g;
        long j17 = walletAwardShakeAnimView.f180705g;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (walletAwardShakeAnimView.f180706h) {
            if (elapsedRealtime < 80) {
                return;
            }
        } else if (elapsedRealtime < 1200) {
            return;
        }
        walletAwardShakeAnimView.f180705g = android.os.SystemClock.elapsedRealtime();
        walletAwardShakeAnimView.f180706h = true;
        if (walletAwardShakeAnimView.f180707i) {
            return;
        }
        walletAwardShakeAnimView.f180707i = true;
        walletAwardShakeAnimView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletAwardShakeAnimView", "onStartShakeOrClick");
        com.tencent.mm.sdk.platformtools.v5.b(walletAwardShakeAnimView.getContext(), com.tencent.mm.R.string.j3j);
        walletAwardShakeAnimView.b();
        gt4.x xVar = walletAwardShakeAnimView.f180713r;
        if (xVar != null) {
            ((gt4.z1) xVar).a(true);
        }
    }
}
