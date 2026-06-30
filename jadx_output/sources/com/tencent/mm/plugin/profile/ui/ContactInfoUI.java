package com.tencent.mm.plugin.profile.ui;

@gm0.a2
/* loaded from: classes11.dex */
public class ContactInfoUI extends com.tencent.mm.ui.base.preference.MMPreference implements l75.q0, xg3.u0, com.tencent.mm.modelbase.u0, ze4.h, bi4.l0, xg3.a0, l75.z0, lk5.a, com.tencent.mm.sdk.platformtools.f7 {
    public static final java.util.Map U = new java.util.concurrent.ConcurrentHashMap();
    public android.view.View K;
    public android.view.View L;
    public android.view.View R;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f153654d;

    /* renamed from: e, reason: collision with root package name */
    public t25.a f153655e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference f153656f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f153657g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f153658h;

    /* renamed from: i, reason: collision with root package name */
    public int f153659i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f153660m;
    private vj5.k mStatusBarHeightCallback;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f153661n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f153662o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f153663p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f153664q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f153665r = "";

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.listview.PullDownListView f153666s = null;

    /* renamed from: t, reason: collision with root package name */
    public boolean f153667t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f153668u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f153669v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f153670w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f153671x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f153672y = false;

    /* renamed from: z, reason: collision with root package name */
    public long f153673z = 0;
    public int A = 0;
    public boolean B = false;
    public final int C = 3;
    public int D = 0;
    public int E = 0;
    public com.tencent.mm.ui.widget.dialog.u3 F = null;
    public boolean G = false;
    public int H = 0;
    public final com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback I = new hr3.g1(this);

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.span.z f153653J = new hr3.h1(this);
    public com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo M = null;
    public int N = 1;
    public java.lang.String P = "";
    public long Q = 0;
    public final android.view.View.OnLayoutChangeListener S = new hr3.c1(this);
    public java.lang.Runnable T = null;

    @Override // ze4.h
    public void H2() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "story_cat storyUIHasStory");
        this.f153668u = true;
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f153666s;
        if (pullDownListView == null || !pullDownListView.f212147J) {
            return;
        }
        h7();
    }

    @Override // bi4.l0
    public void K5(boolean z17) {
        android.view.View view = this.R;
        if (view == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "changeStatusBgVisibility: ");
            return;
        }
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "changeStatusBgVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "changeStatusBgVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "changeStatusBgVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "changeStatusBgVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // bi4.l0
    public void M2() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "statusUIHasStatus");
        this.f153669v = true;
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f153666s;
        if (pullDownListView == null || !pullDownListView.f212147J) {
            return;
        }
        h7();
    }

    public final void V6(int i17) {
        try {
            android.view.View view = this.R;
            if (view == null) {
                return;
            }
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams.topMargin != i17) {
                layoutParams.topMargin = i17;
                this.R.setLayoutParams(layoutParams);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContactInfoUI", th6, "adjustStatusBgPosition", new java.lang.Object[0]);
        }
    }

    public final void W6() {
        com.tencent.mm.storage.z3 z3Var = this.f153661n;
        if (z3Var == null || !z3Var.l2()) {
            setMMTitle("");
        }
    }

    public final android.view.View X6(android.view.View view, hr3.o1 o1Var) {
        if (o1Var.apply(view).booleanValue()) {
            return view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View X6 = X6(viewGroup.getChildAt(i17), o1Var);
            if (X6 != null) {
                return X6;
            }
        }
        return null;
    }

    @Override // ze4.h
    public void Y0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "story_cat storyUIBackPressed");
        this.f153666s.n();
    }

    public final void Y6() {
        if (this.K == null || !vj5.n.f437718k) {
            return;
        }
        vj5.n b17 = vj5.n.b(this);
        b17.f(this.mStatusBarHeightCallback);
        hr3.j1 j1Var = new hr3.j1(this);
        this.mStatusBarHeightCallback = j1Var;
        b17.d(j1Var);
        getWindow().getDecorView().requestApplyInsets();
        vj5.o.e(getWindow());
    }

    public final bi4.i0 Z6() {
        com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference;
        com.tencent.mm.ui.base.preference.r rVar = this.f153654d;
        if (rVar == null || (normalProfileHeaderPreference = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_profile_header_normal")) == null) {
            return null;
        }
        return normalProfileHeaderPreference.R();
    }

    @Override // bi4.l0
    public void a6() {
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.jlw);
        if (relativeLayout == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "addStatusBackPreview: ");
        ((uj4.e) pf5.z.f353948a.a(this).a(uj4.e.class)).Z6();
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((uj4.e) pf5.z.f353948a.a(activity).a(uj4.e.class)).O6(getSupportFragmentManager(), relativeLayout, stringExtra, "SCENE_CONTACT_PROFILE", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r3.Q0() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r12.f153661n.l2() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0112, code lost:
    
        if (com.tencent.mm.storage.z3.F3(r5) != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.ContactInfoUI.a7(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x02f3, code lost:
    
        if (com.tencent.mm.storage.z3.F3(r7) != false) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b7(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 1373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.ContactInfoUI.b7(java.lang.String):void");
    }

    @Override // ze4.h
    public void c2() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "story_cat storyUINoStory");
        this.f153668u = false;
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f153666s;
        if (pullDownListView != null && !pullDownListView.f212147J) {
            showTitleView();
            f7();
            this.f153666s.n();
        }
        h7();
    }

    public final void c7() {
        boolean z17;
        if (this.f153670w) {
            if (((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).aj(getIntent().getStringExtra("Contact_User"))) {
                z17 = true;
                this.f153669v = z17;
            }
        }
        z17 = false;
        this.f153669v = z17;
    }

    public final void d7() {
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView;
        if (this.f153671x) {
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, getResources().getString(com.tencent.mm.R.string.f493295jn0), 0).show();
        } else {
            if (!this.f153668u || (pullDownListView = this.f153666s) == null) {
                return;
            }
            pullDownListView.o();
        }
    }

    public final void e7() {
        android.widget.RelativeLayout relativeLayout;
        if (this.f153667t || !this.f153670w || (this.f153655e instanceof com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo)) {
            return;
        }
        com.tencent.mm.storage.z3 z3Var = this.f153661n;
        if (z3Var == null || !com.tencent.mm.storage.z3.p4(z3Var.d1())) {
            com.tencent.mm.storage.z3 z3Var2 = this.f153661n;
            if ((z3Var2 == null || !com.tencent.mm.storage.z3.m4(z3Var2.d1())) && (relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.jlw)) != null) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "setupStory %s stack %s", this, com.tencent.mm.sdk.platformtools.z3.b(true));
                this.f153667t = true;
                this.f153666s = (com.tencent.mm.ui.widget.listview.PullDownListView) getListView();
                ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).cj(getContext(), this.f153666s);
                this.f153666s.setBackground(com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f478348hf));
                c7();
                if (this.f153670w) {
                    this.f153666s.setBackground(null);
                    this.f153666s.f212173z = this.I;
                    android.view.View view = new android.view.View(this);
                    this.R = view;
                    view.setId(com.tencent.mm.R.id.s1d);
                    relativeLayout.addView(view, 0);
                    android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.topMargin = com.tencent.mm.ui.bl.b(getContext()).x;
                    view.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478489a));
                    java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
                    androidx.appcompat.app.AppCompatActivity activity = getContext();
                    kotlin.jvm.internal.o.g(activity, "activity");
                    pf5.z zVar = pf5.z.f353948a;
                    ((uj4.e) zVar.a(activity).a(uj4.e.class)).f428428r = this;
                    androidx.appcompat.app.AppCompatActivity activity2 = getContext();
                    kotlin.jvm.internal.o.g(activity2, "activity");
                    uj4.e eVar = (uj4.e) zVar.a(activity2).a(uj4.e.class);
                    eVar.getClass();
                    com.tencent.mars.xlog.Log.i(eVar.f428417d, "addDBNotifyListener: " + stringExtra);
                    if (stringExtra != null) {
                        new ej4.s(stringExtra, eVar);
                    }
                    if (this.f153669v) {
                        a6();
                        M2();
                    } else {
                        j1();
                    }
                }
                this.f153666s.setNavigationBarHeight(com.tencent.mm.ui.bl.c(getContext()));
                mf4.d.f326163d.f60919e = 3L;
            }
        }
    }

    public final void f7() {
        if (fp.h.c(19)) {
            getWindow().clearFlags(201327616);
        } else {
            getWindow().clearFlags(1024);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        java.lang.Runnable runnable = this.T;
        if (runnable != null) {
            runnable.run();
            return;
        }
        mf4.d dVar = mf4.d.f326160a;
        mf4.d.f326163d.f60919e = 0L;
        super.finish();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", java.lang.Integer.valueOf(i17), a1Var, obj);
            return;
        }
        if ((a1Var instanceof com.tencent.mm.storage.e8) && (obj instanceof java.lang.String)) {
            onNotifyChange((java.lang.String) obj, null);
            return;
        }
        if ((a1Var instanceof com.tencent.mm.storage.n3) && (obj instanceof com.tencent.mm.storage.u3) && this.f153661n != null) {
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_REPORT_LAST_TIME_REPORT_DYNACFG_VER_LONG;
            if ("USERINFO_ADD_CONTACT_BY_WEWORK_USERNAME_STRING_SYNC".equals(obj.toString())) {
                onNotifyChange(this.f153661n.d1(), null);
            }
        }
    }

    public final void g7(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f153663p) || this.f153659i != 15) {
            return;
        }
        com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(str);
        boolean z17 = !android.text.TextUtils.equals(z07.field_conPhone, this.f153663p);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "trySavePhoneToStranger isMobilePhoneChanged:%s cur:%s mobile:%s", java.lang.Boolean.valueOf(z17), z07.field_conPhone, this.f153663p);
        if (z17) {
            com.tencent.mm.storage.ya yaVar = new com.tencent.mm.storage.ya(str);
            yaVar.field_conRemark = z07.field_conRemark;
            yaVar.field_conDescription = z07.field_conDescription;
            yaVar.field_contactLabels = z07.field_contactLabels;
            yaVar.field_conPhone = this.f153663p;
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "trySavePhoneToStranger mobilePhone replace finish ret:%s", java.lang.Boolean.valueOf(((com.tencent.mm.storage.ab) c01.d9.b().B()).replace(yaVar)));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f153663p) || this.f153659i != 15) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "set MM_ADDSCENE_SEARCH_PHONE source");
        this.f153661n.j3(15);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public android.view.View getBottomView() {
        return super.getBottomView();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        t25.a aVar = this.f153655e;
        if (aVar == null || !((aVar instanceof hr3.t6) || (aVar instanceof com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo))) {
            return super.getForceOrientation();
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.biztimeline.RepairerConfigBizOrientation()) == 1) {
            return super.getForceOrientation();
        }
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public s75.b getIdentString() {
        com.tencent.mm.storage.z3 z3Var = this.f153661n;
        if (z3Var == null || ((int) z3Var.E2) == 0 || com.tencent.mm.sdk.platformtools.t8.K0(z3Var.d1())) {
            return new s75.b("");
        }
        if (this.f153661n.k2() || this.f153661n.l2()) {
            return new s75.b("_bizContact");
        }
        java.lang.String d17 = this.f153661n.d1();
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "getIdentityString %s", d17);
        ku5.u0 u0Var = ku5.t0.f312615d;
        hr3.l1 l1Var = new hr3.l1(this, d17);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        return new s75.b(t0Var.m(l1Var, 0L));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View getLayoutView() {
        return com.tencent.mm.ui.td.f209893c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(getContext()), com.tencent.mm.R.layout.dpx, null, false);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494865a9;
    }

    public final void h7() {
        com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "updateUIByStory: %s %s %s %s", java.lang.Boolean.valueOf(this.f153667t), java.lang.Boolean.valueOf(this.f153668u), java.lang.Boolean.valueOf(this.f153670w), java.lang.Boolean.valueOf(this.f153669v));
        if (this.f153668u && !this.f153671x) {
            Y6();
            setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
            W6();
            com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f153666s;
            if (pullDownListView != null) {
                pullDownListView.setBackground(com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f478348hf));
                this.f153666s.setSupportOverscroll(true);
            }
            android.view.View view = this.L;
            if (view != null) {
                view.setOnClickListener(new hr3.e1(this));
            }
        } else if (!this.f153669v || this.f153671x) {
            setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
            W6();
            com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView2 = this.f153666s;
            if (pullDownListView2 != null) {
                pullDownListView2.setBackground(com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f478349hg));
                this.f153666s.setSupportOverscroll(false);
            }
            android.view.View view2 = this.K;
            if (view2 != null) {
                view2.setPadding(0, 0, 0, 0);
            }
            if (getBounceView() != null) {
                getBounceView().setBounceEnabled(true);
            }
        } else {
            Y6();
            setStatusBarShowStrategy(al5.r.f6004d);
            setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
            W6();
            com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView3 = this.f153666s;
            if (pullDownListView3 != null) {
                pullDownListView3.setBackground(null);
                com.tencent.mm.storage.z3 z3Var = this.f153661n;
                if (z3Var != null) {
                    z3Var.getClass();
                }
                androidx.appcompat.app.AppCompatActivity activity = getContext();
                kotlin.jvm.internal.o.g(activity, "activity");
                this.f153666s.setSupportOverscroll(((uj4.e) pf5.z.f353948a.a(activity).a(uj4.e.class)).X6());
            }
            android.view.View view3 = this.L;
            if (view3 != null) {
                view3.setOnClickListener(new hr3.f1(this));
            }
            if (getBounceView() != null) {
                getBounceView().setBounceEnabled(false);
            }
        }
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView4 = this.f153666s;
        if (pullDownListView4 != null) {
            if (this.f153669v) {
                pullDownListView4.setSelector(com.tencent.mm.R.color.f478489a);
            } else {
                pullDownListView4.setSelector(com.tencent.mm.R.color.a9e);
            }
        }
        android.view.View view4 = this.L;
        int height = view4 != null ? view4.getHeight() : 0;
        com.tencent.mm.ui.base.preference.r rVar = this.f153654d;
        if (rVar != null && (normalProfileHeaderPreference = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_profile_header_normal")) != null) {
            normalProfileHeaderPreference.V(this.f153668u && !this.f153671x, height, this.f153669v && !this.f153671x);
        }
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478489a));
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet(super.importUIComponents());
        hashSet.add(hr3.q0.class);
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0752  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 2785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.ContactInfoUI.initView():void");
    }

    @Override // bi4.l0
    public void j1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "statusUINoStatus");
        this.f153669v = false;
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f153666s;
        if (pullDownListView != null && !pullDownListView.f212147J) {
            showTitleView();
            f7();
            this.f153666s.n();
        }
        h7();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent != null) {
            getIntent().putExtra("CONTACT_INFO_UI_SOURCE", intent.getIntExtra("CONTACT_INFO_UI_SOURCE", -1));
        }
        if (i18 == -1 && intent != null && intent.getBooleanExtra("_delete_ok_", false)) {
            setResult(-1, getIntent().putExtra("_delete_ok_", true));
            finish();
        } else {
            t25.a aVar = this.f153655e;
            if (aVar != null) {
                aVar.onActivityResult(i17, i18, intent);
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        gr3.e.c(this.f153661n.d1(), com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t.CTRL_INDEX, this.f153673z, getIntent(), 0, this.f153659i);
        t25.a aVar = this.f153655e;
        if (((aVar instanceof t25.b) && ((t25.b) aVar).onBackPress()) || getSupportFragmentManager().isDestroyed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.storage.z3 z3Var;
        android.widget.RelativeLayout relativeLayout;
        super.onConfigurationChanged(configuration);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onConfigurationChanged: ");
        this.f153671x = !bi4.e.c(this);
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f153666s;
        if (pullDownListView != null && !pullDownListView.f212147J) {
            pullDownListView.n();
        }
        if (!(this.f153655e instanceof com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo) && (((z3Var = this.f153661n) == null || !com.tencent.mm.storage.z3.p4(z3Var.d1())) && this.f153669v && (relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.jlw)) != null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "reSetupStory: ");
            ((uj4.e) pf5.z.f353948a.a(this).a(uj4.e.class)).Z6();
            android.view.View view = this.R;
            if (view != null) {
                relativeLayout.removeView(view);
            }
            this.f153667t = false;
            e7();
        }
        h7();
        bi4.i0 Z6 = Z6();
        if (Z6 != null) {
            Z6.b4(getIntent().getStringExtra("Contact_User"));
        }
        t25.a aVar = this.f153655e;
        if ((aVar instanceof hr3.t6) || (aVar instanceof com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo)) {
            setRequestedOrientation(1);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f153670w = bi4.v1.g();
        c7();
        com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        ((com.tencent.mm.storage.k4) q17).m(stringExtra);
        this.f153668u = false;
        if (this.f153670w) {
            this.f153668u = false;
        }
        if (this.f153668u || this.f153669v) {
            customfixStatusbar(true);
        }
        super.onCreate(bundle);
        this.H = com.tencent.mm.plugin.profile.p2.wi(getIntent());
        com.tencent.mm.sdk.platformtools.o4.M("SnsMMKV").G("SnsMMKVSnsUI", true);
        this.N = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_show_profile_with_contact, 1);
        this.f153671x = !bi4.e.c(this);
        this.f153673z = java.lang.System.currentTimeMillis();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482435ei);
        this.K = findViewById;
        if (findViewById != null) {
            this.L = findViewById.findViewById(com.tencent.mm.R.id.f482438el);
        }
        h7();
        android.view.View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        this.f153663p = getIntent().getStringExtra("Contact_Search_Mobile");
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onCreate MMCore.accHasReady[%b] mobilePhone:%s", java.lang.Boolean.valueOf(gm0.j1.a()), this.f153663p);
        if (!gm0.j1.b().m()) {
            finish();
            return;
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        gm0.j1.u().c().a(this);
        ((com.tencent.mm.storage.ab) c01.d9.b().B()).f193751e.a(this, null);
        ((com.tencent.mm.storage.w7) c01.d9.b().t()).f196310e.a(this, null);
        initView();
        hideActionbarLine();
        t25.a aVar = this.f153655e;
        if (aVar instanceof t25.b) {
            ((t25.b) aVar).onCreate();
        }
        mf4.d dVar = mf4.d.f326160a;
        mf4.d.f326163d.f60920f = com.tencent.mm.plugin.profile.p2.wi(getIntent());
        gm0.j1.i();
        gm0.j1.n().f273288b.a(bd1.f.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(291, this);
        t25.a aVar2 = this.f153655e;
        if ((aVar2 instanceof hr3.t6) || (aVar2 instanceof com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo)) {
            setRequestedOrientation(1);
        }
        cy1.a aVar3 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ContactInfoUI);
        aVar3.Rj(this, iy1.a.Profile);
        aVar3.Ai(this, new hr3.i1(this));
        if (com.tencent.mm.storage.z3.L3(this.f153661n.d1())) {
            int b17 = vh0.l2.b(getIntent());
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("page_id", 50179);
            hashMap.put("page_name", "yuanbao_profile_page");
            hashMap.put("chat_name", this.f153661n.d1());
            hashMap.put("enter_type", java.lang.Integer.valueOf(b17));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("session_in", hashMap, 34004);
        }
        if (com.tencent.mm.storage.z3.A4(this.f153661n.d1())) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.lang.String str = pj5.u.f355407a;
            hashMap2.put("reminder_sessionid", str != null ? str : "");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50312, "page_in", hashMap2, 35684);
        }
        if (com.tencent.mm.storage.z3.t4(this.f153661n.d1())) {
            if (getIntent().getIntExtra("setting_from_source", 2) == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 24, 6);
            } else if (getIntent().getIntExtra("chat_from_scene", -1) == 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 24, 1);
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.sdk.platformtools.o4.M("SnsMMKV").G("SnsMMKVSnsUI", false);
        mf4.d.f326163d.f60920f = 0L;
        if (gm0.j1.b().m()) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
            gm0.j1.u().c().e(this);
            ((com.tencent.mm.storage.ab) c01.d9.b().B()).f193751e.j(this);
            ((com.tencent.mm.storage.w7) c01.d9.b().t()).f196310e.j(this);
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.f153655e == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onDestroy bodyWidget is null?%s", objArr);
        t25.a aVar = this.f153655e;
        if (aVar != null) {
            aVar.onDetach();
        }
        t25.a aVar2 = this.f153655e;
        if (aVar2 instanceof t25.b) {
            ((t25.b) aVar2).onDestroy();
        }
        if (p94.w0.d() != null) {
            ((com.tencent.mm.plugin.sns.model.i1) p94.w0.d()).N(this);
        }
        super.onDestroy();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(bd1.f.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(291, this);
        com.tencent.mm.plugin.profile.p2.Bi(getIntent(), 18, 1, this.f153661n.d1());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17283, java.lang.Integer.valueOf(com.tencent.mm.plugin.profile.p2.wi(getIntent())), this.f153661n.d1(), java.lang.Boolean.valueOf(this.f153668u), java.lang.Boolean.FALSE, java.lang.Integer.valueOf(this.f153661n.L), 0);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.F;
        if (u3Var != null) {
            u3Var.dismiss();
            this.F = null;
        }
        com.tencent.mm.plugin.profile.ui.tab.s sVar = (com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class);
        sVar.f154538g.set(null);
        com.tencent.mars.xlog.Log.i(sVar.f154535d, "clearCurrentConfig");
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        new com.tencent.mm.sdk.platformtools.n3().post(new hr3.p1(this, str));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(com.tencent.mm.sdk.platformtools.x2.f193071a, this);
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((uj4.e) pf5.z.f353948a.a(activity).a(uj4.e.class)).P6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onPause: skip");
            super.onPause();
            return;
        }
        r01.q3.cj().remove(this);
        super.onPause();
        gm0.j1.e().f(new hr3.k1(this));
        if (getIntent().getBooleanExtra("key_from_wesport_right_newtips", false)) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().m(3, getActivityBrowseTimeMs());
        } else if (getIntent().getBooleanExtra("key_from_wesport_plugin_newtips", false)) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().m(1, getActivityBrowseTimeMs());
        }
        f7();
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f153666s;
        if (pullDownListView != null) {
            pullDownListView.n();
        }
        t25.a aVar = this.f153655e;
        if ((aVar instanceof hr3.t6) || (aVar instanceof com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo)) {
            aVar.onDetach();
        }
        t25.a aVar2 = this.f153655e;
        if (aVar2 instanceof t25.b) {
            ((t25.b) aVar2).onPause();
        }
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Ni(this.f153653J);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", str + " item has been clicked!");
        t25.a aVar = this.f153655e;
        if (aVar != null) {
            aVar.R(str);
        }
        if (preference.f197780q.equals("contact_info_sns")) {
            com.tencent.mm.plugin.profile.p2.Bi(getIntent(), 3, 1, this.f153661n.d1());
        } else if (preference.f197780q.equals("contact_info_more")) {
            com.tencent.mm.plugin.profile.p2.Bi(getIntent(), 6, 1, this.f153661n.d1());
        }
        int intExtra = getIntent().getIntExtra("contact_sns_page", 0);
        if (intExtra != 1 && intExtra != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "reportSns33050 page:%d", java.lang.Integer.valueOf(intExtra));
        } else if (preference.f197780q.equals("contact_profile_sns") || preference.f197780q.equals("contact_profile_send")) {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (preference.f197780q.equals("contact_profile_sns")) {
                hashMap.put("jump_dst", 2);
            } else if (preference.f197780q.equals("contact_profile_send")) {
                hashMap.put("jump_dst", 1);
            }
            hashMap.put("sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni());
            if (pc4.d.f353410a.F()) {
                hashMap.put("feed_fold_type", 2);
            } else {
                hashMap.put("feed_fold_type", 1);
            }
            hashMap.put("is_ws_block", 0);
            hashMap.put("is_ws", 0);
            if (intExtra == 1) {
                hashMap.put("jump_scene", 1);
                if (getIntent().getBooleanExtra("contact_sns_is_ws", false)) {
                    hashMap.put("is_ws_block", 1);
                    hashMap.put("is_ws", 1);
                }
            } else if (intExtra == 2) {
                hashMap.put("jump_scene", 2);
                hashMap.put("is_ws", 1);
            }
            hashMap.put("sns_objecttype", getIntent().getIntExtra("contact_sns_feed_type", 0) + "");
            hashMap.put("username_sns", getIntent().getStringExtra("contact_sns_publish_user"));
            hashMap.put("publishid_sns", getIntent().getStringExtra("contact_sns_feed_id"));
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "report 33050:%s", hashMap.toString());
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sns_jump", hashMap, 33050);
        }
        if (preference instanceof com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) {
            d7();
        }
        return false;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        com.tencent.mm.plugin.profile.o oVar;
        t25.a aVar = this.f153655e;
        if ((aVar instanceof com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo) && (oVar = ((com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo) aVar).X) != null && oVar.f153558r) {
            oVar.g();
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        int i18 = com.tencent.mm.R.string.hhn;
        if (i17 != 19) {
            if (i17 != 82) {
                return;
            }
            if (iArr[0] != 0) {
                db5.e1.C(this, getString(com.tencent.mm.R.string.hhn), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new hr3.b1(this), null);
                return;
            }
            com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = (com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference) ((com.tencent.mm.ui.base.preference.h0) this.f153654d).h("contact_info_footer_normal");
            if (normalUserFooterPreference != null) {
                normalUserFooterPreference.M();
                return;
            }
            return;
        }
        if (iArr[0] == 0) {
            com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference2 = (com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference) ((com.tencent.mm.ui.base.preference.h0) this.f153654d).h("contact_info_footer_normal");
            if (normalUserFooterPreference2 != null) {
                normalUserFooterPreference2.N();
                return;
            }
            return;
        }
        if ("android.permission.CAMERA".equals(strArr[0])) {
            i18 = com.tencent.mm.R.string.hh8;
        }
        if (iArr[0] == 0) {
            return;
        }
        db5.e1.C(this, getString(i18), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new hr3.z0(this), new hr3.a1(this));
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(com.tencent.mm.sdk.platformtools.x2.f193071a, this);
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((uj4.e) pf5.z.f353948a.a(activity).a(uj4.e.class)).P6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onResume: skip");
            super.onResume();
            return;
        }
        r01.q3.cj().add(this);
        super.onResume();
        if (this.f153661n != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("page_name", "wxprofilepage");
            hashMap.put("wxtype", java.lang.Integer.valueOf(com.tencent.mm.storage.z3.m4(this.f153661n.d1()) ? 2 : 1));
            hashMap.put("wx_username", this.f153661n.d1());
            hashMap.put("referpath", java.lang.Integer.valueOf(this.H));
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "report 33629:%s", hashMap.toString());
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            iy1.c cVar = iy1.c.MainUI;
            ((cy1.a) rVar).Gj(50323, "page_in", hashMap, 33629);
        }
        android.view.View focusedChild = ((android.view.ViewGroup) getContentView()).getFocusedChild();
        if (focusedChild != null) {
            focusedChild.clearFocus();
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "try to clear focus. id:%s", java.lang.Integer.valueOf(focusedChild.getId()));
        }
        com.tencent.mm.ui.base.preference.r rVar2 = this.f153654d;
        if (rVar2 != null) {
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) rVar2).h("contact_profile_header_normal");
            this.f153656f = normalProfileHeaderPreference;
            if (normalProfileHeaderPreference != null) {
                android.view.View view = this.L;
                this.f153656f.V(this.f153668u, view != null ? view.getHeight() : 0, this.f153669v);
            }
        }
        t25.a aVar = this.f153655e;
        if ((aVar instanceof hr3.t6) || (aVar instanceof com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo)) {
            aVar.Q(this.f153654d, this.f153661n, this.f153657g, this.f153659i);
        }
        t25.a aVar2 = this.f153655e;
        if (aVar2 instanceof t25.b) {
            ((t25.b) aVar2).onResume();
        }
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).wi(this.f153653J);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.storage.z3 z3Var;
        m1Var.getType();
        if (273 == m1Var.getType() && (z3Var = this.f153661n) != null && (this.f153655e instanceof com.tencent.mm.plugin.profile.e0)) {
            z3Var.d1();
            android.support.v4.media.f.a(m1Var);
            throw null;
        }
        if (291 != m1Var.getType() || this.f153661n == null) {
            return;
        }
        new com.tencent.mm.sdk.platformtools.n3().post(new hr3.p1(this, this.f153661n.d1()));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        ((bi4.z0) i95.n0.c(bi4.z0.class)).getClass();
        hashSet.add(qj4.u.class);
        ((bi4.z0) i95.n0.c(bi4.z0.class)).getClass();
        hashSet.add(qj4.i.class);
        ((xe0.l0) i95.n0.c(xe0.l0.class)).getClass();
        hashSet.add(uj4.e.class);
        hashSet.add(xn5.h1.class);
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.storage.z3 z3Var = this.f153661n;
        if (z3Var == null || android.text.TextUtils.isEmpty(z3Var.d1())) {
            return;
        }
        w04.l.INSTANCE.F5(this.f153661n.d1());
    }
}
