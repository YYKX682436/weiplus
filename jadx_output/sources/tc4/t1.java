package tc4;

/* loaded from: classes4.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f417467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc4.x1 f417468e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(android.content.Context context, tc4.x1 x1Var) {
        super(0);
        this.f417467d = context;
        this.f417468e = x1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$debugLabel$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$debugLabel$2");
        android.content.Context context = this.f417467d;
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView(context);
        improveTextView.setTextSize(0, i65.a.p(context, com.tencent.mm.R.dimen.f479897ia));
        improveTextView.setId(com.tencent.mm.R.id.n97);
        improveTextView.setBackgroundColor(i65.a.d(context, com.tencent.mm.R.color.f478532ac));
        tc4.x1 x1Var = this.f417468e;
        improveTextView.setPadding(0, x1Var.m(1), 0, x1Var.m(1));
        improveTextView.setTextColor(i65.a.d(context, com.tencent.mm.R.color.FG_0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$debugLabel$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$debugLabel$2");
        return improveTextView;
    }
}
