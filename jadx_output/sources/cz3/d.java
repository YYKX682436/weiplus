package cz3;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cz3.d f225026d = new cz3.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_scan_crash_valid_duration_seconds, 604800L);
        java.lang.Long valueOf = java.lang.Long.valueOf(Ui > 0 ? Ui : 604800L);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanFileCrashManager", "crashProtect crashValidDuration: " + valueOf.longValue());
        return valueOf;
    }
}
