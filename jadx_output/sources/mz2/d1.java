package mz2;

/* loaded from: classes9.dex */
public class d1 implements pz2.d {

    /* renamed from: g, reason: collision with root package name */
    public int f333107g;

    /* renamed from: a, reason: collision with root package name */
    public pz2.b f333101a = null;

    /* renamed from: b, reason: collision with root package name */
    public pz2.b f333102b = null;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletBaseUI f333103c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f333104d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f333105e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f333106f = null;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f333108h = new com.tencent.mm.sdk.platformtools.n3(new mz2.y0(this));

    @Override // pz2.d
    public void a(android.content.Context context, pz2.b bVar, java.lang.String str) {
        this.f333103c = (com.tencent.mm.wallet_core.ui.WalletBaseUI) context;
        this.f333101a = bVar;
        this.f333106f = str;
        java.lang.String rsaKey = com.tencent.mm.plugin.fingerprint.FingerPrintAuth.getRsaKey(mz2.n0.a(com.tencent.mm.sdk.platformtools.x2.f193071a), mz2.n0.b(), wo.w0.k());
        re4.n.j();
        if (android.text.TextUtils.isEmpty(rsaKey)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HwFingerprintOpenDelegate", "FingerPrintAuth.getRsaKey() is null");
            s75.d.b(new mz2.a2(new mz2.c2(new mz2.c1(this, null))), mz2.c2.class.getName());
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.HwFingerprintOpenDelegate", "do NetSceneTenpayGetOpenTouchCert");
            this.f333103c.doSceneProgress(new oz2.e(rsaKey), false);
        }
    }

    @Override // pz2.d
    public void b(pz2.b bVar, java.lang.String str, int i17) {
        java.lang.String str2;
        java.lang.String str3;
        this.f333102b = bVar;
        if (android.text.TextUtils.isEmpty(this.f333106f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HwFingerprintOpenDelegate", "get user pwd error");
            bVar.h(-1, this.f333103c.getString(com.tencent.mm.R.string.f_k));
            return;
        }
        java.lang.String b17 = mz2.n0.b();
        java.lang.String k17 = wo.w0.k();
        java.lang.String a17 = com.tencent.mm.wallet_core.model.f1.a();
        if (mz2.n0.c()) {
            str2 = com.tencent.mm.plugin.fingerprint.FingerPrintAuth.genOpenFPEncrypt(mz2.n0.a(com.tencent.mm.sdk.platformtools.x2.f193071a), b17, k17, java.lang.String.valueOf(this.f333107g), a17, "", this.f333104d, this.f333105e, wo.w0.m());
            str3 = com.tencent.mm.plugin.fingerprint.FingerPrintAuth.genOpenFPSign(mz2.n0.a(com.tencent.mm.sdk.platformtools.x2.f193071a), mz2.n0.b(), wo.w0.k(), str2);
        } else {
            str2 = "";
            str3 = "";
        }
        if (android.text.TextUtils.isEmpty(this.f333104d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HwFingerprintOpenDelegate", "The value of encrypted_device_info which return by FingerPrintAuth.genOpenFPEncrypt is null");
        } else if (android.text.TextUtils.isEmpty(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HwFingerprintOpenDelegate", "The value of encrypto_open_sign which return by FingerPrintAuth.genOpenFPSign is null");
        }
        this.f333103c.doSceneProgress(new oz2.f(str2, str3, this.f333106f, i17), false);
    }

    @Override // pz2.d
    public void c(android.content.Context context, pz2.b bVar) {
        ((nz2.o) gm0.j1.s(nz2.o.class)).g9(context, new nz2.f(""), new mz2.z0(this, bVar));
    }

    @Override // pz2.d
    public void clear() {
    }

    @Override // pz2.d
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof oz2.e)) {
            if (!(m1Var instanceof oz2.f)) {
                return false;
            }
            if (i17 == 0 && i18 == 0) {
                re4.n.h();
                re4.n.g(0, 0, 0, "OK");
                this.f333102b.h(0, "");
            } else {
                this.f333102b.h(-2, "");
            }
            return true;
        }
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HwFingerprintOpenDelegate", "get FingerPrint cert success");
            oz2.e eVar = (oz2.e) m1Var;
            this.f333104d = eVar.f350250d;
            this.f333105e = eVar.f350251e;
            this.f333101a.h(0, "");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.HwFingerprintOpenDelegate", "get FingerPrint cert error");
            pz2.b bVar = this.f333101a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = this.f333103c.getString(com.tencent.mm.R.string.f_k);
            }
            bVar.h(-1, str);
        }
        return true;
    }
}
