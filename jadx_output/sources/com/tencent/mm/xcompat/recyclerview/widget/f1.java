package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class f1 implements com.tencent.mm.xcompat.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.g1 f214518a;

    public f1(com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var) {
        this.f214518a = g1Var;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.h2
    public int a() {
        return this.f214518a.n();
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.h2
    public int b() {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214518a;
        return g1Var.f214533m - g1Var.k();
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.h2
    public int c(android.view.View view) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214518a;
        g1Var.getClass();
        return (view.getTop() - g1Var.q(view)) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.h2
    public int d(android.view.View view) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214518a;
        g1Var.getClass();
        return view.getBottom() + g1Var.f(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.h2
    public android.view.View getChildAt(int i17) {
        return this.f214518a.g(i17);
    }
}
