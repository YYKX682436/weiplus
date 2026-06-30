package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class k10 implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t10 f134912a;

    public k10(com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var) {
        this.f134912a = t10Var;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var = this.f134912a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = t10Var.f135959e;
        if (baseFinderFeed != null) {
            com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
            android.app.Activity context = t10Var.getContext();
            kotlin.jvm.internal.o.d(view);
            kotlin.jvm.internal.o.d(menuItem);
            y4Var.W(context, view, i17, menuItem, baseFinderFeed);
        }
    }
}
