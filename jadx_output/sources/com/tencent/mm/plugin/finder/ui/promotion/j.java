package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes14.dex */
public final class j implements androidx.core.widget.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.promotion.t f129666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f129667b;

    public j(com.tencent.mm.plugin.finder.ui.promotion.t tVar, android.view.ViewGroup viewGroup) {
        this.f129666a = tVar;
        this.f129667b = viewGroup;
    }

    @Override // androidx.core.widget.o
    public final void a(androidx.core.widget.NestedScrollView v17, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.finder.ui.promotion.t tVar = this.f129666a;
        android.view.ViewGroup.LayoutParams layoutParams = tVar.getRecyclerView().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i28 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        android.view.ViewGroup viewGroup = this.f129667b;
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i29 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        if (i18 < (((v17.getChildAt(0).getMeasuredHeight() - v17.getMeasuredHeight()) - viewGroup.getMeasuredHeight()) - i28) - (i29 + ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin)) {
            tVar.f129699v = false;
        } else {
            tVar.f129699v = true;
            com.tencent.mm.plugin.finder.ui.promotion.t.P6(tVar);
        }
    }
}
