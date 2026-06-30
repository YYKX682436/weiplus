package rs;

/* loaded from: classes3.dex */
public class k extends androidx.recyclerview.widget.o3 {

    /* renamed from: s, reason: collision with root package name */
    public static android.animation.TimeInterpolator f399275s;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f399276h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f399277i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f399278j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f399279k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f399280l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f399281m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f399282n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f399283o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f399284p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f399285q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f399286r = new java.util.ArrayList();

    public void D(androidx.recyclerview.widget.k3 k3Var) {
        android.view.View view = k3Var.itemView;
        android.view.ViewPropertyAnimator animate = view.animate();
        this.f399283o.add(k3Var);
        animate.alpha(1.0f).setDuration(m()).setListener(new rs.e(this, k3Var, view, animate)).start();
    }

    public void E(androidx.recyclerview.widget.k3 k3Var) {
        android.view.View view = k3Var.itemView;
        android.view.ViewPropertyAnimator animate = view.animate();
        this.f399285q.add(k3Var);
        animate.setDuration(n()).alpha(0.0f).setListener(new rs.d(this, k3Var, animate, view)).start();
    }

    public void F(java.util.List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((androidx.recyclerview.widget.k3) list.get(size)).itemView.animate().cancel();
        }
    }

    public void G() {
        if (o()) {
            return;
        }
        i();
    }

    public final void H(java.util.List list, androidx.recyclerview.widget.k3 k3Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            rs.i iVar = (rs.i) list.get(size);
            if (I(iVar, k3Var) && iVar.f399264a == null && iVar.f399265b == null) {
                list.remove(iVar);
            }
        }
    }

    public final boolean I(rs.i iVar, androidx.recyclerview.widget.k3 k3Var) {
        if (iVar.f399265b == k3Var) {
            iVar.f399265b = null;
        } else {
            if (iVar.f399264a != k3Var) {
                return false;
            }
            iVar.f399264a = null;
        }
        android.view.View view = k3Var.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/feature/anim/DefaultItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/feature/anim/DefaultItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/feature/anim/DefaultItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        k3Var.itemView.setTranslationX(0.0f);
        k3Var.itemView.setTranslationY(0.0f);
        h(k3Var);
        return true;
    }

    public void J(androidx.recyclerview.widget.k3 k3Var) {
        if (f399275s == null) {
            f399275s = new android.animation.ValueAnimator().getInterpolator();
        }
        k3Var.itemView.animate().setInterpolator(f399275s);
        j(k3Var);
    }

    @Override // androidx.recyclerview.widget.n2
    public boolean g(androidx.recyclerview.widget.k3 k3Var, java.util.List list) {
        return !list.isEmpty() || f(k3Var);
    }

    @Override // androidx.recyclerview.widget.n2
    public void j(androidx.recyclerview.widget.k3 k3Var) {
        android.view.View view = k3Var.itemView;
        view.animate().cancel();
        java.util.ArrayList arrayList = this.f399278j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((rs.j) arrayList.get(size)).f399270a == k3Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                x(k3Var);
                arrayList.remove(size);
            }
        }
        H(this.f399279k, k3Var);
        float f17 = 1.0f;
        if (this.f399276h.remove(k3Var)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            y(k3Var);
        }
        if (this.f399277i.remove(k3Var)) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(k3Var);
        }
        java.util.ArrayList arrayList4 = this.f399282n;
        int size2 = arrayList4.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            java.util.ArrayList arrayList5 = (java.util.ArrayList) arrayList4.get(size2);
            H(arrayList5, k3Var);
            if (arrayList5.isEmpty()) {
                arrayList4.remove(size2);
            }
        }
        java.util.ArrayList arrayList6 = this.f399281m;
        int size3 = arrayList6.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            java.util.ArrayList arrayList7 = (java.util.ArrayList) arrayList6.get(size3);
            int size4 = arrayList7.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((rs.j) arrayList7.get(size4)).f399270a == k3Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    x(k3Var);
                    arrayList7.remove(size4);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size3);
                    }
                }
            }
        }
        java.util.ArrayList arrayList8 = this.f399280l;
        int size5 = arrayList8.size() - 1;
        while (size5 >= 0) {
            java.util.ArrayList arrayList9 = (java.util.ArrayList) arrayList8.get(size5);
            if (arrayList9.remove(k3Var)) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList10.add(java.lang.Float.valueOf(f17));
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view, arrayList10.toArray(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                h(k3Var);
                if (arrayList9.isEmpty()) {
                    arrayList8.remove(size5);
                }
            }
            size5--;
            f17 = 1.0f;
        }
        this.f399285q.remove(k3Var);
        this.f399283o.remove(k3Var);
        this.f399286r.remove(k3Var);
        this.f399284p.remove(k3Var);
        G();
    }

    @Override // androidx.recyclerview.widget.n2
    public void k() {
        float f17;
        java.util.ArrayList arrayList = this.f399278j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            rs.j jVar = (rs.j) arrayList.get(size);
            android.view.View view = jVar.f399270a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            x(jVar.f399270a);
            arrayList.remove(size);
        }
        java.util.ArrayList arrayList2 = this.f399276h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            y((androidx.recyclerview.widget.k3) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.f399277i;
        int size3 = arrayList3.size() - 1;
        while (true) {
            f17 = 1.0f;
            if (size3 < 0) {
                break;
            }
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) arrayList3.get(size3);
            android.view.View view2 = k3Var.itemView;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(k3Var);
            arrayList3.remove(size3);
            size3--;
        }
        java.util.ArrayList arrayList5 = this.f399279k;
        int size4 = arrayList5.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            rs.i iVar = (rs.i) arrayList5.get(size4);
            androidx.recyclerview.widget.k3 k3Var2 = iVar.f399264a;
            if (k3Var2 != null) {
                I(iVar, k3Var2);
            }
            androidx.recyclerview.widget.k3 k3Var3 = iVar.f399265b;
            if (k3Var3 != null) {
                I(iVar, k3Var3);
            }
        }
        arrayList5.clear();
        if (!o()) {
            return;
        }
        java.util.ArrayList arrayList6 = this.f399281m;
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
                    rs.j jVar2 = (rs.j) arrayList7.get(size6);
                    android.view.View view3 = jVar2.f399270a.itemView;
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    x(jVar2.f399270a);
                    arrayList7.remove(size6);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(arrayList7);
                    }
                }
            }
        }
        java.util.ArrayList arrayList8 = this.f399280l;
        int size7 = arrayList8.size() - 1;
        while (size7 >= 0) {
            java.util.ArrayList arrayList9 = (java.util.ArrayList) arrayList8.get(size7);
            int size8 = arrayList9.size() - 1;
            while (size8 >= 0) {
                androidx.recyclerview.widget.k3 k3Var4 = (androidx.recyclerview.widget.k3) arrayList9.get(size8);
                android.view.View view4 = k3Var4.itemView;
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList10.add(java.lang.Float.valueOf(f17));
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view4, arrayList10.toArray(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                h(k3Var4);
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
        java.util.ArrayList arrayList11 = this.f399282n;
        int size9 = arrayList11.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                F(this.f399285q);
                F(this.f399284p);
                F(this.f399283o);
                F(this.f399286r);
                i();
                return;
            }
            java.util.ArrayList arrayList12 = (java.util.ArrayList) arrayList11.get(size9);
            int size10 = arrayList12.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    rs.i iVar2 = (rs.i) arrayList12.get(size10);
                    androidx.recyclerview.widget.k3 k3Var5 = iVar2.f399264a;
                    if (k3Var5 != null) {
                        I(iVar2, k3Var5);
                    }
                    androidx.recyclerview.widget.k3 k3Var6 = iVar2.f399265b;
                    if (k3Var6 != null) {
                        I(iVar2, k3Var6);
                    }
                    if (arrayList12.isEmpty()) {
                        arrayList11.remove(arrayList12);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.n2
    public boolean o() {
        return (this.f399277i.isEmpty() && this.f399279k.isEmpty() && this.f399278j.isEmpty() && this.f399276h.isEmpty() && this.f399284p.isEmpty() && this.f399285q.isEmpty() && this.f399283o.isEmpty() && this.f399286r.isEmpty() && this.f399281m.isEmpty() && this.f399280l.isEmpty() && this.f399282n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.n2
    public void s() {
        java.util.ArrayList arrayList = this.f399276h;
        boolean z17 = !arrayList.isEmpty();
        java.util.ArrayList arrayList2 = this.f399278j;
        boolean z18 = !arrayList2.isEmpty();
        java.util.ArrayList arrayList3 = this.f399279k;
        boolean z19 = !arrayList3.isEmpty();
        java.util.ArrayList arrayList4 = this.f399277i;
        boolean z27 = !arrayList4.isEmpty();
        if (z17 || z18 || z27 || z19) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                E((androidx.recyclerview.widget.k3) it.next());
            }
            arrayList.clear();
            if (z18) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.addAll(arrayList2);
                this.f399281m.add(arrayList5);
                arrayList2.clear();
                rs.a aVar = new rs.a(this, arrayList5);
                if (z17) {
                    android.view.View view = ((rs.j) arrayList5.get(0)).f399270a.itemView;
                    long n17 = n();
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    n3.u0.n(view, aVar, n17);
                } else {
                    aVar.run();
                }
            }
            if (z19) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.addAll(arrayList3);
                this.f399282n.add(arrayList6);
                arrayList3.clear();
                rs.b bVar = new rs.b(this, arrayList6);
                if (z17) {
                    android.view.View view2 = ((rs.i) arrayList6.get(0)).f399264a.itemView;
                    long n18 = n();
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                    n3.u0.n(view2, bVar, n18);
                } else {
                    bVar.run();
                }
            }
            if (z27) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.addAll(arrayList4);
                this.f399280l.add(arrayList7);
                arrayList4.clear();
                rs.c cVar = new rs.c(this, arrayList7);
                if (!z17 && !z18 && !z19) {
                    cVar.run();
                    return;
                }
                android.view.View view3 = ((androidx.recyclerview.widget.k3) arrayList7.get(0)).itemView;
                long l17 = l();
                java.util.WeakHashMap weakHashMap3 = n3.l1.f334362a;
                n3.u0.n(view3, cVar, l17);
            }
        }
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean t(androidx.recyclerview.widget.k3 k3Var) {
        J(k3Var);
        android.view.View view = k3Var.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/feature/anim/DefaultItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f399277i.add(k3Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean u(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2, int i17, int i18, int i19, int i27) {
        if (k3Var == k3Var2) {
            return v(k3Var, i17, i18, i19, i27);
        }
        float translationX = k3Var.itemView.getTranslationX();
        float translationY = k3Var.itemView.getTranslationY();
        float alpha = k3Var.itemView.getAlpha();
        J(k3Var);
        int i28 = (int) ((i19 - i17) - translationX);
        int i29 = (int) ((i27 - i18) - translationY);
        k3Var.itemView.setTranslationX(translationX);
        k3Var.itemView.setTranslationY(translationY);
        android.view.View view = k3Var.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(alpha));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/feature/anim/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (k3Var2 != null) {
            J(k3Var2);
            k3Var2.itemView.setTranslationX(-i28);
            k3Var2.itemView.setTranslationY(-i29);
            android.view.View view2 = k3Var2.itemView;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/feature/anim/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f399279k.add(new rs.i(k3Var, k3Var2, i17, i18, i19, i27));
        return true;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean v(androidx.recyclerview.widget.k3 k3Var, int i17, int i18, int i19, int i27) {
        android.view.View view = k3Var.itemView;
        int translationX = i17 + ((int) view.getTranslationX());
        int translationY = i18 + ((int) k3Var.itemView.getTranslationY());
        J(k3Var);
        int i28 = i19 - translationX;
        int i29 = i27 - translationY;
        if (i28 == 0 && i29 == 0) {
            x(k3Var);
            return false;
        }
        if (i28 != 0) {
            view.setTranslationX(-i28);
        }
        if (i29 != 0) {
            view.setTranslationY(-i29);
        }
        this.f399278j.add(new rs.j(k3Var, translationX, translationY, i19, i27));
        return true;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean w(androidx.recyclerview.widget.k3 k3Var) {
        J(k3Var);
        this.f399276h.add(k3Var);
        return true;
    }
}
