package n84;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public static volatile n84.x f335700a;

    public static n84.x a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
        if (f335700a == null) {
            synchronized (n84.x.class) {
                try {
                    if (f335700a == null) {
                        f335700a = new n84.x();
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
                    throw th6;
                }
            }
        }
        n84.x xVar = f335700a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
        return xVar;
    }

    public void b(java.lang.Runnable runnable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runOnUiThread", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
        if (runnable != null) {
            ((ku5.t0) ku5.t0.f312615d).B(runnable);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runOnUiThread", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
    }
}
