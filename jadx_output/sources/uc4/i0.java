package uc4;

/* loaded from: classes4.dex */
public final class i0 extends uc4.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGroupClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGroupClick");
        } else {
            gc4.k.f270459a.b(b(), (int) c17.U0(), 1, 2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGroupClick");
        }
    }
}
