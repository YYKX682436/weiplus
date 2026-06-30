package jn2;

/* loaded from: classes5.dex */
public final class j extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final gk2.e H;
    public final sf2.x I;

    /* renamed from: J, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f300632J;
    public androidx.viewpager.widget.ViewPager K;
    public jn2.k L;
    public androidx.constraintlayout.widget.ConstraintLayout M;
    public android.widget.TextView N;
    public jn2.w P;
    public final java.util.Set Q;
    public final java.util.Map R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, gk2.e liveData, sf2.x controller) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.H = liveData;
        this.I = controller;
        this.Q = new java.util.LinkedHashSet();
        this.R = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:28|29))(4:30|(1:32)|33|(2:35|(4:37|(1:39)|40|(2:42|43))(2:44|45))(2:46|47))|12|(1:14)|(3:16|(1:26)|(1:21)(3:22|23|24))|27|23|24))|50|6|7|(0)(0)|12|(0)|(0)|27|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018f, code lost:
    
        com.tencent.mars.xlog.Log.e("FinderLiveAnchorSingSongAddPanel", "load tab list failed: " + r0.getMessage());
        r1.j0();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x016c A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:11:0x0034, B:12:0x0168, B:14:0x016c, B:16:0x0170, B:18:0x0174, B:22:0x017e, B:27:0x0185, B:40:0x015b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0170 A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:11:0x0034, B:12:0x0168, B:14:0x016c, B:16:0x0170, B:18:0x0174, B:22:0x017e, B:27:0x0185, B:40:0x015b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e0(jn2.j r32, kotlin.coroutines.Continuation r33) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jn2.j.e0(jn2.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.e8l;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        java.lang.String string = this.f118183e.getString(com.tencent.mm.R.string.ooz);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f487349vg0);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f300632J = (com.google.android.material.tabs.TabLayout) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.voo);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.K = (androidx.viewpager.widget.ViewPager) findViewById2;
        this.M = (androidx.constraintlayout.widget.ConstraintLayout) rootView.findViewById(com.tencent.mm.R.id.sse);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.vhj);
        this.N = textView;
        if (textView != null) {
            textView.setOnClickListener(new jn2.b(this));
        }
        this.P = new jn2.w(rootView, this.E, this.I, this.H, new jn2.c(this), new jn2.d(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        sf2.j0.l((sf2.o1) ((jz5.n) this.I.f407348q).getValue(), "", false, false, 4, null);
        super.S();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        super.V(e0Var, z17, i17);
        te2.a9.f417883a.a(this.I.h7(), 1, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        jn2.w wVar = this.P;
        if (wVar != null) {
            wVar.f();
        }
        k0();
        kotlinx.coroutines.y0 y0Var = this.E;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new jn2.e(this, null), 3, null);
        }
    }

    public final void f0(boolean z17) {
        android.view.View view;
        android.view.View view2;
        java.lang.Object obj;
        com.google.android.material.tabs.TabLayout tabLayout = this.f300632J;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        int tabCount = tabLayout.getTabCount();
        for (int i17 = 0; i17 < tabCount; i17++) {
            java.util.Map map = this.R;
            if (map.containsKey(java.lang.Integer.valueOf(i17))) {
                view2 = (android.view.View) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
            } else {
                com.google.android.material.tabs.TabLayout tabLayout2 = this.f300632J;
                if (tabLayout2 == null) {
                    kotlin.jvm.internal.o.o("tabLayout");
                    throw null;
                }
                oa.i k17 = tabLayout2.k(i17);
                try {
                    java.lang.reflect.Field declaredField = oa.i.class.getDeclaredField("h");
                    kotlin.jvm.internal.o.f(declaredField, "getDeclaredField(...)");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(k17);
                } catch (java.lang.Exception unused) {
                }
                if (obj instanceof android.view.View) {
                    view = (android.view.View) obj;
                    map.put(java.lang.Integer.valueOf(i17), view);
                    view2 = view;
                }
                view = null;
                map.put(java.lang.Integer.valueOf(i17), view);
                view2 = view;
            }
            if (view2 != null) {
                int width = pm0.v.r(view2).width();
                int width2 = view2.getWidth();
                if (width > width2) {
                    width = width2;
                }
                boolean z18 = width >= view2.getWidth() / 3;
                java.util.Set set = this.Q;
                if (!z18) {
                    set.remove(java.lang.Integer.valueOf(i17));
                } else if (z17 || !set.contains(java.lang.Integer.valueOf(i17))) {
                    set.add(java.lang.Integer.valueOf(i17));
                }
            }
        }
    }

    public final void g0() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.M;
        if (constraintLayout != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(constraintLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(constraintLayout, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.N;
        if (textView != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.google.android.material.tabs.TabLayout tabLayout = this.f300632J;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(tabLayout, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        tabLayout.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(tabLayout, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.viewpager.widget.ViewPager viewPager = this.K;
        if (viewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(viewPager, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewPager.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(viewPager, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void h0(int i17, java.util.LinkedList linkedList, int i18, r45.zw1 zw1Var) {
        jn2.k kVar = this.L;
        java.util.ArrayList arrayList = null;
        jn2.f0 f0Var = kVar != null ? (jn2.f0) kVar.f300636e.get(i17) : null;
        java.lang.Object obj = linkedList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.in inVar = (r45.in) kz5.n0.a0(linkedList, i17);
        if (inVar != null) {
            boolean z17 = true;
            if (f0Var != null) {
                kotlinx.coroutines.y0 y0Var = this.E;
                sf2.x controller = this.I;
                kotlin.jvm.internal.o.g(controller, "controller");
                gk2.e liveData = this.H;
                kotlin.jvm.internal.o.g(liveData, "liveData");
                if (!f0Var.f300601g) {
                    f0Var.f300601g = true;
                    f0Var.f300598d = controller;
                    f0Var.f300599e = y0Var;
                    java.util.LinkedList linkedList2 = inVar.f377158f;
                    java.util.Collection collection = linkedList2 == null ? kz5.p0.f313996d : linkedList2;
                    android.widget.ScrollView scrollView = f0Var.f300603i;
                    int i19 = collection.isEmpty() ^ true ? 0 : 8;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(i19));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(scrollView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView", "initSubTabs", "(Ljava/util/List;ILcom/tencent/mm/protocal/protobuf/FinderLiveKtvGetMusicBoardResponse;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    scrollView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(scrollView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView", "initSubTabs", "(Ljava/util/List;ILcom/tencent/mm/protocal/protobuf/FinderLiveKtvGetMusicBoardResponse;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int i27 = 0;
                    for (java.lang.Object obj2 : collection) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        android.view.LayoutInflater from = android.view.LayoutInflater.from(f0Var.getContext());
                        android.widget.LinearLayout linearLayout = f0Var.f300604m;
                        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.e8j, (android.view.ViewGroup) linearLayout, false);
                        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.vhl)).setText(((r45.ch6) obj2).f371556e);
                        linearLayout.addView(inflate);
                        inflate.setOnClickListener(new jn2.b0(f0Var, i27, y0Var));
                        i27 = i28;
                    }
                    f0Var.a(i18, zw1Var, y0Var);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init tab ");
                    sb6.append(inVar.f377157e);
                    sb6.append(", sub tab ");
                    if (linkedList2 != null) {
                        arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                        java.util.Iterator it = linkedList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((r45.ch6) it.next()).f371556e);
                        }
                    }
                    sb6.append(arrayList);
                    com.tencent.mars.xlog.Log.i("FinderLiveAnchorSingSongAddPanelTabView", sb6.toString());
                    android.content.Context context = f0Var.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    jn2.c1 c1Var = new jn2.c1(context, controller, liveData, y0Var, jn2.a2.f300550d, inVar, null, 64, null);
                    f0Var.f300600f = c1Var;
                    androidx.recyclerview.widget.RecyclerView recyclerView = f0Var.f300602h;
                    recyclerView.setAdapter(c1Var);
                    recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
                    recyclerView.setOnTouchListener(new zl2.k5(recyclerView));
                    ym5.a1.g(recyclerView, new jn2.c0(f0Var, controller));
                    recyclerView.i(new jn2.e0(f0Var));
                }
                z17 = true;
            }
            f0(z17);
        }
    }

    public final void i0(r45.ax1 ax1Var, r45.zw1 zw1Var) {
        int i17;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2 = ax1Var.f370327d;
        if (linkedList2 != null) {
            jn2.k kVar = new jn2.k(linkedList2);
            this.L = kVar;
            androidx.viewpager.widget.ViewPager viewPager = this.K;
            if (viewPager == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            viewPager.setAdapter(kVar);
            androidx.viewpager.widget.ViewPager viewPager2 = this.K;
            if (viewPager2 == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            viewPager2.setOffscreenPageLimit(linkedList2.size());
            com.google.android.material.tabs.TabLayout tabLayout = this.f300632J;
            if (tabLayout == null) {
                kotlin.jvm.internal.o.o("tabLayout");
                throw null;
            }
            androidx.viewpager.widget.ViewPager viewPager3 = this.K;
            if (viewPager3 == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            tabLayout.setupWithViewPager(viewPager3);
            com.google.android.material.tabs.TabLayout tabLayout2 = this.f300632J;
            if (tabLayout2 == null) {
                kotlin.jvm.internal.o.o("tabLayout");
                throw null;
            }
            tabLayout2.getViewTreeObserver().addOnScrollChangedListener(new jn2.g(this));
            jn2.i iVar = new jn2.i(this, linkedList2);
            androidx.viewpager.widget.ViewPager viewPager4 = this.K;
            if (viewPager4 == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            viewPager4.addOnPageChangeListener(iVar);
            java.util.Iterator it = linkedList2.iterator();
            int i18 = 0;
            int i19 = 0;
            while (true) {
                i17 = -1;
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                } else {
                    if (((r45.in) it.next()).f377156d == ax1Var.f370329f) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            if (i19 < 0) {
                i19 = 0;
            }
            r45.in inVar = (r45.in) kz5.n0.a0(linkedList2, i19);
            if (inVar != null && (linkedList = inVar.f377158f) != null) {
                java.util.Iterator it6 = linkedList.iterator();
                int i27 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    if (((r45.ch6) it6.next()).f371555d == ax1Var.f370330g) {
                        i17 = i27;
                        break;
                    }
                    i27++;
                }
                if (i17 >= 0) {
                    i18 = i17;
                }
            }
            int i28 = i18;
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorSingSongAddPanel", "default tab type " + ax1Var.f370329f + " pos " + i19 + ", default sub tab type " + ax1Var.f370330g + " pos " + i28);
            androidx.viewpager.widget.ViewPager viewPager5 = this.K;
            if (viewPager5 == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            viewPager5.post(new jn2.h(this, i19, linkedList2, i28, zw1Var));
            k0();
        }
    }

    public final void j0() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.M;
        if (constraintLayout != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(constraintLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(constraintLayout, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.google.android.material.tabs.TabLayout tabLayout = this.f300632J;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(tabLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        tabLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(tabLayout, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.viewpager.widget.ViewPager viewPager = this.K;
        if (viewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(viewPager, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewPager.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(viewPager, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.N;
        if (textView == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(textView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void k0() {
        com.google.android.material.tabs.TabLayout tabLayout = this.f300632J;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(tabLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        tabLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(tabLayout, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.viewpager.widget.ViewPager viewPager = this.K;
        if (viewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        viewPager.setVisibility(0);
        jn2.w wVar = this.P;
        if (wVar != null) {
            wVar.e();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void s(boolean z17) {
        sf2.j0.l((sf2.o1) ((jz5.n) this.I.f407348q).getValue(), "", false, false, 4, null);
        java.lang.Object systemService = this.f118183e.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(H().getWindowToken(), 0);
        }
        super.s(z17);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean w() {
        return true;
    }
}
