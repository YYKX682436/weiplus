package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.f1 f171424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.sns.ui.wsfold.f1 f1Var) {
        super(0);
        this.f171424d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$bottomLoadingView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$bottomLoadingView$2");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView improveLoadingMoreView = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView(this.f171424d.getContext());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$bottomLoadingView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$bottomLoadingView$2");
        return improveLoadingMoreView;
    }
}
