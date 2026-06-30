package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ne extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.oe f135328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135329b;

    public ne(com.tencent.mm.plugin.finder.viewmodel.component.oe oeVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f135328a = oeVar;
        this.f135329b = baseFinderFeed;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.viewmodel.component.oe oeVar = this.f135328a;
            r45.u25 u25Var = oeVar.f135470o;
            oeVar.i7(this.f135329b, u25Var != null ? u25Var.getString(4) : null);
        }
    }
}
