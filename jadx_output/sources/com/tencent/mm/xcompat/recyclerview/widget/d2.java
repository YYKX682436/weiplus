package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public abstract class d2 extends com.tencent.mm.xcompat.recyclerview.widget.i1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214491a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.k1 f214492b = new com.tencent.mm.xcompat.recyclerview.widget.c2(this);

    public abstract int[] a(com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var, android.view.View view);

    public abstract android.view.View b(com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var);

    public void c() {
        com.tencent.mm.xcompat.recyclerview.widget.g1 layoutManager;
        android.view.View b17;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214491a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (b17 = b(layoutManager)) == null) {
            return;
        }
        int[] a17 = a(layoutManager, b17);
        int i17 = a17[0];
        if (i17 == 0 && a17[1] == 0) {
            return;
        }
        this.f214491a.d0(i17, a17[1], null, Integer.MIN_VALUE, false);
    }
}
