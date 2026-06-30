package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes14.dex */
public class q extends com.tencent.mm.xcompat.recyclerview.widget.b2 {

    /* renamed from: s, reason: collision with root package name */
    public static android.animation.TimeInterpolator f214609s;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f214610h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f214611i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f214612j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f214613k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f214614l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f214615m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f214616n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f214617o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f214618p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f214619q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f214620r = new java.util.ArrayList();

    @Override // com.tencent.mm.xcompat.recyclerview.widget.b1
    public void d(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var) {
        android.view.View view = y1Var.f214703d;
        view.animate().cancel();
        java.util.ArrayList arrayList = this.f214612j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((com.tencent.mm.xcompat.recyclerview.widget.p) arrayList.get(size)).f214603a == y1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(y1Var);
                arrayList.remove(size);
            }
        }
        j(this.f214613k, y1Var);
        float f17 = 1.0f;
        if (this.f214610h.remove(y1Var)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            c(y1Var);
        }
        if (this.f214611i.remove(y1Var)) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            c(y1Var);
        }
        java.util.ArrayList arrayList4 = this.f214616n;
        for (int size2 = arrayList4.size() - 1; size2 >= 0; size2--) {
            java.util.ArrayList arrayList5 = (java.util.ArrayList) arrayList4.get(size2);
            j(arrayList5, y1Var);
            if (arrayList5.isEmpty()) {
                arrayList4.remove(size2);
            }
        }
        java.util.ArrayList arrayList6 = this.f214615m;
        for (int size3 = arrayList6.size() - 1; size3 >= 0; size3--) {
            java.util.ArrayList arrayList7 = (java.util.ArrayList) arrayList6.get(size3);
            int size4 = arrayList7.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((com.tencent.mm.xcompat.recyclerview.widget.p) arrayList7.get(size4)).f214603a == y1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(y1Var);
                    arrayList7.remove(size4);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        java.util.ArrayList arrayList8 = this.f214614l;
        int size5 = arrayList8.size() - 1;
        while (size5 >= 0) {
            java.util.ArrayList arrayList9 = (java.util.ArrayList) arrayList8.get(size5);
            if (arrayList9.remove(y1Var)) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList10.add(java.lang.Float.valueOf(f17));
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view, arrayList10.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                c(y1Var);
                if (arrayList9.isEmpty()) {
                    arrayList8.remove(size5);
                }
            }
            size5--;
            f17 = 1.0f;
        }
        this.f214619q.remove(y1Var);
        this.f214617o.remove(y1Var);
        this.f214620r.remove(y1Var);
        this.f214618p.remove(y1Var);
        i();
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.b1
    public void e() {
        float f17;
        java.util.ArrayList arrayList = this.f214612j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            com.tencent.mm.xcompat.recyclerview.widget.p pVar = (com.tencent.mm.xcompat.recyclerview.widget.p) arrayList.get(size);
            android.view.View view = pVar.f214603a.f214703d;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(pVar.f214603a);
            arrayList.remove(size);
        }
        java.util.ArrayList arrayList2 = this.f214610h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c((com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.f214611i;
        int size3 = arrayList3.size() - 1;
        while (true) {
            f17 = 1.0f;
            if (size3 < 0) {
                break;
            }
            com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = (com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList3.get(size3);
            android.view.View view2 = y1Var.f214703d;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            c(y1Var);
            arrayList3.remove(size3);
            size3--;
        }
        java.util.ArrayList arrayList5 = this.f214613k;
        int size4 = arrayList5.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            com.tencent.mm.xcompat.recyclerview.widget.o oVar = (com.tencent.mm.xcompat.recyclerview.widget.o) arrayList5.get(size4);
            com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var2 = oVar.f214596a;
            if (y1Var2 != null) {
                k(oVar, y1Var2);
            }
            com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var3 = oVar.f214597b;
            if (y1Var3 != null) {
                k(oVar, y1Var3);
            }
        }
        arrayList5.clear();
        if (f()) {
            java.util.ArrayList arrayList6 = this.f214615m;
            int size5 = arrayList6.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                java.util.ArrayList arrayList7 = (java.util.ArrayList) arrayList6.get(size5);
                int size6 = arrayList7.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        com.tencent.mm.xcompat.recyclerview.widget.p pVar2 = (com.tencent.mm.xcompat.recyclerview.widget.p) arrayList7.get(size6);
                        android.view.View view3 = pVar2.f214603a.f214703d;
                        view3.setTranslationY(0.0f);
                        view3.setTranslationX(0.0f);
                        c(pVar2.f214603a);
                        arrayList7.remove(size6);
                        if (arrayList7.isEmpty()) {
                            arrayList6.remove(arrayList7);
                        }
                    }
                }
            }
            java.util.ArrayList arrayList8 = this.f214614l;
            int size7 = arrayList8.size() - 1;
            while (size7 >= 0) {
                java.util.ArrayList arrayList9 = (java.util.ArrayList) arrayList8.get(size7);
                int size8 = arrayList9.size() - 1;
                while (size8 >= 0) {
                    com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var4 = (com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList9.get(size8);
                    android.view.View view4 = y1Var4.f214703d;
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList10.add(java.lang.Float.valueOf(f17));
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(view4, arrayList10.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view4.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                    yj0.a.f(view4, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    c(y1Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList8.remove(arrayList9);
                    }
                    size8--;
                    f17 = 1.0f;
                }
                size7--;
                f17 = 1.0f;
            }
            java.util.ArrayList arrayList11 = this.f214616n;
            int size9 = arrayList11.size();
            while (true) {
                size9--;
                if (size9 < 0) {
                    break;
                }
                java.util.ArrayList arrayList12 = (java.util.ArrayList) arrayList11.get(size9);
                int size10 = arrayList12.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        com.tencent.mm.xcompat.recyclerview.widget.o oVar2 = (com.tencent.mm.xcompat.recyclerview.widget.o) arrayList12.get(size10);
                        com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var5 = oVar2.f214596a;
                        if (y1Var5 != null) {
                            k(oVar2, y1Var5);
                        }
                        com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var6 = oVar2.f214597b;
                        if (y1Var6 != null) {
                            k(oVar2, y1Var6);
                        }
                        if (arrayList12.isEmpty()) {
                            arrayList11.remove(arrayList12);
                        }
                    }
                }
            }
            h(this.f214619q);
            h(this.f214618p);
            h(this.f214617o);
            h(this.f214620r);
            java.util.ArrayList arrayList13 = this.f214462b;
            if (arrayList13.size() <= 0) {
                arrayList13.clear();
            } else {
                android.support.v4.media.f.a(arrayList13.get(0));
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.b1
    public boolean f() {
        return (this.f214611i.isEmpty() && this.f214613k.isEmpty() && this.f214612j.isEmpty() && this.f214610h.isEmpty() && this.f214618p.isEmpty() && this.f214619q.isEmpty() && this.f214617o.isEmpty() && this.f214620r.isEmpty() && this.f214615m.isEmpty() && this.f214614l.isEmpty() && this.f214616n.isEmpty()) ? false : true;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.b2
    public boolean g(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var, int i17, int i18, int i19, int i27) {
        android.view.View view = y1Var.f214703d;
        int translationX = i17 + ((int) view.getTranslationX());
        int translationY = i18 + ((int) y1Var.f214703d.getTranslationY());
        l(y1Var);
        int i28 = i19 - translationX;
        int i29 = i27 - translationY;
        if (i28 == 0 && i29 == 0) {
            c(y1Var);
            return false;
        }
        if (i28 != 0) {
            view.setTranslationX(-i28);
        }
        if (i29 != 0) {
            view.setTranslationY(-i29);
        }
        this.f214612j.add(new com.tencent.mm.xcompat.recyclerview.widget.p(y1Var, translationX, translationY, i19, i27));
        return true;
    }

    public void h(java.util.List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((com.tencent.mm.xcompat.recyclerview.widget.y1) list.get(size)).f214703d.animate().cancel();
        }
    }

    public void i() {
        if (f()) {
            return;
        }
        java.util.ArrayList arrayList = this.f214462b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            android.support.v4.media.f.a(arrayList.get(0));
            throw null;
        }
    }

    public final void j(java.util.List list, com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            com.tencent.mm.xcompat.recyclerview.widget.o oVar = (com.tencent.mm.xcompat.recyclerview.widget.o) list.get(size);
            if (k(oVar, y1Var) && oVar.f214596a == null && oVar.f214597b == null) {
                list.remove(oVar);
            }
        }
    }

    public final boolean k(com.tencent.mm.xcompat.recyclerview.widget.o oVar, com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var) {
        if (oVar.f214597b == y1Var) {
            oVar.f214597b = null;
        } else {
            if (oVar.f214596a != y1Var) {
                return false;
            }
            oVar.f214596a = null;
        }
        android.view.View view = y1Var.f214703d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator$ChangeInfo;Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator$ChangeInfo;Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = y1Var.f214703d;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(y1Var);
        return true;
    }

    public final void l(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var) {
        if (f214609s == null) {
            f214609s = new android.animation.ValueAnimator().getInterpolator();
        }
        y1Var.f214703d.animate().setInterpolator(f214609s);
        d(y1Var);
    }
}
