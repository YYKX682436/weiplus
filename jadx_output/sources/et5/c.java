package et5;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f256672a;

    static {
        new et5.b(null);
        try {
            boolean a17 = gm0.j1.a();
            if (a17 && f256672a == null) {
                f256672a = com.tencent.mm.sdk.platformtools.o4.M(c01.z1.r() + "_scan_cost_mmkv");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCostManager", "initMMKV %s, mmkv: %s", java.lang.Boolean.valueOf(a17), f256672a);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanCostManager", e17, "checkInitMMKV exception", new java.lang.Object[0]);
        }
    }
}
