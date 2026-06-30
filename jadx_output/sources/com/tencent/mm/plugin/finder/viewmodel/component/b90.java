package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class b90 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f133856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e90 f133858c;

    public b90(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.view.View view, com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var) {
        this.f133856a = baseFinderFeed;
        this.f133857b = view;
        this.f133858c = e90Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dialogGuide, click left, feedId = ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f133856a;
        sb6.append(baseFinderFeed.getItemId());
        com.tencent.mars.xlog.Log.i("Finder.FinderTingEntryUIC", sb6.toString());
        com.tencent.mm.plugin.finder.report.d2.k(com.tencent.mm.plugin.finder.report.d2.f124994a, this.f133857b, "findersleephalfpage", "view_unexp", true, this.f133858c.Q6(baseFinderFeed), null, 32, null);
    }
}
