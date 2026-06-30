package mz2;

/* loaded from: classes9.dex */
public abstract class a implements pz2.a {

    /* renamed from: d, reason: collision with root package name */
    public nz2.o f333085d;

    @Override // pz2.a
    public boolean D() {
        return false;
    }

    @Override // pz2.a
    public java.util.Map F8() {
        return C();
    }

    @Override // pz2.a
    public boolean H4() {
        return false;
    }

    @Override // pz2.a
    public java.lang.String Uh() {
        return "";
    }

    public boolean a() {
        ((nz2.a) ((nz2.o) gm0.j1.s(nz2.o.class))).getClass();
        return mz2.m0.a();
    }

    public boolean b() {
        return ((nz2.a) ((nz2.o) gm0.j1.s(nz2.o.class))).a();
    }

    public void c(nz2.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseFingerprintImp", "setBiometricManager %s", oVar.toString());
        this.f333085d = oVar;
    }

    public void d(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseFingerprintImp", "set is open faceid: %s", java.lang.Boolean.valueOf(z17));
        ((nz2.a) ((nz2.o) gm0.j1.s(nz2.o.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractBiometricPayManager", "set is open faceid: %s", java.lang.Boolean.valueOf(z17));
        mz2.m0.c(z17);
    }

    public void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseFingerprintImp", "hy: set isOpenFp: %b", java.lang.Boolean.valueOf(z17));
        ((nz2.a) ((nz2.o) gm0.j1.s(nz2.o.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractBiometricPayManager", "hy: set isOpenFp: %b", java.lang.Boolean.valueOf(z17));
        mz2.m0.b(z17);
    }

    public void f(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseFingerprintImp", "showFingerPrintEntrance");
        if (a() && !yh()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseFingerprintImp", "the fingerprint is open ready, but system has none Finger print ids!");
            return;
        }
        if (b() && !a1()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseFingerprintImp", "the faceid is open ready, but system has none face ids!");
        } else if (wo.v1.f447826f.f447867a != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseFingerprintImp", "hy: device info not support");
        }
    }
}
