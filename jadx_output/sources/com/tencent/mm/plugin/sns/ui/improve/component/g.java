package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.j f168805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.sns.ui.improve.component.j jVar) {
        super(0);
        this.f168805d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$recycleView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$recycleView$2");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView improveRecyclerView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView) this.f168805d.findViewById(com.tencent.mm.R.id.hbs);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$recycleView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$recycleView$2");
        return improveRecyclerView;
    }
}
