package lz2;

/* loaded from: classes9.dex */
public class m implements lz2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lz2.n f322342a;

    public m(lz2.n nVar) {
        this.f322342a = nVar;
    }

    @Override // lz2.a
    public void onAuthCancel() {
        this.f322342a.h();
    }

    @Override // lz2.a
    public void onAuthFail(int i17) {
        com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI = this.f322342a.f322346d;
        walletFaceIdAuthUI.U6(walletFaceIdAuthUI.getString(com.tencent.mm.R.string.c8v));
    }

    @Override // lz2.a
    public void onAuthSuccess(int i17, int i18) {
        lz2.n nVar = this.f322342a;
        com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI = nVar.f322346d;
        walletFaceIdAuthUI.f136985h = "cgiFail";
        walletFaceIdAuthUI.showProgress();
        nVar.f322344b.b(new lz2.l(nVar), java.lang.String.valueOf(i17), nVar.c() == 1 ? 2 : 1);
    }
}
