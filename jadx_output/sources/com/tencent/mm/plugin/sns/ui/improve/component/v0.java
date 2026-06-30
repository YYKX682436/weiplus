package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f169031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC) {
        super(0);
        this.f169031d = improveMainUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$bottomLoadingView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$bottomLoadingView$2");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView improveLoadingMoreView = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView(this.f169031d.getContext());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$bottomLoadingView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$bottomLoadingView$2");
        return improveLoadingMoreView;
    }
}
