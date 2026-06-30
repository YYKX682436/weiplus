package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Lcom/tencent/mm/plugin/finder/view/ka;", "Lcom/tencent/mm/ui/MMActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Lcom/tencent/mm/ui/MMActivity;", "getActivity", "()Lcom/tencent/mm/ui/MMActivity;", "", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "fragments", "Ljava/util/List;", "", "lastIndex", "I", "lastType", "Companion", "com/tencent/mm/plugin/finder/view/la", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class FinderFragmentChangeObserver implements androidx.viewpager.widget.ViewPager.OnPageChangeListener, com.tencent.mm.plugin.finder.view.ka {
    public static final com.tencent.mm.plugin.finder.view.la Companion = new com.tencent.mm.plugin.finder.view.la(null);
    public static final java.lang.String TAG = "Finder.FragmentChangeObserver";
    private final com.tencent.mm.ui.MMActivity activity;
    private final java.util.List<com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> fragments;
    private int lastIndex;
    private int lastType;

    public FinderFragmentChangeObserver(com.tencent.mm.ui.MMActivity activity, java.util.List fragments) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(fragments, "fragments");
        this.activity = activity;
        this.fragments = fragments;
        this.lastIndex = -1;
        this.lastType = -1;
    }

    public final void a() {
        int i17 = 0;
        for (java.lang.Object obj : this.fragments) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj;
            if (this.lastIndex == i17) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).w8(finderHomeTabFragment);
                finderHomeTabFragment.p0();
                z(false, i17, finderHomeTabFragment);
                ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).a7(com.tencent.mm.plugin.finder.view.ma.f132636d);
            }
            i17 = i18;
        }
    }

    public final void b() {
        int i17 = this.lastIndex;
        l(i17, i17, this.lastType, this.fragments.get(i17).f129265p);
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) kz5.n0.a0(this.fragments, this.lastIndex);
        if (finderHomeTabFragment != null) {
            androidx.fragment.app.FragmentActivity activity = finderHomeTabFragment.getActivity();
            if (activity != null) {
                if (this.lastIndex == -1) {
                    android.app.Activity Ui = ((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui();
                    if (Ui == null) {
                        Ui = finderHomeTabFragment.getActivity();
                    }
                    if (kotlin.jvm.internal.o.b(activity, Ui)) {
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).D2(finderHomeTabFragment);
                    }
                } else {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).D2(finderHomeTabFragment);
                }
            }
            finderHomeTabFragment.o0();
            z(true, this.lastIndex, finderHomeTabFragment);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        if (i17 >= 0 && i17 < this.fragments.size()) {
            com.tencent.mm.ui.MMActivity mMActivity = this.activity;
            com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI = mMActivity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) mMActivity : null;
            boolean c76 = finderProfileUI != null ? finderProfileUI.c7() : false;
            java.lang.String name = this.fragments.get(i17).getClass().getName();
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            java.lang.String str = (java.lang.String) ml2.j0.f327583i.H.get(name);
            if (!c76 && str != null) {
                p52.h.f352023h = name;
            }
        }
        int i18 = this.lastIndex;
        if (i18 != i17) {
            G3(i18, i17, this.lastType, this.fragments.get(i17).f129265p);
            int i19 = 0;
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = null;
            for (java.lang.Object obj : this.fragments) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment2 = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj;
                if (i17 == i19) {
                    finderHomeTabFragment = finderHomeTabFragment2;
                } else if (this.lastIndex == i19) {
                    finderHomeTabFragment2.p0();
                    z(false, i19, finderHomeTabFragment2);
                }
                if (i17 != i19) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).w8(finderHomeTabFragment2);
                }
                i19 = i27;
            }
            l(this.lastIndex, i17, this.lastType, this.fragments.get(i17).f129265p);
            if (finderHomeTabFragment != null) {
                androidx.fragment.app.FragmentActivity activity = finderHomeTabFragment.getActivity();
                if (activity != null) {
                    if (this.lastIndex == -1) {
                        android.app.Activity Ui = ((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui();
                        if (Ui == null) {
                            Ui = finderHomeTabFragment.getActivity();
                        }
                        if (kotlin.jvm.internal.o.b(activity, Ui)) {
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).D2(finderHomeTabFragment);
                        }
                    } else {
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).D2(finderHomeTabFragment);
                    }
                }
                finderHomeTabFragment.o0();
                z(true, i17, finderHomeTabFragment);
            }
        }
        this.lastIndex = i17;
        this.lastType = this.fragments.get(i17).f129265p;
    }
}
