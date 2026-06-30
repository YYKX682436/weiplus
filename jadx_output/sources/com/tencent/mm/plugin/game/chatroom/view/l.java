package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes3.dex */
public abstract class l extends androidx.recyclerview.widget.o3 {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f139204h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f139205i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f139206j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f139207k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f139208l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f139209m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f139210n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f139211o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f139212p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f139213q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f139214r = new java.util.ArrayList();

    public l() {
        new android.view.animation.DecelerateInterpolator();
        this.f12182g = false;
    }

    public final void D(java.util.List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i17 = size - 1;
            ((androidx.recyclerview.widget.k3) list.get(size)).itemView.animate().cancel();
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
            com.tencent.mm.plugin.game.chatroom.view.b bVar = (com.tencent.mm.plugin.game.chatroom.view.b) list.get(size);
            if (G(bVar, k3Var) && bVar.f139027a == null && bVar.f139028b == null) {
                list.remove(bVar);
            }
            if (i17 < 0) {
                return;
            } else {
                size = i17;
            }
        }
    }

    public final boolean G(com.tencent.mm.plugin.game.chatroom.view.b bVar, androidx.recyclerview.widget.k3 k3Var) {
        if (bVar.f139028b == k3Var) {
            bVar.f139028b = null;
        } else {
            if (bVar.f139027a != k3Var) {
                return false;
            }
            bVar.f139027a = null;
        }
        kotlin.jvm.internal.o.d(k3Var);
        android.view.View view = k3Var.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        k3Var.itemView.setTranslationX(0.0f);
        k3Var.itemView.setTranslationY(0.0f);
        h(k3Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.n2
    public void j(androidx.recyclerview.widget.k3 item) {
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View itemView = item.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        itemView.animate().cancel();
        java.util.ArrayList arrayList = this.f139206j;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i17 = size - 1;
                java.lang.Object obj = arrayList.get(size);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                if (((com.tencent.mm.plugin.game.chatroom.view.e) obj).f139072a == item) {
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
        F(this.f139207k, item);
        if (this.f139204h.remove(item)) {
            android.view.View itemView2 = item.itemView;
            kotlin.jvm.internal.o.f(itemView2, "itemView");
            com.tencent.mm.plugin.game.chatroom.view.m.a(itemView2);
            y(item);
        }
        if (this.f139205i.remove(item)) {
            android.view.View itemView3 = item.itemView;
            kotlin.jvm.internal.o.f(itemView3, "itemView");
            com.tencent.mm.plugin.game.chatroom.view.m.a(itemView3);
            h(item);
        }
        java.util.ArrayList arrayList2 = this.f139210n;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i18 = size2 - 1;
                java.lang.Object obj2 = arrayList2.get(size2);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                java.util.ArrayList arrayList3 = (java.util.ArrayList) obj2;
                F(arrayList3, item);
                if (arrayList3.isEmpty()) {
                    arrayList2.remove(size2);
                }
                if (i18 < 0) {
                    break;
                } else {
                    size2 = i18;
                }
            }
        }
        java.util.ArrayList arrayList4 = this.f139209m;
        int size3 = arrayList4.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i19 = size3 - 1;
                java.lang.Object obj3 = arrayList4.get(size3);
                kotlin.jvm.internal.o.f(obj3, "get(...)");
                java.util.ArrayList arrayList5 = (java.util.ArrayList) obj3;
                int size4 = arrayList5.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i27 = size4 - 1;
                        java.lang.Object obj4 = arrayList5.get(size4);
                        kotlin.jvm.internal.o.f(obj4, "get(...)");
                        if (((com.tencent.mm.plugin.game.chatroom.view.e) obj4).f139072a == item) {
                            itemView.setTranslationY(0.0f);
                            itemView.setTranslationX(0.0f);
                            x(item);
                            arrayList5.remove(size4);
                            if (arrayList5.isEmpty()) {
                                arrayList4.remove(size3);
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
        java.util.ArrayList arrayList6 = this.f139208l;
        int size5 = arrayList6.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i28 = size5 - 1;
                java.lang.Object obj5 = arrayList6.get(size5);
                kotlin.jvm.internal.o.f(obj5, "get(...)");
                java.util.ArrayList arrayList7 = (java.util.ArrayList) obj5;
                if (arrayList7.remove(item)) {
                    android.view.View itemView4 = item.itemView;
                    kotlin.jvm.internal.o.f(itemView4, "itemView");
                    com.tencent.mm.plugin.game.chatroom.view.m.a(itemView4);
                    h(item);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
                if (i28 < 0) {
                    break;
                } else {
                    size5 = i28;
                }
            }
        }
        this.f139213q.remove(item);
        this.f139211o.remove(item);
        this.f139214r.remove(item);
        this.f139212p.remove(item);
        E();
    }

    @Override // androidx.recyclerview.widget.n2
    public void k() {
        java.lang.String str;
        java.util.ArrayList arrayList = this.f139206j;
        int i17 = -1;
        int size = arrayList.size() - 1;
        while (true) {
            str = "itemView";
            if (-1 >= size) {
                break;
            }
            java.lang.Object obj = arrayList.get(size);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            com.tencent.mm.plugin.game.chatroom.view.e eVar = (com.tencent.mm.plugin.game.chatroom.view.e) obj;
            android.view.View itemView = eVar.f139072a.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            itemView.setTranslationY(0.0f);
            itemView.setTranslationX(0.0f);
            x(eVar.f139072a);
            arrayList.remove(size);
            size--;
        }
        java.util.ArrayList arrayList2 = this.f139204h;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            java.lang.Object obj2 = arrayList2.get(size2);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            y((androidx.recyclerview.widget.k3) obj2);
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.f139205i;
        for (int size3 = arrayList3.size() - 1; -1 < size3; size3--) {
            java.lang.Object obj3 = arrayList3.get(size3);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) obj3;
            android.view.View itemView2 = k3Var.itemView;
            kotlin.jvm.internal.o.f(itemView2, "itemView");
            com.tencent.mm.plugin.game.chatroom.view.m.a(itemView2);
            h(k3Var);
            arrayList3.remove(size3);
        }
        java.util.ArrayList arrayList4 = this.f139207k;
        for (int size4 = arrayList4.size() - 1; -1 < size4; size4--) {
            java.lang.Object obj4 = arrayList4.get(size4);
            kotlin.jvm.internal.o.f(obj4, "get(...)");
            com.tencent.mm.plugin.game.chatroom.view.b bVar = (com.tencent.mm.plugin.game.chatroom.view.b) obj4;
            androidx.recyclerview.widget.k3 k3Var2 = bVar.f139027a;
            if (k3Var2 != null) {
                G(bVar, k3Var2);
            }
            androidx.recyclerview.widget.k3 k3Var3 = bVar.f139028b;
            if (k3Var3 != null) {
                G(bVar, k3Var3);
            }
        }
        arrayList4.clear();
        if (o()) {
            java.util.ArrayList arrayList5 = this.f139209m;
            for (int size5 = arrayList5.size() - 1; -1 < size5; size5--) {
                java.lang.Object obj5 = arrayList5.get(size5);
                kotlin.jvm.internal.o.f(obj5, "get(...)");
                java.util.ArrayList arrayList6 = (java.util.ArrayList) obj5;
                for (int size6 = arrayList6.size() - 1; -1 < size6; size6--) {
                    java.lang.Object obj6 = arrayList6.get(size6);
                    kotlin.jvm.internal.o.f(obj6, "get(...)");
                    com.tencent.mm.plugin.game.chatroom.view.e eVar2 = (com.tencent.mm.plugin.game.chatroom.view.e) obj6;
                    android.view.View itemView3 = eVar2.f139072a.itemView;
                    kotlin.jvm.internal.o.f(itemView3, "itemView");
                    itemView3.setTranslationY(0.0f);
                    itemView3.setTranslationX(0.0f);
                    x(eVar2.f139072a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            java.util.ArrayList arrayList7 = this.f139208l;
            int size7 = arrayList7.size() - 1;
            while (i17 < size7) {
                java.lang.Object obj7 = arrayList7.get(size7);
                kotlin.jvm.internal.o.f(obj7, "get(...)");
                java.util.ArrayList arrayList8 = (java.util.ArrayList) obj7;
                int size8 = arrayList8.size() + i17;
                while (i17 < size8) {
                    java.lang.Object obj8 = arrayList8.get(size8);
                    kotlin.jvm.internal.o.f(obj8, "get(...)");
                    androidx.recyclerview.widget.k3 k3Var4 = (androidx.recyclerview.widget.k3) obj8;
                    android.view.View view = k3Var4.itemView;
                    kotlin.jvm.internal.o.f(view, str);
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList9.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList9);
                    java.lang.String str2 = str;
                    yj0.a.d(view, arrayList9.toArray(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList9.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    h(k3Var4);
                    if (size8 < arrayList8.size()) {
                        arrayList8.remove(size8);
                    }
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                    size8--;
                    str = str2;
                    i17 = -1;
                }
                size7--;
                i17 = -1;
            }
            java.util.ArrayList arrayList10 = this.f139210n;
            for (int size9 = arrayList10.size() - 1; -1 < size9; size9--) {
                java.lang.Object obj9 = arrayList10.get(size9);
                kotlin.jvm.internal.o.f(obj9, "get(...)");
                java.util.ArrayList arrayList11 = (java.util.ArrayList) obj9;
                for (int size10 = arrayList11.size() - 1; -1 < size10; size10--) {
                    java.lang.Object obj10 = arrayList11.get(size10);
                    kotlin.jvm.internal.o.f(obj10, "get(...)");
                    com.tencent.mm.plugin.game.chatroom.view.b bVar2 = (com.tencent.mm.plugin.game.chatroom.view.b) obj10;
                    androidx.recyclerview.widget.k3 k3Var5 = bVar2.f139027a;
                    if (k3Var5 != null) {
                        G(bVar2, k3Var5);
                    }
                    androidx.recyclerview.widget.k3 k3Var6 = bVar2.f139028b;
                    if (k3Var6 != null) {
                        G(bVar2, k3Var6);
                    }
                    if (arrayList11.isEmpty()) {
                        arrayList10.remove(arrayList11);
                    }
                }
            }
            D(this.f139213q);
            D(this.f139212p);
            D(this.f139211o);
            D(this.f139214r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.n2
    public boolean o() {
        return (this.f139205i.isEmpty() ^ true) || (this.f139207k.isEmpty() ^ true) || (this.f139206j.isEmpty() ^ true) || (this.f139204h.isEmpty() ^ true) || (this.f139212p.isEmpty() ^ true) || (this.f139213q.isEmpty() ^ true) || (this.f139211o.isEmpty() ^ true) || (this.f139214r.isEmpty() ^ true) || (this.f139209m.isEmpty() ^ true) || (this.f139208l.isEmpty() ^ true) || (this.f139210n.isEmpty() ^ true);
    }

    @Override // androidx.recyclerview.widget.n2
    public void s() {
        java.util.ArrayList arrayList = this.f139204h;
        boolean z17 = !arrayList.isEmpty();
        java.util.ArrayList arrayList2 = this.f139206j;
        boolean z18 = !arrayList2.isEmpty();
        java.util.ArrayList arrayList3 = this.f139207k;
        boolean z19 = !arrayList3.isEmpty();
        java.util.ArrayList arrayList4 = this.f139205i;
        boolean z27 = !arrayList4.isEmpty();
        if (z17 || z18 || z27 || z19) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
                kotlin.jvm.internal.o.d(k3Var);
                com.tencent.mm.plugin.game.chatroom.view.o1 o1Var = (com.tencent.mm.plugin.game.chatroom.view.o1) this;
                android.view.ViewPropertyAnimator animate = k3Var.itemView.animate();
                animate.translationY((-k3Var.itemView.getHeight()) * 0.25f);
                animate.alpha(0.0f);
                animate.setDuration(o1Var.f12168c);
                animate.setInterpolator(animate.getInterpolator());
                animate.setListener(new com.tencent.mm.plugin.game.chatroom.view.d(o1Var, k3Var));
                animate.setStartDelay(java.lang.Math.abs((k3Var.getOldPosition() * o1Var.f12169d) / 4));
                animate.start();
                this.f139213q.add(k3Var);
                arrayList4 = arrayList4;
                z27 = z27;
            }
            java.util.ArrayList arrayList5 = arrayList4;
            boolean z28 = z27;
            arrayList.clear();
            if (z18) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList(arrayList2);
                this.f139209m.add(arrayList6);
                arrayList2.clear();
                com.tencent.mm.plugin.game.chatroom.view.k kVar = new com.tencent.mm.plugin.game.chatroom.view.k(this, arrayList6);
                if (z17) {
                    android.view.View itemView = ((com.tencent.mm.plugin.game.chatroom.view.e) arrayList6.get(0)).f139072a.itemView;
                    kotlin.jvm.internal.o.f(itemView, "itemView");
                    itemView.postOnAnimationDelayed(kVar, this.f12169d);
                } else {
                    kVar.run();
                }
            }
            if (z19) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList(arrayList3);
                this.f139210n.add(arrayList7);
                arrayList3.clear();
                com.tencent.mm.plugin.game.chatroom.view.j jVar = new com.tencent.mm.plugin.game.chatroom.view.j(this, arrayList7);
                if (z17) {
                    androidx.recyclerview.widget.k3 k3Var2 = ((com.tencent.mm.plugin.game.chatroom.view.b) arrayList7.get(0)).f139027a;
                    kotlin.jvm.internal.o.d(k3Var2);
                    k3Var2.itemView.postOnAnimationDelayed(jVar, this.f12169d);
                } else {
                    jVar.run();
                }
            }
            if (z28) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList(arrayList5);
                this.f139208l.add(arrayList8);
                arrayList5.clear();
                com.tencent.mm.plugin.game.chatroom.view.i iVar = new com.tencent.mm.plugin.game.chatroom.view.i(this, arrayList8);
                if (!z17 && !z18 && !z19) {
                    iVar.run();
                    return;
                }
                long j17 = z17 ? this.f12169d : 0L;
                long j18 = z18 ? this.f12170e : 0L;
                long j19 = z19 ? this.f12171f : 0L;
                if (j18 < j19) {
                    j18 = j19;
                }
                android.view.View itemView2 = ((androidx.recyclerview.widget.k3) arrayList8.get(0)).itemView;
                kotlin.jvm.internal.o.f(itemView2, "itemView");
                itemView2.postOnAnimationDelayed(iVar, j17 + j18);
            }
        }
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean t(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        j(holder);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.game.chatroom.view.m.a(itemView);
        holder.itemView.setTranslationY((-r0.getHeight()) * 0.25f);
        android.view.View view = holder.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/FadeInDownAnimator", "preAnimateAddImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/FadeInDownAnimator", "preAnimateAddImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f139205i.add(holder);
        return true;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean u(androidx.recyclerview.widget.k3 oldHolder, androidx.recyclerview.widget.k3 newHolder, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(oldHolder, "oldHolder");
        kotlin.jvm.internal.o.g(newHolder, "newHolder");
        if (oldHolder == newHolder) {
            return v(oldHolder, i17, i18, i19, i27);
        }
        float translationX = oldHolder.itemView.getTranslationX();
        float translationY = oldHolder.itemView.getTranslationY();
        float alpha = oldHolder.itemView.getAlpha();
        j(oldHolder);
        int i28 = (int) ((i19 - i17) - translationX);
        int i29 = (int) ((i27 - i18) - translationY);
        oldHolder.itemView.setTranslationX(translationX);
        oldHolder.itemView.setTranslationY(translationY);
        android.view.View view = oldHolder.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(alpha));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        j(newHolder);
        newHolder.itemView.setTranslationX(-i28);
        newHolder.itemView.setTranslationY(-i29);
        android.view.View view2 = newHolder.itemView;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f139207k.add(new com.tencent.mm.plugin.game.chatroom.view.b(oldHolder, newHolder, i17, i18, i19, i27));
        return true;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean v(androidx.recyclerview.widget.k3 holder, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        int translationX = i17 + ((int) holder.itemView.getTranslationX());
        int translationY = i18 + ((int) holder.itemView.getTranslationY());
        j(holder);
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
        this.f139206j.add(new com.tencent.mm.plugin.game.chatroom.view.e(holder, translationX, translationY, i19, i27));
        return true;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean w(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        j(holder);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.game.chatroom.view.m.a(itemView);
        this.f139204h.add(holder);
        return true;
    }
}
