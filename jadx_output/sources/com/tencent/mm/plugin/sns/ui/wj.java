package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class wj implements db5.a8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsInfoFlip f171328a;

    public wj(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        this.f171328a = snsInfoFlip;
    }

    @Override // db5.a8
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("longClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$8");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.f167186o2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f171328a.V();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("longClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$8");
    }
}
