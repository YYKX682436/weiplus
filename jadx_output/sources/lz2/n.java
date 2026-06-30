package lz2;

/* loaded from: classes9.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final pz2.a f322343a;

    /* renamed from: b, reason: collision with root package name */
    public final mz2.s1 f322344b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f322345c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI f322346d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f322347e;

    public n(com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI) {
        this.f322346d = walletFaceIdAuthUI;
        this.f322345c = walletFaceIdAuthUI.f136983f == 0 ? walletFaceIdAuthUI.getProcess().f213801c : walletFaceIdAuthUI.getIntent().getExtras();
        this.f322344b = new mz2.s1();
        this.f322343a = (pz2.a) gm0.j1.s(pz2.a.class);
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "do face id auth");
        mz2.e1 e1Var = (mz2.e1) i95.n0.c(mz2.e1.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("face_auth_scene", 0);
        ((mz2.j2) e1Var).wi(this.f322346d, new lz2.m(this), bundle);
    }

    public abstract void b();

    public abstract int c();

    public abstract boolean d();

    public abstract void e();

    public void f() {
        com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI = this.f322346d;
        pz2.a aVar = this.f322343a;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletFaceIdAuthUI", "no mgr");
            walletFaceIdAuthUI.U6(walletFaceIdAuthUI.getString(com.tencent.mm.R.string.c8v));
            return;
        }
        boolean Rb = aVar.Rb();
        boolean a17 = aVar.a1();
        boolean z17 = wo.v1.f447826f.f447867a != 1;
        android.os.Bundle bundle = this.f322345c;
        if (!Rb || !a17 || z17 || bundle == null) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Boolean.valueOf(Rb);
            objArr[1] = java.lang.Boolean.valueOf(a17);
            objArr[2] = java.lang.Boolean.valueOf(z17);
            objArr[3] = java.lang.Boolean.valueOf(bundle == null);
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletFaceIdAuthUI", "support: %s, enrolled: %s, forceClose: %s, data: %s", objArr);
            walletFaceIdAuthUI.U6(walletFaceIdAuthUI.getString(com.tencent.mm.R.string.c8v));
            return;
        }
        java.lang.String string = bundle.getString("pwd");
        this.f322347e = string;
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletFaceIdAuthUI", "no pwd");
            walletFaceIdAuthUI.U6(walletFaceIdAuthUI.getString(com.tencent.mm.R.string.c8v));
        } else {
            ju5.n.c().b();
            b();
        }
    }

    public abstract void g();

    public abstract void h();

    public abstract boolean i(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var);
}
