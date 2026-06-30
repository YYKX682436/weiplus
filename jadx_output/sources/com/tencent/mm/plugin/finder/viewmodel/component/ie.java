package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ie extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.je f134736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f134737b;

    public ie(com.tencent.mm.plugin.finder.viewmodel.component.je jeVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f134736a = jeVar;
        this.f134737b = baseFinderFeed;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.viewmodel.component.je jeVar = this.f134736a;
            r45.u25 u25Var = jeVar.f134859o;
            jeVar.i7(this.f134737b, u25Var != null ? u25Var.getString(4) : null);
        }
    }
}
