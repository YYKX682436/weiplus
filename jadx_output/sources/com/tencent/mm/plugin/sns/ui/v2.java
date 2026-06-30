package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class v2 extends com.tencent.mm.plugin.sns.ui.o2 {

    /* renamed from: s, reason: collision with root package name */
    public final int f170619s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.ui.MMActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f170619s = 45;
    }

    @Override // com.tencent.mm.plugin.sns.ui.o2
    public int o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsType", "com.tencent.mm.plugin.sns.ui.FinderPurchaseLiveWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsType", "com.tencent.mm.plugin.sns.ui.FinderPurchaseLiveWidget");
        return this.f170619s;
    }
}
