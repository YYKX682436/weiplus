package uc4;

/* loaded from: classes4.dex */
public final class y0 extends uc4.m0 {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f426466g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f426466g = jz5.h.b(new uc4.x0(this));
    }

    @Override // uc4.g
    public android.view.View.OnCreateContextMenuListener d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLinkMenuListner", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick");
        com.tencent.mm.plugin.sns.ui.listener.h1 h1Var = (com.tencent.mm.plugin.sns.ui.listener.h1) ((jz5.n) this.f426466g).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLinkMenuListner", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick");
        return h1Var;
    }
}
