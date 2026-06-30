package on2;

/* loaded from: classes3.dex */
public final class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.b3 f346874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f346875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ on2.f2 f346876f;

    public d2(so2.b3 b3Var, in5.s0 s0Var, on2.f2 f2Var) {
        this.f346874d = b3Var;
        this.f346875e = s0Var;
        this.f346876f = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.G().r()).intValue() <= 0) {
            db5.t7.makeText(view.getContext(), view.getContext().getResources().getString(com.tencent.mm.R.string.cn9), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        so2.b3 b3Var = this.f346874d;
        java.lang.String string = b3Var.f410268d.getString(0);
        com.tencent.mm.plugin.finder.report.p pVar = com.tencent.mm.plugin.finder.report.p.f125222a;
        com.tencent.mm.plugin.finder.report.k kVar = com.tencent.mm.plugin.finder.report.p.f125228g;
        in5.s0 s0Var = this.f346875e;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        if (string == null) {
            string = "";
        }
        kVar.c(e17, string, "");
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        r45.zy1 zy1Var = b3Var.f410268d;
        on2.f2 f2Var = this.f346876f;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = f2Var.f346906e.f122551d;
        kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader");
        java.lang.String str = ((com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader) baseFeedLoader).f107483d;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = f2Var.f346906e.f122551d;
        kotlin.jvm.internal.o.e(baseFeedLoader2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader");
        long j17 = ((com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader) baseFeedLoader2).f107485f;
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context3);
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Vi(context2, 1, zy1Var, str, j17, Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null, true);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f327601q, "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
