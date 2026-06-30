package l44;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f316137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f316138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f316139f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, kotlin.jvm.internal.f0 f0Var, int i17) {
        super(1);
        this.f316137d = j17;
        this.f316138e = f0Var;
        this.f316139f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$3");
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$3");
        if (java.lang.System.currentTimeMillis() % 10 == 0) {
            ca4.e0.b("auto_clean_ad_record_info", "" + intValue, this.f316138e.f310116d, this.f316139f, java.lang.String.valueOf(java.lang.System.currentTimeMillis() - this.f316137d));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$3");
        return f0Var;
    }
}
