package mz2;

/* loaded from: classes9.dex */
public class w1 implements pz2.d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f333198a = null;

    /* renamed from: b, reason: collision with root package name */
    public pz2.b f333199b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f333200c = "";

    /* renamed from: d, reason: collision with root package name */
    public pz2.b f333201d = null;

    /* renamed from: e, reason: collision with root package name */
    public d50.q f333202e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f333203f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f333204g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f333205h;

    @Override // pz2.d
    public void a(android.content.Context context, pz2.b bVar, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: prepare");
        ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
        this.f333202e = new ne4.n();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference((com.tencent.mm.wallet_core.ui.WalletBaseUI) context);
        this.f333198a = weakReference;
        this.f333199b = bVar;
        this.f333200c = str;
        ((com.tencent.mm.wallet_core.ui.WalletBaseUI) weakReference.get()).addSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.media.r6.CTRL_INDEX);
        ((com.tencent.mm.wallet_core.ui.WalletBaseUI) this.f333198a.get()).addSceneEndListener(1638);
        re4.n.j();
        ((nz2.o) gm0.j1.s(nz2.o.class)).D1(new java.lang.Object[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: start gen auth key");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 35);
        d50.q qVar = this.f333202e;
        mz2.u1 u1Var = new mz2.u1(this);
        d50.k kVar = (d50.k) i95.n0.c(d50.k.class);
        java.lang.String str2 = this.f333200c;
        ((d50.i) kVar).getClass();
        ((ne4.n) qVar).b(u1Var, true, 1, new oz2.c(str2, 1), 0);
    }

    @Override // pz2.d
    public void b(pz2.b bVar, java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: doOpenFP");
        this.f333201d = bVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f333204g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterFingerprintOpenDelegate", "hy: signature is null");
            re4.n.g(9, -1000223, -1, "signature is null");
            d(-1, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f_k));
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f333198a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = (com.tencent.mm.wallet_core.ui.WalletBaseUI) this.f333198a.get();
        d50.k kVar = (d50.k) i95.n0.c(d50.k.class);
        java.lang.String str2 = this.f333204g;
        java.lang.String str3 = this.f333205h;
        java.lang.String str4 = this.f333200c;
        ((d50.i) kVar).getClass();
        walletBaseUI.doSceneProgress(new oz2.b(str2, str3, str4, 1));
    }

    @Override // pz2.d
    public void c(android.content.Context context, pz2.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "request authentication");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f333203f)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SoterFingerprintOpenDelegate", "no challenge!!");
        } else {
            if (bVar == null) {
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 41);
            ((nz2.o) gm0.j1.s(nz2.o.class)).g9(context, new nz2.f(this.f333203f, 1), new mz2.t1(this, bVar));
        }
    }

    @Override // pz2.d
    public void clear() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: clear");
        java.lang.ref.WeakReference weakReference = this.f333198a;
        if (weakReference != null && weakReference.get() != null) {
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) this.f333198a.get()).removeSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.media.r6.CTRL_INDEX);
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) this.f333198a.get()).removeSceneEndListener(1638);
        }
        this.f333199b = null;
        mz2.d2.IML.h();
        java.lang.ref.WeakReference weakReference2 = this.f333198a;
        if (weakReference2 == null || weakReference2.get() == null) {
            return;
        }
        this.f333198a.clear();
    }

    public final void d(int i17, java.lang.String str) {
        pz2.b bVar = this.f333199b;
        if (bVar != null) {
            bVar.h(i17, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pz2.d
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: onSceneEnd: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f_k);
        }
        if (m1Var instanceof d50.l) {
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SoterFingerprintOpenDelegate", "hy: failed get challenge");
                d(i18, str);
                re4.n.g(7, i17, i18, "get challenge failed");
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "get challenge success");
            oz2.a aVar = (oz2.a) ((d50.l) m1Var);
            if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f350239f)) {
                d(-1, str);
                return true;
            }
            this.f333203f = aVar.f350239f;
            com.tencent.mm.sdk.platformtools.u3.h(new mz2.v1(this));
        }
        if (!(m1Var instanceof d50.m)) {
            return false;
        }
        if (i18 == 0 && i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: open success");
            re4.n.h();
            re4.n.g(0, 0, 0, "OK");
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: callback total");
            clear();
            this.f333201d.h(0, str);
            this.f333201d = null;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: open");
            re4.n.g(8, i17, i18, "open fp pay failed");
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: callback total");
            clear();
            this.f333201d.h(-1, str);
            this.f333201d = null;
        }
        return true;
    }
}
