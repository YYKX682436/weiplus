package sb4;

/* loaded from: classes4.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f405444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f405445e;

    public b0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        this.f405444d = snsInfo;
        this.f405445e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$5");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f405444d;
        if (snsInfo != null) {
            long j17 = snsInfo.field_snsId;
            if (sb4.z.a().containsKey(java.lang.Long.valueOf(j17))) {
                sb4.e0 e0Var = (sb4.e0) sb4.z.a().get(java.lang.Long.valueOf(j17));
                int i17 = e0Var.f405487f;
                int i18 = this.f405445e;
                if (i17 == 0) {
                    e0Var.f405487f = i18 + 1;
                }
                if (e0Var.f405483b == null) {
                    e0Var.f405483b = new java.util.HashSet();
                }
                e0Var.f405483b.add(java.lang.Integer.valueOf(i18 + 1));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$5");
    }
}
