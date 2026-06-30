package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class i8 extends com.tencent.mm.plugin.finder.live.widget.e0 implements android.view.View.OnClickListener {
    public final sf2.e0 H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.EditText f118649J;
    public com.tencent.mm.ui.widget.imageview.WeImageView K;
    public com.tencent.mm.ui.widget.MMProcessBar L;
    public com.tencent.mm.view.recyclerview.WxRecyclerView M;
    public com.tencent.mm.plugin.finder.live.widget.r7 N;
    public com.google.android.material.tabs.TabLayout P;
    public androidx.viewpager.widget.ViewPager Q;
    public android.view.View R;
    public android.widget.TextView S;
    public int T;
    public kotlinx.coroutines.r2 U;
    public boolean V;
    public boolean W;
    public java.util.List X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(android.content.Context context, com.tencent.mm.ui.MMActivity activity, sf2.e0 controller) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.H = controller;
        this.X = kz5.p0.f313996d;
    }

    public static final void e0(com.tencent.mm.plugin.finder.live.widget.i8 i8Var) {
        i8Var.W = false;
        kotlinx.coroutines.r2 r2Var = i8Var.U;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        i8Var.h0(i8Var.f118649J);
        android.widget.EditText editText = i8Var.f118649J;
        if (editText != null) {
            editText.clearComposingText();
        }
        android.widget.EditText editText2 = i8Var.f118649J;
        if (editText2 != null) {
            editText2.clearFocus();
        }
        android.widget.EditText editText3 = i8Var.f118649J;
        if (editText3 != null) {
            editText3.setText("");
        }
        i8Var.H.Z6();
        com.tencent.mm.plugin.finder.live.widget.r7 r7Var = i8Var.N;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = r7Var != null ? r7Var.f119584e : null;
        if (wxRecyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wxRecyclerView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.live.widget.r7 r7Var2 = i8Var.N;
        android.widget.TextView textView = r7Var2 != null ? r7Var2.f119585f : null;
        if (textView != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = i8Var.L;
        if (mMProcessBar != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(mMProcessBar, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mMProcessBar.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(mMProcessBar, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.google.android.material.tabs.TabLayout tabLayout = i8Var.P;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(tabLayout, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        tabLayout.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(tabLayout, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.viewpager.widget.ViewPager viewPager = i8Var.Q;
        if (viewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(viewPager, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewPager.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(viewPager, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = i8Var.R;
        if (view == null) {
            kotlin.jvm.internal.o.o("divider");
            throw null;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView2 = i8Var.S;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("tvCancel");
            throw null;
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(textView2, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView2.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(textView2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i8Var.f0();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.dht;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        com.tencent.mm.plugin.finder.live.widget.r7 r7Var;
        android.view.ViewGroup viewGroup;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.I = rootView;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.qgt);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.P = (com.google.android.material.tabs.TabLayout) findViewById;
        android.view.View view = this.I;
        if (view == null) {
            kotlin.jvm.internal.o.o("myRoot");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f487636qh2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.Q = (androidx.viewpager.widget.ViewPager) findViewById2;
        android.view.View view2 = this.I;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("myRoot");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.qf6);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.R = findViewById3;
        android.view.View view3 = this.I;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("myRoot");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.tencent.mm.R.id.ole);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.S = (android.widget.TextView) findViewById4;
        android.view.View view4 = this.I;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("myRoot");
            throw null;
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view4.findViewById(com.tencent.mm.R.id.f486769mf2);
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.y7(this));
        }
        android.view.View view5 = this.I;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("myRoot");
            throw null;
        }
        this.f118649J = (android.widget.EditText) view5.findViewById(com.tencent.mm.R.id.f486770mf3);
        android.view.View view6 = this.I;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("myRoot");
            throw null;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view6.findViewById(com.tencent.mm.R.id.f486768mf0);
        this.K = weImageView;
        if (weImageView != null) {
            weImageView.setOnClickListener(this);
        }
        android.view.View view7 = this.I;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("myRoot");
            throw null;
        }
        this.L = (com.tencent.mm.ui.widget.MMProcessBar) view7.findViewById(com.tencent.mm.R.id.m6l);
        android.widget.TextView textView = this.S;
        if (textView == null) {
            kotlin.jvm.internal.o.o("tvCancel");
            throw null;
        }
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.z7(this));
        zl2.r4 r4Var = zl2.r4.f473950a;
        r4Var.Z2(this.f118649J, null, 200, 100, (r17 & 16) != 0, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, new com.tencent.mm.plugin.finder.live.widget.b8(this));
        android.widget.EditText editText = this.f118649J;
        if (editText != null) {
            editText.setOnEditorActionListener(new com.tencent.mm.plugin.finder.live.widget.c8(this));
        }
        android.widget.EditText editText2 = this.f118649J;
        if (editText2 != null) {
            editText2.setOnFocusChangeListener(new com.tencent.mm.plugin.finder.live.widget.d8(this));
        }
        android.view.View view8 = this.I;
        if (view8 == null) {
            kotlin.jvm.internal.o.o("myRoot");
            throw null;
        }
        android.view.View findViewById5 = view8.findViewById(com.tencent.mm.R.id.fd8);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.e8 e8Var = new com.tencent.mm.plugin.finder.live.widget.e8(this);
        sf2.e0 e0Var = this.H;
        com.tencent.mm.plugin.finder.live.widget.r7 r7Var2 = new com.tencent.mm.plugin.finder.live.widget.r7((android.view.ViewGroup) findViewById5, e0Var, null, e8Var);
        this.N = r7Var2;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = r7Var2.f119584e;
        this.M = wxRecyclerView;
        bm2.a0 a0Var = e0Var.f407112n;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(a0Var);
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(wxRecyclerView.getContext()));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.M;
        if (wxRecyclerView2 != null) {
            ym5.a1.g(wxRecyclerView2, new com.tencent.mm.plugin.finder.live.widget.f8(this));
        }
        if (!r4Var.Y1(this.f118183e) && (r7Var = this.N) != null && (viewGroup = r7Var.f119580a) != null) {
            android.view.View view9 = this.I;
            if (view9 == null) {
                kotlin.jvm.internal.o.o("myRoot");
                throw null;
            }
            viewGroup.setPadding(0, 0, 0, com.tencent.mm.ui.bl.c(view9.getContext()));
        }
        android.content.Context context = this.f118183e;
        sf2.e0 e0Var2 = this.H;
        r45.xg7 xg7Var = r45.xg7.emFinderLiveGetMusicTabListType_FinderMusic;
        te2.u1 u1Var = new te2.u1(context, null, 0, e0Var2, xg7Var, 6, null);
        android.content.Context context2 = this.f118183e;
        sf2.e0 e0Var3 = this.H;
        r45.xg7 xg7Var2 = r45.xg7.emFinderLiveGetMusicTabListType_Like;
        te2.u1 u1Var2 = new te2.u1(context2, null, 0, e0Var3, xg7Var2, 6, null);
        android.content.Context context3 = this.f118183e;
        sf2.e0 e0Var4 = this.H;
        r45.xg7 xg7Var3 = r45.xg7.emFinderLiveGetMusicTabListType_Recommend;
        this.X = kz5.c0.i(u1Var, u1Var2, new te2.u1(context3, null, 0, e0Var4, xg7Var3, 6, null));
        e0Var.a7(xg7Var, null);
        e0Var.a7(xg7Var3, null);
        e0Var.a7(xg7Var2, null);
        androidx.viewpager.widget.ViewPager viewPager = this.Q;
        if (viewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        viewPager.setAdapter(new te2.r1(this.X));
        androidx.viewpager.widget.ViewPager viewPager2 = this.Q;
        if (viewPager2 == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        viewPager2.setOffscreenPageLimit(this.X.size() - 1);
        com.google.android.material.tabs.TabLayout tabLayout = this.P;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        androidx.viewpager.widget.ViewPager viewPager3 = this.Q;
        if (viewPager3 == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        tabLayout.setupWithViewPager(viewPager3);
        androidx.viewpager.widget.ViewPager viewPager4 = this.Q;
        if (viewPager4 == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        viewPager4.addOnPageChangeListener(new com.tencent.mm.plugin.finder.live.widget.h8(this));
        android.view.View view10 = this.I;
        if (view10 == null) {
            kotlin.jvm.internal.o.o("myRoot");
            throw null;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.c(view10) || view10.isLayoutRequested()) {
            view10.addOnLayoutChangeListener(new com.tencent.mm.plugin.finder.live.widget.g8(this));
        } else {
            e0(this);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void R() {
        super.R();
        g0();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        g0();
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public void f() {
        h0(this.f118649J);
        android.widget.EditText editText = this.f118649J;
        if (editText != null) {
            editText.setText("");
        }
        sf2.e0 e0Var = this.H;
        e0Var.getClass();
        if2.b.Y6(e0Var, qo0.b.L2, null, 2, null);
        e0Var.Z6();
    }

    public final void f0() {
        int i17 = 0;
        for (java.lang.Object obj : this.X) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView musicRv = ((te2.u1) obj).getMusicRv();
            boolean z17 = true;
            int i19 = i17 == this.T ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(musicRv, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            musicRv.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(musicRv, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i17 != this.T) {
                z17 = false;
            }
            musicRv.setNestedScrollingEnabled(z17);
            i17 = i18;
        }
    }

    public final void g0() {
        h0(this.f118649J);
        android.widget.EditText editText = this.f118649J;
        if (editText != null) {
            editText.setText("");
        }
        com.tencent.mm.plugin.finder.live.widget.r7 r7Var = this.N;
        android.widget.TextView textView = r7Var != null ? r7Var.f119585f : null;
        if (textView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        sf2.e0 e0Var = this.H;
        e0Var.getClass();
        if2.b.Y6(e0Var, qo0.b.L2, null, 2, null);
        e0Var.Z6();
        kotlinx.coroutines.r2 r2Var = this.U;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    public final void h0(android.widget.EditText editText) {
        android.content.Context context;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
        }
    }

    public final void i0(int i17) {
        boolean x17 = dk2.ef.f233372a.x();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1);
        jSONObject.put("tab_type", ((te2.u1) this.X.get(i17)).getType().f390089d);
        sf2.e0 e0Var = this.H;
        if (!kotlin.jvm.internal.o.b(e0Var.f407115q, "")) {
            jSONObject.put("ai_msg_id", e0Var.f407115q);
        }
        if (x17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.O1, jSONObject.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5((zy2.zb) c18, 48L, jSONObject.toString(), null, 4, null);
        }
    }

    public final void j0(boolean z17) {
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.L;
        if (mMProcessBar != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mMProcessBar, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "toggleSearchLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mMProcessBar.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mMProcessBar, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "toggleSearchLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.M;
        if (wxRecyclerView != null) {
            int i18 = z17 ^ true ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(wxRecyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "toggleSearchLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wxRecyclerView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "toggleSearchLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.live.widget.r7 r7Var = this.N;
        android.widget.TextView textView = r7Var != null ? r7Var.f119585f : null;
        if (textView == null) {
            return;
        }
        int i19 = z17 ^ true ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(textView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "toggleSearchLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "toggleSearchLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01be A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0(java.util.List r12, r45.xg7 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.i8.k0(java.util.List, r45.xg7, boolean):void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.widget.EditText editText;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f486768mf0 && (editText = this.f118649J) != null) {
            editText.setText("");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
