package nz2;

/* loaded from: classes9.dex */
public class h extends nz2.a {
    @Override // nz2.o
    public java.util.Map C() {
        return null;
    }

    @Override // nz2.o
    public void C3(android.content.Context context, nz2.f fVar, nz2.b bVar) {
    }

    @Override // nz2.o
    public boolean D() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DummyBiometricPayManager", "isFaceIdFreeze");
        return false;
    }

    @Override // nz2.o
    public void D1(java.lang.Object... objArr) {
    }

    @Override // nz2.o
    public boolean E2() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DummyBiometricPayManager", "isFingerprintFreeze");
        return false;
    }

    @Override // nz2.a, nz2.o
    public boolean Je() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DummyBiometricPayManager", "canUse");
        return false;
    }

    @Override // nz2.o
    public boolean Lf(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DummyBiometricPayManager", "isSupportFingerprint");
        return false;
    }

    @Override // nz2.o
    public void Mf(boolean z17, boolean z18, boolean z19, android.os.Bundle bundle) {
    }

    @Override // nz2.o
    public void cancel() {
    }

    @Override // nz2.o
    public void g9(android.content.Context context, nz2.f fVar, nz2.b bVar) {
    }

    @Override // nz2.o
    public boolean h1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DummyBiometricPayManager", "isDeviceEnrolledFaceId");
        return false;
    }

    @Override // nz2.o
    public boolean ja() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DummyBiometricPayManager", "isDeviceHasFingerPrint:false");
        return false;
    }

    @Override // nz2.o
    public boolean mf() {
        return false;
    }

    @Override // nz2.o
    public int of() {
        return 0;
    }

    @Override // nz2.o
    public void prepare() {
        if (((pz2.a) gm0.j1.s(pz2.a.class)) == null) {
            mz2.l0 l0Var = new mz2.l0();
            l0Var.c(this);
            gm0.j1.q(pz2.a.class, l0Var);
        }
        if (wo.v1.f447828h.f447810a && ((ie0.m) ((je0.i) i95.n0.c(je0.i.class))).wi()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DummyBiometricPayManager", "maybe soter init fail, reinit");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 42);
            je0.i iVar = (je0.i) i95.n0.c(je0.i.class);
            nz2.g gVar = new nz2.g(this);
            ((ie0.m) iVar).getClass();
            se4.h.a(true, true, gVar);
        }
    }

    @Override // nz2.o
    public pz2.d r1() {
        return null;
    }

    @Override // nz2.o
    public boolean uf(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DummyBiometricPayManager", "isSupportFaceId");
        return false;
    }

    @Override // nz2.o
    public boolean wh() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DummyBiometricPayManager", "isSupport");
        return false;
    }

    @Override // nz2.o
    public void z9(android.content.Context context, nz2.f fVar, nz2.d dVar) {
    }
}
