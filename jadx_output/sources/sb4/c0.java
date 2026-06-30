package sb4;

/* loaded from: classes4.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f405451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f405452e;

    public c0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        this.f405451d = snsInfo;
        this.f405452e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$6");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f405451d;
        if (snsInfo != null) {
            long j17 = snsInfo.field_snsId;
            if (sb4.z.a().containsKey(java.lang.Long.valueOf(j17))) {
                sb4.e0 e0Var = (sb4.e0) sb4.z.a().get(java.lang.Long.valueOf(j17));
                if (e0Var.f405484c == null) {
                    e0Var.f405484c = new java.util.HashSet();
                }
                java.util.HashSet hashSet = e0Var.f405484c;
                int i17 = this.f405452e;
                if (!hashSet.contains(java.lang.Integer.valueOf(i17 + 1))) {
                    e0Var.f405484c.add(java.lang.Integer.valueOf(i17 + 1));
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$6");
    }
}
