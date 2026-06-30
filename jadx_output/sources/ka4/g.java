package ka4;

/* loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ka4.g f306130d = new ka4.g();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getAfterMaxToPredict$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "getAfterMaxToPredict >> " + ka4.m.a());
        if (ka4.m.a() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getAfterMaxToPredict$1");
            return;
        }
        java.util.List a17 = com.tencent.mm.plugin.sns.storage.i2.f166022a.a(ka4.m.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getAfterMaxToPredict getSnsInfoLargeThanCreateTime >> ");
        sb6.append(((java.util.ArrayList) a17).size());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", sb6.toString());
        if (!r5.isEmpty()) {
            int createTime = ((com.tencent.mm.plugin.sns.storage.SnsInfo) kz5.n0.X(a17)).getCreateTime();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            ka4.m.f306141f = createTime;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            ka4.m.c(ka4.m.f306136a, (java.util.ArrayList) a17, true, ka4.c.f306123f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$getAfterMaxToPredict$1");
    }
}
