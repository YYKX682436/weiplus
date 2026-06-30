package lz2;

/* loaded from: classes9.dex */
public class i extends lz2.n {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f322338f;

    public i(com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI, boolean z17) {
        super(walletFaceIdAuthUI);
        this.f322338f = false;
        this.f322338f = z17;
        re4.n.f394543a = 0;
    }

    @Override // lz2.n
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "do prepare ");
        com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI = this.f322346d;
        walletFaceIdAuthUI.showProgress();
        this.f322344b.a(walletFaceIdAuthUI, new lz2.g(this), this.f322347e);
    }

    @Override // lz2.n
    public int c() {
        return 1;
    }

    @Override // lz2.n
    public boolean d() {
        return true;
    }

    @Override // lz2.n
    public void e() {
    }

    @Override // lz2.n
    public void f() {
        com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI = this.f322346d;
        walletFaceIdAuthUI.getWindow().setDimAmount(0.0f);
        super.f();
        walletFaceIdAuthUI.hideTitleView();
        walletFaceIdAuthUI.hideActionbarLine();
        walletFaceIdAuthUI.setContentViewVisibility(8);
    }

    @Override // lz2.n
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "do finish");
        this.f322346d.finish();
    }

    @Override // lz2.n
    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "do finish");
        this.f322346d.finish();
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
        if (!this.f322338f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "use old successpage");
            com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI2 = this.f322346d;
            db5.e1.E(walletFaceIdAuthUI2, walletFaceIdAuthUI2.getString(com.tencent.mm.R.string.c8x), walletFaceIdAuthUI.getString(com.tencent.mm.R.string.c8w), walletFaceIdAuthUI.getString(com.tencent.mm.R.string.kuq), false, new lz2.h(this));
        } else if (walletFaceIdAuthUI.f136984g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "useLiteApp successpage");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("event_name", "openFaceIdPaySuccess");
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                com.tencent.mm.plugin.lite.w.k(com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_ID, "pay.notifyAll", jSONObject);
                walletFaceIdAuthUI.f136985h = "";
                walletFaceIdAuthUI.finish();
            } catch (org.json.JSONException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        return true;
    }
}
