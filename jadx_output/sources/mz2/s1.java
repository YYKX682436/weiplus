package mz2;

/* loaded from: classes9.dex */
public class s1 implements pz2.d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f333179a;

    /* renamed from: b, reason: collision with root package name */
    public pz2.b f333180b;

    /* renamed from: c, reason: collision with root package name */
    public pz2.b f333181c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f333182d;

    /* renamed from: e, reason: collision with root package name */
    public d50.q f333183e;

    @Override // pz2.d
    public void a(android.content.Context context, pz2.b bVar, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "do prepare");
        this.f333180b = bVar;
        this.f333182d = str;
        this.f333179a = new java.lang.ref.WeakReference((com.tencent.mm.wallet_core.ui.WalletBaseUI) context);
        ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
        this.f333183e = new ne4.n();
        ((com.tencent.mm.wallet_core.ui.WalletBaseUI) this.f333179a.get()).addSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.media.r6.CTRL_INDEX);
        ((com.tencent.mm.wallet_core.ui.WalletBaseUI) this.f333179a.get()).addSceneEndListener(1638);
        ((nz2.o) gm0.j1.s(nz2.o.class)).D1(new java.lang.Object[0]);
        d50.q qVar = this.f333183e;
        mz2.r1 r1Var = new mz2.r1(this);
        d50.k kVar = (d50.k) i95.n0.c(d50.k.class);
        java.lang.String str2 = this.f333182d;
        ((d50.i) kVar).getClass();
        ((ne4.n) qVar).b(r1Var, true, 1, new oz2.c(str2, 2), 0);
    }

    @Override // pz2.d
    public void b(pz2.b bVar, java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: doOpenFP");
        this.f333181c = bVar;
        zt5.s sVar = mz2.d2.IML.f333114g;
        if (sVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterFaceIdOpenDelegate", "hy: signature is null");
            re4.n.e(9, -1000223, -1, "signature is null");
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c8v);
            pz2.b bVar2 = this.f333181c;
            if (bVar2 != null) {
                bVar2.h(-1, string);
                return;
            }
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f333179a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = (com.tencent.mm.wallet_core.ui.WalletBaseUI) this.f333179a.get();
        d50.k kVar = (d50.k) i95.n0.c(d50.k.class);
        java.lang.String str2 = sVar.f475629j;
        java.lang.String str3 = sVar.f475630k;
        java.lang.String str4 = this.f333182d;
        ((d50.i) kVar).getClass();
        walletBaseUI.doSceneProgress(new oz2.b(str2, str3, str4, 2));
    }

    @Override // pz2.d
    public void c(android.content.Context context, pz2.b bVar) {
    }

    @Override // pz2.d
    public void clear() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: clear");
        java.lang.ref.WeakReference weakReference = this.f333179a;
        if (weakReference != null && weakReference.get() != null) {
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) this.f333179a.get()).removeSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.media.r6.CTRL_INDEX);
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) this.f333179a.get()).removeSceneEndListener(1638);
        }
        mz2.d2.IML.h();
        java.lang.ref.WeakReference weakReference2 = this.f333179a;
        if (weakReference2 == null || weakReference2.get() == null) {
            return;
        }
        this.f333179a.clear();
    }

    public final void d(int i17, java.lang.String str) {
        pz2.b bVar = this.f333180b;
        if (bVar != null) {
            bVar.h(i17, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pz2.d
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: onSceneEnd: errType: %d, errCode: %d, errMsg: %s, scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c8v);
        }
        if (m1Var instanceof d50.l) {
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SoterFaceIdOpenDelegate", "hy: failed get challenge");
                d(i18, str);
                re4.n.e(7, i17, i18, "get challenge failed");
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "get challenge success");
            if (com.tencent.mm.sdk.platformtools.t8.K0(((oz2.a) ((d50.l) m1Var)).f350239f)) {
                d(-1, str);
                return true;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new mz2.q1(this));
        }
        if (!(m1Var instanceof d50.m)) {
            return false;
        }
        if (i18 == 0 && i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: open success");
            re4.n.h();
            re4.n.e(0, 0, 0, "OK");
            pz2.b bVar = this.f333181c;
            if (bVar != null) {
                bVar.h(0, str);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: open");
            re4.n.e(8, i17, i18, "open fp pay failed");
            pz2.b bVar2 = this.f333181c;
            if (bVar2 != null) {
                bVar2.h(-1, str);
            }
        }
        return true;
    }
}
