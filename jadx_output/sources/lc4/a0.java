package lc4;

/* loaded from: classes4.dex */
public final class a0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC f317946d;

    public a0(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC) {
        this.f317946d = improveDataUIC;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$setupLiveList$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$setupLiveList$1");
        int ordinal = ((ym3.o) obj).f463177a.ordinal();
        if (ordinal == 0 || ordinal == 2) {
            com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC = this.f317946d;
            int size = improveDataUIC.S6().f152065o.size();
            if (size == 0) {
                com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.P6(improveDataUIC).S6(2147483645);
            } else {
                com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.P6(improveDataUIC).S6(2147483646);
                if (size == 1) {
                    com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.P6(improveDataUIC).c7();
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$setupLiveList$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$setupLiveList$1");
    }
}
