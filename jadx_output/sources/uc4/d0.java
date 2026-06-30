package uc4;

/* loaded from: classes4.dex */
public final class d0 extends uc4.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderLiveClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderLiveClick");
            return;
        }
        android.view.View h17 = h();
        if (h17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderLiveClick");
            return;
        }
        uc4.g.g();
        ot5.g.c("MicroMsg.Improve.Click", "ImproveFinderLiveClick");
        h17.setTag(c17.h1());
        com.tencent.mm.plugin.sns.ui.kw.A(h17);
        dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
        java.lang.String a17 = c17.a1();
        zy1.f fVar = (zy1.f) sVar;
        fVar.Bi(12076, "ClickFeedCount", 1);
        fVar.Di(12076, "ClickFeedId", a17);
        yc4.b0 b0Var = yc4.b0.f460839a;
        b0Var.b(c17.a1());
        b0Var.c(c17.a1(), 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderLiveClick");
    }
}
