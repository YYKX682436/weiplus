package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class r extends androidx.recyclerview.widget.o3 {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.view.h f203062m = new com.tencent.mm.ui.chatting.view.h(null);

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.WeakHashMap f203063n = new java.util.WeakHashMap();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Long f203064h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Long f203065i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f203066j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f203067k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public yz5.a f203068l;

    public r(long j17, java.lang.Long l17, java.lang.Long l18) {
        this.f203064h = l17;
        this.f203065i = l18;
        this.f12182g = true;
        this.f12171f = j17;
    }

    public final void D(com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, java.lang.String str, int i17, int i18) {
        int f17 = e06.p.f(i17, 0, str.length());
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        if ((str.length() > 0) && f17 < str.length()) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i18), f17, str.length(), 33);
        }
        mMNeat7extView.b(spannableStringBuilder);
    }

    public final com.tencent.mm.ui.chatting.view.g E(androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.ui.chatting.view.j jVar = (com.tencent.mm.ui.chatting.view.j) this.f203067k.get(k3Var);
        if (jVar == null) {
            return null;
        }
        G(jVar.f202962a, jVar.f202970i);
        android.animation.ValueAnimator valueAnimator = jVar.f202966e;
        valueAnimator.removeAllListeners();
        android.view.View view = jVar.f202963b;
        android.graphics.Rect clipBounds = view.getClipBounds();
        android.graphics.Rect rect = clipBounds != null ? new android.graphics.Rect(clipBounds) : null;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i17 = layoutParams != null ? layoutParams.width : 0;
        float e17 = e06.p.e(((valueAnimator.getAnimatedFraction() * 300.0f) - 150.0f) / 150.0f, 0.0f, 1.0f);
        valueAnimator.cancel();
        H(jVar);
        return new com.tencent.mm.ui.chatting.view.g(jVar, rect, i17, e17);
    }

    public final void F() {
        if (o()) {
            return;
        }
        i();
        yz5.a aVar = this.f203068l;
        this.f203068l = null;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void G(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2) {
        java.util.HashMap hashMap = this.f203067k;
        hashMap.remove(k3Var);
        if (k3Var2 != null) {
            hashMap.remove(k3Var2);
        }
    }

    public final void H(com.tencent.mm.ui.chatting.view.j jVar) {
        I(jVar.f202963b, jVar.f202964c, jVar.f202965d);
        android.view.View view = jVar.f202963b;
        view.setClipBounds(jVar.f202967f);
        android.view.View view2 = jVar.f202963b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(jVar.f202968g));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator", "resetViewState", "(Lcom/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator$RunningAnim;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator", "resetViewState", "(Lcom/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator$RunningAnim;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = view instanceof com.tencent.mm.ui.widget.MMNeat7extView ? (com.tencent.mm.ui.widget.MMNeat7extView) view : null;
        if (mMNeat7extView != null) {
            java.lang.Integer num = jVar.f202969h;
            J(mMNeat7extView, num != null ? num.intValue() : mMNeat7extView.getCurrentTextColor(), 1.0f);
        }
        L(view);
        android.view.View view3 = jVar.f202971j;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(jVar.f202972k));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator", "resetViewState", "(Lcom/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator$RunningAnim;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator", "resetViewState", "(Lcom/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator$RunningAnim;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void I(android.view.View view, int i17, int i18) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = i17;
        layoutParams.height = i18;
        view.setLayoutParams(layoutParams);
    }

    public final void J(com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, int i17, float f17) {
        mMNeat7extView.setTextColor(android.graphics.Color.argb(e06.p.f(a06.d.b(e06.p.e(f17, 0.0f, 1.0f) * 255.0f), 0, 255), android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17)));
    }

    public final void K(com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView) {
        android.animation.ValueAnimator valueAnimator;
        com.tencent.mm.ui.chatting.view.i iVar = (com.tencent.mm.ui.chatting.view.i) f203063n.remove(mMNeat7extView);
        if (iVar == null || (valueAnimator = iVar.f202956a) == null) {
            return;
        }
        valueAnimator.cancel();
    }

    public final void L(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView recyclerView = null;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = view instanceof com.tencent.mm.ui.widget.MMNeat7extView ? (com.tencent.mm.ui.widget.MMNeat7extView) view : null;
        if (mMNeat7extView == null) {
            return;
        }
        K(mMNeat7extView);
        java.lang.Object parent = mMNeat7extView.getParent();
        while (true) {
            if (parent == null) {
                break;
            }
            if (parent instanceof androidx.recyclerview.widget.RecyclerView) {
                recyclerView = (androidx.recyclerview.widget.RecyclerView) parent;
                break;
            } else {
                android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
                parent = view2 != null ? view2.getParent() : null;
            }
        }
        if (recyclerView == null || recyclerView.getItemAnimator() != this || o()) {
            return;
        }
        com.tencent.mm.ui.chatting.view.v.c(recyclerView, this);
    }

    @Override // androidx.recyclerview.widget.n2
    public boolean g(androidx.recyclerview.widget.k3 viewHolder, java.util.List payloads) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        return (payloads.isEmpty() ^ true) || f(viewHolder);
    }

    @Override // androidx.recyclerview.widget.n2
    public void j(androidx.recyclerview.widget.k3 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f203066j.remove(item);
        com.tencent.mm.ui.chatting.view.j jVar = (com.tencent.mm.ui.chatting.view.j) this.f203067k.get(item);
        if (jVar == null) {
            com.tencent.mm.ui.widget.MMNeat7extView a17 = com.tencent.mm.ui.chatting.view.v.a(item);
            if (a17 != null) {
                K(a17);
                return;
            }
            return;
        }
        androidx.recyclerview.widget.k3 k3Var = jVar.f202962a;
        androidx.recyclerview.widget.k3 k3Var2 = jVar.f202970i;
        G(k3Var, k3Var2);
        android.animation.ValueAnimator valueAnimator = jVar.f202966e;
        valueAnimator.removeAllListeners();
        valueAnimator.cancel();
        H(jVar);
        com.tencent.mm.ui.widget.MMNeat7extView a18 = com.tencent.mm.ui.chatting.view.v.a(item);
        if (a18 != null) {
            K(a18);
        }
        if (k3Var2 == null || k3Var2 == k3Var) {
            h(k3Var);
        } else {
            h(k3Var2);
            h(k3Var);
        }
        F();
    }

    @Override // androidx.recyclerview.widget.n2
    public void k() {
        java.util.HashMap hashMap = this.f203067k;
        java.util.Collection values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Set<com.tencent.mm.ui.chatting.view.j> X0 = kz5.n0.X0(values);
        hashMap.clear();
        this.f203066j.clear();
        for (com.tencent.mm.ui.chatting.view.j jVar : X0) {
            jVar.f202966e.removeAllListeners();
            jVar.f202966e.cancel();
            H(jVar);
            androidx.recyclerview.widget.k3 k3Var = jVar.f202970i;
            if (k3Var != null) {
                h(k3Var);
            }
            h(jVar.f202962a);
        }
        i();
    }

    @Override // androidx.recyclerview.widget.n2
    public boolean o() {
        return !this.f203067k.isEmpty();
    }

    @Override // androidx.recyclerview.widget.n2
    public androidx.recyclerview.widget.m2 r(androidx.recyclerview.widget.h3 state, androidx.recyclerview.widget.k3 viewHolder, int i17, java.util.List payloads) {
        com.tencent.mm.ui.chatting.view.w b17;
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        com.tencent.mm.ui.widget.MMNeat7extView a17 = com.tencent.mm.ui.chatting.view.v.a(viewHolder);
        if (a17 != null && (b17 = com.tencent.mm.ui.chatting.view.v.b(a17)) != null) {
            java.lang.CharSequence a18 = a17.a();
            this.f203066j.put(viewHolder, new com.tencent.mm.ui.chatting.view.w(b17.f203133a, b17.f203134b, a18 != null ? a18.length() : 0));
        }
        androidx.recyclerview.widget.m2 m2Var = new androidx.recyclerview.widget.m2();
        m2Var.a(viewHolder, 0);
        return m2Var;
    }

    @Override // androidx.recyclerview.widget.n2
    public void s() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    @Override // androidx.recyclerview.widget.o3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t(androidx.recyclerview.widget.k3 r15) {
        /*
            r14 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.g(r15, r0)
            java.util.HashMap r0 = r14.f203066j
            boolean r0 = r0.containsKey(r15)
            r1 = 0
            if (r0 != 0) goto Lc7
            com.tencent.mm.ui.widget.MMNeat7extView r0 = com.tencent.mm.ui.chatting.view.v.a(r15)
            r2 = 0
            r3 = 2131300369(0x7f091011, float:1.8218766E38)
            if (r0 != 0) goto L19
            goto L40
        L19:
            java.lang.Object r0 = r0.getTag(r3)
            boolean r4 = r0 instanceof java.lang.Long
            if (r4 == 0) goto L24
            java.lang.Long r0 = (java.lang.Long) r0
            goto L25
        L24:
            r0 = r2
        L25:
            if (r0 == 0) goto L40
            long r4 = r0.longValue()
            java.lang.Long r0 = r14.f203064h
            if (r0 == 0) goto L40
            long r6 = r0.longValue()
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L3a
            goto L40
        L3a:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L40
            r0 = 1
            goto L41
        L40:
            r0 = r1
        L41:
            if (r0 == 0) goto Lc7
            com.tencent.mm.ui.widget.MMNeat7extView r0 = com.tencent.mm.ui.chatting.view.v.a(r15)
            if (r0 == 0) goto Lc7
            java.lang.Object r3 = r0.getTag(r3)
            boolean r4 = r3 instanceof java.lang.Long
            if (r4 == 0) goto L54
            java.lang.Long r3 = (java.lang.Long) r3
            goto L55
        L54:
            r3 = r2
        L55:
            if (r3 == 0) goto Lc7
            long r6 = r3.longValue()
            java.lang.CharSequence r3 = r0.a()
            if (r3 == 0) goto L65
            java.lang.String r2 = r3.toString()
        L65:
            if (r2 != 0) goto L69
            java.lang.String r2 = ""
        L69:
            java.util.WeakHashMap r3 = com.tencent.mm.ui.chatting.view.r.f203063n
            java.lang.Object r4 = r3.remove(r0)
            com.tencent.mm.ui.chatting.view.i r4 = (com.tencent.mm.ui.chatting.view.i) r4
            if (r4 == 0) goto L7a
            android.animation.ValueAnimator r4 = r4.f202956a
            if (r4 == 0) goto L7a
            r4.cancel()
        L7a:
            android.content.res.Resources r4 = com.tencent.mm.sdk.platformtools.x2.f193075e
            r5 = 2131100274(0x7f060272, float:1.7812925E38)
            int r11 = r4.getColor(r5)
            com.tencent.mm.ui.chatting.view.i r12 = new com.tencent.mm.ui.chatting.view.i
            r4 = 2
            float[] r4 = new float[r4]
            r4 = {x00cc: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r4)
            java.lang.String r4 = "ofFloat(...)"
            kotlin.jvm.internal.o.f(r5, r4)
            r8 = 0
            r9 = 4
            r10 = 0
            r4 = r12
            r4.<init>(r5, r6, r8, r9, r10)
            r14.D(r0, r2, r1, r11)
            android.animation.ValueAnimator r10 = r12.f202956a
            r4 = 750(0x2ee, double:3.705E-321)
            r10.setDuration(r4)
            r4 = -1
            r10.setRepeatCount(r4)
            android.view.animation.LinearInterpolator r4 = new android.view.animation.LinearInterpolator
            r4.<init>()
            r10.setInterpolator(r4)
            com.tencent.mm.ui.chatting.view.q r13 = new com.tencent.mm.ui.chatting.view.q
            r4 = r13
            r5 = r2
            r6 = r12
            r7 = r14
            r8 = r0
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r10.addUpdateListener(r13)
            r3.put(r0, r12)
            android.animation.ValueAnimator r0 = r12.f202956a
            r0.start()
        Lc7:
            r14.h(r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.view.r.t(androidx.recyclerview.widget.k3):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    @Override // androidx.recyclerview.widget.o3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u(androidx.recyclerview.widget.k3 r30, androidx.recyclerview.widget.k3 r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.view.r.u(androidx.recyclerview.widget.k3, androidx.recyclerview.widget.k3, int, int, int, int):boolean");
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean v(androidx.recyclerview.widget.k3 holder, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(holder, "holder");
        x(holder);
        return false;
    }

    @Override // androidx.recyclerview.widget.o3
    public boolean w(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        y(holder);
        return false;
    }
}
