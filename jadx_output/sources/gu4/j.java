package gu4;

/* loaded from: classes9.dex */
public class j implements fu4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI f275952a;

    public j(com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI) {
        this.f275952a = fingerprintWalletLockUI;
    }

    @Override // fu4.g
    public void h(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "prepare onFinish errCode: %d, errMsg: %s, time: %d", java.lang.Integer.valueOf(i17), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI = this.f275952a;
        if (fingerprintWalletLockUI.f181306y) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "has cancelled and return");
        } else if (i17 == 0) {
            fingerprintWalletLockUI.a7();
        } else {
            fingerprintWalletLockUI.c7(fingerprintWalletLockUI.getString(com.tencent.mm.R.string.knq));
        }
    }
}
