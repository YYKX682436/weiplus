package p34;

@j95.b
/* loaded from: classes3.dex */
public class p extends i95.w implements p94.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f351688d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f351689e = false;

    public void Ai(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        wi();
        z44.a aVar = (z44.a) ((java.util.HashMap) this.f351688d).get(java.lang.Integer.valueOf(i17));
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("SnsAdReportService", "can not find %s implementation for kv %d", z44.a.class, java.lang.Integer.valueOf(i17));
        } else {
            aVar.a(objArr);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
    }

    public void Bi(int i17, int i18, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("kvStatWithRecSrc", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        wi();
        z44.a aVar = (z44.a) ((java.util.HashMap) this.f351688d).get(java.lang.Integer.valueOf(i17));
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("SnsAdReportService", "can not find %s implementation for kv %d", z44.a.class, java.lang.Integer.valueOf(i17));
        } else {
            aVar.d(i18, objArr);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kvStatWithRecSrc", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
    }

    public void Di(z44.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registeKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("SnsAdReportService", "registing null %s", z44.a.class);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registeKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        } else {
            ((java.util.HashMap) this.f351688d).put(java.lang.Integer.valueOf(aVar.getKey()), aVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registeKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        }
    }

    public final void Ni() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerAllKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        Di(new z44.e());
        Di(new z44.d());
        Di(new z44.b());
        Di(new z44.c());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerAllKvReporter", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
    }

    public final void wi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initOnDemand", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
        if (this.f351689e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initOnDemand", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
            return;
        }
        synchronized (this) {
            try {
                if (!this.f351689e) {
                    Ni();
                }
                this.f351689e = true;
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initOnDemand", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initOnDemand", "com.tencent.mm.plugin.sns.ad.SnsAdReportService");
    }
}
