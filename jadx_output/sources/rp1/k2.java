package rp1;

/* loaded from: classes3.dex */
public class k2 extends androidx.recyclerview.widget.o3 {

    /* renamed from: u, reason: collision with root package name */
    public static android.animation.TimeInterpolator f398453u;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f398454h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f398455i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f398456j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f398457k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f398458l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f398459m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f398460n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f398461o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f398462p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f398463q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f398464r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public rp1.i2 f398465s;

    /* renamed from: t, reason: collision with root package name */
    public mp1.c f398466t;

    @Override // androidx.recyclerview.widget.o3
    public void B(androidx.recyclerview.widget.k3 k3Var) {
        mp1.c cVar = this.f398466t;
        if (cVar != null) {
            cVar.getClass();
        }
    }

    @Override // androidx.recyclerview.widget.o3
    public void C(androidx.recyclerview.widget.k3 k3Var) {
        mp1.c cVar = this.f398466t;
        if (cVar != null) {
            ((rp1.p1) cVar).a();
        }
    }

    public void D(java.util.List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((androidx.recyclerview.widget.k3) list.get(size)).itemView.animate().cancel();
        }
    }

    public void E() {
        if (o()) {
            return;
        }
        i();
    }

    public final void F(java.util.List list, androidx.recyclerview.widget.k3 k3Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            rp1.h2 h2Var = (rp1.h2) list.get(size);
            if (G(h2Var, k3Var) && h2Var.f398411a == null && h2Var.f398412b == null) {
                list.remove(h2Var);
            }
        }
    }

    public final boolean G(rp1.h2 h2Var, androidx.recyclerview.widget.k3 k3Var) {
        if (h2Var.f398412b == k3Var) {
            h2Var.f398412b = null;
        } else {
            if (h2Var.f398411a != k3Var) {
                return false;
            }
            h2Var.f398411a = null;
        }
        android.view.View view = k3Var.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        k3Var.itemView.setTranslationX(0.0f);
        k3Var.itemView.setTranslationY(0.0f);
        h(k3Var);
        return true;
    }

    public final void H(androidx.recyclerview.widget.k3 k3Var) {
        if (f398453u == null) {
            f398453u = new android.animation.ValueAnimator().getInterpolator();
        }
        k3Var.itemView.animate().setInterpolator(f398453u);
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
        java.util.ArrayList arrayList = this.f398456j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((rp1.j2) arrayList.get(size)).f398442a == k3Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                x(k3Var);
                arrayList.remove(size);
            }
        }
        F(this.f398457k, k3Var);
        float f17 = 1.0f;
        if (this.f398454h.remove(k3Var)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setTranslationX(0.0f);
            y(k3Var);
        }
        if (this.f398455i.remove(k3Var)) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(k3Var);
        }
        java.util.ArrayList arrayList4 = this.f398460n;
        int size2 = arrayList4.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            java.util.ArrayList arrayList5 = (java.util.ArrayList) arrayList4.get(size2);
            F(arrayList5, k3Var);
            if (arrayList5.isEmpty()) {
                arrayList4.remove(size2);
            }
        }
        java.util.ArrayList arrayList6 = this.f398459m;
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
                if (((rp1.j2) arrayList7.get(size4)).f398442a == k3Var) {
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
        java.util.ArrayList arrayList8 = this.f398458l;
        int size5 = arrayList8.size() - 1;
        while (size5 >= 0) {
            java.util.ArrayList arrayList9 = (java.util.ArrayList) arrayList8.get(size5);
            if (arrayList9.remove(k3Var)) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList10.add(java.lang.Float.valueOf(f17));
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view, arrayList10.toArray(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                h(k3Var);
                if (arrayList9.isEmpty()) {
                    arrayList8.remove(size5);
                }
            }
            size5--;
            f17 = 1.0f;
        }
        this.f398463q.remove(k3Var);
        this.f398461o.remove(k3Var);
        this.f398464r.remove(k3Var);
        this.f398462p.remove(k3Var);
        E();
    }

    @Override // androidx.recyclerview.widget.n2
    public void k() {
        float f17;
        java.util.ArrayList arrayList = this.f398456j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            rp1.j2 j2Var = (rp1.j2) arrayList.get(size);
            android.view.View view = j2Var.f398442a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            x(j2Var.f398442a);
            arrayList.remove(size);
        }
        java.util.ArrayList arrayList2 = this.f398454h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            y((androidx.recyclerview.widget.k3) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.f398455i;
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
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(k3Var);
            arrayList3.remove(size3);
            size3--;
        }
        java.util.ArrayList arrayList5 = this.f398457k;
        int size4 = arrayList5.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            rp1.h2 h2Var = (rp1.h2) arrayList5.get(size4);
            androidx.recyclerview.widget.k3 k3Var2 = h2Var.f398411a;
            if (k3Var2 != null) {
                G(h2Var, k3Var2);
            }
            androidx.recyclerview.widget.k3 k3Var3 = h2Var.f398412b;
            if (k3Var3 != null) {
                G(h2Var, k3Var3);
            }
        }
        arrayList5.clear();
        if (!o()) {
            return;
        }
        java.util.ArrayList arrayList6 = this.f398459m;
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
                    rp1.j2 j2Var2 = (rp1.j2) arrayList7.get(size6);
                    android.view.View view3 = j2Var2.f398442a.itemView;
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    x(j2Var2.f398442a);
                    arrayList7.remove(size6);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(arrayList7);
                    }
                }
            }
        }
        java.util.ArrayList arrayList8 = this.f398458l;
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
                yj0.a.d(view4, arrayList10.toArray(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
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
        java.util.ArrayList arrayList11 = this.f398460n;
        int size9 = arrayList11.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                D(this.f398463q);
                D(this.f398462p);
                D(this.f398461o);
                D(this.f398464r);
                i();
                return;
            }
            java.util.ArrayList arrayList12 = (java.util.ArrayList) arrayList11.get(size9);
            int size10 = arrayList12.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    rp1.h2 h2Var2 = (rp1.h2) arrayList12.get(size10);
                    androidx.recyclerview.widget.k3 k3Var5 = h2Var2.f398411a;
                    if (k3Var5 != null) {
                        G(h2Var2, k3Var5);
                    }
                    androidx.recyclerview.widget.k3 k3Var6 = h2Var2.f398412b;
                    if (k3Var6 != null) {
                        G(h2Var2, k3Var6);
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
        return (this.f398455i.isEmpty() && this.f398457k.isEmpty() && this.f398456j.isEmpty() && this.f398454h.isEmpty() && this.f398462p.isEmpty() && this.f398463q.isEmpty() && this.f398461o.isEmpty() && this.f398464r.isEmpty() && this.f398459m.isEmpty() && this.f398458l.isEmpty() && this.f398460n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.n2
    public void s() {
        java.util.ArrayList arrayList = this.f398454h;
        boolean z17 = !arrayList.isEmpty();
        java.util.ArrayList arrayList2 = this.f398456j;
        boolean z18 = !arrayList2.isEmpty();
        java.util.ArrayList arrayList3 = this.f398457k;
        boolean z19 = !arrayList3.isEmpty();
        java.util.ArrayList arrayList4 = this.f398455i;
        boolean z27 = !arrayList4.isEmpty();
        if (z17 || z18 || z27 || z19) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
                android.view.View view = k3Var.itemView;
                this.f398463q.add(k3Var);
                android.view.ViewPropertyAnimator animate = view.animate();
                rp1.c2 c2Var = new rp1.c2(this, k3Var, animate, view);
                rp1.i2 i2Var = this.f398465s;
                if (i2Var == null || !((rp1.v1) i2Var).a(k3Var, c2Var)) {
                    animate.setDuration(this.f12169d).alpha(0.0f).setListener(c2Var).start();
                }
            }
            arrayList.clear();
            if (z18) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.addAll(arrayList2);
                this.f398459m.add(arrayList5);
                arrayList2.clear();
                rp1.z1 z1Var = new rp1.z1(this, arrayList5);
                if (z17) {
                    android.view.View view2 = ((rp1.j2) arrayList5.get(0)).f398442a.itemView;
                    long j17 = this.f12169d;
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    n3.u0.n(view2, z1Var, j17);
                } else {
                    z1Var.run();
                }
            }
            if (z19) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.addAll(arrayList3);
                this.f398460n.add(arrayList6);
                arrayList3.clear();
                rp1.a2 a2Var = new rp1.a2(this, arrayList6);
                if (z17) {
                    android.view.View view3 = ((rp1.h2) arrayList6.get(0)).f398411a.itemView;
                    long j18 = this.f12169d;
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                    n3.u0.n(view3, a2Var, j18);
                } else {
                    a2Var.run();
                }
            }
            if (z27) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.addAll(arrayList4);
                this.f398458l.add(arrayList7);
                arrayList4.clear();
                rp1.b2 b2Var = new rp1.b2(this, arrayList7);
                if (!z17 && !z18 && !z19) {
                    b2Var.run();
                    return;
                }
                long max = (z17 ? this.f12169d : 0L) + java.lang.Math.max(z18 ? this.f12170e : 0L, z19 ? this.f12171f : 0L);
                android.view.View view4 = ((androidx.recyclerview.widget.k3) arrayList7.get(0)).itemView;
                java.util.WeakHashMap weakHashMap3 = n3.l1.f334362a;
                n3.u0.n(view4, b2Var, max);
            }
        }
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean t(androidx.recyclerview.widget.k3 k3Var) {
        H(k3Var);
        android.view.View view = k3Var.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f398455i.add(k3Var);
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
        H(k3Var);
        int i28 = (int) ((i19 - i17) - translationX);
        int i29 = (int) ((i27 - i18) - translationY);
        k3Var.itemView.setTranslationX(translationX);
        k3Var.itemView.setTranslationY(translationY);
        android.view.View view = k3Var.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(alpha));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (k3Var2 != null) {
            H(k3Var2);
            k3Var2.itemView.setTranslationX(-i28);
            k3Var2.itemView.setTranslationY(-i29);
            android.view.View view2 = k3Var2.itemView;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f398457k.add(new rp1.h2(k3Var, k3Var2, i17, i18, i19, i27));
        return true;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean v(androidx.recyclerview.widget.k3 k3Var, int i17, int i18, int i19, int i27) {
        android.view.View view = k3Var.itemView;
        int translationX = i17 + ((int) view.getTranslationX());
        int translationY = i18 + ((int) k3Var.itemView.getTranslationY());
        H(k3Var);
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
        this.f398456j.add(new rp1.j2(k3Var, translationX, translationY, i19, i27));
        return true;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean w(androidx.recyclerview.widget.k3 k3Var) {
        H(k3Var);
        this.f398454h.add(k3Var);
        return true;
    }
}
