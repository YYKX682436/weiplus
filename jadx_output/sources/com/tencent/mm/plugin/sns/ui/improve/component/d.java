package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.j f168753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.sns.ui.improve.component.j jVar) {
        super(0);
        this.f168753d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$layoutManager$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$layoutManager$2");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f168753d.getRecycleView().getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager improveLayoutManager = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager) layoutManager;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$layoutManager$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$layoutManager$2");
        return improveLayoutManager;
    }
}
