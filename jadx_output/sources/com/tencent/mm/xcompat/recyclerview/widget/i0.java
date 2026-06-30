package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class i0 extends com.tencent.mm.xcompat.recyclerview.widget.k0 {
    public i0(com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var) {
        super(g1Var, null);
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k0
    public int a(android.view.View view) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214558a;
        g1Var.getClass();
        return view.getRight() + g1Var.p(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k0
    public int b(android.view.View view) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        this.f214558a.getClass();
        android.graphics.Rect rect = ((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f214426b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k0
    public int c(android.view.View view) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        this.f214558a.getClass();
        android.graphics.Rect rect = ((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f214426b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k0
    public int d(android.view.View view) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214558a;
        g1Var.getClass();
        return (view.getLeft() - g1Var.j(view)) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k0
    public int e() {
        return this.f214558a.f214532l;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k0
    public int f() {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214558a;
        return g1Var.f214532l - g1Var.m();
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k0
    public int g() {
        return this.f214558a.m();
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k0
    public int h() {
        return this.f214558a.f214530j;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k0
    public int i() {
        return this.f214558a.l();
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k0
    public int j() {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214558a;
        return (g1Var.f214532l - g1Var.l()) - g1Var.m();
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k0
    public int k(android.view.View view) {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214558a;
        android.graphics.Rect rect = this.f214560c;
        g1Var.r(view, true, rect);
        return rect.right;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k0
    public int l(android.view.View view) {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214558a;
        android.graphics.Rect rect = this.f214560c;
        g1Var.r(view, true, rect);
        return rect.left;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.k0
    public void m(int i17) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214558a.f214522b;
        if (recyclerView != null) {
            int e17 = recyclerView.f214402i.e();
            for (int i18 = 0; i18 < e17; i18++) {
                recyclerView.f214402i.d(i18).offsetLeftAndRight(i17);
            }
        }
    }
}
