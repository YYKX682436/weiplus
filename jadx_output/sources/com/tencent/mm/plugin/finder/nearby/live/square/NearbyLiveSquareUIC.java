package com.tencent.mm.plugin.finder.nearby.live.square;

/* loaded from: classes2.dex */
public final class NearbyLiveSquareUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderViewPager f121493d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f121494e;

    /* renamed from: f, reason: collision with root package name */
    public jp2.a f121495f;

    /* renamed from: g, reason: collision with root package name */
    public yl2.g f121496g;

    /* renamed from: h, reason: collision with root package name */
    public r45.dd2 f121497h;

    /* renamed from: i, reason: collision with root package name */
    public long f121498i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f121499m;

    /* renamed from: n, reason: collision with root package name */
    public int f121500n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f121501o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f121502p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f121503q;

    /* renamed from: r, reason: collision with root package name */
    public final kp2.c f121504r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f121505s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyLiveSquareUIC(com.tencent.mm.ui.MMFragmentActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f121498i = -1L;
        this.f121499m = "";
        this.f121500n = -1;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f121501o = linkedList;
        this.f121502p = new java.util.LinkedList();
        this.f121504r = new kp2.c(this, getActivity(), linkedList);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f121505s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTabSelectedEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC$eventListener$1
            {
                this.__eventId = -1371931232;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderTabSelectedEvent finderTabSelectedEvent) {
                com.tencent.mm.autogen.events.FinderTabSelectedEvent event = finderTabSelectedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.id idVar = event.f54329g;
                if (idVar == null) {
                    return true;
                }
                com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.this.S6(idVar.f6938a);
                return true;
            }
        };
    }

    public static final void O6(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC nearbyLiveSquareUIC) {
        java.lang.String s07;
        androidx.fragment.app.Fragment fragment = nearbyLiveSquareUIC.getFragment();
        kotlin.jvm.internal.o.d(fragment);
        java.lang.String str = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_context_id", str);
        intent.putExtra("key_click_tab_context_id", ip2.a.f293614c);
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment P6 = nearbyLiveSquareUIC.P6();
        if (P6 != null && (s07 = P6.s0()) != null) {
            str2 = s07;
        }
        intent.putExtra("key_click_sub_tab_context_id", str2);
        jp2.a aVar = nearbyLiveSquareUIC.f121495f;
        if (aVar != null) {
            aVar.a(intent);
        } else {
            kotlin.jvm.internal.o.o("liveSearchHelper");
            throw null;
        }
    }

    public static void T6(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC nearbyLiveSquareUIC, int i17, boolean z17, android.os.Bundle bundle, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            z17 = true;
        }
        if ((i18 & 4) != 0) {
            bundle = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCurrentTabIndex size:");
        java.util.LinkedList linkedList = nearbyLiveSquareUIC.f121501o;
        sb6.append(linkedList.size());
        sb6.append(" index:");
        sb6.append(i17);
        sb6.append(" withAnim:");
        sb6.append(z17);
        sb6.append(" args:");
        sb6.append(bundle);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareUIC", sb6.toString());
        if (i17 >= 0 && i17 < linkedList.size()) {
            if (bundle != null) {
                ((com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) linkedList.get(i17)).getClass();
            }
            com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = nearbyLiveSquareUIC.f121493d;
            if (finderViewPager != null) {
                finderViewPager.setCurrentItem(i17, z17);
            }
        }
    }

    public final com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment P6() {
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager;
        androidx.fragment.app.Fragment fragment = getFragment();
        kotlin.jvm.internal.o.d(fragment);
        int currentItem = (fragment.getView() == null || (finderViewPager = this.f121493d) == null) ? this.f121500n : finderViewPager.getCurrentItem();
        if (currentItem >= 0) {
            java.util.LinkedList linkedList = this.f121501o;
            if (currentItem < linkedList.size() && linkedList.size() != 0) {
                return (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) linkedList.get(currentItem);
            }
        }
        return null;
    }

    public final int Q6() {
        r45.dd2 dd2Var;
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment P6 = P6();
        int i17 = 0;
        if (P6 != null && (dd2Var = P6.f121519s) != null) {
            i17 = dd2Var.getInteger(0);
        }
        return R6(i17);
    }

    public final int R6(int i17) {
        java.util.Iterator it = this.f121502p.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (((r45.dd2) it.next()).getInteger(0) == i17) {
                break;
            }
            i18++;
        }
        if (i18 >= 0) {
            return i18;
        }
        com.tencent.mars.xlog.Log.e("NearbyLiveSquareUIC", "[getIndex] tabId=" + i17 + " is invalid.");
        return 0;
    }

    public final void S6(int i17) {
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager;
        int R6 = R6(i17);
        if (!(R6 >= 0 && R6 < this.f121501o.size()) || (finderViewPager = this.f121493d) == null) {
            return;
        }
        finderViewPager.setCurrentItem(R6);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c79;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (this.f121496g != null) {
            return;
        }
        kotlin.jvm.internal.o.o("livePostHelper");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        r45.dd2 dd2Var;
        java.lang.String string;
        byte[] byteArray;
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.os.Bundle arguments = getArguments();
        this.f121503q = arguments != null && arguments.getInt("key_use_dark_style", 1) == 1;
        androidx.fragment.app.Fragment fragment = getFragment();
        this.f121493d = (fragment == null || (view3 = fragment.getView()) == null) ? null : (com.tencent.mm.plugin.finder.view.FinderViewPager) view3.findViewById(com.tencent.mm.R.id.f487570p16);
        androidx.fragment.app.Fragment fragment2 = getFragment();
        android.view.View findViewById = (fragment2 == null || (view2 = fragment2.getView()) == null) ? null : view2.findViewById(com.tencent.mm.R.id.afd);
        if (this.f121503q) {
            com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = this.f121493d;
            if (finderViewPager != null) {
                finderViewPager.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478512u));
            }
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478512u));
            }
        } else {
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
            }
            com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager2 = this.f121493d;
            if (finderViewPager2 != null) {
                finderViewPager2.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.BW_100));
            }
        }
        androidx.fragment.app.Fragment fragment3 = getFragment();
        this.f121493d = (fragment3 == null || (view = fragment3.getView()) == null) ? null : (com.tencent.mm.plugin.finder.view.FinderViewPager) view.findViewById(com.tencent.mm.R.id.f487570p16);
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (byteArray = arguments2.getByteArray("nearby_live_target_square_page_params_key")) == null) {
            dd2Var = null;
        } else {
            com.tencent.mm.protobuf.f parseFrom = new r45.dd2().parseFrom(byteArray);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveTabInfo");
            dd2Var = (r45.dd2) parseFrom;
        }
        this.f121497h = dd2Var;
        android.os.Bundle arguments3 = getArguments();
        this.f121498i = arguments3 != null ? arguments3.getLong("nearby_live_target_object_id_params_key", -1L) : -1L;
        android.os.Bundle arguments4 = getArguments();
        java.lang.String str = "";
        java.lang.String string2 = arguments4 != null ? arguments4.getString("nearby_live_target_nonce_id_params_key", "") : null;
        if (string2 == null) {
            string2 = "";
        }
        this.f121499m = string2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate targetTabInfo=");
        r45.dd2 dd2Var2 = this.f121497h;
        sb6.append(dd2Var2 != null ? java.lang.Integer.valueOf(dd2Var2.getInteger(0)) : null);
        sb6.append('-');
        r45.dd2 dd2Var3 = this.f121497h;
        sb6.append(dd2Var3 != null ? dd2Var3.getString(1) : null);
        sb6.append(" targetObjectId:");
        sb6.append(this.f121498i);
        sb6.append(" targetObjectNonceId:");
        sb6.append(this.f121499m);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareUIC", sb6.toString());
        this.f121505s.alive();
        this.f121496g = new yl2.g(getActivity());
        this.f121495f = new jp2.a(getActivity());
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager3 = this.f121493d;
        if (finderViewPager3 != null) {
            finderViewPager3.setEnableViewPagerScroll(true);
        }
        this.f121494e = true;
        androidx.fragment.app.Fragment fragment4 = getFragment();
        kotlin.jvm.internal.o.d(fragment4);
        pf5.z zVar = pf5.z.f353948a;
        java.lang.String str2 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.b(fragment4).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String enterClickTabContextID = "1001-" + c01.id.c();
        android.view.View findViewById2 = getActivity().findViewById(com.tencent.mm.R.id.meo);
        if (findViewById2 != null) {
            if (c92.g.f39738a.b()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC", "initSearchItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC", "initSearchItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setOnClickListener(new kp2.d(this));
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC", "initSearchItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC", "initSearchItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View findViewById3 = getActivity().findViewById(com.tencent.mm.R.id.md6);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new kp2.e(this));
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(str2);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Di(enterClickTabContextID);
        rq2.x xVar = rq2.x.f398914a;
        kotlin.jvm.internal.o.g(enterClickTabContextID, "enterClickTabContextID");
        rq2.x.f398915b = str2;
        long c17 = c01.id.c();
        rq2.x.f398916c = c17;
        rq2.x.f398917d = c17;
        if (getFragment() instanceof com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment) {
            androidx.fragment.app.Fragment fragment5 = getFragment();
            kotlin.jvm.internal.o.e(fragment5, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment");
            java.lang.String str3 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.b((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment) fragment5).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135386r;
            if (str3 == null) {
                str3 = "";
            }
            android.os.Bundle arguments5 = getArguments();
            if (arguments5 != null && (string = arguments5.getString("key_by_pass")) != null) {
                str = string;
            }
            ip2.a aVar = ip2.a.f293612a;
            androidx.fragment.app.Fragment fragment6 = getFragment();
            kotlin.jvm.internal.o.e(fragment6, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment");
            aVar.a(str2, (com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment) fragment6, str3, str);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        yl2.g gVar = this.f121496g;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("livePostHelper");
            throw null;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostForNearby", "reset()");
        com.tencent.mm.plugin.finder.assist.d9 d9Var = gVar.f463002e;
        if (d9Var != null) {
            d9Var.f102094e = 0;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onPreDestroyed() {
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment P6;
        r45.dd2 dd2Var;
        super.onPreDestroyed();
        dp2.e eVar = dp2.e.f242192a;
        dp2.e.f242193b = false;
        dp2.e.f242194c.clear();
        synchronized (eVar.e()) {
            eVar.e().clear();
        }
        wo2.n0 n0Var = wo2.n0.f448105a;
        int integer = (!this.f121494e || (P6 = P6()) == null || (dd2Var = P6.f121519s) == null) ? 0 : dd2Var.getInteger(0);
        androidx.fragment.app.Fragment fragment = getFragment();
        int i17 = fragment != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n : 0;
        com.tencent.mars.xlog.Log.i("NearbyConfig", "saveExitLiveTabId tabId:" + integer + " commentScene: " + i17);
        wo2.n0.f448107c = android.os.SystemClock.elapsedRealtime();
        wo2.n0.f448108d.put(i17, java.lang.Integer.valueOf(integer));
        ip2.a.f293613b = "";
        ip2.a.f293615d = "";
        ip2.a.f293614c = "";
        ip2.a.f293616e = true;
        ip2.a.f293620i = false;
        ip2.a.f293617f = "";
        ip2.a.f293618g = -1;
        ip2.a.f293619h = -1;
        this.f121505s.dead();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (this.f121496g == null) {
            kotlin.jvm.internal.o.o("livePostHelper");
            throw null;
        }
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment P6 = P6();
        if (P6 != null) {
            P6.onRequestPermissionsResult(i17, permissions, grantResults);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager;
        if (!ig2.e.f291372a.c() || (finderViewPager = this.f121493d) == null) {
            return;
        }
        finderViewPager.setNeedInterceptFitWindow(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyLiveSquareUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f121498i = -1L;
        this.f121499m = "";
        this.f121500n = -1;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f121501o = linkedList;
        this.f121502p = new java.util.LinkedList();
        this.f121504r = new kp2.c(this, getActivity(), linkedList);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f121505s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTabSelectedEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC$eventListener$1
            {
                this.__eventId = -1371931232;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderTabSelectedEvent finderTabSelectedEvent) {
                com.tencent.mm.autogen.events.FinderTabSelectedEvent event = finderTabSelectedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.id idVar = event.f54329g;
                if (idVar == null) {
                    return true;
                }
                com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.this.S6(idVar.f6938a);
                return true;
            }
        };
    }
}
