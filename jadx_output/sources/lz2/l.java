package lz2;

/* loaded from: classes9.dex */
public class l implements pz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lz2.n f322341d;

    public l(lz2.n nVar) {
        this.f322341d = nVar;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        lz2.n nVar = this.f322341d;
        if (i17 != 0) {
            nVar.f322346d.hideProgress();
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletFaceIdAuthUI", "open fingerprintpay failed");
            com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI = nVar.f322346d;
            walletFaceIdAuthUI.U6(walletFaceIdAuthUI.getString(com.tencent.mm.R.string.c8v));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.h6.CTRL_INDEX, 2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "open fingerprintpay success");
        nVar.f322346d.doSceneProgress(new ss4.e0(null, 19), false);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(nVar.c() == 1 ? 1 : 2);
        g0Var.d(15817, objArr);
        g0Var.A(com.tencent.mm.plugin.appbrand.jsapi.h6.CTRL_INDEX, 1);
    }
}
