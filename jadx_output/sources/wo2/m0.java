package wo2;

/* loaded from: classes2.dex */
public final class m0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public qp2.g f448096d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f448097e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f448098f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f448099g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f448100h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f448101i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f448102m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f448097e = jz5.h.b(new wo2.r(activity));
        this.f448098f = jz5.h.b(new wo2.k0(activity));
        this.f448099g = jz5.h.b(new wo2.v(activity));
        this.f448100h = jz5.h.b(new wo2.w(activity));
        this.f448101i = jz5.h.b(new wo2.x(activity));
        this.f448102m = jz5.h.b(new wo2.l0(activity));
    }

    public static final oa.i O6(wo2.m0 m0Var, com.google.android.material.tabs.TabLayout tabLayout, java.lang.Object obj) {
        m0Var.getClass();
        int tabCount = tabLayout.getTabCount();
        int i17 = 0;
        while (true) {
            if (i17 >= tabCount) {
                return null;
            }
            oa.i k17 = tabLayout.k(i17);
            if ((k17 != null ? k17.f343778a : null) instanceof wo2.q) {
                java.lang.Object obj2 = k17.f343778a;
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.NearbyActionBarUIC.NearbyTab");
                wo2.q qVar = (wo2.q) obj2;
                if (obj instanceof java.lang.Integer) {
                    if (qVar.f448116b == ((java.lang.Number) obj).intValue()) {
                        return k17;
                    }
                } else {
                    continue;
                }
            }
            i17++;
        }
    }

    public static final void P6(wo2.m0 m0Var, int i17) {
        if (i17 == 1) {
            android.view.View view = (android.view.View) ((jz5.n) m0Var.f448099g).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) ((jz5.n) m0Var.f448100h).getValue()).setVisibility(8);
            android.view.View view2 = (android.view.View) ((jz5.n) m0Var.f448101i).getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == 2) {
            android.view.View view3 = (android.view.View) ((jz5.n) m0Var.f448099g).getValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 != 3) {
            m0Var.getClass();
            return;
        }
        android.view.View view4 = (android.view.View) ((jz5.n) m0Var.f448099g).getValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) ((jz5.n) m0Var.f448100h).getValue()).setVisibility(8);
        android.view.View view5 = (android.view.View) ((jz5.n) m0Var.f448101i).getValue();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void Q6() {
        if (((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).wi()) {
            com.tencent.mars.xlog.Log.i("NearbyActionBarUIC", "checkAddFootPrintRedDot: clear footprint red dot");
            zy2.fa.y0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), 1014, null, null, 6, null);
        } else {
            com.tencent.mars.xlog.Log.i("NearbyActionBarUIC", "checkAddFootPrintRedDot: add footprint red dot");
            ((com.tencent.mm.plugin.finder.extension.reddot.na) ((c61.l7) i95.n0.c(c61.l7.class)).nk().j0()).a();
        }
    }

    public final com.google.android.material.tabs.TabLayout R6() {
        return (com.google.android.material.tabs.TabLayout) ((jz5.n) this.f448102m).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        r45.qt2 V6;
        androidx.appcompat.app.b supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        ((android.view.View) ((jz5.n) this.f448097e).getValue()).setOnClickListener(new wo2.y(this));
        jz5.g gVar = this.f448098f;
        ((com.tencent.mm.view.HardTouchableLayout) ((jz5.n) gVar).getValue()).setOnSingleClickListener(new wo2.a0(this));
        ((com.tencent.mm.view.HardTouchableLayout) ((jz5.n) gVar).getValue()).setOnDoubleClickListener(new wo2.c0(this));
        ((android.view.View) ((jz5.n) this.f448099g).getValue()).setOnClickListener(new wo2.e0(this));
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f448100h).getValue();
        if (textView != null) {
            textView.setTextSize(1, 15.0f);
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        if (((com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC) zVar.a(activity).a(com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC.class)).f121451e.size() == 2) {
            android.view.ViewGroup.LayoutParams layoutParams = ((com.tencent.mm.view.HardTouchableLayout) ((jz5.n) gVar).getValue()).getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams)).leftMargin = 0;
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        int i17 = 0;
        for (java.lang.Object obj : ((com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC) zVar.a(activity2).a(com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC.class)).f121451e) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment = (com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment) obj;
            wo2.q qVar = new wo2.q(R6().l(), absNearByFragment.f121460p);
            boolean isEmpty = android.text.TextUtils.isEmpty(absNearByFragment.f121459o);
            android.widget.TextView textView2 = qVar.f448117c;
            if (isEmpty) {
                java.lang.String string = getContext().getString(absNearByFragment.f121458n);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                if (textView2 != null) {
                    textView2.setText(string);
                }
            } else {
                java.lang.String title = absNearByFragment.f121459o;
                kotlin.jvm.internal.o.g(title, "title");
                if (textView2 != null) {
                    textView2.setText(title);
                }
            }
            R6().d(qVar.f448115a, false);
            i17 = i18;
        }
        R6().a(new wo2.s(this));
        pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.f105352J, getActivity(), new wo2.f0(this));
        pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.K, getActivity(), new wo2.g0(this));
        pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.L, getActivity(), new wo2.h0(this));
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment != null) {
            V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        } else {
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            kotlin.jvm.internal.o.g(activity3, "activity");
            V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        }
        if (this.f448096d == null) {
            this.f448096d = new qp2.g(getContext(), 0, "", "", "", "");
        }
        qp2.g gVar2 = this.f448096d;
        if (gVar2 != null) {
            gVar2.a(V6, true, true, new wo2.u(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        qp2.g gVar = this.f448096d;
        if (gVar != null) {
            gm0.j1.d().q(4210, gVar);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
    }
}
