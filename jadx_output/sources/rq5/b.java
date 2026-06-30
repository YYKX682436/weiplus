package rq5;

/* loaded from: classes9.dex */
public abstract class b {
    public static void a(int i17) {
        com.tencent.mars.xlog.Log.i("BigImageReporter", "alvinluo reportLoadError errCode: %d", java.lang.Integer.valueOf(i17));
        if (i17 == 4) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(896L, 2L, 1L);
        } else if (i17 == 5) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(896L, 3L, 1L);
        }
    }
}
