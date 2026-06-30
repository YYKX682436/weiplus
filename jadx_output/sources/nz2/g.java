package nz2;

/* loaded from: classes9.dex */
public class g implements re4.z {
    public g(nz2.h hVar) {
    }

    @Override // re4.z
    public void h(int i17, java.lang.String str) {
        if (!cu5.b.c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DummyBiometricPayManager", "init failed: %s, %s", java.lang.Integer.valueOf(i17), str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 43);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.DummyBiometricPayManager", "init success: %s", java.lang.Integer.valueOf(i17));
            nz2.x xVar = new nz2.x();
            xVar.prepare();
            gm0.j1.q(nz2.o.class, xVar);
        }
    }
}
