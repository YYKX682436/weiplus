package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class e1 implements com.tencent.mm.xcompat.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.g1 f214506a;

    public e1(com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var) {
        this.f214506a = g1Var;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.h2
    public int a() {
        return this.f214506a.l();
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.h2
    public int b() {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214506a;
        return g1Var.f214532l - g1Var.m();
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.h2
    public int c(android.view.View view) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214506a;
        g1Var.getClass();
        return (view.getLeft() - g1Var.j(view)) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.h2
    public int d(android.view.View view) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214506a;
        g1Var.getClass();
        return view.getRight() + g1Var.p(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.h2
    public android.view.View getChildAt(int i17) {
        return this.f214506a.g(i17);
    }
}
