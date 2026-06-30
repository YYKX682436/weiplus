package mz2;

@j95.b
/* loaded from: classes3.dex */
public class j2 extends i95.w implements mz2.e1 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Ai(android.app.Activity r22) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz2.j2.Ai(android.app.Activity):boolean");
    }

    public final boolean Bi() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_soter_adopt_to_android12_by_device, 0) == 1 || bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_UseBiometricPrompt_Int, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSoterService", "use biometric prompt: %s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public void wi(com.tencent.mm.ui.MMActivity mMActivity, lz2.a aVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog walletFaceIdDialog = new com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog(mMActivity, aVar, bundle);
        walletFaceIdDialog.setCancelable(false);
        mMActivity.mo133getLifecycle().a(walletFaceIdDialog);
        walletFaceIdDialog.show();
    }
}
