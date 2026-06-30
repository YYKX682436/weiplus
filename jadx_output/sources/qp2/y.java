package qp2;

/* loaded from: classes2.dex */
public final class y extends com.tencent.mm.ui.component.UIComponent {
    public boolean A;

    /* renamed from: d, reason: collision with root package name */
    public boolean f365807d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f365808e;

    /* renamed from: f, reason: collision with root package name */
    public qp2.g f365809f;

    /* renamed from: g, reason: collision with root package name */
    public int f365810g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f365811h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f365812i;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f365813m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f365814n;

    /* renamed from: o, reason: collision with root package name */
    public int f365815o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f365816p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f365817q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f365818r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f365819s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f365820t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f365821u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f365822v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f365823w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f365824x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f365825y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f365826z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f365808e = new java.util.LinkedList();
        this.f365816p = "";
        this.f365817q = "";
        this.f365818r = "";
        this.f365819s = "";
        this.f365820t = jz5.h.b(new qp2.l(this));
        this.f365821u = jz5.h.b(new qp2.v(this));
        this.f365822v = jz5.h.b(new qp2.j(this));
        this.f365823w = jz5.h.b(new qp2.w(this));
        this.f365824x = jz5.h.b(new qp2.x(this));
        this.f365825y = jz5.h.b(new qp2.m(this));
    }

    public final void O6(java.util.List list) {
        androidx.viewpager.widget.a adapter;
        android.view.View view;
        if (this.A) {
            com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabLayoutUIC", "buildTab hasBuildTab:" + this.A);
            return;
        }
        if (!this.f365826z) {
            com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabLayoutUIC", "buildTab onUserVisibleFocused:" + this.f365826z);
            return;
        }
        androidx.fragment.app.Fragment fragment = getFragment();
        kotlin.jvm.internal.o.d(fragment);
        if (fragment.isDetached()) {
            com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabLayoutUIC", "buildTab after fragment detached");
            return;
        }
        androidx.fragment.app.Fragment fragment2 = getFragment();
        kotlin.jvm.internal.o.d(fragment2);
        if (fragment2.getView() == null) {
            com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabLayoutUIC", "buildTab view is null");
            return;
        }
        boolean isEmpty = list.isEmpty();
        jz5.g gVar = this.f365824x;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabLayoutUIC", "buildTab liveTabList:" + list);
            ((com.tencent.mm.plugin.finder.view.FinderViewPager) ((jz5.n) gVar).getValue()).setVisibility(8);
            Q6().setVisibility(8);
            return;
        }
        Q6().setVisibility(0);
        ((com.tencent.mm.plugin.finder.view.FinderViewPager) ((jz5.n) gVar).getValue()).setVisibility(0);
        boolean z17 = this.f365807d;
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabLayoutUIC", "checkIfHideTabs isHideTabs:" + z17);
        Q6().setVisibility(z17 ? 8 : 0);
        ((android.widget.TextView) ((jz5.n) this.f365825y).getValue()).setVisibility(((java.util.LinkedList) this.f365808e).size() == 0 ? 0 : 8);
        androidx.fragment.app.Fragment fragment3 = getFragment();
        kotlin.jvm.internal.o.d(fragment3);
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (true) {
            androidx.viewpager.widget.ViewPager viewPager = null;
            if (!it.hasNext()) {
                int i18 = 0;
                for (java.lang.Object obj : linkedList) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) obj;
                    qp2.i iVar = new qp2.i(R6().l(), nearbyLiveSquareTabFragment.f121460p, this.f365814n);
                    java.lang.String title = nearbyLiveSquareTabFragment.f121459o;
                    kotlin.jvm.internal.o.g(title, "title");
                    android.widget.TextView textView = iVar.f365787d;
                    if (textView != null) {
                        textView.setText(title);
                    }
                    iVar.f365785b = i18;
                    r45.dd2 dd2Var = nearbyLiveSquareTabFragment.f121519s;
                    iVar.f365786c = dd2Var != null ? dd2Var.getInteger(0) : 0;
                    R6().d(iVar.f365784a, false);
                    i18 = i19;
                }
                R6().a(new qp2.k(this));
                androidx.fragment.app.Fragment fragment4 = getFragment();
                kotlin.jvm.internal.o.d(fragment4);
                com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC nearbyLiveSquareUIC = (com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) pf5.z.f353948a.b(fragment4).a(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class);
                nearbyLiveSquareUIC.getClass();
                nearbyLiveSquareUIC.f121502p.addAll(list);
                java.util.LinkedList linkedList2 = nearbyLiveSquareUIC.f121501o;
                linkedList2.addAll(linkedList);
                androidx.fragment.app.Fragment fragment5 = nearbyLiveSquareUIC.getFragment();
                if (fragment5 != null && (view = fragment5.getView()) != null) {
                    viewPager = (androidx.viewpager.widget.ViewPager) view.findViewById(com.tencent.mm.R.id.f487570p16);
                }
                if (viewPager != null) {
                    androidx.fragment.app.Fragment fragment6 = nearbyLiveSquareUIC.getFragment();
                    kotlin.jvm.internal.o.d(fragment6);
                    androidx.fragment.app.FragmentManager childFragmentManager = fragment6.getChildFragmentManager();
                    kotlin.jvm.internal.o.f(childFragmentManager, "getChildFragmentManager(...)");
                    viewPager.setAdapter(new zo2.c(childFragmentManager, linkedList2));
                    viewPager.addOnPageChangeListener(nearbyLiveSquareUIC.f121504r);
                    viewPager.setOffscreenPageLimit(2);
                    viewPager.post(new kp2.b(nearbyLiveSquareUIC, viewPager));
                    int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.D2().r()).intValue();
                    if (intValue > 0) {
                        android.content.Context context = viewPager.getContext();
                        try {
                            java.lang.reflect.Field declaredField = androidx.viewpager.widget.ViewPager.class.getDeclaredField("mScroller");
                            kotlin.jvm.internal.o.f(declaredField, "getDeclaredField(...)");
                            declaredField.setAccessible(true);
                            declaredField.set(viewPager, new hc2.h1(context, intValue));
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("ViewPagerExt", e17, "", new java.lang.Object[0]);
                        }
                    }
                }
                if (viewPager != null && (adapter = viewPager.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
                this.A = true;
                return;
            }
            java.lang.Object next = it.next();
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.dd2 dd2Var2 = (r45.dd2) next;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("nearby_live_square_tab_info_key", dd2Var2.toByteArray());
            bundle.putInt("key_from_comment_scene", V6.getInteger(5));
            bundle.putString("key_click_tab_context_id", V6.getString(2));
            androidx.fragment.app.Fragment fragment7 = getFragment();
            kotlin.jvm.internal.o.e(fragment7, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment");
            bundle.putString("key_click_tab_id", ((com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment) fragment7).getF121461q());
            bundle.putInt("key_use_dark_style", this.f365814n ? 1 : 0);
            bundle.putString("key_by_pass", this.f365816p);
            bundle.putBoolean("nearby_live_target_auto_refresh_params_key", this.f365811h);
            int i28 = this.f365810g;
            if ((i28 == 0 && i17 == 0) || i28 == dd2Var2.getInteger(0)) {
                bundle.putBoolean("nearby_live_target_auto_refresh_params_key", this.f365812i);
                bundle.putByteArray("nearby_live_target_last_buffer_params_key", this.f365813m);
            }
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment2 = new com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment(dd2Var2, null, 2, null);
            nearbyLiveSquareTabFragment2.f121459o = java.lang.String.valueOf(dd2Var2.getString(1));
            nearbyLiveSquareTabFragment2.setArguments(bundle);
            linkedList.add(nearbyLiveSquareTabFragment2);
            i17 = i27;
        }
    }

    public final com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment P6() {
        if (getFragment() == null) {
            com.tencent.mars.xlog.Log.w("NearbyLiveSquareTabLayoutUIC", "getActivityFragment return for fragment is null.");
            return null;
        }
        androidx.fragment.app.Fragment fragment = getFragment();
        kotlin.jvm.internal.o.d(fragment);
        if (fragment.getActivity() == null) {
            com.tencent.mars.xlog.Log.w("NearbyLiveSquareTabLayoutUIC", "getActivityFragment return for activity is null.");
            return null;
        }
        androidx.fragment.app.Fragment fragment2 = getFragment();
        kotlin.jvm.internal.o.d(fragment2);
        return ((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) pf5.z.f353948a.b(fragment2).a(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class)).P6();
    }

    public final com.tencent.mm.view.HardTouchableLayout Q6() {
        return (com.tencent.mm.view.HardTouchableLayout) ((jz5.n) this.f365821u).getValue();
    }

    public final com.google.android.material.tabs.TabLayout R6() {
        return (com.google.android.material.tabs.TabLayout) ((jz5.n) this.f365823w).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        byte[] byteArray;
        androidx.fragment.app.Fragment fragment = getFragment();
        kotlin.jvm.internal.o.d(fragment);
        android.os.Bundle arguments = getArguments();
        this.f365814n = arguments != null && arguments.getInt("key_use_dark_style", 1) == 1;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string = arguments2 != null ? arguments2.getString("key_by_pass") : null;
        if (string == null) {
            string = "";
        }
        this.f365816p = string;
        android.os.Bundle arguments3 = getArguments();
        java.lang.String string2 = arguments3 != null ? arguments3.getString("key_feed_export_id") : null;
        if (string2 == null) {
            string2 = "";
        }
        this.f365817q = string2;
        android.os.Bundle arguments4 = getArguments();
        java.lang.String string3 = arguments4 != null ? arguments4.getString("key_feed_nonce_id") : null;
        if (string3 == null) {
            string3 = "";
        }
        this.f365818r = string3;
        android.os.Bundle arguments5 = getArguments();
        java.lang.String string4 = arguments5 != null ? arguments5.getString("key_page_title") : null;
        this.f365819s = string4 != null ? string4 : "";
        android.os.Bundle arguments6 = getArguments();
        this.f365815o = arguments6 != null ? arguments6.getInt("key_request_scene") : 0;
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabLayoutUIC", "onCreate isForceNightMode:" + this.f365814n + " fetchTabListScene:" + this.f365815o + " byPass:" + this.f365816p);
        boolean z17 = this.f365814n;
        jz5.g gVar = this.f365820t;
        if (z17) {
            ((androidx.constraintlayout.widget.ConstraintLayout) ((jz5.n) gVar).getValue()).setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478512u));
        } else {
            ((androidx.constraintlayout.widget.ConstraintLayout) ((jz5.n) gVar).getValue()).setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.asq));
        }
        android.view.View view = (android.view.View) ((jz5.n) this.f365822v).getValue();
        if (view != null) {
            if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).lk() && c92.g.f39738a.b()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setOnClickListener(new qp2.n(this));
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.os.Bundle arguments7 = getArguments();
        if (arguments7 == null || (byteArray = arguments7.getByteArray("nearby_live_target_square_page_params_key")) == null) {
            i17 = 0;
        } else {
            com.tencent.mm.protobuf.f parseFrom = new r45.dd2().parseFrom(byteArray);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveTabInfo");
            i17 = ((r45.dd2) parseFrom).getInteger(0);
        }
        this.f365810g = i17;
        android.os.Bundle arguments8 = getArguments();
        this.f365811h = arguments8 != null ? arguments8.getBoolean("nearby_live_all_auto_refresh_params_key", false) : false;
        android.os.Bundle arguments9 = getArguments();
        this.f365812i = arguments9 != null ? arguments9.getBoolean("nearby_live_target_auto_refresh_params_key", false) : false;
        android.os.Bundle arguments10 = getArguments();
        this.f365813m = arguments10 != null ? arguments10.getByteArray("nearby_live_target_last_buffer_params_key") : null;
        Q6().setOnSingleClickListener(new qp2.p(this));
        Q6().setOnDoubleClickListener(new qp2.r(this));
        android.view.View view2 = fragment.getView();
        android.view.View findViewById = view2 != null ? view2.findViewById(com.tencent.mm.R.id.afd) : null;
        pf5.z zVar = pf5.z.f353948a;
        bp2.m mVar = ((op2.a) zVar.b(fragment).a(op2.a.class)).f347237d;
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = (com.tencent.mm.plugin.finder.view.FinderViewPager) ((jz5.n) this.f365824x).getValue();
        kotlin.jvm.internal.o.f(finderViewPager, "<get-viewPager>(...)");
        mVar.getClass();
        mVar.f23074c = findViewById;
        mVar.f23075d = finderViewPager;
        int[] iArr = mVar.f23076e;
        finderViewPager.getLocationOnScreen(iArr);
        com.tencent.mars.xlog.Log.i("FinderLivePageScrollGuideHelper", "setTargetView pos[" + iArr[0] + ", " + iArr[1] + "] targetView:" + finderViewPager);
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        if (this.f365809f == null) {
            this.f365809f = new qp2.g(getContext(), this.f365815o, this.f365816p, this.f365817q, this.f365818r, this.f365819s);
        }
        boolean z18 = this.f365815o == 0;
        qp2.g gVar2 = this.f365809f;
        if (gVar2 != null) {
            gVar2.a(V6, false, z18, new qp2.t(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        qp2.g gVar = this.f365809f;
        if (gVar != null) {
            gm0.j1.d().q(4210, gVar);
        }
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabLayoutUIC", "onDestroy");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        su4.f1 f1Var;
        if (!(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).lk() && c92.g.f39738a.b()) || (f1Var = (su4.f1) i95.n0.c(su4.f1.class)) == null) {
            return;
        }
        ((sg0.h3) f1Var).Ai(125, getContext());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        this.f365826z = true;
        O6(this.f365808e);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabLayoutUIC", "onUserVisibleFocused");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        this.f365826z = false;
    }
}
