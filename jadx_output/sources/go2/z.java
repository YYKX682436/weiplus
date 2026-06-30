package go2;

/* loaded from: classes2.dex */
public final class z extends x92.r {
    public android.view.View A;
    public com.tencent.mm.plugin.finder.profile.widget.s1 B;
    public com.tencent.mm.plugin.finder.profile.widget.s4 C;
    public java.lang.String D;
    public boolean E;
    public final java.util.HashMap F;
    public final jz5.g G;
    public final kk.l H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f274086J;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f274087g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f274088h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f274089i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f274090m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f274091n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f274092o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f274093p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f274094q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f274095r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f274096s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f274097t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f274098u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f274099v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f274100w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f274101x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f274102y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f274103z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f274098u = new java.util.ArrayList();
        this.D = "";
        this.F = new java.util.HashMap();
        this.G = jz5.h.b(new go2.h(activity));
        this.H = new kk.l(1);
        this.f274086J = jz5.h.b(new go2.q(activity));
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        java.lang.String stringExtra = getIntent().getStringExtra("key_author_finder_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.D = stringExtra;
        this.E = getIntent().getBooleanExtra("key_self_flag", false);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485875jf1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f274087g = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.jet);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f274088h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.raa);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f274089i = (androidx.recyclerview.widget.RecyclerView) findViewById3;
        android.widget.TextView textView = this.f274088h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("memberTitle");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 1.0f);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.jer);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) findViewById4;
        this.f274090m = finderCollapsibleTextView;
        finderCollapsibleTextView.setLocalExpanText(com.tencent.mm.R.string.f491276cl4);
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView2 = this.f274090m;
        if (finderCollapsibleTextView2 == null) {
            kotlin.jvm.internal.o.o("memberDesc");
            throw null;
        }
        finderCollapsibleTextView2.setExpanText(com.tencent.mm.R.string.f491276cl4);
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView3 = this.f274090m;
        if (finderCollapsibleTextView3 == null) {
            kotlin.jvm.internal.o.o("memberDesc");
            throw null;
        }
        finderCollapsibleTextView3.setLimitLine(4);
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView4 = this.f274090m;
        if (finderCollapsibleTextView4 == null) {
            kotlin.jvm.internal.o.o("memberDesc");
            throw null;
        }
        finderCollapsibleTextView4.getContentTextView().k(0.0f, 1.4f);
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView5 = this.f274090m;
        if (finderCollapsibleTextView5 == null) {
            kotlin.jvm.internal.o.o("memberDesc");
            throw null;
        }
        finderCollapsibleTextView5.f(true, false);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.rwx);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f274091n = (android.view.ViewGroup) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.jfp);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f274099v = findViewById6;
        android.view.View findViewById7 = findViewById6.findViewById(com.tencent.mm.R.id.i6m);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f274100w = (android.widget.ImageView) findViewById7;
        android.view.View view = this.f274099v;
        if (view == null) {
            kotlin.jvm.internal.o.o("curLiveLayout");
            throw null;
        }
        android.view.View findViewById8 = view.findViewById(com.tencent.mm.R.id.cnv);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f274101x = (android.widget.TextView) findViewById8;
        android.view.View view2 = this.f274099v;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("curLiveLayout");
            throw null;
        }
        android.view.View findViewById9 = view2.findViewById(com.tencent.mm.R.id.cnw);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f274102y = (android.widget.TextView) findViewById9;
        android.view.View view3 = this.f274099v;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("curLiveLayout");
            throw null;
        }
        android.view.View findViewById10 = view3.findViewById(com.tencent.mm.R.id.cnt);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f274103z = (android.widget.ImageView) findViewById10;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.jev);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f274092o = findViewById11;
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.q8f);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f274093p = (android.widget.TextView) findViewById12;
        android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.pyx);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f274094q = (android.widget.TextView) findViewById13;
        android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.jfl);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f274095r = (android.widget.TextView) findViewById14;
        android.view.View findViewById15 = findViewById(com.tencent.mm.R.id.jfj);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.f274096s = (android.widget.TextView) findViewById15;
        android.view.View findViewById16 = findViewById(com.tencent.mm.R.id.l_a);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.A = findViewById16;
        android.widget.TextView textView2 = this.f274094q;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("postDynamicBtn");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.widget.TextView textView3 = this.f274095r;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("postVideoBtn");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        android.widget.TextView textView4 = this.f274096s;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("postLiveBtn");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
        android.view.View findViewById17 = findViewById(com.tencent.mm.R.id.jfr);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.f274097t = findViewById17;
        findViewById17.setOnClickListener(new go2.k(this));
        android.widget.TextView textView5 = this.f274094q;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("postDynamicBtn");
            throw null;
        }
        textView5.setOnClickListener(new go2.l(this));
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f274089i;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("memberStatRecycleView");
            throw null;
        }
        final android.app.Activity context = getContext();
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context) { // from class: com.tencent.mm.plugin.finder.member.area.uic.FinderMemberAreaHeaderUIC$initStatList$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            /* renamed from: canScrollVertically */
            public boolean getF123307r() {
                return false;
            }
        });
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f274089i;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("memberStatRecycleView");
            throw null;
        }
        recyclerView2.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.member.area.uic.FinderMemberAreaHeaderUIC$initStatList$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.convert.oo();
            }
        }, this.f274098u, false));
        if (kotlin.jvm.internal.o.b(this.D, xy2.c.e(getContext()))) {
            android.view.View view4 = this.f274092o;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("authorLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView6 = this.f274095r;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("postVideoBtn");
                throw null;
            }
            textView6.setOnClickListener(new go2.m(this));
            android.widget.TextView textView7 = this.f274096s;
            if (textView7 == null) {
                kotlin.jvm.internal.o.o("postLiveBtn");
                throw null;
            }
            textView7.setOnClickListener(new go2.n(this));
            if (((java.lang.Number) ae2.in.G5.r()).intValue() != 1 && com.tencent.mm.ui.bk.A()) {
                android.widget.TextView textView8 = this.f274096s;
                if (textView8 == null) {
                    kotlin.jvm.internal.o.o("postLiveBtn");
                    throw null;
                }
                textView8.setVisibility(8);
            }
        }
        java.lang.String str = this.D;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        boolean b17 = kotlin.jvm.internal.o.b(this.D, xy2.c.e(getContext()));
        jz5.g gVar = this.G;
        r45.qt2 qt2Var = (r45.qt2) ((jz5.n) gVar).getValue();
        kk.l lVar = this.H;
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = new com.tencent.mm.plugin.finder.profile.widget.s4(str, activity, b17, qt2Var, 101, false, true, lVar, "204", null, 512, null);
        s4Var.f124770x = new go2.i(s4Var, this);
        this.C = s4Var;
        android.view.View view5 = this.f274087g;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("memberContainer");
            throw null;
        }
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = new com.tencent.mm.plugin.finder.profile.widget.s1(view5, getActivity(), (r45.qt2) ((jz5.n) gVar).getValue(), false, lVar, "204", null, 64, null);
        s1Var.f124724h = new go2.j(this);
        s1Var.D = true;
        this.B = s1Var;
        s1Var.k(this.D);
        pf5.u uVar = pf5.u.f353936a;
        ((im2.p4) ((zy2.m8) uVar.c(getActivity()).c(zy2.m8.class))).f292495o = new go2.o(this);
        ((im2.p4) ((zy2.m8) uVar.c(getActivity()).c(zy2.m8.class))).f292496p = new go2.p();
        if (kotlin.jvm.internal.o.b(this.D, xy2.c.e(getActivity()))) {
            if (this.E) {
                r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("AuthorProfileMemberShipZone");
                com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("AuthorProfileMemberShipZone");
                if (I0 != null && L0 != null) {
                    com.tencent.mm.plugin.finder.report.x2.f125429a.e("3", L0, I0, 2, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
                }
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("AuthorProfileMemberShipZone");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("FinderMyTab", new int[]{32});
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("ProfileEntrance", new int[]{32});
        }
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(getActivity(), iy1.c.FinderMemberAreaUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(getActivity(), 12, 27010);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("finder_username", this.D);
        lVarArr[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
        lVarArr[2] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f135386r : null);
        eo2.b bVar = (eo2.b) uVar.b(getContext()).e(eo2.b.class);
        lVarArr[3] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(bVar != null ? bVar.f255558d : 0));
        lVarArr[4] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f135382p : null);
        lVarArr[5] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f135385q : null);
        ((cy1.a) rVar).gk(activity2, kz5.c1.k(lVarArr));
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view6 = this.A;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("liveNoticeLayout");
            throw null;
        }
        ((cy1.a) rVar2).pk(view6, "appointment_live");
        dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view7 = this.A;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("liveNoticeLayout");
            throw null;
        }
        ((cy1.a) rVar3).ik(view7, 40, 25496);
        dy1.r rVar4 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view8 = this.A;
        if (view8 == null) {
            kotlin.jvm.internal.o.o("liveNoticeLayout");
            throw null;
        }
        jz5.l[] lVarArr2 = new jz5.l[6];
        eo2.b bVar2 = (eo2.b) uVar.b(getContext()).e(eo2.b.class);
        lVarArr2[0] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(bVar2 != null ? bVar2.f255558d : 0));
        lVarArr2[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
        lVarArr2[2] = new jz5.l("finder_username", this.D);
        lVarArr2[3] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f135386r : null);
        lVarArr2[4] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f135382p : null);
        lVarArr2[5] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f135385q : null);
        ((cy1.a) rVar4).gk(view8, kz5.c1.k(lVarArr2));
        dy1.r rVar5 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view9 = this.f274097t;
        if (view9 == null) {
            kotlin.jvm.internal.o.o("memberRightLayout");
            throw null;
        }
        ((cy1.a) rVar5).pk(view9, "member_rights");
        dy1.r rVar6 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view10 = this.f274097t;
        if (view10 == null) {
            kotlin.jvm.internal.o.o("memberRightLayout");
            throw null;
        }
        ((cy1.a) rVar6).ik(view10, 40, 25496);
        dy1.r rVar7 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view11 = this.f274097t;
        if (view11 == null) {
            kotlin.jvm.internal.o.o("memberRightLayout");
            throw null;
        }
        jz5.l[] lVarArr3 = new jz5.l[6];
        eo2.b bVar3 = (eo2.b) uVar.b(getContext()).e(eo2.b.class);
        lVarArr3[0] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(bVar3 != null ? bVar3.f255558d : 0));
        lVarArr3[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
        lVarArr3[2] = new jz5.l("finder_username", this.D);
        lVarArr3[3] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f135386r : null);
        lVarArr3[4] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f135382p : null);
        lVarArr3[5] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f135385q : null);
        ((cy1.a) rVar7).gk(view11, kz5.c1.k(lVarArr3));
    }

    @Override // x92.r
    public void U6() {
        r45.j32 j32Var;
        r45.cc ccVar;
        z5();
        ya2.g gVar = ya2.h.f460484a;
        if (gVar.b(this.D) == null) {
            r45.tr0 tr0Var = (r45.tr0) this.f452719d;
            ya2.g.m(gVar, tr0Var != null ? tr0Var.f386732p : null, false, 2, null);
        }
        android.widget.TextView textView = this.f274088h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("memberTitle");
            throw null;
        }
        r45.tr0 tr0Var2 = (r45.tr0) this.f452719d;
        textView.setText(tr0Var2 != null ? tr0Var2.f386724e : null);
        r45.tr0 tr0Var3 = (r45.tr0) this.f452719d;
        java.lang.String str = tr0Var3 != null ? tr0Var3.f386725f : null;
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f274090m;
            if (finderCollapsibleTextView == null) {
                kotlin.jvm.internal.o.o("memberDesc");
                throw null;
            }
            finderCollapsibleTextView.setVisibility(8);
        } else {
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView2 = this.f274090m;
            if (finderCollapsibleTextView2 == null) {
                kotlin.jvm.internal.o.o("memberDesc");
                throw null;
            }
            finderCollapsibleTextView2.setVisibility(0);
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView3 = this.f274090m;
            if (finderCollapsibleTextView3 == null) {
                kotlin.jvm.internal.o.o("memberDesc");
                throw null;
            }
            r45.tr0 tr0Var4 = (r45.tr0) this.f452719d;
            finderCollapsibleTextView3.setText(tr0Var4 != null ? tr0Var4.f386725f : null);
        }
        r45.tr0 tr0Var5 = (r45.tr0) this.f452719d;
        if (tr0Var5 != null && eo2.a.a(java.lang.Long.valueOf(tr0Var5.f386737u))) {
            android.widget.TextView textView2 = this.f274094q;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("postDynamicBtn");
                throw null;
            }
            textView2.setVisibility(0);
        }
        r45.tr0 tr0Var6 = (r45.tr0) this.f452719d;
        if (tr0Var6 != null) {
            if (tr0Var6.f386723d == 2) {
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Hk(getActivity(), new android.content.Intent(), this.D, tr0Var6.f386723d, tr0Var6.f386726g);
                getActivity().finish();
                return;
            }
            if (tr0Var6.A == 1) {
                android.view.ViewGroup viewGroup = this.f274091n;
                if (viewGroup == null) {
                    kotlin.jvm.internal.o.o("blackListBlockLayout");
                    throw null;
                }
                viewGroup.setVisibility(0);
                android.widget.TextView textView3 = this.f274094q;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("postDynamicBtn");
                    throw null;
                }
                textView3.setVisibility(8);
                android.view.View view = this.A;
                if (view == null) {
                    kotlin.jvm.internal.o.o("liveNoticeLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            int i17 = tr0Var6.f386726g;
            if (i17 == 0) {
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Kk(getContext(), new android.content.Intent(), this.D);
                getActivity().finish();
                return;
            }
            if (i17 == 1) {
                W6(tr0Var6 != null ? tr0Var6.f386739w : null);
                android.view.View view2 = this.f274097t;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("memberRightLayout");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView4 = this.f274093p;
                if (textView4 == null) {
                    kotlin.jvm.internal.o.o("memberStatistic");
                    throw null;
                }
                textView4.setVisibility(8);
                r45.g07 g07Var = tr0Var6.f386727h;
                V6(g07Var != null ? g07Var.f374790e : null, tr0Var6.f386726g == 2);
            } else if (i17 == 2) {
                r45.cc ccVar2 = tr0Var6.f386729m;
                android.view.View view3 = this.f274097t;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("memberRightLayout");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateAuthorInfo", "(Lcom/tencent/mm/protocal/protobuf/AuthorMemberInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateAuthorInfo", "(Lcom/tencent/mm/protocal/protobuf/AuthorMemberInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView5 = this.f274093p;
                if (textView5 == null) {
                    kotlin.jvm.internal.o.o("memberStatistic");
                    throw null;
                }
                textView5.setVisibility(0);
                android.view.View view4 = this.f274092o;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("authorLayout");
                    throw null;
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateAuthorInfo", "(Lcom/tencent/mm/protocal/protobuf/AuthorMemberInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateAuthorInfo", "(Lcom/tencent/mm/protocal/protobuf/AuthorMemberInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r45.tr0 tr0Var7 = (r45.tr0) this.f452719d;
                java.lang.String str2 = (tr0Var7 == null || (ccVar = tr0Var7.f386729m) == null) ? null : ccVar.f371442f;
                if (str2 == null || str2.length() == 0) {
                    android.widget.TextView textView6 = this.f274093p;
                    if (textView6 == null) {
                        kotlin.jvm.internal.o.o("memberStatistic");
                        throw null;
                    }
                    android.content.res.Resources resources = getResources();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Long.valueOf(ccVar2 != null ? ccVar2.f371440d : 0L);
                    textView6.setText(resources.getString(com.tencent.mm.R.string.elj, objArr));
                    android.widget.TextView textView7 = this.f274093p;
                    if (textView7 == null) {
                        kotlin.jvm.internal.o.o("memberStatistic");
                        throw null;
                    }
                    textView7.setOnClickListener(new go2.w(this));
                } else {
                    android.widget.TextView textView8 = this.f274093p;
                    if (textView8 == null) {
                        kotlin.jvm.internal.o.o("memberStatistic");
                        throw null;
                    }
                    textView8.setText(getResources().getString(com.tencent.mm.R.string.f491923lk1));
                    android.widget.TextView textView9 = this.f274093p;
                    if (textView9 == null) {
                        kotlin.jvm.internal.o.o("memberStatistic");
                        throw null;
                    }
                    textView9.setOnClickListener(new go2.x(str2, this));
                }
                r45.tr0 tr0Var8 = (r45.tr0) this.f452719d;
                W6(tr0Var8 != null ? tr0Var8.f386739w : null);
                r45.cc ccVar3 = tr0Var6.f386729m;
                V6(ccVar3 != null ? ccVar3.f371441e : null, tr0Var6.f386726g == 2);
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = tr0Var6.f386733q;
            int i18 = tr0Var6.f386730n;
            int i19 = tr0Var6.f386736t;
            if (finderObject == null) {
                return;
            }
            android.view.View view5 = this.f274099v;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("curLiveLayout");
                throw null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateCurLive", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateCurLive", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d a18 = g1Var.a();
            mn2.n nVar = new mn2.n(a17.getAvatarUrl(), null, 2, null);
            android.widget.ImageView imageView = this.f274100w;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("curLiveAvatar");
                throw null;
            }
            a18.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
            android.view.View view6 = this.f274099v;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("curLiveLayout");
                throw null;
            }
            view6.setOnClickListener(new go2.y(this, i19, i18, a17));
            android.text.SpannableString descriptionSpan = a17.getDescriptionSpan();
            if (descriptionSpan == null || descriptionSpan.length() == 0) {
                android.widget.TextView textView10 = this.f274101x;
                if (textView10 == null) {
                    kotlin.jvm.internal.o.o("curLiveDesc");
                    throw null;
                }
                textView10.setVisibility(8);
                android.widget.TextView textView11 = this.f274102y;
                if (textView11 == null) {
                    kotlin.jvm.internal.o.o("curLiveTime");
                    throw null;
                }
                com.tencent.mm.ui.bk.s0(textView11.getPaint());
            } else {
                android.widget.TextView textView12 = this.f274101x;
                if (textView12 == null) {
                    kotlin.jvm.internal.o.o("curLiveDesc");
                    throw null;
                }
                textView12.setText(a17.getDescriptionSpan());
                android.widget.TextView textView13 = this.f274101x;
                if (textView13 == null) {
                    kotlin.jvm.internal.o.o("curLiveDesc");
                    throw null;
                }
                com.tencent.mm.ui.bk.s0(textView13.getPaint());
                android.widget.TextView textView14 = this.f274102y;
                if (textView14 == null) {
                    kotlin.jvm.internal.o.o("curLiveTime");
                    throw null;
                }
                com.tencent.mm.ui.bk.t0(textView14.getPaint());
            }
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) this.H.get(this.D);
            java.util.LinkedList list = (l2Var == null || (j32Var = l2Var.f123923l) == null) ? null : j32Var.getList(0);
            android.view.View view7 = this.f274099v;
            if (view7 == null) {
                kotlin.jvm.internal.o.o("curLiveLayout");
                throw null;
            }
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view7.getLayoutParams();
            if (list != null && !list.isEmpty()) {
                z17 = false;
            }
            if (z17) {
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
                }
            } else if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = 0;
            }
            android.view.View view8 = this.f274099v;
            if (view8 == null) {
                kotlin.jvm.internal.o.o("curLiveLayout");
                throw null;
            }
            view8.setLayoutParams(marginLayoutParams);
            android.widget.TextView textView15 = this.f274101x;
            if (textView15 == null) {
                kotlin.jvm.internal.o.o("curLiveDesc");
                throw null;
            }
            com.tencent.mm.ui.fk.a(textView15);
            android.widget.TextView textView16 = this.f274102y;
            if (textView16 == null) {
                kotlin.jvm.internal.o.o("curLiveTime");
                throw null;
            }
            textView16.setText(getContext().getString(com.tencent.mm.R.string.elx, zl2.q4.r(zl2.q4.f473933a, a17.getCreateTime() * 1000, java.lang.Boolean.FALSE, false, false, 12, null)));
            com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.B;
            if (s1Var != null) {
                s1Var.j(this.D);
            } else {
                kotlin.jvm.internal.o.o("headerLiveWidget");
                throw null;
            }
        }
    }

    public final void V6(r45.j32 j32Var, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.util.LinkedList<r45.h32> list3;
        int i17 = 0;
        java.util.LinkedList list4 = j32Var != null ? j32Var.getList(0) : null;
        boolean z18 = list4 == null || list4.isEmpty();
        kk.l lVar = this.H;
        if (z18) {
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = new com.tencent.mm.plugin.finder.profile.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
            l2Var.f123923l = null;
            lVar.put(this.D, l2Var);
            android.view.View view = this.A;
            if (view == null) {
                kotlin.jvm.internal.o.o("liveNoticeLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateLiveNotice", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeListInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateLiveNotice", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeListInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var2 = new com.tencent.mm.plugin.finder.profile.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
            l2Var2.f123923l = j32Var;
            lVar.put(this.D, l2Var2);
            if (j32Var != null && (list3 = j32Var.getList(0)) != null) {
                for (r45.h32 h32Var : list3) {
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    java.lang.String str3 = this.D;
                    java.lang.String string = h32Var.getString(4);
                    if (string == null) {
                        string = "";
                    }
                    if (((b92.d1) zbVar).bj(str3, string) == null) {
                        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
                        java.lang.String str4 = this.D;
                        java.lang.String string2 = h32Var.getString(4);
                        ((b92.d1) zbVar2).Ai(str4, string2 != null ? string2 : "", h32Var);
                    } else {
                        c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
                        java.lang.String str5 = this.D;
                        java.lang.String string3 = h32Var.getString(4);
                        r45.h32 bj6 = ((b92.d1) zbVar3).bj(str5, string3 != null ? string3 : "");
                        if (bj6 != null) {
                            bj6.set(1, java.lang.Integer.valueOf(h32Var.getInteger(1)));
                        }
                    }
                }
            }
            if ((j32Var == null || (list2 = j32Var.getList(0)) == null || !(list2.isEmpty() ^ true)) ? false : true) {
                android.widget.ImageView imageView = this.f274103z;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("curLiveBottomLive");
                    throw null;
                }
                imageView.setVisibility(8);
                com.tencent.mm.plugin.finder.profile.uic.l2 l2Var3 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(this.D);
                com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.B;
                if (s1Var == null) {
                    kotlin.jvm.internal.o.o("headerLiveWidget");
                    throw null;
                }
                java.util.LinkedList list5 = j32Var.getList(0);
                r45.h32 h32Var2 = list5 != null ? (r45.h32) list5.get(0) : null;
                s1Var.b(h32Var2);
                l2Var3.f123916e = h32Var2;
            }
        }
        this.I = getIntent().getBooleanExtra("KEY_FINDER_PROFILE_UI_AFTER_SHOW_NOTICE_LIST", false);
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var2 = this.B;
        if (s1Var2 == null) {
            kotlin.jvm.internal.o.o("headerLiveWidget");
            throw null;
        }
        java.lang.String str6 = this.D;
        ya2.b2 b17 = ya2.h.f460484a.b(str6);
        if (j32Var == null || (str = j32Var.getString(5)) == null) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            str = ((go2.c0) pf5.z.f353948a.a(activity).a(go2.c0.class)).f273959z;
        }
        java.lang.String str7 = str;
        kotlin.jvm.internal.o.d(str7);
        s1Var2.a("onSceneEnd:FinderFetchMemberShipDetailInfoCgi", str6, false, z17, z17, b17, str7);
        if (!this.I) {
            com.tencent.mm.plugin.finder.profile.widget.s1 s1Var3 = this.B;
            if (s1Var3 != null) {
                s1Var3.c();
                return;
            } else {
                kotlin.jvm.internal.o.o("headerLiveWidget");
                throw null;
            }
        }
        this.I = false;
        if (j32Var != null && (list = j32Var.getList(0)) != null) {
            i17 = list.size();
        }
        if (i17 <= 1) {
            com.tencent.mm.plugin.finder.profile.widget.s1 s1Var4 = this.B;
            if (s1Var4 != null) {
                s1Var4.c();
                return;
            } else {
                kotlin.jvm.internal.o.o("headerLiveWidget");
                throw null;
            }
        }
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.C;
        if (s4Var == null) {
            kotlin.jvm.internal.o.o("moreLiveListWidget");
            throw null;
        }
        if (j32Var == null || (str2 = j32Var.getString(5)) == null) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            str2 = ((go2.c0) pf5.z.f353948a.a(activity2).a(go2.c0.class)).f273959z;
        }
        zy2.ic.a(s4Var, j32Var, str2, false, null, 0, 0, null, 124, null);
    }

    public final void W6(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            return;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127899qc).getValue()).r()).intValue() == 1) {
            linkedList.clear();
            int random = (int) (10 * java.lang.Math.random());
            if (random >= 0) {
                int i17 = 0;
                while (true) {
                    r45.mk4 mk4Var = new r45.mk4();
                    mk4Var.f380603d = "测试标题" + i17;
                    mk4Var.f380604e = "内容" + i17;
                    linkedList.add(mk4Var);
                    if (i17 == random) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        java.util.ArrayList arrayList = this.f274098u;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new jo2.f((r45.mk4) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (linkedList.isEmpty()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f274089i;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("memberStatRecycleView");
                throw null;
            }
            recyclerView.setVisibility(8);
        } else {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f274089i;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("memberStatRecycleView");
                throw null;
            }
            recyclerView2.setVisibility(0);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f274089i;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("memberStatRecycleView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView3.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        super.onActivityResult(i17, i18, intent);
        if (intent == null) {
            return;
        }
        if (i17 != 100) {
            if (i17 == 10011 && i18 == 1000 && (stringExtra = intent.getStringExtra("ACTIVITY_RESULT_REMOVE_NOTICE_KEY")) != null) {
                if (!(stringExtra.length() > 0)) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.C;
                    if (s4Var == null) {
                        kotlin.jvm.internal.o.o("moreLiveListWidget");
                        throw null;
                    }
                    s4Var.f(stringExtra);
                    androidx.appcompat.app.AppCompatActivity activity = getActivity();
                    kotlin.jvm.internal.o.g(activity, "activity");
                    ((go2.c0) pf5.z.f353948a.a(activity).a(go2.c0.class)).G7();
                    return;
                }
                return;
            }
            return;
        }
        kk.l lVar = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
        kk.l lVar2 = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar2.get(this.D);
        if (l2Var == null) {
            l2Var = new com.tencent.mm.plugin.finder.profile.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("KEY_FINDER_LIVE_NOTICE_INFO");
        if (byteArrayExtra != null) {
            r45.h32 h32Var = new r45.h32();
            h32Var.parseFrom(byteArrayExtra);
            if (h32Var.getInteger(14) == 1) {
                r45.h32 h32Var2 = l2Var.f123916e;
                if ((h32Var2 != null ? h32Var2.getInteger(0) : Integer.MAX_VALUE) > h32Var.getInteger(0)) {
                    l2Var.f123916e = h32Var;
                }
            }
        }
        lVar2.put(this.D, l2Var);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        ((go2.c0) pf5.z.f353948a.a(activity2).a(go2.c0.class)).G7();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.B;
        if (s1Var != null) {
            gm0.j1.d().q(6276, s1Var.f124716J);
        } else {
            kotlin.jvm.internal.o.o("headerLiveWidget");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        java.lang.String str;
        r45.j32 j32Var;
        r45.j32 j32Var2;
        java.util.LinkedList<r45.h32> list;
        r45.j32 j32Var3;
        java.util.LinkedList list2;
        kk.l lVar = this.H;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(this.D);
        if ((l2Var == null || (j32Var3 = l2Var.f123923l) == null || (list2 = j32Var3.getList(0)) == null || !(list2.isEmpty() ^ true)) ? false : true) {
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var2 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(this.D);
            if (l2Var2 != null && (j32Var2 = l2Var2.f123923l) != null && (list = j32Var2.getList(0)) != null) {
                for (r45.h32 h32Var : list) {
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    java.lang.String str2 = this.D;
                    java.lang.String string = h32Var.getString(4);
                    if (string == null) {
                        string = "";
                    }
                    r45.h32 bj6 = ((b92.d1) zbVar).bj(str2, string);
                    java.lang.Integer valueOf = bj6 != null ? java.lang.Integer.valueOf(bj6.getInteger(1)) : null;
                    if (valueOf != null) {
                        h32Var.set(1, java.lang.Integer.valueOf(valueOf.intValue()));
                    }
                }
            }
            r45.tr0 tr0Var = (r45.tr0) this.f452719d;
            boolean z17 = tr0Var != null && tr0Var.f386726g == 2;
            com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.B;
            if (s1Var == null) {
                kotlin.jvm.internal.o.o("headerLiveWidget");
                throw null;
            }
            java.lang.String str3 = this.D;
            ya2.b2 b17 = ya2.h.f460484a.b(str3);
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var3 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(this.D);
            if (l2Var3 == null || (j32Var = l2Var3.f123923l) == null || (str = j32Var.getString(5)) == null) {
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                str = ((go2.c0) pf5.z.f353948a.a(activity).a(go2.c0.class)).f273959z;
            }
            java.lang.String str4 = str;
            kotlin.jvm.internal.o.d(str4);
            s1Var.a("onSceneEnd:MemberOnResume", str3, false, z17, z17, b17, str4);
        }
    }
}
