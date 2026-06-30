package uc4;

/* loaded from: classes4.dex */
public final class c1 extends uc4.g {

    /* renamed from: f, reason: collision with root package name */
    public final n34.d5 f426385f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f426385f = new n34.d5();
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStarClick");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStarClick");
            return;
        }
        xc4.p c17 = c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStarClick");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = c17.c1();
        android.content.Context context = b();
        n34.d5 d5Var = this.f426385f;
        d5Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelStar", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        kotlin.jvm.internal.o.g(context, "context");
        n34.y4 y4Var = new n34.y4(d5Var, snsInfo, view, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showCancelStarAlbert", "com.tencent.mm.plugin.sns.SnsStarUIHelper");
        db5.e1.L(context, false, i65.a.r(context, com.tencent.mm.R.string.jew), "", i65.a.r(context, com.tencent.mm.R.string.jev), i65.a.r(context, com.tencent.mm.R.string.jex), new n34.k4(y4Var), n34.l4.f334674d, com.tencent.mm.R.color.Red_100, -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showCancelStarAlbert", "com.tencent.mm.plugin.sns.SnsStarUIHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelStar", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStarClick");
    }
}
