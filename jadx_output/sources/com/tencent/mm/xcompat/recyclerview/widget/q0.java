package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class q0 implements com.tencent.mm.xcompat.recyclerview.widget.k2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214621a;

    public q0(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView) {
        this.f214621a = recyclerView;
    }

    public void a(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var, com.tencent.mm.xcompat.recyclerview.widget.a1 a1Var, com.tencent.mm.xcompat.recyclerview.widget.a1 a1Var2) {
        boolean z17;
        int i17;
        int i18;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214621a;
        recyclerView.getClass();
        y1Var.x(false);
        com.tencent.mm.xcompat.recyclerview.widget.b2 b2Var = (com.tencent.mm.xcompat.recyclerview.widget.b2) recyclerView.S;
        b2Var.getClass();
        if (a1Var == null || ((i17 = a1Var.f214449a) == (i18 = a1Var2.f214449a) && a1Var.f214450b == a1Var2.f214450b)) {
            com.tencent.mm.xcompat.recyclerview.widget.q qVar = (com.tencent.mm.xcompat.recyclerview.widget.q) b2Var;
            qVar.l(y1Var);
            android.view.View view = y1Var.f214703d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "animateAdd", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "animateAdd", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            qVar.f214611i.add(y1Var);
            z17 = true;
        } else {
            z17 = b2Var.g(y1Var, i17, a1Var.f214450b, i18, a1Var2.f214450b);
        }
        if (z17) {
            recyclerView.S();
        }
    }

    public void b(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var, com.tencent.mm.xcompat.recyclerview.widget.a1 a1Var, com.tencent.mm.xcompat.recyclerview.widget.a1 a1Var2) {
        boolean z17;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214621a;
        recyclerView.f214399f.k(y1Var);
        recyclerView.g(y1Var);
        y1Var.x(false);
        com.tencent.mm.xcompat.recyclerview.widget.b2 b2Var = (com.tencent.mm.xcompat.recyclerview.widget.b2) recyclerView.S;
        b2Var.getClass();
        int i17 = a1Var.f214449a;
        int i18 = a1Var.f214450b;
        android.view.View view = y1Var.f214703d;
        int left = a1Var2 == null ? view.getLeft() : a1Var2.f214449a;
        int top = a1Var2 == null ? view.getTop() : a1Var2.f214450b;
        if (y1Var.m() || (i17 == left && i18 == top)) {
            com.tencent.mm.xcompat.recyclerview.widget.q qVar = (com.tencent.mm.xcompat.recyclerview.widget.q) b2Var;
            qVar.l(y1Var);
            qVar.f214610h.add(y1Var);
            z17 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z17 = b2Var.g(y1Var, i17, i18, left, top);
        }
        if (z17) {
            recyclerView.S();
        }
    }

    public void c(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214621a;
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = recyclerView.f214413t;
        android.view.View view = y1Var.f214703d;
        com.tencent.mm.xcompat.recyclerview.widget.f fVar = g1Var.f214521a;
        com.tencent.mm.xcompat.recyclerview.widget.r0 r0Var = (com.tencent.mm.xcompat.recyclerview.widget.r0) fVar.f214507a;
        int indexOfChild = r0Var.f214623a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (fVar.f214508b.f(indexOfChild)) {
                fVar.k(view);
            }
            r0Var.b(indexOfChild);
        }
        recyclerView.f214399f.g(view);
    }
}
