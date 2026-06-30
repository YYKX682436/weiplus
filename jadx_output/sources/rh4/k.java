package rh4;

/* loaded from: classes3.dex */
public class k extends androidx.recyclerview.widget.o3 {

    /* renamed from: s, reason: collision with root package name */
    public static android.animation.TimeInterpolator f395747s;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f395748h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f395749i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f395750j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f395751k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f395752l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f395753m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f395754n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f395755o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f395756p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f395757q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f395758r = new java.util.ArrayList();

    public k() {
        this.f12168c = 400L;
        this.f12171f = 400L;
        this.f12170e = 400L;
        this.f12169d = 400L;
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
            rh4.i iVar = (rh4.i) list.get(size);
            if (G(iVar, k3Var) && iVar.f395735a == null && iVar.f395736b == null) {
                list.remove(iVar);
            }
        }
    }

    public final boolean G(rh4.i iVar, androidx.recyclerview.widget.k3 k3Var) {
        if (iVar.f395736b == k3Var) {
            iVar.f395736b = null;
        } else {
            if (iVar.f395735a != k3Var) {
                return false;
            }
            iVar.f395735a = null;
        }
        android.view.View view = k3Var.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        k3Var.itemView.setTranslationX(0.0f);
        k3Var.itemView.setTranslationY(0.0f);
        h(k3Var);
        return true;
    }

    public final void H(androidx.recyclerview.widget.k3 k3Var) {
        if (f395747s == null) {
            f395747s = new android.animation.ValueAnimator().getInterpolator();
        }
        k3Var.itemView.animate().setInterpolator(f395747s);
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
        java.util.ArrayList arrayList = this.f395750j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((rh4.j) arrayList.get(size)).f395742a == k3Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                x(k3Var);
                arrayList.remove(size);
            }
        }
        F(this.f395751k, k3Var);
        float f17 = 1.0f;
        if (this.f395748h.remove(k3Var)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            y(k3Var);
        }
        if (this.f395749i.remove(k3Var)) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(k3Var);
        }
        java.util.ArrayList arrayList4 = this.f395754n;
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
        java.util.ArrayList arrayList6 = this.f395753m;
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
                if (((rh4.j) arrayList7.get(size4)).f395742a == k3Var) {
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
        java.util.ArrayList arrayList8 = this.f395752l;
        int size5 = arrayList8.size() - 1;
        while (size5 >= 0) {
            java.util.ArrayList arrayList9 = (java.util.ArrayList) arrayList8.get(size5);
            if (arrayList9.remove(k3Var)) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList10.add(java.lang.Float.valueOf(f17));
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view, arrayList10.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                h(k3Var);
                if (arrayList9.isEmpty()) {
                    arrayList8.remove(size5);
                }
            }
            size5--;
            f17 = 1.0f;
        }
        this.f395757q.remove(k3Var);
        this.f395755o.remove(k3Var);
        this.f395758r.remove(k3Var);
        this.f395756p.remove(k3Var);
        E();
    }

    @Override // androidx.recyclerview.widget.n2
    public void k() {
        float f17;
        java.util.ArrayList arrayList = this.f395750j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            rh4.j jVar = (rh4.j) arrayList.get(size);
            android.view.View view = jVar.f395742a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            x(jVar.f395742a);
            arrayList.remove(size);
        }
        java.util.ArrayList arrayList2 = this.f395748h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            y((androidx.recyclerview.widget.k3) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.f395749i;
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
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(k3Var);
            arrayList3.remove(size3);
            size3--;
        }
        java.util.ArrayList arrayList5 = this.f395751k;
        int size4 = arrayList5.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            rh4.i iVar = (rh4.i) arrayList5.get(size4);
            androidx.recyclerview.widget.k3 k3Var2 = iVar.f395735a;
            if (k3Var2 != null) {
                G(iVar, k3Var2);
            }
            androidx.recyclerview.widget.k3 k3Var3 = iVar.f395736b;
            if (k3Var3 != null) {
                G(iVar, k3Var3);
            }
        }
        arrayList5.clear();
        if (!o()) {
            return;
        }
        java.util.ArrayList arrayList6 = this.f395753m;
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
                    rh4.j jVar2 = (rh4.j) arrayList7.get(size6);
                    android.view.View view3 = jVar2.f395742a.itemView;
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    x(jVar2.f395742a);
                    arrayList7.remove(size6);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(arrayList7);
                    }
                }
            }
        }
        java.util.ArrayList arrayList8 = this.f395752l;
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
                yj0.a.d(view4, arrayList10.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
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
        java.util.ArrayList arrayList11 = this.f395754n;
        int size9 = arrayList11.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                D(this.f395757q);
                D(this.f395756p);
                D(this.f395755o);
                D(this.f395758r);
                i();
                return;
            }
            java.util.ArrayList arrayList12 = (java.util.ArrayList) arrayList11.get(size9);
            int size10 = arrayList12.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    rh4.i iVar2 = (rh4.i) arrayList12.get(size10);
                    androidx.recyclerview.widget.k3 k3Var5 = iVar2.f395735a;
                    if (k3Var5 != null) {
                        G(iVar2, k3Var5);
                    }
                    androidx.recyclerview.widget.k3 k3Var6 = iVar2.f395736b;
                    if (k3Var6 != null) {
                        G(iVar2, k3Var6);
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
        return (this.f395749i.isEmpty() && this.f395751k.isEmpty() && this.f395750j.isEmpty() && this.f395748h.isEmpty() && this.f395756p.isEmpty() && this.f395757q.isEmpty() && this.f395755o.isEmpty() && this.f395758r.isEmpty() && this.f395753m.isEmpty() && this.f395752l.isEmpty() && this.f395754n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.n2
    public void s() {
        java.util.ArrayList arrayList = this.f395748h;
        boolean z17 = !arrayList.isEmpty();
        java.util.ArrayList arrayList2 = this.f395750j;
        boolean z18 = !arrayList2.isEmpty();
        java.util.ArrayList arrayList3 = this.f395751k;
        boolean z19 = !arrayList3.isEmpty();
        java.util.ArrayList arrayList4 = this.f395749i;
        boolean z27 = !arrayList4.isEmpty();
        if (z17 || z18 || z27 || z19) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
                android.view.View view = k3Var.itemView;
                android.view.ViewPropertyAnimator animate = view.animate();
                this.f395757q.add(k3Var);
                animate.setDuration(this.f12169d).alpha(0.0f).setInterpolator(new android.view.animation.AccelerateInterpolator()).setListener(new rh4.d(this, k3Var, animate, view)).start();
            }
            arrayList.clear();
            if (z18) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.addAll(arrayList2);
                this.f395753m.add(arrayList5);
                arrayList2.clear();
                rh4.a aVar = new rh4.a(this, arrayList5);
                if (z17) {
                    android.view.View view2 = ((rh4.j) arrayList5.get(0)).f395742a.itemView;
                    long j17 = this.f12169d;
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    n3.u0.n(view2, aVar, j17);
                } else {
                    aVar.run();
                }
            }
            if (z19) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.addAll(arrayList3);
                this.f395754n.add(arrayList6);
                arrayList3.clear();
                rh4.b bVar = new rh4.b(this, arrayList6);
                if (z17) {
                    android.view.View view3 = ((rh4.i) arrayList6.get(0)).f395735a.itemView;
                    long j18 = this.f12169d;
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                    n3.u0.n(view3, bVar, j18);
                } else {
                    bVar.run();
                }
            }
            if (z27) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.addAll(arrayList4);
                this.f395752l.add(arrayList7);
                arrayList4.clear();
                rh4.c cVar = new rh4.c(this, arrayList7);
                if (!z17 && !z18 && !z19) {
                    cVar.run();
                    return;
                }
                long max = (z17 ? this.f12169d : 0L) + java.lang.Math.max(z18 ? this.f12170e : 0L, z19 ? this.f12171f : 0L);
                android.view.View view4 = ((androidx.recyclerview.widget.k3) arrayList7.get(0)).itemView;
                java.util.WeakHashMap weakHashMap3 = n3.l1.f334362a;
                n3.u0.n(view4, cVar, max);
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
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f395749i.add(k3Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean u(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2, int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopSectionWeAppItemAnimator", "animateChange lastPos: %d", java.lang.Integer.valueOf(k3Var.getAdapterPosition()));
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
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (k3Var2 != null) {
            H(k3Var2);
            k3Var2.itemView.setTranslationX(-i28);
            k3Var2.itemView.setTranslationY(-i29);
            android.view.View view2 = k3Var2.itemView;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f395751k.add(new rh4.i(k3Var, k3Var2, i17, i18, i19, i27));
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
        this.f395750j.add(new rh4.j(k3Var, translationX, translationY, i19, i27));
        return true;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean w(androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopSectionWeAppItemAnimator", "animateRemove %d", java.lang.Integer.valueOf(k3Var.getAdapterPosition()));
        H(k3Var);
        this.f395748h.add(k3Var);
        return true;
    }
}
