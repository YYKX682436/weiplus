package sb4;

/* loaded from: classes4.dex */
public final /* synthetic */ class z$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f405594d;

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$recordClickExceprtReadOrigin$1", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        java.util.HashMap hashMap = sb4.z.f405591d;
        long j17 = this.f405594d;
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            ((sb4.e0) hashMap.get(java.lang.Long.valueOf(j17))).getClass();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$recordClickExceprtReadOrigin$1", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }
}
