package z44;

/* loaded from: classes3.dex */
public class e implements z44.a {
    @Override // z44.a
    public void a(java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_13235");
        d(0, objArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_13235");
    }

    @Override // z44.a
    public void d(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_13235");
        if (i17 != 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13235, objArr);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.kv.Kv_13235");
    }

    @Override // z44.a
    public int getKey() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.ad.kv.Kv_13235");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.ad.kv.Kv_13235");
        return 13235;
    }
}
