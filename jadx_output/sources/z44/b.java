package z44;

/* loaded from: classes3.dex */
public class b implements z44.a {
    @Override // z44.a
    public void a(java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_11855");
        d(0, objArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_11855");
    }

    @Override // z44.a
    public void d(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_11855");
        if (i17 == 0 || i17 == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11855, objArr);
        } else if (i17 != 2) {
            com.tencent.mars.xlog.Log.e("Kv_11855", "unknown type %d", java.lang.Integer.valueOf(i17));
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14646, objArr);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_11855");
    }

    @Override // z44.a
    public int getKey() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.ad.kv.Kv_11855");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.ad.kv.Kv_11855");
        return 11855;
    }
}
