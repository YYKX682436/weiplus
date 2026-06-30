package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes14.dex */
public abstract class b2 extends com.tencent.mm.xcompat.recyclerview.widget.b1 {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f214467g = true;

    @Override // com.tencent.mm.xcompat.recyclerview.widget.b1
    public boolean a(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var, com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var2, com.tencent.mm.xcompat.recyclerview.widget.a1 a1Var, com.tencent.mm.xcompat.recyclerview.widget.a1 a1Var2) {
        int i17;
        int i18;
        int i19 = a1Var.f214449a;
        int i27 = a1Var.f214450b;
        if (y1Var2.y()) {
            int i28 = a1Var.f214449a;
            i18 = a1Var.f214450b;
            i17 = i28;
        } else {
            i17 = a1Var2.f214449a;
            i18 = a1Var2.f214450b;
        }
        com.tencent.mm.xcompat.recyclerview.widget.q qVar = (com.tencent.mm.xcompat.recyclerview.widget.q) this;
        if (y1Var == y1Var2) {
            return qVar.g(y1Var, i19, i27, i17, i18);
        }
        float translationX = y1Var.f214703d.getTranslationX();
        android.view.View view = y1Var.f214703d;
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        qVar.l(y1Var);
        int i29 = (int) ((i17 - i19) - translationX);
        int i37 = (int) ((i18 - i27) - translationY);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        android.view.View view2 = y1Var.f214703d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(alpha));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "animateChange", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "animateChange", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        qVar.l(y1Var2);
        android.view.View view3 = y1Var2.f214703d;
        view3.setTranslationX(-i29);
        view3.setTranslationY(-i37);
        android.view.View view4 = y1Var2.f214703d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "animateChange", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "animateChange", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        qVar.f214613k.add(new com.tencent.mm.xcompat.recyclerview.widget.o(y1Var, y1Var2, i19, i27, i17, i18));
        return true;
    }

    public abstract boolean g(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var, int i17, int i18, int i19, int i27);
}
