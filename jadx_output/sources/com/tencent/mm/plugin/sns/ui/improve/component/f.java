package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.j f168786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.sns.ui.improve.component.j jVar) {
        super(0);
        this.f168786d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$overScrollView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$overScrollView$2");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView improveOverScrollView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView) this.f168786d.findViewById(com.tencent.mm.R.id.mce);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$overScrollView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$overScrollView$2");
        return improveOverScrollView;
    }
}
