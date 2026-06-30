package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public final class n7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView f169981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView passThroughRecyclerView) {
        super(0);
        this.f169981d = passThroughRecyclerView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView$touchSlop$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView$touchSlop$2");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(android.view.ViewConfiguration.get(this.f169981d.getContext()).getScaledTouchSlop());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView$touchSlop$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView$touchSlop$2");
        return valueOf;
    }
}
