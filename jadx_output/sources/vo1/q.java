package vo1;

/* loaded from: classes3.dex */
public class q extends androidx.recyclerview.widget.o3 {

    /* renamed from: s, reason: collision with root package name */
    public static android.animation.TimeInterpolator f438544s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.reflect.Method f438545t;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f438546h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f438547i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f438548j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f438549k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f438550l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f438551m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f438552n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f438553o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f438554p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f438555q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f438556r = new java.util.ArrayList();

    static {
        java.lang.reflect.Method declaredMethod = androidx.recyclerview.widget.k3.class.getDeclaredMethod("shouldIgnore", new java.lang.Class[0]);
        declaredMethod.setAccessible(true);
        f438545t = declaredMethod;
    }

    public final void D(java.util.List viewHolders) {
        kotlin.jvm.internal.o.g(viewHolders, "viewHolders");
        int size = viewHolders.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i17 = size - 1;
            java.lang.Object obj = viewHolders.get(size);
            kotlin.jvm.internal.o.d(obj);
            ((androidx.recyclerview.widget.k3) obj).itemView.animate().cancel();
            if (i17 < 0) {
                return;
            } else {
                size = i17;
            }
        }
    }

    public final void E() {
        if (o()) {
            return;
        }
        i();
    }

    public final void F(java.util.List list, androidx.recyclerview.widget.k3 k3Var) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i17 = size - 1;
            vo1.c cVar = (vo1.c) list.get(size);
            if (G(cVar, k3Var) && cVar.f438498a == null && cVar.f438499b == null) {
                list.remove(cVar);
            }
            if (i17 < 0) {
                return;
            } else {
                size = i17;
            }
        }
    }

    public final boolean G(vo1.c cVar, androidx.recyclerview.widget.k3 k3Var) {
        if (cVar.f438499b == k3Var) {
            cVar.f438499b = null;
        } else {
            if (cVar.f438498a != k3Var) {
                return false;
            }
            cVar.f438498a = null;
        }
        kotlin.jvm.internal.o.d(k3Var);
        android.view.View view = k3Var.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        k3Var.itemView.setTranslationX(0.0f);
        k3Var.itemView.setTranslationY(0.0f);
        h(k3Var);
        return true;
    }

    public final void H(androidx.recyclerview.widget.k3 k3Var) {
        if (f438544s == null) {
            f438544s = new android.animation.ValueAnimator().getInterpolator();
        }
        k3Var.itemView.animate().setInterpolator(f438544s);
        j(k3Var);
    }

    @Override // androidx.recyclerview.widget.o3, androidx.recyclerview.widget.n2
    public boolean b(androidx.recyclerview.widget.k3 oldHolder, androidx.recyclerview.widget.k3 newHolder, androidx.recyclerview.widget.m2 preInfo, androidx.recyclerview.widget.m2 postInfo) {
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(oldHolder, "oldHolder");
        kotlin.jvm.internal.o.g(newHolder, "newHolder");
        kotlin.jvm.internal.o.g(preInfo, "preInfo");
        kotlin.jvm.internal.o.g(postInfo, "postInfo");
        int i19 = preInfo.f12139a;
        int i27 = preInfo.f12140b;
        java.lang.Object invoke = f438545t.invoke(newHolder, new java.lang.Object[0]);
        kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) invoke).booleanValue()) {
            i17 = preInfo.f12139a;
            i18 = preInfo.f12140b;
        } else {
            i17 = postInfo.f12139a;
            i18 = postInfo.f12140b;
        }
        int i28 = i17;
        int i29 = i18;
        int i37 = preInfo.f12141c - preInfo.f12140b;
        int i38 = postInfo.f12141c - postInfo.f12140b;
        float translationX = oldHolder.itemView.getTranslationX();
        float translationY = oldHolder.itemView.getTranslationY();
        int i39 = (int) ((i28 - i19) - translationX);
        int i47 = (int) ((i29 - i27) - translationY);
        if (kotlin.jvm.internal.o.b(oldHolder, newHolder)) {
            return v(oldHolder, i19, i27, i28, i29);
        }
        jz5.l lVar = i37 == i38 ? null : new jz5.l(java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38));
        H(oldHolder);
        oldHolder.itemView.setTranslationX(translationX);
        oldHolder.itemView.setTranslationY(translationY);
        H(newHolder);
        android.view.View view = newHolder.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ItemAnimator$ItemHolderInfo;Landroidx/recyclerview/widget/RecyclerView$ItemAnimator$ItemHolderInfo;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ItemAnimator$ItemHolderInfo;Landroidx/recyclerview/widget/RecyclerView$ItemAnimator$ItemHolderInfo;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        newHolder.itemView.setTranslationX(-i39);
        newHolder.itemView.setTranslationY(-i47);
        this.f438549k.add(new vo1.c(oldHolder, newHolder, i19, i27, i28, i29, lVar));
        return true;
    }

    @Override // androidx.recyclerview.widget.n2
    public boolean g(androidx.recyclerview.widget.k3 viewHolder, java.util.List payloads) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        return !payloads.isEmpty() || f(viewHolder);
    }

    @Override // androidx.recyclerview.widget.n2
    public void j(androidx.recyclerview.widget.k3 item) {
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View itemView = item.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        itemView.animate().cancel();
        java.util.ArrayList arrayList = this.f438548j;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i17 = size - 1;
                java.lang.Object obj = arrayList.get(size);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                if (((vo1.d) obj).f438505a == item) {
                    itemView.setTranslationY(0.0f);
                    itemView.setTranslationX(0.0f);
                    x(item);
                    arrayList.remove(size);
                }
                if (i17 < 0) {
                    break;
                } else {
                    size = i17;
                }
            }
        }
        F(this.f438549k, item);
        float f17 = 1.0f;
        if (this.f438546h.remove(item)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(itemView, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            itemView.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(itemView, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            y(item);
        }
        if (this.f438547i.remove(item)) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(itemView, arrayList3.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            itemView.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(itemView, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(item);
        }
        java.util.ArrayList arrayList4 = this.f438552n;
        int size2 = arrayList4.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i18 = size2 - 1;
                java.lang.Object obj2 = arrayList4.get(size2);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                java.util.ArrayList arrayList5 = (java.util.ArrayList) obj2;
                F(arrayList5, item);
                if (arrayList5.isEmpty()) {
                    arrayList4.remove(size2);
                }
                if (i18 < 0) {
                    break;
                } else {
                    size2 = i18;
                }
            }
        }
        java.util.ArrayList arrayList6 = this.f438551m;
        int size3 = arrayList6.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i19 = size3 - 1;
                java.lang.Object obj3 = arrayList6.get(size3);
                kotlin.jvm.internal.o.f(obj3, "get(...)");
                java.util.ArrayList arrayList7 = (java.util.ArrayList) obj3;
                int size4 = arrayList7.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i27 = size4 - 1;
                        java.lang.Object obj4 = arrayList7.get(size4);
                        kotlin.jvm.internal.o.f(obj4, "get(...)");
                        if (((vo1.d) obj4).f438505a == item) {
                            itemView.setTranslationY(0.0f);
                            itemView.setTranslationX(0.0f);
                            x(item);
                            arrayList7.remove(size4);
                            if (arrayList7.isEmpty()) {
                                arrayList6.remove(size3);
                            }
                        } else if (i27 < 0) {
                            break;
                        } else {
                            size4 = i27;
                        }
                    }
                }
                if (i19 < 0) {
                    break;
                } else {
                    size3 = i19;
                }
            }
        }
        java.util.ArrayList arrayList8 = this.f438550l;
        int size5 = arrayList8.size() - 1;
        if (size5 >= 0) {
            int i28 = size5;
            while (true) {
                int i29 = i28 - 1;
                java.lang.Object obj5 = arrayList8.get(i28);
                kotlin.jvm.internal.o.f(obj5, "get(...)");
                java.util.ArrayList arrayList9 = (java.util.ArrayList) obj5;
                if (arrayList9.remove(item)) {
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList10.add(java.lang.Float.valueOf(f17));
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(itemView, arrayList10.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    itemView.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                    yj0.a.f(itemView, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    h(item);
                    if (arrayList9.isEmpty()) {
                        arrayList8.remove(i28);
                    }
                }
                if (i29 < 0) {
                    break;
                }
                i28 = i29;
                f17 = 1.0f;
            }
        }
        this.f438555q.remove(item);
        this.f438553o.remove(item);
        this.f438556r.remove(item);
        this.f438554p.remove(item);
        E();
    }

    @Override // androidx.recyclerview.widget.n2
    public void k() {
        float f17;
        java.util.ArrayList arrayList = this.f438548j;
        int i17 = -1;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            java.lang.Object obj = arrayList.get(size);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            vo1.d dVar = (vo1.d) obj;
            android.view.View itemView = dVar.f438505a.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            itemView.setTranslationY(0.0f);
            itemView.setTranslationX(0.0f);
            x(dVar.f438505a);
            arrayList.remove(size);
        }
        java.util.ArrayList arrayList2 = this.f438546h;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            java.lang.Object obj2 = arrayList2.get(size2);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            y((androidx.recyclerview.widget.k3) obj2);
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.f438547i;
        int size3 = arrayList3.size() - 1;
        while (true) {
            f17 = 1.0f;
            if (-1 >= size3) {
                break;
            }
            java.lang.Object obj3 = arrayList3.get(size3);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) obj3;
            android.view.View view = k3Var.itemView;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(k3Var);
            arrayList3.remove(size3);
            size3--;
        }
        java.util.ArrayList arrayList5 = this.f438549k;
        for (int size4 = arrayList5.size() - 1; -1 < size4; size4--) {
            java.lang.Object obj4 = arrayList5.get(size4);
            kotlin.jvm.internal.o.f(obj4, "get(...)");
            vo1.c cVar = (vo1.c) obj4;
            androidx.recyclerview.widget.k3 k3Var2 = cVar.f438498a;
            if (k3Var2 != null) {
                G(cVar, k3Var2);
            }
            androidx.recyclerview.widget.k3 k3Var3 = cVar.f438499b;
            if (k3Var3 != null) {
                G(cVar, k3Var3);
            }
        }
        arrayList5.clear();
        if (o()) {
            java.util.ArrayList arrayList6 = this.f438551m;
            for (int size5 = arrayList6.size() - 1; -1 < size5; size5--) {
                java.lang.Object obj5 = arrayList6.get(size5);
                kotlin.jvm.internal.o.f(obj5, "get(...)");
                java.util.ArrayList arrayList7 = (java.util.ArrayList) obj5;
                for (int size6 = arrayList7.size() - 1; -1 < size6; size6--) {
                    java.lang.Object obj6 = arrayList7.get(size6);
                    kotlin.jvm.internal.o.f(obj6, "get(...)");
                    vo1.d dVar2 = (vo1.d) obj6;
                    android.view.View itemView2 = dVar2.f438505a.itemView;
                    kotlin.jvm.internal.o.f(itemView2, "itemView");
                    itemView2.setTranslationY(0.0f);
                    itemView2.setTranslationX(0.0f);
                    x(dVar2.f438505a);
                    arrayList7.remove(size6);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(arrayList7);
                    }
                }
            }
            java.util.ArrayList arrayList8 = this.f438550l;
            int size7 = arrayList8.size() - 1;
            while (i17 < size7) {
                java.lang.Object obj7 = arrayList8.get(size7);
                kotlin.jvm.internal.o.f(obj7, "get(...)");
                java.util.ArrayList arrayList9 = (java.util.ArrayList) obj7;
                int size8 = arrayList9.size() + i17;
                while (i17 < size8) {
                    java.lang.Object obj8 = arrayList9.get(size8);
                    kotlin.jvm.internal.o.f(obj8, "get(...)");
                    androidx.recyclerview.widget.k3 k3Var4 = (androidx.recyclerview.widget.k3) obj8;
                    android.view.View itemView3 = k3Var4.itemView;
                    kotlin.jvm.internal.o.f(itemView3, "itemView");
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList10.add(java.lang.Float.valueOf(f17));
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(itemView3, arrayList10.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    itemView3.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                    yj0.a.f(itemView3, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    h(k3Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList8.remove(arrayList9);
                    }
                    size8--;
                    i17 = -1;
                    f17 = 1.0f;
                }
                size7--;
                i17 = -1;
                f17 = 1.0f;
            }
            java.util.ArrayList arrayList11 = this.f438552n;
            for (int size9 = arrayList11.size() - 1; -1 < size9; size9--) {
                java.lang.Object obj9 = arrayList11.get(size9);
                kotlin.jvm.internal.o.f(obj9, "get(...)");
                java.util.ArrayList arrayList12 = (java.util.ArrayList) obj9;
                for (int size10 = arrayList12.size() - 1; -1 < size10; size10--) {
                    java.lang.Object obj10 = arrayList12.get(size10);
                    kotlin.jvm.internal.o.f(obj10, "get(...)");
                    vo1.c cVar2 = (vo1.c) obj10;
                    androidx.recyclerview.widget.k3 k3Var5 = cVar2.f438498a;
                    if (k3Var5 != null) {
                        G(cVar2, k3Var5);
                    }
                    androidx.recyclerview.widget.k3 k3Var6 = cVar2.f438499b;
                    if (k3Var6 != null) {
                        G(cVar2, k3Var6);
                    }
                    if (arrayList12.isEmpty()) {
                        arrayList11.remove(arrayList12);
                    }
                }
            }
            D(this.f438555q);
            D(this.f438554p);
            D(this.f438553o);
            D(this.f438556r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.n2
    public boolean o() {
        return (this.f438547i.isEmpty() && this.f438549k.isEmpty() && this.f438548j.isEmpty() && this.f438546h.isEmpty() && this.f438554p.isEmpty() && this.f438555q.isEmpty() && this.f438553o.isEmpty() && this.f438556r.isEmpty() && this.f438551m.isEmpty() && this.f438550l.isEmpty() && this.f438552n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.n2
    public void s() {
        java.util.ArrayList arrayList = this.f438546h;
        boolean z17 = !arrayList.isEmpty();
        java.util.ArrayList arrayList2 = this.f438548j;
        boolean z18 = !arrayList2.isEmpty();
        java.util.ArrayList arrayList3 = this.f438549k;
        boolean z19 = !arrayList3.isEmpty();
        java.util.ArrayList arrayList4 = this.f438547i;
        boolean z27 = !arrayList4.isEmpty();
        if (z17 || z18 || z27 || z19) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) next;
                android.view.View itemView = k3Var.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                android.view.ViewPropertyAnimator animate = itemView.animate();
                this.f438555q.add(k3Var);
                animate.setDuration(this.f12169d).alpha(0.0f).setListener(new vo1.m(this, k3Var, animate, itemView)).start();
            }
            arrayList.clear();
            if (z18) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.addAll(arrayList2);
                this.f438551m.add(arrayList5);
                arrayList2.clear();
                vo1.p pVar = new vo1.p(arrayList5, this);
                if (z17) {
                    android.view.View itemView2 = ((vo1.d) arrayList5.get(0)).f438505a.itemView;
                    kotlin.jvm.internal.o.f(itemView2, "itemView");
                    long j17 = this.f12169d;
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    n3.u0.n(itemView2, pVar, j17);
                } else {
                    pVar.run();
                }
            }
            if (z19) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.addAll(arrayList3);
                this.f438552n.add(arrayList6);
                arrayList3.clear();
                vo1.o oVar = new vo1.o(arrayList6, this);
                if (z17) {
                    androidx.recyclerview.widget.k3 k3Var2 = ((vo1.c) arrayList6.get(0)).f438498a;
                    kotlin.jvm.internal.o.d(k3Var2);
                    android.view.View view = k3Var2.itemView;
                    long j18 = this.f12169d;
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                    n3.u0.n(view, oVar, j18);
                } else {
                    oVar.run();
                }
            }
            if (z27) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.addAll(arrayList4);
                this.f438550l.add(arrayList7);
                arrayList4.clear();
                vo1.n nVar = new vo1.n(arrayList7, this);
                if (!z17 && !z18 && !z19) {
                    nVar.run();
                    return;
                }
                long max = (long) ((z17 ? this.f12169d : 0L) + java.lang.Math.max(z18 ? this.f12170e : 0L, z19 ? this.f12171f : 0L));
                android.view.View itemView3 = ((androidx.recyclerview.widget.k3) arrayList7.get(0)).itemView;
                kotlin.jvm.internal.o.f(itemView3, "itemView");
                java.util.WeakHashMap weakHashMap3 = n3.l1.f334362a;
                n3.u0.n(itemView3, nVar, max);
            }
        }
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean t(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        H(holder);
        android.view.View view = holder.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f438547i.add(holder);
        return true;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean u(androidx.recyclerview.widget.k3 oldHolder, androidx.recyclerview.widget.k3 newHolder, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(oldHolder, "oldHolder");
        kotlin.jvm.internal.o.g(newHolder, "newHolder");
        throw new java.lang.IllegalAccessError();
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean v(androidx.recyclerview.widget.k3 holder, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        int translationX = i17 + ((int) holder.itemView.getTranslationX());
        int translationY = i18 + ((int) holder.itemView.getTranslationY());
        H(holder);
        int i28 = i19 - translationX;
        int i29 = i27 - translationY;
        if (i28 == 0 && i29 == 0) {
            x(holder);
            return false;
        }
        if (i28 != 0) {
            itemView.setTranslationX(-i28);
        }
        if (i29 != 0) {
            itemView.setTranslationY(-i29);
        }
        this.f438548j.add(new vo1.d(holder, translationX, translationY, i19, i27));
        return true;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean w(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        H(holder);
        this.f438546h.add(holder);
        return true;
    }
}
