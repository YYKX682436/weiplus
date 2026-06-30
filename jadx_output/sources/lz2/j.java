package lz2;

/* loaded from: classes9.dex */
public class j implements pz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lz2.k f322339d;

    public j(lz2.k kVar) {
        this.f322339d = kVar;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "prepared finish: %s, %s", java.lang.Integer.valueOf(i17), str);
        lz2.k kVar = this.f322339d;
        kVar.f322346d.hideProgress();
        if (i17 == 0) {
            kVar.f322346d.f136981d.setEnabled(true);
        } else {
            com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI = kVar.f322346d;
            walletFaceIdAuthUI.U6(walletFaceIdAuthUI.getString(com.tencent.mm.R.string.aiu));
        }
    }
}
