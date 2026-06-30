package gq2;

/* loaded from: classes2.dex */
public final class j extends in5.r implements fq2.a, bq2.a, zp2.a {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f274562e;

    /* renamed from: f, reason: collision with root package name */
    public final sp2.c4 f274563f;

    /* renamed from: g, reason: collision with root package name */
    public final sp2.k f274564g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderViewPager f274565h;

    /* renamed from: i, reason: collision with root package name */
    public int f274566i;

    /* renamed from: m, reason: collision with root package name */
    public hq2.c f274567m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f274568n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f274569o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f274570p;

    public j(com.tencent.mm.ui.MMActivity context, sp2.c4 outsideEventListener, sp2.k parentOutsideOperator) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(outsideEventListener, "outsideEventListener");
        kotlin.jvm.internal.o.g(parentOutsideOperator, "parentOutsideOperator");
        this.f274562e = context;
        this.f274563f = outsideEventListener;
        this.f274564g = parentOutsideOperator;
        this.f274568n = new java.util.LinkedList();
        this.f274569o = jz5.h.b(new gq2.i(this));
        this.f274570p = jz5.h.b(new gq2.e(this));
    }

    @Override // bq2.a
    public java.util.ArrayList a(java.util.ArrayList collectScene) {
        kotlin.jvm.internal.o.g(collectScene, "collectScene");
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = this.f274565h;
        if (finderViewPager != null && finderViewPager.isShown()) {
            com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager2 = this.f274565h;
            if (finderViewPager2 != null && finderViewPager2.isAttachedToWindow()) {
                com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment o17 = o();
                com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView = o17 != null ? o17.f122085o : null;
                com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment o18 = o();
                com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView2 = o18 != null ? o18.f122085o : null;
                java.lang.Object adapter = finderChildRecyclerView2 != null ? finderChildRecyclerView2.getAdapter() : null;
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
                if (finderChildRecyclerView != null && wxRecyclerAdapter != null) {
                    return sp2.n3.f411116a.c(finderChildRecyclerView, wxRecyclerAdapter, collectScene);
                }
            }
        }
        return new java.util.ArrayList();
    }

    @Override // zp2.a
    public androidx.recyclerview.widget.RecyclerView b() {
        com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment o17;
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = this.f274565h;
        if (!(finderViewPager != null && finderViewPager.isShown())) {
            return null;
        }
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager2 = this.f274565h;
        if (!(finderViewPager2 != null && finderViewPager2.isAttachedToWindow()) || (o17 = o()) == null) {
            return null;
        }
        return o17.f122085o;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489345c74;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment liveStreamTabFragment;
        hq2.c item = (hq2.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        this.f274567m = item;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveTabViewPagerConvert onBindViewHolder size: ");
        java.util.ArrayList arrayList = item.f283210e;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("LiveTabViewPagerConvert", sb6.toString());
        java.util.LinkedList linkedList = this.f274568n;
        linkedList.clear();
        n();
        if (arrayList.size() <= 0) {
            ((com.google.android.material.tabs.TabLayout) holder.itemView.findViewById(com.tencent.mm.R.id.nv8)).n();
            ((androidx.viewpager.widget.ViewPager) holder.itemView.findViewById(com.tencent.mm.R.id.f487570p16)).removeAllViews();
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        n();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i27 = 0;
        if (arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            int i28 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i29 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                hq2.a aVar = (hq2.a) next;
                int integer = aVar.f283205d.getInteger(i27);
                r45.dd2 dd2Var = aVar.f283205d;
                r45.fa2 fa2Var = item.f283209d;
                int i37 = fa2Var.f374126e;
                int i38 = fa2Var.f374125d;
                r45.u80 u80Var = new r45.u80();
                u80Var.set(i27, java.lang.Integer.valueOf(fa2Var.f374125d));
                u80Var.set(1, fa2Var.f374132n);
                u80Var.getList(2).addAll(item.g());
                u80Var.set(3, java.lang.Integer.valueOf(item.c()));
                linkedList2.add(new com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment(new jq2.a(i28, integer, dd2Var, i37, i38, u80Var, this, aVar.f283206e.f374136r, item)));
                i27 = 0;
                i28 = i29;
                arrayList = arrayList;
                linkedList = linkedList;
            }
        }
        java.util.LinkedList<com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment> linkedList3 = linkedList;
        java.util.ArrayList arrayList2 = arrayList;
        linkedList3.clear();
        linkedList3.addAll(linkedList2);
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = (com.tencent.mm.plugin.finder.view.FinderViewPager) holder.itemView.findViewById(com.tencent.mm.R.id.f487570p16);
        finderViewPager.setEnableViewPagerScroll(true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        for (com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment liveStreamTabFragment2 : linkedList3) {
            try {
                java.lang.reflect.Field declaredField = androidx.fragment.app.Fragment.class.getDeclaredField("mContainer");
                declaredField.setAccessible(true);
                declaredField.set(liveStreamTabFragment2, finderViewPager);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.i("LiveTabViewPagerConvert", "reflectSetFragmentContainer exception", th6);
            }
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        ae2.b2 b2Var = ae2.b2.f3461a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.G).getValue()).r()).intValue();
        com.tencent.mars.xlog.Log.i("LiveTabViewPagerConvert", "reflect cost: " + currentTimeMillis2 + " opSwitch: " + intValue);
        finderViewPager.setOffscreenPageLimit(2);
        finderViewPager.removeAllViewsInLayout();
        com.tencent.mm.ui.MMActivity mMActivity = this.f274562e;
        androidx.fragment.app.FragmentManager supportFragmentManager = mMActivity.getSupportFragmentManager();
        kotlin.jvm.internal.o.f(supportFragmentManager, "getSupportFragmentManager(...)");
        finderViewPager.setAdapter(new dq2.c(supportFragmentManager, linkedList3, intValue == 1 ? 1 : 0));
        int intValue2 = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.D2().r()).intValue();
        if (intValue2 > 0) {
            try {
                java.lang.reflect.Field declaredField2 = androidx.viewpager.widget.ViewPager.class.getDeclaredField("mScroller");
                kotlin.jvm.internal.o.f(declaredField2, "getDeclaredField(...)");
                declaredField2.setAccessible(true);
                declaredField2.set(finderViewPager, new hc2.h1(mMActivity, intValue2));
            } catch (java.lang.Exception e17) {
                i19 = 0;
                com.tencent.mars.xlog.Log.printErrStackTrace("ViewPagerExt", e17, "", new java.lang.Object[0]);
            }
        }
        i19 = 0;
        androidx.viewpager.widget.a adapter = finderViewPager.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        this.f274565h = finderViewPager;
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f274562e;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        gq2.g gVar = new gq2.g(new gq2.d(mMActivity2, itemView, arrayList2, this, new gq2.h(this, item)), this, item, this.f274562e, linkedList3);
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager2 = this.f274565h;
        if (finderViewPager2 != null) {
            finderViewPager2.clearOnPageChangeListeners();
        }
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager3 = this.f274565h;
        if (finderViewPager3 != null) {
            finderViewPager3.addOnPageChangeListener(gVar);
        }
        com.tencent.mars.xlog.Log.i("LiveTabViewPagerConvert", "onPageSelected");
        sp2.b bVar = sp2.b.f410972a;
        java.lang.String key = (java.lang.String) ((jz5.n) this.f274569o).getValue();
        kotlin.jvm.internal.o.g(key, "key");
        java.util.HashMap hashMap = sp2.b.f410974c;
        java.lang.Object obj = hashMap.get(key);
        if (obj == null) {
            obj = new sp2.a();
            hashMap.put(key, obj);
        }
        int i39 = ((sp2.a) obj).f410962i;
        if (i39 <= linkedList3.size() - 1) {
            com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager4 = this.f274565h;
            if (finderViewPager4 != null) {
                finderViewPager4.setCurrentItem(i39);
            }
            gVar.onPageSelected(i39);
        } else {
            com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager5 = this.f274565h;
            if (finderViewPager5 != null) {
                finderViewPager5.setCurrentItem(i19);
            }
            gVar.onPageSelected(i19);
        }
        java.util.Iterator it6 = arrayList2.iterator();
        int i47 = i19;
        while (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            int i48 = i47 + 1;
            if (i47 < 0) {
                kz5.c0.p();
                throw null;
            }
            hq2.a aVar2 = (hq2.a) next2;
            if (aVar2.f283205d.getBoolean(2) && (liveStreamTabFragment = (com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment) kz5.n0.a0(linkedList3, i47)) != null) {
                com.tencent.mars.xlog.Log.i("LiveTabViewPagerConvert", "checkPreloadTargetTabData index: " + i47);
                eq2.e eVar = eq2.e.f255900a;
                int d17 = ((com.tencent.mm.plugin.finder.ui.MMFinderUI) mMActivity).getD();
                int integer2 = aVar2.f283205d.getInteger(i19);
                jq2.a aVar3 = liveStreamTabFragment.f122084n;
                java.lang.String str = (java.lang.String) ((jz5.n) this.f274570p).getValue();
                kotlin.jvm.internal.o.f(str, "<get-fromCommentScene>(...)");
                eVar.a(d17, integer2, 0, 12, aVar3, str);
            }
            i47 = i48;
        }
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager6 = this.f274565h;
        if (finderViewPager6 != null) {
            finderViewPager6.postDelayed(new gq2.f(this), 500L);
        }
    }

    public final void n() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f274562e;
        java.util.List<androidx.fragment.app.Fragment> fragments = mMActivity.getSupportFragmentManager().getFragments();
        kotlin.jvm.internal.o.f(fragments, "getFragments(...)");
        if (!fragments.isEmpty()) {
            java.util.Iterator<androidx.fragment.app.Fragment> it = fragments.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.Fragment next = it.next();
                com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment liveStreamTabFragment = next instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment ? (com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment) next : null;
                if (liveStreamTabFragment != null) {
                    lq2.a aVar = liveStreamTabFragment.f122086p;
                    if (aVar != null) {
                        iq2.d0 d0Var = aVar.f320455e;
                        if (d0Var == null) {
                            kotlin.jvm.internal.o.o("liveThemeCallback");
                            throw null;
                        }
                        d0Var.A = true;
                    }
                    androidx.fragment.app.i2 beginTransaction = mMActivity.getSupportFragmentManager().beginTransaction();
                    kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
                    beginTransaction.j(liveStreamTabFragment);
                    beginTransaction.f();
                    it.remove();
                }
            }
        }
    }

    public final com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment o() {
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = this.f274565h;
        int currentItem = finderViewPager != null ? finderViewPager.getCurrentItem() : 0;
        if (currentItem >= 0) {
            java.util.LinkedList linkedList = this.f274568n;
            if (currentItem < linkedList.size() && linkedList.size() != 0) {
                return (com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment) linkedList.get(currentItem);
            }
        }
        return null;
    }
}
