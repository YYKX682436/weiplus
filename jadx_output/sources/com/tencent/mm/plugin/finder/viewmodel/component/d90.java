package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class d90 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f134093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e90 f134094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134095c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f134096d;

    public d90(com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f134093a = z2Var;
        this.f134094b = e90Var;
        this.f134095c = s0Var;
        this.f134096d = baseFinderFeed;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        this.f134093a.B();
        com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var = this.f134094b;
        e90Var.S6(null);
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.view.View itemView = this.f134095c.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f134096d;
        com.tencent.mm.plugin.finder.report.d2.k(d2Var, itemView, "finder_sleep_mode", "view_clk", true, e90Var.Q6(baseFinderFeed), null, 32, null);
        com.tencent.mars.xlog.Log.i("Finder.FinderTingEntryUIC", "dialogGuide, click right, feedId = " + baseFinderFeed.getItemId());
    }
}
