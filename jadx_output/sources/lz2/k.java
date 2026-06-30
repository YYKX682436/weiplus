package lz2;

/* loaded from: classes9.dex */
public class k extends lz2.n {

    /* renamed from: f, reason: collision with root package name */
    public boolean f322340f;

    public k(com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI) {
        super(walletFaceIdAuthUI);
        this.f322340f = true;
        re4.n.f394543a = 1;
    }

    @Override // lz2.n
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "do prepare ");
        com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI = this.f322346d;
        walletFaceIdAuthUI.showProgress();
        this.f322344b.a(walletFaceIdAuthUI, new lz2.j(this), this.f322347e);
    }

    @Override // lz2.n
    public int c() {
        return 0;
    }

    @Override // lz2.n
    public boolean d() {
        return false;
    }

    @Override // lz2.n
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "do verify face id");
        a();
    }

    @Override // lz2.n
    public void g() {
        j(false);
    }

    @Override // lz2.n
    public void h() {
        j(false);
    }

    @Override // lz2.n
    public boolean i(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (this.f322344b.onSceneEnd(i17, i18, str, m1Var)) {
            return true;
        }
        if (!(m1Var instanceof ss4.e0)) {
            return false;
        }
        com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI = this.f322346d;
        walletFaceIdAuthUI.hideProgress();
        j(true);
        if (this.f322340f) {
            dp.a.makeText(walletFaceIdAuthUI, com.tencent.mm.R.string.f_l, 0).show();
        }
        return true;
    }

    public final void j(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "do end process");
        android.os.Bundle bundle = new android.os.Bundle();
        if (z17) {
            bundle.putInt("key_process_result_code", -1);
        }
        com.tencent.mm.wallet_core.a.c(this.f322346d, bundle, 0);
    }
}
