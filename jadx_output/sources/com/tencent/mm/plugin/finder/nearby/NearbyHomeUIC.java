package com.tencent.mm.plugin.finder.nearby;

/* loaded from: classes2.dex */
public final class NearbyHomeUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f121450d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f121451e;

    /* renamed from: f, reason: collision with root package name */
    public int f121452f;

    /* renamed from: g, reason: collision with root package name */
    public int f121453g;

    /* renamed from: h, reason: collision with root package name */
    public ap2.a f121454h;

    /* renamed from: i, reason: collision with root package name */
    public final wo2.o0 f121455i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f121456m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyHomeUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.ArrayList d17 = ((((long) c01.z1.n()) & 512) > 0L ? 1 : ((((long) c01.z1.n()) & 512) == 0L ? 0 : -1)) == 0 ? kz5.c0.d(new com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFragment(), new com.tencent.mm.plugin.finder.nearby.live.localcity.NearbyLiveLocalCityFragment(), new com.tencent.mm.plugin.finder.nearby.person.NearbyPersonFragment()) : kz5.c0.d(new com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFragment(), new com.tencent.mm.plugin.finder.nearby.live.localcity.NearbyLiveLocalCityFragment());
        this.f121451e = d17;
        this.f121452f = 1;
        this.f121453g = 1002;
        this.f121455i = new wo2.o0(activity, this, d17);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f121456m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTabSelectedEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC$eventListener$1
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
                com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC.this.R6(idVar.f6938a);
                return true;
            }
        };
    }

    public final com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment O6() {
        ap2.a aVar = this.f121454h;
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = aVar != null ? aVar.f12775b : null;
        if (finderViewPager == null) {
            com.tencent.mars.xlog.Log.e("NearbyHomeUIC", "[getActiveFragment] viewPager==null lastIndex=" + this.f121452f);
        }
        int currentItem = finderViewPager != null ? finderViewPager.getCurrentItem() : this.f121452f;
        if (currentItem < 0) {
            return null;
        }
        java.util.ArrayList arrayList = this.f121451e;
        if (currentItem >= arrayList.size() || arrayList.size() == 0) {
            return null;
        }
        return (com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment) arrayList.get(currentItem);
    }

    public final int P6(int i17) {
        java.util.Iterator it = this.f121451e.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (((com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment) it.next()).f121460p == i17) {
                break;
            }
            i18++;
        }
        if (i18 >= 0) {
            return i18;
        }
        com.tencent.mars.xlog.Log.e("Finder.HomeUIC", "[getIndex] type=" + i17 + " is invalid.");
        return 0;
    }

    public final void Q6(int i17, boolean z17) {
        java.lang.String str;
        switch (i17) {
            case 1001:
                str = ".ui.nearby.Live";
                break;
            case 1002:
                str = ".ui.nearby.FinderVideo";
                break;
            case 1003:
                str = ".ui.nearby.Person";
                break;
            default:
                str = null;
                break;
        }
        if (str != null) {
            if (!z17) {
                ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).rj(str);
            } else {
                this.f121453g = i17;
                ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).qj(str);
            }
        }
    }

    public final void R6(int i17) {
        int P6 = P6(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCurrentTabIndex size:");
        java.util.ArrayList arrayList = this.f121451e;
        sb6.append(arrayList.size());
        sb6.append(" index:");
        sb6.append(P6);
        sb6.append(" args:null");
        com.tencent.mars.xlog.Log.i("NearbyHomeUIC", sb6.toString());
        if (P6 >= 0 && P6 < arrayList.size()) {
            ap2.a aVar = this.f121454h;
            com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = aVar != null ? aVar.f12775b : null;
            if (finderViewPager == null) {
                return;
            }
            finderViewPager.setCurrentItem(P6);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c6c;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        ap2.a aVar;
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager;
        wo2.n0 n0Var = wo2.n0.f448105a;
        int b17 = n0Var.b();
        com.tencent.mars.xlog.Log.i("NearbyHomeUIC", "[onCreate] targetTabType=" + b17);
        tq2.a aVar2 = tq2.d.f421230a;
        aVar2.c("nearbyHomeOnCreate");
        aVar2.f421219e = getActivity().hashCode();
        this.f121456m.alive();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486098k60);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager2 = (com.tencent.mm.plugin.finder.view.FinderViewPager) x4.b.a(findViewById, com.tencent.mm.R.id.f487570p16);
        if (finderViewPager2 == null) {
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(com.tencent.mm.R.id.f487570p16)));
        }
        this.f121454h = new ap2.a(linearLayout, linearLayout, finderViewPager2);
        finderViewPager2.setEnableViewPagerScroll(true);
        androidx.fragment.app.FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        kotlin.jvm.internal.o.f(supportFragmentManager, "getSupportFragmentManager(...)");
        java.util.ArrayList arrayList = this.f121451e;
        finderViewPager2.setAdapter(new zo2.c(supportFragmentManager, arrayList));
        finderViewPager2.addOnPageChangeListener(this.f121455i);
        finderViewPager2.setOffscreenPageLimit(3);
        finderViewPager2.post(new wo2.p0(this, b17));
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.D2().r()).intValue();
        if (intValue > 0 && (aVar = this.f121454h) != null && (finderViewPager = aVar.f12775b) != null) {
            android.content.Context context = finderViewPager2.getContext();
            try {
                java.lang.reflect.Field declaredField = androidx.viewpager.widget.ViewPager.class.getDeclaredField("mScroller");
                kotlin.jvm.internal.o.f(declaredField, "getDeclaredField(...)");
                declaredField.setAccessible(true);
                declaredField.set(finderViewPager, new hc2.h1(context, intValue));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("ViewPagerExt", e17, "", new java.lang.Object[0]);
            }
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        java.lang.String str = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String enterClickTabContextID = n0Var.d() + '-' + c01.id.c();
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Zi(getActivity(), null);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(str2);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Di(enterClickTabContextID);
        rq2.x xVar = rq2.x.f398914a;
        kotlin.jvm.internal.o.g(enterClickTabContextID, "enterClickTabContextID");
        rq2.x.f398915b = str2;
        long c17 = c01.id.c();
        rq2.x.f398916c = c17;
        rq2.x.f398917d = c17;
        this.f121450d = true;
        R6(b17);
        if (c92.g.f39738a.b()) {
            com.tencent.mars.xlog.Log.w("NearbyHomeUIC", "prepareLiveSquare not NearbyLiveSquareFragment");
        } else if (arrayList.get(1) instanceof com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment) {
            java.lang.Object obj = arrayList.get(1);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment");
            ((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment) obj).B0(getActivity());
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((wo2.n) zVar.a(activity2).a(wo2.n.class)).R6();
        } else {
            com.tencent.mars.xlog.Log.w("NearbyHomeUIC", "prepareLiveSquare return for !is NearbyLiveSquareFragment");
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_ENTER_NEARBY_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("NearbyEntrance");
        cy1.a aVar3 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar3.dk(this, com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC.class.getSimpleName());
        ((cy1.a) aVar3.ak(this, iy1.c.NearbyHomeUI)).Rj(this, iy1.a.NewNearBy);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        int b17;
        this.f121456m.dead();
        nq2.d.f338980a.g();
        wo2.n0 n0Var = wo2.n0.f448105a;
        if (this.f121450d) {
            com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment O6 = O6();
            b17 = O6 != null ? O6.f121460p : 1001;
        } else {
            b17 = n0Var.b();
        }
        com.tencent.mars.xlog.Log.i("NearbyConfig", "saveExitTabType tabType:" + b17);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_NEARBY_LAST_TAB_TYPE_INT_SYNC, java.lang.Integer.valueOf(b17));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_EXIT_NEARBY_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
        dp2.e eVar = dp2.e.f242192a;
        dp2.e.f242193b = false;
        dp2.e.f242194c.clear();
        synchronized (eVar.e()) {
            eVar.e().clear();
        }
        Q6(this.f121453g, false);
        com.tencent.mars.xlog.Log.i("NearbyHomeUIC", "onDestroy fragments:" + this.f121451e);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("NearbyHomeUIC", "onPause()");
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment O6 = O6();
        if (O6 instanceof com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment) {
            return;
        }
        rq2.x.f398914a.d(O6);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("NearbyHomeUIC", "onResume()");
        rq2.x xVar = rq2.x.f398914a;
        rq2.x.f398917d = c01.id.c();
        tq2.d.f421230a.c("nearbyHomeOnResume");
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.tencent.mm.plugin.finder.extension.reddot.ga gaVar = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a;
        gaVar.p(1, V6);
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment O6 = O6();
        if (O6 == null || (str = O6.getF121516t()) == null) {
            str = "";
        }
        gaVar.n(1, V6, 0, str);
        gaVar.o(1, V6);
    }
}
