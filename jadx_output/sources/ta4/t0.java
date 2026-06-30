package ta4;

/* loaded from: classes11.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ta4.t0 f416835d = new ta4.t0();

    public t0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
        synchronized (ta4.u0.d()) {
            try {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                if (!r75.d.f393261h) {
                    i17 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
                } else if (r75.d.f393258e == -100) {
                    i17 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
                    r75.d.f393258e = i17;
                } else {
                    ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
                    com.tencent.mars.xlog.Log.i("NetWorkCache", "getIOSNetTypeFromCache, iosNetworkType = " + r75.d.f393258e);
                    i17 = r75.d.f393258e;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setNetType$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                ta4.u0.f416845h = i17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setNetType$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                ta4.u0 u0Var = ta4.u0.f416838a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                boolean i18 = u0Var.i();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                if (i18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Image.SnsImageLoadReporter", "startSession, already has currentSession");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
                } else {
                    ta4.u0.e().clear();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSessionLock$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    java.lang.Object obj = ta4.u0.f416843f;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSessionLock$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    synchronized (obj) {
                        try {
                            java.lang.String uuid = java.util.UUID.randomUUID().toString();
                            kotlin.jvm.internal.o.f(uuid, "toString(...)");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            ta4.u0.f416844g = uuid;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start new session:");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            java.lang.String str = ta4.u0.f416844g;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            sb6.append(str);
                            com.tencent.mars.xlog.Log.i("MicroMsg.Image.SnsImageLoadReporter", sb6.toString());
                        } finally {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
                throw th6;
            }
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
        return f0Var;
    }
}
