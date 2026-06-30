package ug1;

/* loaded from: classes4.dex */
public abstract class b {
    public static final void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandParallelTaskReporter", "report: key = [%d]", java.lang.Integer.valueOf(i17));
        if (i17 < 0 || i17 > 255) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1248, i17);
    }
}
