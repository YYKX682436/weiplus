package fn2;

/* loaded from: classes5.dex */
public final class b0 extends android.widget.LinearLayout implements fn2.y1 {

    /* renamed from: d, reason: collision with root package name */
    public final sf2.d3 f264212d;

    /* renamed from: e, reason: collision with root package name */
    public final int f264213e;

    /* renamed from: f, reason: collision with root package name */
    public final fn2.u1 f264214f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f264215g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f264216h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f264217i;

    /* renamed from: m, reason: collision with root package name */
    public fn2.e f264218m;

    /* renamed from: n, reason: collision with root package name */
    public fn2.s f264219n;

    /* renamed from: o, reason: collision with root package name */
    public int f264220o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f264221p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f264222q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Set f264223r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f264224s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.content.Context context, sf2.d3 controller, int i17, fn2.u1 sourceScene, kotlinx.coroutines.y0 y0Var) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(sourceScene, "sourceScene");
        this.f264212d = controller;
        this.f264213e = i17;
        this.f264214f = sourceScene;
        this.f264215g = y0Var;
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dsh, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487350s91);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f264216h = (com.google.android.material.tabs.TabLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.s_w);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f264217i = (androidx.viewpager.widget.ViewPager) findViewById2;
        this.f264221p = (androidx.constraintlayout.widget.ConstraintLayout) findViewById(com.tencent.mm.R.id.rfr);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487465vj3);
        this.f264222q = textView;
        if (textView != null) {
            textView.setOnClickListener(new fn2.u(this));
        }
        this.f264219n = new fn2.s(this, y0Var, controller, i17, sourceScene, new fn2.v(this), new fn2.w(this));
        if (zl2.r4.f473950a.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.W1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("element", 1);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c18;
            ml2.b4 b4Var = ml2.b4.f327253o2;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("type", 1);
            jSONObject2.put("element", 1);
            ml2.r0.hj(r0Var, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
        }
        this.f264223r = new java.util.LinkedHashSet();
        this.f264224s = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x016d A[Catch: Exception -> 0x0036, TryCatch #1 {Exception -> 0x0036, blocks: (B:11:0x0031, B:12:0x0169, B:14:0x016d, B:16:0x0171, B:18:0x0175, B:22:0x017f, B:26:0x0186), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0171 A[Catch: Exception -> 0x0036, TryCatch #1 {Exception -> 0x0036, blocks: (B:11:0x0031, B:12:0x0169, B:14:0x016d, B:16:0x0171, B:18:0x0175, B:22:0x017f, B:26:0x0186), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // fn2.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r33) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.b0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(boolean z17) {
        android.view.View view;
        android.view.View view2;
        java.lang.Object obj;
        fn2.s0 s0Var;
        com.google.android.material.tabs.TabLayout tabLayout = this.f264216h;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        int tabCount = tabLayout.getTabCount();
        for (int i17 = 0; i17 < tabCount; i17++) {
            java.util.Map map = this.f264224s;
            if (map.containsKey(java.lang.Integer.valueOf(i17))) {
                view2 = (android.view.View) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
            } else {
                com.google.android.material.tabs.TabLayout tabLayout2 = this.f264216h;
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
                java.util.Set set = this.f264223r;
                if (!z18) {
                    set.remove(java.lang.Integer.valueOf(i17));
                } else if (z17 || !set.contains(java.lang.Integer.valueOf(i17))) {
                    set.add(java.lang.Integer.valueOf(i17));
                    fn2.e eVar = this.f264218m;
                    if (eVar != null && (s0Var = (fn2.s0) eVar.f264249g.get(i17)) != null) {
                        r45.in inVar = s0Var.f264396r;
                        int i18 = inVar.f377156d;
                        java.lang.String board_name = inVar.f377157e;
                        kotlin.jvm.internal.o.f(board_name, "board_name");
                        s0Var.a(1, i18, board_name, null, null);
                    }
                }
            }
        }
    }

    public final void c() {
        androidx.recyclerview.widget.RecyclerView songRv;
        fn2.e eVar = this.f264218m;
        if (eVar != null) {
            kz5.x0 it = e06.p.m(0, eVar.getCount()).iterator();
            while (((e06.j) it).f246214f) {
                int b17 = it.b();
                fn2.s0 s0Var = (fn2.s0) eVar.f264249g.get(b17);
                if (s0Var != null && (songRv = s0Var.getSongRv()) != null) {
                    int i17 = b17 == this.f264220o ? 0 : 8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(songRv, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    songRv.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(songRv, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    songRv.setNestedScrollingEnabled(b17 == this.f264220o);
                }
            }
        }
    }

    public final void d() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f264221p;
        if (constraintLayout != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(constraintLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(constraintLayout, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f264222q;
        if (textView != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.google.android.material.tabs.TabLayout tabLayout = this.f264216h;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(tabLayout, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        tabLayout.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(tabLayout, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.viewpager.widget.ViewPager viewPager = this.f264217i;
        if (viewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(viewPager, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewPager.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(viewPager, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void e(int i17, java.util.LinkedList linkedList, int i18, r45.zw1 zw1Var) {
        java.util.ArrayList arrayList;
        this.f264220o = i17;
        fn2.e eVar = this.f264218m;
        fn2.s0 s0Var = eVar != null ? (fn2.s0) eVar.f264249g.get(i17) : null;
        java.lang.Object obj = linkedList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.in inVar = (r45.in) obj;
        r45.in inVar2 = (r45.in) kz5.n0.a0(linkedList, i17);
        if (inVar2 != null) {
            if (s0Var != null) {
                kotlinx.coroutines.y0 y0Var = this.f264215g;
                sf2.d3 controller = this.f264212d;
                kotlin.jvm.internal.o.g(controller, "controller");
                if (!s0Var.f264389h) {
                    s0Var.f264389h = true;
                    s0Var.f264387f = controller;
                    java.util.LinkedList linkedList2 = inVar2.f377158f;
                    java.util.Collection collection = linkedList2 == null ? kz5.p0.f313996d : linkedList2;
                    android.widget.ScrollView scrollView = s0Var.f264392n;
                    boolean z17 = false;
                    int i19 = collection.isEmpty() ^ true ? 0 : 8;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(i19));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(scrollView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabView", "initSubTabs", "(Ljava/util/List;ILcom/tencent/mm/protocal/protobuf/FinderLiveKtvGetMusicBoardResponse;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    scrollView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(scrollView, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabView", "initSubTabs", "(Ljava/util/List;ILcom/tencent/mm/protocal/protobuf/FinderLiveKtvGetMusicBoardResponse;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int i27 = 0;
                    for (java.lang.Object obj2 : collection) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.ch6 ch6Var = (r45.ch6) obj2;
                        android.view.LayoutInflater from = android.view.LayoutInflater.from(s0Var.getContext());
                        android.widget.LinearLayout linearLayout = s0Var.f264393o;
                        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.dsq, linearLayout, z17);
                        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.s9r)).setText(ch6Var.f371556e);
                        linearLayout.addView(inflate);
                        r45.in inVar3 = s0Var.f264396r;
                        int i29 = inVar3.f377156d;
                        java.lang.String board_name = inVar3.f377157e;
                        kotlin.jvm.internal.o.f(board_name, "board_name");
                        s0Var.a(1, i29, board_name, java.lang.Integer.valueOf(ch6Var.f371555d), ch6Var.f371556e);
                        inflate.setOnClickListener(new fn2.n0(s0Var, i27, y0Var));
                        i27 = i28;
                        z17 = false;
                    }
                    s0Var.b(i18, zw1Var, y0Var);
                    s0Var.f264391m = new com.tencent.mm.plugin.finder.live.widget.dv(s0Var, controller, y0Var, null);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init tab ");
                    sb6.append(inVar2.f377157e);
                    sb6.append(", sub tab ");
                    if (linkedList2 != null) {
                        arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                        java.util.Iterator it = linkedList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((r45.ch6) it.next()).f371556e);
                        }
                    } else {
                        arrayList = null;
                    }
                    sb6.append(arrayList);
                    com.tencent.mars.xlog.Log.i("FinderLiveRequestSongTabView", sb6.toString());
                    android.content.Context context = s0Var.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    bm2.o6 o6Var = new bm2.o6(context, controller, s0Var.f264385d, s0Var.f264386e, y0Var);
                    s0Var.f264388g = o6Var;
                    o6Var.f22201q = inVar2;
                    o6Var.f22199o = r45.y4.AddSongSourceType_MusicBoard;
                    androidx.recyclerview.widget.RecyclerView recyclerView = s0Var.f264390i;
                    recyclerView.setAdapter(o6Var);
                    recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
                    ym5.a1.g(recyclerView, new fn2.o0(s0Var));
                    com.tencent.mm.plugin.finder.live.widget.dv dvVar = s0Var.f264391m;
                    if (dvVar != null) {
                        fn2.p0 p0Var = new fn2.p0(controller, s0Var, null);
                        fn2.q0 q0Var = new fn2.q0(s0Var);
                        dvVar.f118162o = p0Var;
                        dvVar.f118163p = q0Var;
                    }
                }
            }
            if (s0Var != null) {
                int i37 = inVar.f377156d;
                java.lang.String board_name2 = inVar.f377157e;
                kotlin.jvm.internal.o.f(board_name2, "board_name");
                s0Var.a(2, i37, board_name2, null, null);
            }
            b(true);
        }
        c();
    }

    public final void f(r45.ax1 ax1Var, r45.zw1 zw1Var) {
        int i17;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2 = ax1Var.f370327d;
        if (linkedList2 != null) {
            this.f264218m = new fn2.e(linkedList2, this.f264213e, this.f264214f);
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSongTabRequest", "tab list ".concat(kz5.n0.g0(linkedList2, null, null, null, 0, null, fn2.y.f264446d, 31, null)));
            androidx.viewpager.widget.ViewPager viewPager = this.f264217i;
            if (viewPager == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            viewPager.setAdapter(this.f264218m);
            androidx.viewpager.widget.ViewPager viewPager2 = this.f264217i;
            if (viewPager2 == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            viewPager2.setOffscreenPageLimit(ax1Var.f370327d.size());
            com.google.android.material.tabs.TabLayout tabLayout = this.f264216h;
            if (tabLayout == null) {
                kotlin.jvm.internal.o.o("tabLayout");
                throw null;
            }
            androidx.viewpager.widget.ViewPager viewPager3 = this.f264217i;
            if (viewPager3 == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            tabLayout.setupWithViewPager(viewPager3);
            com.google.android.material.tabs.TabLayout tabLayout2 = this.f264216h;
            if (tabLayout2 == null) {
                kotlin.jvm.internal.o.o("tabLayout");
                throw null;
            }
            tabLayout2.getViewTreeObserver().addOnScrollChangedListener(new fn2.z(this));
            fn2.a0 a0Var = new fn2.a0(this, linkedList2);
            androidx.viewpager.widget.ViewPager viewPager4 = this.f264217i;
            if (viewPager4 == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            viewPager4.addOnPageChangeListener(a0Var);
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
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSongTabRequest", "default tab type " + ax1Var.f370329f + " pos " + i19 + ", default sub tab type " + ax1Var.f370330g + " pos " + i18);
            e(i19, linkedList2, i18, zw1Var);
            if (i19 != 0) {
                com.google.android.material.tabs.TabLayout tabLayout3 = this.f264216h;
                if (tabLayout3 == null) {
                    kotlin.jvm.internal.o.o("tabLayout");
                    throw null;
                }
                oa.i k17 = tabLayout3.k(i19);
                if (k17 != null) {
                    k17.b();
                }
            }
            i();
        }
    }

    public final void g() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f264221p;
        if (constraintLayout != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(constraintLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(constraintLayout, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.google.android.material.tabs.TabLayout tabLayout = this.f264216h;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(tabLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        tabLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(tabLayout, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.viewpager.widget.ViewPager viewPager = this.f264217i;
        if (viewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(viewPager, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewPager.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(viewPager, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f264222q;
        if (textView == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(textView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "showRetry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public java.lang.String getTitle() {
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.mnb);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // fn2.y1
    public void h() {
        fn2.s sVar = this.f264219n;
        if (sVar != null) {
            sVar.d();
        }
    }

    public final void i() {
        com.google.android.material.tabs.TabLayout tabLayout = this.f264216h;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(tabLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        tabLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(tabLayout, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.viewpager.widget.ViewPager viewPager = this.f264217i;
        if (viewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(viewPager, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewPager.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(viewPager, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        fn2.s sVar = this.f264219n;
        if (sVar != null) {
            sVar.d();
        }
        c();
    }
}
