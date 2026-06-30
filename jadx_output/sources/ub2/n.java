package ub2;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final ub2.n f426084a = new ub2.n();

    /* renamed from: b, reason: collision with root package name */
    public static long f426085b;

    public final boolean a() {
        long j17;
        if (f426085b == 0) {
            ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
            p05.a3 a3Var = p05.a3.f350439a;
            java.lang.String g17 = a3Var.g("MODEL_OSD");
            ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
            java.lang.String g18 = a3Var.g("MODEL_OSD_FEATURES");
            if (!(g17 == null || g17.length() == 0)) {
                if (!(g18 == null || g18.length() == 0)) {
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    f426085b = com.tencent.mm.xeffect.WeWatermarkDet.nInit(g17, g18);
                    j17 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
                    com.tencent.mars.xlog.Log.i("Finder.WatermarkDetCore", "[init] initTime:" + j17 + ", modelPath:" + g17 + " watermarkPath:" + g18);
                }
            }
            j17 = 0;
            com.tencent.mars.xlog.Log.i("Finder.WatermarkDetCore", "[init] initTime:" + j17 + ", modelPath:" + g17 + " watermarkPath:" + g18);
        }
        return f426085b != 0;
    }
}
