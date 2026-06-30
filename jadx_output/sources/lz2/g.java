package lz2;

/* loaded from: classes9.dex */
public class g implements pz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lz2.i f322336d;

    public g(lz2.i iVar) {
        this.f322336d = iVar;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "prepared finish: %s, %s", java.lang.Integer.valueOf(i17), str);
        lz2.i iVar = this.f322336d;
        iVar.f322346d.hideProgress();
        if (i17 == 0) {
            iVar.a();
        } else {
            com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI = iVar.f322346d;
            walletFaceIdAuthUI.U6(walletFaceIdAuthUI.getString(com.tencent.mm.R.string.aiu));
        }
    }
}
