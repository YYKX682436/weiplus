package vz3;

/* loaded from: classes11.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f441684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz3.q f441685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yz5.l lVar, vz3.q qVar) {
        super(0);
        this.f441684d = lVar;
        this.f441685e = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean bool;
        boolean z17;
        vz3.h hVar = new vz3.h(this.f441684d, this.f441685e);
        java.lang.Boolean bool2 = et5.a.f256671b;
        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
        if (kotlin.jvm.internal.o.b(bool2, bool3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AffScanSoLoader", "loadFFESo loaded success already");
            hVar.invoke(bool3);
        } else {
            try {
                ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
                fp.d0.n("XNet");
                fp.d0.n("opencv_world");
                fp.d0.n("QBar");
                boolean wi6 = ((jd0.o2) ((ry3.k) i95.n0.c(ry3.k.class))).wi("ffengine");
                boolean wi7 = ((jd0.o2) ((ry3.k) i95.n0.c(ry3.k.class))).wi("focusEngineJni");
                if (wi6 && wi7) {
                    hVar.invoke(bool3);
                    z17 = true;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AffScanSoLoader", "loadFFESoSync failed, loadFFE: " + wi6 + ", loadJNI: " + wi7);
                    hVar.invoke(java.lang.Boolean.FALSE);
                    z17 = false;
                }
                bool = java.lang.Boolean.valueOf(z17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AffScanSoLoader", th6, "loadFFESo exception", new java.lang.Object[0]);
                java.lang.Boolean bool4 = java.lang.Boolean.FALSE;
                hVar.invoke(bool4);
                bool = bool4;
            }
            et5.a.f256671b = bool;
            com.tencent.mars.xlog.Log.i("MicroMsg.AffScanSoLoader", "loadFFESo ffeSoLoaded: " + et5.a.f256671b);
        }
        return jz5.f0.f302826a;
    }
}
