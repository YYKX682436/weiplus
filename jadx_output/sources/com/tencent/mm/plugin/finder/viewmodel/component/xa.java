package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class xa extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f136428n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f136429o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f136430p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(int i17, int i18, int i19, android.app.Activity activity) {
        super(activity);
        this.f136428n = i17;
        this.f136429o = i18;
        this.f136430p = i19;
    }

    @Override // androidx.recyclerview.widget.o1
    public int i(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12051c;
        if (layoutManager == null || !layoutManager.getF123307r()) {
            return 0;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
        int decoratedTop = layoutManager.getDecoratedTop(view) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        int decoratedBottom = (layoutManager.getDecoratedBottom(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - decoratedTop;
        int ceil = (int) java.lang.Math.ceil(((this.f136428n - this.f136429o) + 1) / 3.0f);
        int i18 = decoratedBottom * ceil;
        int height = (layoutManager.getHeight() - layoutManager.getPaddingBottom()) - layoutManager.getPaddingTop();
        if (i18 > height / 2) {
            ceil = (int) java.lang.Math.ceil((height / 2.0f) / decoratedBottom);
        }
        return (height - (decoratedTop + (ceil * decoratedBottom))) + this.f136430p;
    }

    @Override // androidx.recyclerview.widget.o1
    public int m() {
        return 1;
    }
}
