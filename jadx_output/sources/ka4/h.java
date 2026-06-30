package ka4;

/* loaded from: classes4.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ka4.h f306131d = new ka4.h();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getBeforeMinToPredict$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "getBeforeMinToPredict >> " + ka4.m.b());
        if (ka4.m.b() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getBeforeMinToPredict$1");
            return;
        }
        java.util.List b17 = com.tencent.mm.plugin.sns.storage.i2.f166022a.b(ka4.m.b(), 50);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBeforeMinToPredict getSnsInfoSmallThanCreateTimeAndLimit >> ");
        sb6.append(((java.util.ArrayList) b17).size());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", sb6.toString());
        if (!r5.isEmpty()) {
            int createTime = ((com.tencent.mm.plugin.sns.storage.SnsInfo) kz5.n0.i0(b17)).getCreateTime();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            ka4.m.f306142g = createTime;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            ka4.m.c(ka4.m.f306136a, (java.util.ArrayList) b17, true, ka4.c.f306124g);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getBeforeMinToPredict$1");
    }
}
