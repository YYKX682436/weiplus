package cz3;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cz3.c f225025d = new cz3.c();

    public c() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_scan_crash_protect_enable, 1) == 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanFileCrashManager", "crashProtect enable: " + valueOf.booleanValue());
        return valueOf;
    }
}
