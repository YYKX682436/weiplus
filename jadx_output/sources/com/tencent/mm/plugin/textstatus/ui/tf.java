package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class tf extends com.tencent.mm.ui.component.UIComponent implements l75.q0, qi4.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f174325d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f174326e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f174327f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f174328g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f174329h;

    /* renamed from: i, reason: collision with root package name */
    public int f174330i;

    /* renamed from: m, reason: collision with root package name */
    public int f174331m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f174332n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f174325d = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.pf(this, activity));
        this.f174326e = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.of(this));
        this.f174327f = jz5.h.b(com.tencent.mm.plugin.textstatus.ui.kf.f174039d);
        this.f174328g = true;
        this.f174329h = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.sf(this));
        jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.rf(this));
        this.f174332n = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.qf(this));
    }

    public static final int O6(com.tencent.mm.plugin.textstatus.ui.tf tfVar, oa.i iVar) {
        com.tencent.mm.plugin.textstatus.ui.ff ffVar;
        tfVar.getClass();
        java.lang.Object obj = iVar.f343778a;
        com.tencent.mm.plugin.textstatus.ui.jf jfVar = obj instanceof com.tencent.mm.plugin.textstatus.ui.jf ? (com.tencent.mm.plugin.textstatus.ui.jf) obj : null;
        if (jfVar == null || (ffVar = jfVar.f174020e) == null) {
            return 0;
        }
        return ffVar.f173882b;
    }

    public static final void P6(com.tencent.mm.plugin.textstatus.ui.tf tfVar, oa.i iVar, boolean z17) {
        com.tencent.mm.ui.MMActivity mMActivity;
        tfVar.getClass();
        java.lang.Object obj = iVar.f343778a;
        if (obj instanceof com.tencent.mm.plugin.textstatus.ui.jf) {
            if (!z17) {
                com.tencent.mm.plugin.textstatus.ui.jf jfVar = (com.tencent.mm.plugin.textstatus.ui.jf) obj;
                jfVar.b(com.tencent.mm.R.color.f478873jj);
                jfVar.a(false);
                return;
            }
            com.tencent.mm.plugin.textstatus.ui.jf jfVar2 = (com.tencent.mm.plugin.textstatus.ui.jf) obj;
            jfVar2.b(com.tencent.mm.R.color.a0c);
            jfVar2.a(true);
            if (iVar.f343782e == 0) {
                androidx.appcompat.app.AppCompatActivity activity = tfVar.getActivity();
                mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
                if (mMActivity != null) {
                    mMActivity.showOptionMenu(true);
                    return;
                }
                return;
            }
            androidx.appcompat.app.AppCompatActivity activity2 = tfVar.getActivity();
            mMActivity = activity2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity2 : null;
            if (mMActivity != null) {
                mMActivity.showOptionMenu(false);
            }
        }
    }

    @Override // qi4.b
    public void L3(java.lang.String event, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusPagerUIC", "onObserver() called with: event = " + event + ", eventId = " + i17);
        U6(0);
        if (S6().getSelectedTabPosition() == 0) {
            T6(0);
        }
    }

    public final void Q6(oa.i iVar, com.tencent.mm.plugin.textstatus.ui.ff ffVar) {
        android.view.ViewGroup.LayoutParams layoutParams;
        int i17 = iVar.f343782e;
        java.util.Objects.toString(ffVar);
        java.lang.Object obj = iVar.f343778a;
        com.tencent.mm.plugin.textstatus.ui.jf jfVar = obj instanceof com.tencent.mm.plugin.textstatus.ui.jf ? (com.tencent.mm.plugin.textstatus.ui.jf) obj : null;
        if (jfVar != null) {
            jfVar.f174020e = ffVar;
            int i18 = ffVar.f173881a;
            jz5.g gVar = jfVar.f174019d;
            jz5.g gVar2 = jfVar.f174018c;
            if (i18 == 0) {
                android.widget.TextView textView = (android.widget.TextView) ((jz5.n) gVar2).getValue();
                if (textView != null) {
                    textView.setVisibility(8);
                }
                android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i18 == 1) {
                android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) gVar2).getValue();
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                android.widget.TextView textView3 = (android.widget.TextView) ((jz5.n) gVar2).getValue();
                if (textView3 != null) {
                    textView3.setText("+" + ffVar.f173882b);
                }
                android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i18 == 2) {
                android.view.View view3 = (android.view.View) ((jz5.n) gVar).getValue();
                if (view3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.TextView textView4 = (android.widget.TextView) ((jz5.n) gVar2).getValue();
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            }
            oa.k kVar = iVar.f343785h;
            if (!(kVar instanceof android.view.View)) {
                kVar = null;
            }
            if (kVar == null || (layoutParams = kVar.getLayoutParams()) == null) {
                return;
            }
            layoutParams.width = -2;
            oa.k kVar2 = iVar.f343785h;
            oa.k kVar3 = kVar2 instanceof android.view.View ? kVar2 : null;
            if (kVar3 == null) {
                return;
            }
            kVar3.setLayoutParams(layoutParams);
        }
    }

    public final com.tencent.mm.plugin.textstatus.ui.ef R6() {
        return (com.tencent.mm.plugin.textstatus.ui.ef) ((jz5.n) this.f174325d).getValue();
    }

    public final com.google.android.material.tabs.TabLayout S6() {
        java.lang.Object value = ((jz5.n) this.f174329h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.google.android.material.tabs.TabLayout) value;
    }

    public final void T6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusPagerUIC", "markShownTime: " + i17);
        if (i17 == 0) {
            ai4.m0.f5173a.F(c01.id.e());
        } else {
            if (i17 != 1) {
                return;
            }
            ni4.x xVar = ni4.x.f337776d;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_LASTTIME_CONV_TAB_SHOWN_INT, java.lang.Integer.valueOf(c01.id.e()));
        }
    }

    public final void U6(int i17) {
        oa.i k17;
        if (i17 == -1 || (k17 = S6().k(i17)) == null) {
            return;
        }
        Q6(k17, R6().a(i17));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ni4.x xVar = ni4.x.f337776d;
        xVar.o();
        xVar.k().remove(this);
        xVar.h().remove(this);
        xVar.l().remove(this);
        ai4.m0 m0Var = ai4.m0.f5173a;
        m0Var.p(this, null);
        m0Var.b();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(hi4.m.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        hi4.m.O6((hi4.m) a17, 4, 0, 0, 0, 14, null);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.util.Objects.toString(w0Var);
        l75.s0 s0Var = w0Var != null ? w0Var.f316975c : null;
        int i17 = 1;
        if (s0Var instanceof mj4.n ? true : s0Var instanceof mj4.p) {
            i17 = 0;
        } else {
            if (!(s0Var instanceof li4.a ? true : s0Var instanceof li4.b)) {
                i17 = -1;
            }
        }
        U6(i17);
        if (i17 == S6().getSelectedTabPosition()) {
            T6(i17);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        ni4.x.f337776d.o();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        android.widget.TextView textView;
        com.tencent.mm.ui.ga controller;
        if (this.f174328g) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity != null && (controller = mMActivity.getController()) != null) {
                androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                controller.f208653k0 = com.tencent.mm.R.layout.cyj;
                controller.N(activity2);
            }
            int count = R6().getCount();
            for (int i17 = 0; i17 < count; i17++) {
                com.tencent.mm.plugin.textstatus.ui.ef R6 = R6();
                com.google.android.material.tabs.TabLayout S6 = S6();
                R6.getClass();
                oa.i l17 = S6.l();
                new com.tencent.mm.plugin.textstatus.ui.jf(l17);
                com.tencent.mm.plugin.textstatus.ui.ef R62 = R6();
                R62.getClass();
                java.lang.CharSequence pageTitle = R62.getPageTitle(i17);
                com.tencent.mm.plugin.textstatus.ui.tf tfVar = R62.f173850d;
                tfVar.getClass();
                java.lang.Object obj = l17.f343778a;
                if ((obj instanceof com.tencent.mm.plugin.textstatus.ui.jf) && (textView = (android.widget.TextView) ((jz5.n) ((com.tencent.mm.plugin.textstatus.ui.jf) obj).f174017b).getValue()) != null) {
                    textView.setText(pageTitle);
                }
                tfVar.Q6(l17, R62.a(i17));
                S6().d(l17, false);
            }
            androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) getActivity().findViewById(com.tencent.mm.R.id.kod);
            S6().a(new com.tencent.mm.plugin.textstatus.ui.lf(viewPager, this));
            viewPager.addOnPageChangeListener(new com.tencent.mm.plugin.textstatus.ui.mf(S6()));
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            oa.i k17 = S6().k(((java.lang.Number) ((jz5.n) ((hi4.j) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(hi4.j.class)).f281553f).getValue()).intValue());
            if (k17 != null) {
                k17.b();
            }
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity2 = activity3 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity3 : null;
            if (mMActivity2 != null) {
                mMActivity2.setMMTitle("");
            }
            androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity3 = activity4 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity4 : null;
            if (mMActivity3 != null) {
                mMActivity3.setBackBtn(new com.tencent.mm.plugin.textstatus.ui.nf(this));
            }
            ni4.x xVar = ni4.x.f337776d;
            xVar.k().add(this);
            xVar.h().add(this);
            xVar.l().add(this);
            this.f174328g = false;
        }
        ni4.x xVar2 = ni4.x.f337776d;
        int e17 = c01.id.e();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_LASTTIME_NOTIFY_SHOWN_INT, java.lang.Integer.valueOf(e17));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_LASTTIME_LIKE_TAB_SHOWN_INT, java.lang.Integer.valueOf(e17));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_LASTTIME_CONV_TAB_SHOWN_INT, java.lang.Integer.valueOf(e17));
    }
}
