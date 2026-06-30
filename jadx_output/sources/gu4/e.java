package gu4;

/* loaded from: classes9.dex */
public class e implements fu4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI f275947a;

    public e(com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI) {
        this.f275947a = fingerprintWalletLockUI;
    }

    @Override // fu4.g
    public void h(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "open fingerprint lock onFinish errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI = this.f275947a;
        if (i17 != 0) {
            java.lang.String string = fingerprintWalletLockUI.getString(com.tencent.mm.R.string.knr);
            int i18 = com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.C;
            fingerprintWalletLockUI.c7(string);
            return;
        }
        int i19 = com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.C;
        fingerprintWalletLockUI.V6();
        com.tencent.mm.sdk.platformtools.u3.h(new gu4.f(fingerprintWalletLockUI));
        dp.a.makeText(fingerprintWalletLockUI, com.tencent.mm.R.string.kns, 0).show();
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().j(2);
        com.tencent.mm.plugin.walletlock.model.n.INSTANCE.i();
        fingerprintWalletLockUI.Y6(-1, 0, "open fingerprint lock ok");
    }
}
