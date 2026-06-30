package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class qj implements db5.d8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsInfoFlip f170345a;

    public qj(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        this.f170345a = snsInfoFlip;
    }

    @Override // db5.d8
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("singleClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$2");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.f167186o2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f170345a;
        boolean z17 = snsInfoFlip.F1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip.F(snsInfoFlip);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("singleClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$2");
    }

    @Override // db5.d8
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exitDirectly", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$2");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip.F(this.f170345a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exitDirectly", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$2");
    }
}
