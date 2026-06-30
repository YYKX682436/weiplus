package com.tencent.mm.plugin.finder.viewmodel.component;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderTabUIC;", "Lcom/tencent/mm/ui/component/UIComponent;", "Lcom/tencent/mm/plugin/finder/view/tabcomp/IFinderTabProvider;", "tabProvider", "Lcom/tencent/mm/plugin/finder/view/tabcomp/IFinderTabProvider;", "d7", "()Lcom/tencent/mm/plugin/finder/view/tabcomp/IFinderTabProvider;", "setTabProvider", "(Lcom/tencent/mm/plugin/finder/view/tabcomp/IFinderTabProvider;)V", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class FinderTabUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d */
    public int f133655d;

    /* renamed from: e */
    public boolean f133656e;

    /* renamed from: f */
    public boolean f133657f;

    /* renamed from: g */
    public com.google.android.material.tabs.TabLayout f133658g;

    /* renamed from: h */
    public androidx.viewpager.widget.ViewPager f133659h;

    /* renamed from: i */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f133660i;

    /* renamed from: m */
    public tw2.b f133661m;

    /* renamed from: n */
    public zx2.b0 f133662n;

    /* renamed from: o */
    public final java.util.concurrent.CopyOnWriteArraySet f133663o;

    /* renamed from: p */
    public java.util.List f133664p;

    /* renamed from: q */
    public java.util.List f133665q;

    /* renamed from: r */
    public zx2.z f133666r;

    /* renamed from: s */
    public zx2.a0 f133667s;

    /* renamed from: t */
    public com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver f133668t;
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider tabProvider;

    /* renamed from: u */
    public final boolean f133669u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderTabUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f133655d = -1;
        this.f133656e = true;
        this.f133663o = new java.util.concurrent.CopyOnWriteArraySet();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f133669u = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127820m5).getValue()).r()).intValue() == 1;
    }

    public static /* synthetic */ void Q6(com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC, int i17, zx2.i iVar, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addTabAndFragment");
        }
        if ((i18 & 8) != 0) {
            z17 = false;
        }
        finderTabUIC.P6(i17, iVar, finderHomeTabFragment, z17);
    }

    public static void R6(com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC, zx2.i tab, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addTabAndFragment");
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        finderTabUIC.getClass();
        kotlin.jvm.internal.o.g(tab, "tab");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        finderTabUIC.P6(finderTabUIC.f7().size(), tab, fragment, z17);
    }

    public static /* synthetic */ void n7(com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC, int i17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeTabAndFragment");
        }
        if ((i19 & 2) != 0) {
            i18 = -1;
        }
        finderTabUIC.m7(i17, i18);
    }

    public static /* synthetic */ void p7(com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC, int i17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeTabAndFragmentByTabType");
        }
        if ((i19 & 2) != 0) {
            i18 = -1;
        }
        finderTabUIC.o7(i17, i18);
    }

    public static /* synthetic */ void t7(com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectTab");
        }
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        finderTabUIC.s7(i17, z17);
    }

    public void O6(zx2.i iVar, int i17) {
        com.google.android.material.tabs.TabLayout tabLayout = this.f133658g;
        if (tabLayout != null) {
            oa.i l17 = tabLayout.l();
            if (iVar != null) {
                l17.c(iVar.a());
                iVar.c((android.view.ViewGroup) l17.f343783f);
                iVar.e(false);
                if (iVar instanceof zx2.k) {
                    l17.f343781d = ((zx2.k) iVar).i(getContext());
                    l17.f();
                }
            }
            l17.f343778a = iVar;
            if (i17 >= 0) {
                tabLayout.c(l17, i17, tabLayout.f44541d.isEmpty());
            } else {
                tabLayout.b(l17);
            }
        }
    }

    public final void P6(int i17, zx2.i tab, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment, boolean z17) {
        int size;
        boolean z18;
        int i18;
        kotlin.jvm.internal.o.g(tab, "tab");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        if (!this.f133657f || !kotlin.jvm.internal.m0.g(f7())) {
            com.tencent.mars.xlog.Log.e("Finder.FinderTabUIC", "addTabAndFragment param error");
            return;
        }
        if (i17 <= f7().size()) {
            size = i17;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reoderTabPos ");
            com.tencent.mm.plugin.finder.profile.uic.re reVar = tab instanceof com.tencent.mm.plugin.finder.profile.uic.re ? (com.tencent.mm.plugin.finder.profile.uic.re) tab : null;
            sb6.append(reVar != null ? java.lang.Integer.valueOf(reVar.f477051i) : null);
            sb6.append(" pos from:");
            sb6.append(i17);
            sb6.append(" to:");
            sb6.append(f7().size());
            sb6.append('!');
            com.tencent.mars.xlog.Log.e("Finder.FinderTabUIC", sb6.toString());
            size = f7().size();
        }
        if (this.f133669u && (i18 = tab.f477041b) >= 0 && i18 < Integer.MAX_VALUE) {
            java.util.Iterator it = f7().iterator();
            int i19 = 0;
            while (true) {
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    if (((zx2.i) next).f477041b > tab.f477041b) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("reoderTabPos ");
                        com.tencent.mm.plugin.finder.profile.uic.re reVar2 = tab instanceof com.tencent.mm.plugin.finder.profile.uic.re ? (com.tencent.mm.plugin.finder.profile.uic.re) tab : null;
                        sb7.append(reVar2 != null ? java.lang.Integer.valueOf(reVar2.f477051i) : null);
                        sb7.append(" pos from:");
                        sb7.append(size);
                        sb7.append(" to:");
                        sb7.append(i19);
                        sb7.append('!');
                        com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", sb7.toString());
                        size = i19;
                    } else {
                        i19 = i27;
                    }
                } else {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("reoderTabPos  ");
                    com.tencent.mm.plugin.finder.profile.uic.re reVar3 = tab instanceof com.tencent.mm.plugin.finder.profile.uic.re ? (com.tencent.mm.plugin.finder.profile.uic.re) tab : null;
                    sb8.append(reVar3 != null ? java.lang.Integer.valueOf(reVar3.f477051i) : null);
                    sb8.append(" priority is max, pos from:");
                    sb8.append(size);
                    sb8.append(" to:");
                    sb8.append(f7().size());
                    sb8.append('!');
                    com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", sb8.toString());
                    size = f7().size();
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "after reoderTabPos position from:" + i17 + " to " + size);
        if (size >= 0 && size <= f7().size()) {
            int X6 = X6();
            tab.f477040a = size;
            kotlin.jvm.internal.m0.b(f7()).add(size, tab);
            if (this.f133658g != null) {
                O6(tab, size);
            }
            tw2.b bVar = this.f133661m;
            if (bVar != null) {
                z18 = false;
                bVar.a(new tw2.a(0, size), fragment);
            } else {
                z18 = false;
            }
            if (z17) {
                t7(this, size, z18, 2, null);
            } else if (X6 >= size) {
                s7(X6 + 1, true);
            }
        }
        V6();
    }

    public void S6() {
        com.google.android.material.tabs.TabLayout tabLayout = this.f133658g;
        if (tabLayout != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "ajustIndicator:" + tabLayout.getTabCount());
            if (tabLayout.getTabCount() <= 1) {
                return;
            }
            tabLayout.post(new com.tencent.mm.plugin.finder.viewmodel.component.v70(this));
        }
    }

    public void T6() {
        oa.i k17;
        com.google.android.material.tabs.TabLayout tabLayout = this.f133658g;
        if (tabLayout != null) {
            int tabCount = tabLayout.getTabCount();
            android.view.ViewGroup Z6 = Z6();
            if (Z6 != null) {
                boolean z17 = false;
                for (int i17 = 0; i17 < tabCount; i17++) {
                    com.google.android.material.tabs.TabLayout tabLayout2 = this.f133658g;
                    java.lang.Object obj = (tabLayout2 == null || (k17 = tabLayout2.k(i17)) == null) ? null : k17.f343778a;
                    kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
                    int[] b17 = ((zx2.i) obj).b();
                    if (b17[0] > 0 || b17[1] > 0) {
                        v7(Z6, i17, i65.a.b(Z6.getContext(), b17[0]), i65.a.b(Z6.getContext(), b17[1]));
                        z17 = true;
                    }
                }
                if (z17) {
                    Z6.requestLayout();
                }
            }
        }
    }

    public void U6() {
        com.google.android.material.tabs.TabLayout tabLayout = this.f133658g;
        if (tabLayout != null) {
            tabLayout.a(new com.tencent.mm.plugin.finder.viewmodel.component.w70(this, tabLayout));
            int i17 = 0;
            for (java.lang.Object obj : f7()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                zx2.i iVar = (zx2.i) obj;
                iVar.f477040a = i17;
                O6(iVar, -1);
                i17 = i18;
            }
            S6();
        }
    }

    public void V6() {
        if (f7().size() <= 1) {
            com.tencent.mm.view.HardTouchableLayout h17 = c7().h();
            if (h17 == null) {
                return;
            }
            h17.setVisibility(8);
            return;
        }
        com.tencent.mm.view.HardTouchableLayout h18 = c7().h();
        if (h18 == null) {
            return;
        }
        h18.setVisibility(0);
    }

    public abstract com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6();

    public final int X6() {
        androidx.viewpager.widget.ViewPager viewPager = this.f133659h;
        return viewPager != null ? viewPager.getCurrentItem() : this.f133655d;
    }

    public final java.util.List Y6() {
        java.util.List list = this.f133664p;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.o.o("fragments");
        throw null;
    }

    public android.view.ViewGroup Z6() {
        android.view.View childAt;
        com.google.android.material.tabs.TabLayout tabLayout = this.f133658g;
        if (tabLayout == null || (childAt = tabLayout.getChildAt(0)) == null) {
            return null;
        }
        return (android.view.ViewGroup) childAt;
    }

    public int a7() {
        com.google.android.material.tabs.TabLayout tabLayout = this.f133658g;
        return tabLayout != null ? tabLayout.getSelectedTabPosition() : this.f133655d;
    }

    public final zx2.i b7(int i17) {
        java.util.List f76 = f7();
        if (!(i17 >= 0 && i17 < f76.size())) {
            f76 = null;
        }
        if (f76 != null) {
            return (zx2.i) f7().get(i17);
        }
        return null;
    }

    public final zx2.a0 c7() {
        zx2.a0 a0Var = this.f133667s;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.o.o("tabContainer");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider d7() {
        com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider iFinderTabProvider = this.tabProvider;
        if (iFinderTabProvider != null) {
            return iFinderTabProvider;
        }
        kotlin.jvm.internal.o.o("tabProvider");
        throw null;
    }

    public final zx2.z e7() {
        zx2.z zVar = this.f133666r;
        if (zVar != null) {
            return zVar;
        }
        kotlin.jvm.internal.o.o("tabViewAction");
        throw null;
    }

    public final java.util.List f7() {
        java.util.List list = this.f133665q;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.o.o("tabs");
        throw null;
    }

    public void g7() {
    }

    public final com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment getActiveFragment() {
        androidx.viewpager.widget.ViewPager viewPager = this.f133659h;
        int currentItem = viewPager != null ? viewPager.getCurrentItem() : this.f133655d;
        if (currentItem < 0 || currentItem >= Y6().size()) {
            currentItem = 0;
        }
        return (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) Y6().get(currentItem);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        i7();
        return c7().getLayoutId();
    }

    public void h7() {
    }

    public final void i7() {
        if (this.tabProvider != null) {
            return;
        }
        com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6 = W6();
        kotlin.jvm.internal.o.g(W6, "<set-?>");
        this.tabProvider = W6;
        java.util.List fragments = d7().fragments();
        kotlin.jvm.internal.o.g(fragments, "<set-?>");
        this.f133664p = fragments;
        java.util.List tabs = d7().tabs();
        kotlin.jvm.internal.o.g(tabs, "<set-?>");
        this.f133665q = tabs;
        zx2.z tabViewAction = d7().tabViewAction();
        kotlin.jvm.internal.o.g(tabViewAction, "<set-?>");
        this.f133666r = tabViewAction;
        zx2.a0 tabContainer = d7().tabContainer();
        kotlin.jvm.internal.o.g(tabContainer, "<set-?>");
        this.f133667s = tabContainer;
        this.f133657f = d7().isDynamic();
        g7();
    }

    public void k7() {
    }

    public void l7(int i17) {
    }

    public final void m7(int i17, int i18) {
        if (!this.f133657f || !kotlin.jvm.internal.m0.g(f7())) {
            com.tencent.mars.xlog.Log.e("Finder.FinderTabUIC", "removeTabAndFragment param error");
            return;
        }
        if (this.f133657f && i17 >= 0 && i17 < f7().size()) {
            kotlin.jvm.internal.m0.b(f7()).remove(i17);
            q7(i17);
            tw2.b bVar = this.f133661m;
            if (bVar != null) {
                bVar.a(new tw2.a(2, i17), null);
            }
            if (i18 <= -1 || i18 >= f7().size()) {
                int i19 = i17 - 1;
                if (i19 < 0) {
                    i19 = 0;
                }
                t7(this, i19, false, 2, null);
            } else {
                t7(this, i18, false, 2, null);
            }
        }
        V6();
    }

    public final void o7(int i17, int i18) {
        int i19 = -1;
        for (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment : Y6()) {
            if (finderHomeTabFragment.f129265p == i17) {
                i19 = Y6().indexOf(finderHomeTabFragment);
            }
        }
        if (i19 >= 0) {
            m7(i19, i18);
        }
        V6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        i7();
        if (Y6().size() != f7().size()) {
            com.tencent.mars.xlog.Log.e("Finder.FinderTabUIC", "fragments size must not be equal to tabs");
            throw new java.lang.IllegalArgumentException("FinderTabUIC: fragments size must not be equal to tabs");
        }
        zx2.a0 c76 = c7();
        android.view.Window window = getActivity().getWindow();
        kotlin.jvm.internal.o.f(window, "getWindow(...)");
        c76.c(window);
        if (this.tabProvider != null) {
            this.f133658g = c7().g();
            this.f133659h = c7().e();
            this.f133660i = c7().b();
            h7();
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).setTitleBarClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.a80(this), new com.tencent.mm.plugin.finder.viewmodel.component.b80(this));
        android.view.View f17 = c7().f();
        if (f17 != null) {
            f17.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.c80(this));
        }
        this.f133668t = new com.tencent.mm.plugin.finder.viewmodel.component.z70(this, getActivity(), Y6());
        androidx.viewpager.widget.ViewPager viewPager = this.f133659h;
        if (viewPager != null) {
            if (getFragment() != null) {
                androidx.fragment.app.Fragment fragment = getFragment();
                kotlin.jvm.internal.o.d(fragment);
                supportFragmentManager = fragment.getChildFragmentManager();
            } else {
                supportFragmentManager = getActivity().getSupportFragmentManager();
            }
            kotlin.jvm.internal.o.d(supportFragmentManager);
            if (this.f133657f) {
                tw2.b bVar = new tw2.b(viewPager, supportFragmentManager, kotlin.jvm.internal.m0.b(Y6()));
                this.f133661m = bVar;
                viewPager.setAdapter(bVar);
                int size = f7().size() + 3;
                if (size > 5) {
                    size = 5;
                }
                viewPager.setOffscreenPageLimit(size);
            } else {
                viewPager.setAdapter(new tw2.f(supportFragmentManager, Y6(), 0));
                viewPager.setOffscreenPageLimit(f7().size() + 1);
            }
            com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver finderFragmentChangeObserver = this.f133668t;
            if (finderFragmentChangeObserver == null) {
                kotlin.jvm.internal.o.o("fragmentChangeObserver");
                throw null;
            }
            viewPager.addOnPageChangeListener(finderFragmentChangeObserver);
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
        U6();
        com.tencent.mm.view.HardTouchableLayout h17 = c7().h();
        if (h17 != null) {
            h17.setOnDoubleClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.y70(this));
        }
        t7(this, 0, false, 2, null);
        r7();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "onDestroy");
        tw2.b bVar = this.f133661m;
        if (bVar != null) {
            com.tencent.mars.xlog.Log.i("Finder.DynamicAdapter", "removePendingActions");
            ((java.util.ArrayList) bVar.f422460o).clear();
            ((java.util.ArrayList) bVar.f422461p).clear();
        }
    }

    public void q7(int i17) {
        com.google.android.material.tabs.TabLayout tabLayout = this.f133658g;
        if (tabLayout != null) {
            tabLayout.o(i17);
        }
    }

    public final void r7() {
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.viewmodel.component.d80(this));
    }

    public void s7(int i17, boolean z17) {
        oa.i k17;
        com.google.android.material.tabs.TabLayout tabLayout = this.f133658g;
        if (tabLayout != null) {
            if (!(i17 >= 0 && i17 < tabLayout.getTabCount())) {
                tabLayout = null;
            }
            if (tabLayout == null || (k17 = tabLayout.k(i17)) == null) {
                return;
            }
            if (z17 || !k17.a()) {
                com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "selectTab :" + i17);
                k17.b();
            }
            l7(i17);
        }
    }

    public final void u7(int i17) {
        androidx.viewpager.widget.ViewPager viewPager;
        if (i17 > -1 && (viewPager = this.f133659h) != null) {
            viewPager.setCurrentItem(i17, this.f133656e);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "setCurrentPage :" + i17);
    }

    public final void v7(android.view.ViewGroup viewGroup, int i17, int i18, int i19) {
        if (i18 == 0 && i19 == 0) {
            return;
        }
        if (viewGroup != null) {
            if (!(viewGroup.getChildCount() > i17 && i17 >= 0)) {
                viewGroup = null;
            }
            if (viewGroup != null) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                android.view.ViewGroup.LayoutParams layoutParams = childAt != null ? childAt.getLayoutParams() : null;
                if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
                    android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.leftMargin = i18;
                    layoutParams2.rightMargin = i19;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "setMargins : invalidate" + i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderTabUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f133655d = -1;
        this.f133656e = true;
        this.f133663o = new java.util.concurrent.CopyOnWriteArraySet();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f133669u = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127820m5).getValue()).r()).intValue() == 1;
    }
}
