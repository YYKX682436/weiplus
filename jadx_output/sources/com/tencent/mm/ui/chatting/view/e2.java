package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class e2 extends androidx.recyclerview.widget.o3 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f202911h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.view.e1 f202912i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedHashMap f202913j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f202914k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedHashMap f202915l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.view.z2 f202916m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f202917n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f202918o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f202919p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f202920q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashSet f202921r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashSet f202922s;

    /* renamed from: t, reason: collision with root package name */
    public final int f202923t;

    /* renamed from: u, reason: collision with root package name */
    public final int f202924u;

    /* renamed from: v, reason: collision with root package name */
    public int f202925v;

    /* renamed from: w, reason: collision with root package name */
    public int f202926w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f202927x;

    public e2(java.lang.String focusGroupId) {
        kotlin.jvm.internal.o.g(focusGroupId, "focusGroupId");
        this.f202911h = focusGroupId;
        this.f12182g = false;
        this.f202913j = new java.util.LinkedHashMap();
        this.f202914k = new java.util.HashMap();
        this.f202915l = new java.util.LinkedHashMap();
        this.f202916m = new com.tencent.mm.ui.chatting.view.z2();
        this.f202917n = new java.util.ArrayList();
        this.f202918o = new java.util.HashMap();
        this.f202919p = new java.util.HashMap();
        this.f202920q = new java.util.HashMap();
        this.f202921r = new java.util.HashSet();
        this.f202922s = new java.util.HashSet();
        this.f202923t = 5;
        this.f202924u = 5;
    }

    public static final void D(kotlin.jvm.internal.f0 f0Var, android.view.View view, com.tencent.mm.ui.chatting.view.e2 e2Var, androidx.recyclerview.widget.k3 k3Var, yz5.a aVar) {
        int i17 = f0Var.f310116d - 1;
        f0Var.f310116d = i17;
        if (i17 <= 0) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            e2Var.f202919p.remove(k3Var);
            e2Var.f202920q.remove(k3Var);
            e2Var.f202921r.remove(k3Var);
            if (!e2Var.f202922s.contains(k3Var) && (view.getParent() instanceof androidx.recyclerview.widget.RecyclerView)) {
                aVar.invoke();
            }
            e2Var.J();
        }
    }

    public final boolean E(androidx.recyclerview.widget.k3 k3Var, int i17, int i18, int i19, int i27, yz5.a aVar, yz5.a aVar2) {
        kotlin.jvm.internal.f0 f0Var;
        int i28;
        android.view.View itemView = k3Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        n3.l1.a(itemView).b();
        java.util.HashMap hashMap = this.f202919p;
        u3.u uVar = (u3.u) hashMap.remove(k3Var);
        if (uVar != null) {
            uVar.b();
        }
        java.util.HashMap hashMap2 = this.f202920q;
        u3.u uVar2 = (u3.u) hashMap2.remove(k3Var);
        if (uVar2 != null) {
            uVar2.b();
        }
        int i29 = i17 - i19;
        int i37 = i18 - i27;
        if (i29 == 0 && i37 == 0) {
            aVar2.invoke();
            J();
            return false;
        }
        if (i29 != 0) {
            itemView.setTranslationX(i29);
        }
        if (i37 != 0) {
            itemView.setTranslationY(i37);
        }
        aVar.invoke();
        this.f202921r.add(k3Var);
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        if (i29 != 0) {
            f0Var2.f310116d++;
        }
        if (i37 != 0) {
            f0Var2.f310116d++;
        }
        if (i29 != 0) {
            f0Var = f0Var2;
            i28 = i37;
            u3.u a17 = pa5.j.a(i29, 0, new com.tencent.mm.ui.chatting.view.l1(itemView), new com.tencent.mm.ui.chatting.view.m1(f0Var2, itemView, this, k3Var, aVar2), 0.0f, 0.0f, 0.0f, 112, null);
            hashMap.put(k3Var, a17);
            a17.e();
        } else {
            f0Var = f0Var2;
            i28 = i37;
        }
        if (i28 != 0) {
            u3.u a18 = pa5.j.a(i28, 0, new com.tencent.mm.ui.chatting.view.n1(itemView), new com.tencent.mm.ui.chatting.view.o1(f0Var, itemView, this, k3Var, aVar2), 0.0f, 0.0f, 0.0f, 112, null);
            hashMap2.put(k3Var, a18);
            a18.e();
        }
        return true;
    }

    public final void F(androidx.recyclerview.widget.RecyclerView recyclerView, qd5.b bVar) {
        if (kotlin.jvm.internal.o.b(bVar.f361902a, this.f202911h)) {
            com.tencent.mm.ui.chatting.view.w2 f17 = this.f202916m.f(recyclerView, bVar.f361904c, i65.a.h(recyclerView.getContext(), com.tencent.mm.R.dimen.f479646bl));
            if (f17 == null) {
                return;
            }
            java.util.HashMap hashMap = this.f202914k;
            java.lang.String str = bVar.f361903b;
            hashMap.put(str, new com.tencent.mm.ui.chatting.view.d1(str, f17));
        }
    }

    public final void G(androidx.recyclerview.widget.RecyclerView recyclerView, qd5.b bVar) {
        jz5.l lVar;
        if (kotlin.jvm.internal.o.b(bVar.f361902a, this.f202911h) && (lVar = bVar.f361904c) != null) {
            android.view.View view = (android.view.View) lVar.f302833d;
            this.f202913j.put(bVar.f361903b, lVar);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "collectExpandedTargetForExpand", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/mvvm/fold/ExpandedChattingItem$UIData;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "collectExpandedTargetForExpand", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/mvvm/fold/ExpandedChattingItem$UIData;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            recyclerView.post(new com.tencent.mm.ui.chatting.view.p1(this, bVar, view));
        }
    }

    public final void H(androidx.recyclerview.widget.RecyclerView recyclerView, qd5.g gVar) {
        java.util.Map map;
        if (kotlin.jvm.internal.o.b(gVar.f361908a, this.f202911h) && (map = gVar.f361909b) != null) {
            java.util.Set<java.util.Map.Entry> entrySet = map.entrySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.Map.Entry entry : entrySet) {
                java.lang.String str = (java.lang.String) entry.getKey();
                com.tencent.mm.ui.chatting.view.w2 f17 = this.f202916m.f(recyclerView, (jz5.l) entry.getValue(), i65.a.h(recyclerView.getContext(), com.tencent.mm.R.dimen.f479738dv));
                com.tencent.mm.ui.chatting.view.d1 d1Var = f17 == null ? null : new com.tencent.mm.ui.chatting.view.d1(str, f17);
                if (d1Var != null) {
                    arrayList.add(d1Var);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            java.util.List F0 = kz5.n0.F0(arrayList, new com.tencent.mm.ui.chatting.view.q1());
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry2 : map.entrySet()) {
                linkedHashMap.put((java.lang.String) entry2.getKey(), ((jz5.l) entry2.getValue()).f302833d);
            }
            this.f202912i = new com.tencent.mm.ui.chatting.view.e1(F0, linkedHashMap);
        }
    }

    public final void I(androidx.recyclerview.widget.RecyclerView recyclerView, qd5.g gVar) {
        java.util.Map map;
        if (kotlin.jvm.internal.o.b(gVar.f361908a, this.f202911h) && (map = gVar.f361909b) != null) {
            java.util.LinkedHashMap linkedHashMap = this.f202915l;
            linkedHashMap.clear();
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                android.view.View view = (android.view.View) ((jz5.l) entry.getValue()).f302833d;
                linkedHashMap.put(str, view);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "collectFoldedTargetsForCollapse", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/mvvm/fold/FoldedChattingItem$UIData;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "collectFoldedTargetsForCollapse", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/mvvm/fold/FoldedChattingItem$UIData;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            recyclerView.post(new com.tencent.mm.ui.chatting.view.r1(this));
        }
    }

    public final void J() {
        if (o()) {
            return;
        }
        i();
        yz5.a aVar = this.f202927x;
        this.f202927x = null;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void K(androidx.recyclerview.widget.RecyclerView recyclerView) {
        if (this.f202916m.e(this.f202911h) || this.f202914k.isEmpty() || this.f202915l.isEmpty()) {
            return;
        }
        n3.m0.a(recyclerView, new com.tencent.mm.ui.chatting.view.s1(recyclerView, this, recyclerView));
    }

    public final void L(androidx.recyclerview.widget.RecyclerView recyclerView) {
        if (this.f202916m.e(this.f202911h) || this.f202913j.isEmpty()) {
            return;
        }
        n3.m0.a(recyclerView, new com.tencent.mm.ui.chatting.view.t1(recyclerView, this, recyclerView));
    }

    public final androidx.recyclerview.widget.RecyclerView M(androidx.recyclerview.widget.k3 k3Var) {
        android.view.ViewParent parent = k3Var.itemView.getParent();
        if (parent instanceof androidx.recyclerview.widget.RecyclerView) {
            return (androidx.recyclerview.widget.RecyclerView) parent;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n2
    public void j(androidx.recyclerview.widget.k3 item) {
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View itemView = item.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        boolean z17 = !(itemView.getParent() instanceof androidx.recyclerview.widget.RecyclerView);
        java.util.HashMap hashMap = this.f202918o;
        android.animation.Animator animator = (android.animation.Animator) hashMap.get(item);
        if (z17 || animator != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[endAnimation] suppressMove=");
            sb6.append(z17);
            sb6.append(" hasAddAnim=");
            sb6.append(animator != null);
            com.tencent.mars.xlog.Log.w("MicroMsg.MediaGroupFoldItemAnimator", sb6.toString());
        }
        java.util.HashSet hashSet = this.f202922s;
        if (z17) {
            hashSet.add(item);
        }
        n3.l1.a(itemView).b();
        u3.u uVar = (u3.u) this.f202919p.remove(item);
        if (uVar != null) {
            uVar.b();
        }
        u3.u uVar2 = (u3.u) this.f202920q.remove(item);
        if (uVar2 != null) {
            uVar2.b();
        }
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
            ((java.util.ArrayList) this.f202917n).remove(animator);
            hashMap.remove(item);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(itemView, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            itemView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(itemView, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            h(item);
        }
        itemView.setTranslationX(0.0f);
        itemView.setTranslationY(0.0f);
        this.f202921r.remove(item);
        if (z17) {
            hashSet.remove(item);
        }
        J();
    }

    @Override // androidx.recyclerview.widget.n2
    public void k() {
        float f17;
        java.util.HashMap hashMap = this.f202916m.f203170a;
        java.util.Collection values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.List S0 = kz5.n0.S0(values);
        hashMap.clear();
        java.util.Iterator it = S0.iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((com.tencent.mm.ui.chatting.view.u2) it.next()).f203109a.iterator();
            while (it6.hasNext()) {
                ((u3.s) it6.next()).b();
            }
        }
        java.util.List list = this.f202917n;
        java.util.Iterator it7 = kz5.n0.S0(list).iterator();
        while (it7.hasNext()) {
            ((android.animation.Animator) it7.next()).cancel();
        }
        ((java.util.ArrayList) list).clear();
        java.util.HashSet hashSet = this.f202922s;
        java.util.HashSet hashSet2 = this.f202921r;
        hashSet.addAll(hashSet2);
        java.util.HashMap hashMap2 = this.f202919p;
        java.util.Collection values2 = hashMap2.values();
        kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
        java.util.Iterator it8 = kz5.n0.S0(values2).iterator();
        while (it8.hasNext()) {
            ((u3.u) it8.next()).b();
        }
        java.util.HashMap hashMap3 = this.f202920q;
        java.util.Collection values3 = hashMap3.values();
        kotlin.jvm.internal.o.f(values3, "<get-values>(...)");
        java.util.Iterator it9 = kz5.n0.S0(values3).iterator();
        while (it9.hasNext()) {
            ((u3.u) it9.next()).b();
        }
        hashMap2.clear();
        hashMap3.clear();
        java.util.Iterator it10 = hashSet2.iterator();
        while (it10.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it10.next();
            k3Var.itemView.setTranslationX(0.0f);
            k3Var.itemView.setTranslationY(0.0f);
        }
        hashSet2.clear();
        hashSet.clear();
        java.util.LinkedHashMap linkedHashMap = this.f202913j;
        java.util.Collection values4 = linkedHashMap.values();
        kotlin.jvm.internal.o.f(values4, "<get-values>(...)");
        java.util.Iterator it11 = values4.iterator();
        while (true) {
            f17 = 1.0f;
            if (!it11.hasNext()) {
                break;
            }
            android.view.View view = (android.view.View) ((jz5.l) it11.next()).f302833d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        java.util.LinkedHashMap linkedHashMap2 = this.f202915l;
        java.util.Collection<android.view.View> values5 = linkedHashMap2.values();
        kotlin.jvm.internal.o.f(values5, "<get-values>(...)");
        for (android.view.View view2 : values5) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            f17 = 1.0f;
        }
        com.tencent.mm.ui.chatting.view.e1 e1Var = this.f202912i;
        if (e1Var != null) {
            java.util.Collection<android.view.View> values6 = e1Var.f202910b.values();
            kotlin.jvm.internal.o.f(values6, "<get-values>(...)");
            for (android.view.View view3 : values6) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        this.f202912i = null;
        linkedHashMap.clear();
        this.f202914k.clear();
        linkedHashMap2.clear();
        i();
        yz5.a aVar = this.f202927x;
        this.f202927x = null;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.n2
    public boolean o() {
        return (this.f202916m.f203170a.isEmpty() ^ true) || (this.f202917n.isEmpty() ^ true) || (this.f202921r.isEmpty() ^ true);
    }

    @Override // androidx.recyclerview.widget.n2
    public void s() {
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean t(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        androidx.recyclerview.widget.RecyclerView M = M(holder);
        qd5.g b17 = com.tencent.mm.ui.chatting.view.i2.b(holder);
        qd5.b a17 = com.tencent.mm.ui.chatting.view.i2.a(holder);
        java.lang.String str = this.f202911h;
        if (!((b17 != null && kotlin.jvm.internal.o.b(b17.f361908a, str)) || (a17 != null && kotlin.jvm.internal.o.b(a17.f361902a, str)))) {
            h(holder);
            return false;
        }
        if (M != null) {
            if (a17 != null) {
                if (!kotlin.jvm.internal.o.b(a17.f361902a, str)) {
                    a17 = null;
                }
                if (a17 != null) {
                    G(M, a17);
                    L(M);
                    int i17 = this.f202925v + 1;
                    this.f202925v = i17;
                    int i18 = this.f202923t;
                    if (i18 > 0) {
                        M.post(new com.tencent.mm.ui.chatting.view.v1(i17, this, M, i18));
                    }
                }
            }
            if (b17 != null) {
                if (!kotlin.jvm.internal.o.b(b17.f361908a, str)) {
                    b17 = null;
                }
                if (b17 != null) {
                    I(M, b17);
                    K(M);
                    int i19 = this.f202926w + 1;
                    this.f202926w = i19;
                    int i27 = this.f202924u;
                    if (i27 > 0) {
                        M.post(new com.tencent.mm.ui.chatting.view.u1(i19, this, M, i27));
                    }
                }
            }
        }
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 1.0f);
        ofFloat.setDuration(180L);
        ofFloat.addUpdateListener(new com.tencent.mm.ui.chatting.view.f1(itemView));
        ofFloat.addListener(new com.tencent.mm.ui.chatting.view.g1(this, holder, itemView));
        ((java.util.ArrayList) this.f202917n).add(ofFloat);
        this.f202918o.put(holder, ofFloat);
        ofFloat.start();
        return true;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean u(androidx.recyclerview.widget.k3 oldHolder, androidx.recyclerview.widget.k3 newHolder, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(oldHolder, "oldHolder");
        kotlin.jvm.internal.o.g(newHolder, "newHolder");
        androidx.recyclerview.widget.RecyclerView M = M(oldHolder);
        if (M == null) {
            M = M(newHolder);
        }
        if (M != null) {
            qd5.g b17 = com.tencent.mm.ui.chatting.view.i2.b(oldHolder);
            java.lang.String str = this.f202911h;
            qd5.b bVar = null;
            if (b17 == null || !kotlin.jvm.internal.o.b(b17.f361908a, str)) {
                b17 = null;
            }
            qd5.b a17 = com.tencent.mm.ui.chatting.view.i2.a(oldHolder);
            if (a17 == null || !kotlin.jvm.internal.o.b(a17.f361902a, str)) {
                a17 = null;
            }
            qd5.g b18 = com.tencent.mm.ui.chatting.view.i2.b(newHolder);
            if (b18 == null || !kotlin.jvm.internal.o.b(b18.f361908a, str)) {
                b18 = null;
            }
            qd5.b a18 = com.tencent.mm.ui.chatting.view.i2.a(newHolder);
            if (a18 != null && kotlin.jvm.internal.o.b(a18.f361902a, str)) {
                bVar = a18;
            }
            int i28 = this.f202923t;
            if (b17 != null) {
                H(M, b17);
                L(M);
                int i29 = this.f202925v + 1;
                this.f202925v = i29;
                if (i28 > 0) {
                    M.post(new com.tencent.mm.ui.chatting.view.v1(i29, this, M, i28));
                }
            }
            if (bVar != null) {
                G(M, bVar);
                L(M);
                int i37 = this.f202925v + 1;
                this.f202925v = i37;
                if (i28 > 0) {
                    M.post(new com.tencent.mm.ui.chatting.view.v1(i37, this, M, i28));
                }
            }
            int i38 = this.f202924u;
            if (a17 != null) {
                F(M, a17);
                K(M);
                int i39 = this.f202926w + 1;
                this.f202926w = i39;
                if (i38 > 0) {
                    M.post(new com.tencent.mm.ui.chatting.view.u1(i39, this, M, i38));
                }
            }
            if (b18 != null) {
                I(M, b18);
                K(M);
                int i47 = this.f202926w + 1;
                this.f202926w = i47;
                if (i38 > 0) {
                    M.post(new com.tencent.mm.ui.chatting.view.u1(i47, this, M, i38));
                }
            }
        }
        if (oldHolder == newHolder && i17 == i19 && i18 == i27) {
            h(oldHolder);
            return false;
        }
        if (oldHolder == newHolder) {
            return E(oldHolder, i17, i18, i19, i27, new com.tencent.mm.ui.chatting.view.h1(this, oldHolder), new com.tencent.mm.ui.chatting.view.i1(this, oldHolder));
        }
        h(oldHolder);
        h(newHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean v(androidx.recyclerview.widget.k3 holder, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return E(holder, i17, i18, i19, i27, new com.tencent.mm.ui.chatting.view.j1(this, holder), new com.tencent.mm.ui.chatting.view.k1(this, holder));
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean w(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        androidx.recyclerview.widget.RecyclerView M = M(holder);
        qd5.g b17 = com.tencent.mm.ui.chatting.view.i2.b(holder);
        qd5.b a17 = com.tencent.mm.ui.chatting.view.i2.a(holder);
        java.lang.String str = this.f202911h;
        if (!((b17 != null && kotlin.jvm.internal.o.b(b17.f361908a, str)) || (a17 != null && kotlin.jvm.internal.o.b(a17.f361902a, str)))) {
            y(holder);
            return false;
        }
        if (M != null) {
            if (b17 != null) {
                if (!kotlin.jvm.internal.o.b(b17.f361908a, str)) {
                    b17 = null;
                }
                if (b17 != null) {
                    H(M, b17);
                    L(M);
                    int i17 = this.f202925v + 1;
                    this.f202925v = i17;
                    int i18 = this.f202923t;
                    if (i18 > 0) {
                        M.post(new com.tencent.mm.ui.chatting.view.v1(i17, this, M, i18));
                    }
                }
            }
            if (a17 != null) {
                if (!kotlin.jvm.internal.o.b(a17.f361902a, str)) {
                    a17 = null;
                }
                if (a17 != null) {
                    F(M, a17);
                    K(M);
                    int i19 = this.f202926w + 1;
                    this.f202926w = i19;
                    int i27 = this.f202924u;
                    if (i27 > 0) {
                        M.post(new com.tencent.mm.ui.chatting.view.u1(i19, this, M, i27));
                    }
                }
            }
        }
        y(holder);
        return true;
    }
}
