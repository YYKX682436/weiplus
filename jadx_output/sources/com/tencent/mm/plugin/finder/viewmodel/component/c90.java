package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class c90 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f133989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e90 f133990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f133991c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f133992d;

    public c90(com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f133989a = z2Var;
        this.f133990b = e90Var;
        this.f133991c = s0Var;
        this.f133992d = baseFinderFeed;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        this.f133989a.B();
        com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var = this.f133990b;
        androidx.appcompat.app.AppCompatActivity activity = e90Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.bl) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.bl.class)).getActivity().onBackPressed();
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.view.View itemView = this.f133991c.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f133992d;
        com.tencent.mm.plugin.finder.report.d2.k(d2Var, itemView, "finder_sleep_leave", "view_clk", true, e90Var.Q6(baseFinderFeed), null, 32, null);
        com.tencent.mars.xlog.Log.i("Finder.FinderTingEntryUIC", "dialogGuide, click left, feedId = " + baseFinderFeed.getItemId());
    }
}
