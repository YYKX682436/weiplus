package n34;

/* loaded from: classes4.dex */
public final class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.SnsStarListUIC f334619d;

    public h4(com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC) {
        this.f334619d = snsStarListUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.SnsStarListUIC$setSnsList$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("post ");
        com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC = this.f334619d;
        sb6.append(com.tencent.mm.plugin.sns.SnsStarListUIC.P6(snsStarListUIC).getLastVisiblePosition());
        sb6.append(", ");
        sb6.append(com.tencent.mm.plugin.sns.SnsStarListUIC.P6(snsStarListUIC).getCount());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListUIC", sb6.toString());
        if (com.tencent.mm.plugin.sns.SnsStarListUIC.P6(snsStarListUIC).getLastVisiblePosition() == com.tencent.mm.plugin.sns.SnsStarListUIC.P6(snsStarListUIC).getCount() - 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListUIC", "load data by post");
            androidx.appcompat.app.AppCompatActivity activity = snsStarListUIC.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.sns.SnsStarListDataUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.SnsStarListDataUIC.class)).U6();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.SnsStarListUIC$setSnsList$1");
    }
}
