package p05;

/* loaded from: classes5.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final p05.o2 f350631d = new p05.o2();

    public o2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.t87 t87Var = new r45.t87();
        com.tencent.mm.sdk.platformtools.o4 Bi = p05.v2.f350704d.Bi();
        p05.p3 p3Var = p05.p3.f350639a;
        byte[] j17 = Bi.j("effect_config");
        if (j17 != null) {
            try {
                t87Var.parseFrom(j17);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        p05.v2 v2Var = p05.v2.f350704d;
        boolean z17 = false;
        v2Var.Ni(t87Var, false);
        new p05.b().l().K(p05.t2.f350692a);
        com.tencent.mm.sdk.platformtools.o4 Bi2 = v2Var.Bi();
        p05.p3 p3Var2 = p05.p3.f350639a;
        long j18 = Bi2.getLong("score_cgi_time", 0L);
        if (v2Var.Bi().f("cpu_score") && v2Var.Bi().f("gpu_score")) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i(p05.v2.f350705e, "loadDeviceScore: last:" + j18 + ", hasScore:" + z17);
        if (!z17 ? java.lang.System.currentTimeMillis() - j18 > p05.v2.f350707g : java.lang.System.currentTimeMillis() - j18 > p05.v2.f350706f) {
            new p05.a().l().K(p05.s2.f350687a);
        }
        return jz5.f0.f302826a;
    }
}
