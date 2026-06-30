package dr2;

/* loaded from: classes2.dex */
public abstract class b implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f242585d;

    /* renamed from: e, reason: collision with root package name */
    public int f242586e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f242587f;

    public b(com.tencent.mm.ui.MMActivity activity, java.util.List fragments) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(fragments, "fragments");
        this.f242585d = fragments;
        this.f242586e = -1;
        this.f242587f = "";
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver.TAG, "onPageScrollStateChanged position:" + i17);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        int i18 = this.f242586e;
        java.util.List list = this.f242585d;
        if (i18 != i17) {
            int i19 = 0;
            com.tencent.mm.plugin.finder.nearby.ui.special.fragment.LiveThemeTagFragment liveThemeTagFragment = null;
            for (java.lang.Object obj : list) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.finder.nearby.ui.special.fragment.LiveThemeTagFragment liveThemeTagFragment2 = (com.tencent.mm.plugin.finder.nearby.ui.special.fragment.LiveThemeTagFragment) obj;
                if (i17 == i19) {
                    liveThemeTagFragment = liveThemeTagFragment2;
                } else if (this.f242586e == i19) {
                    liveThemeTagFragment2.p0();
                }
                i19 = i27;
            }
            int i28 = this.f242586e;
            java.lang.String fromThemeTag = this.f242587f;
            java.lang.String toThemeTag = ((com.tencent.mm.plugin.finder.nearby.ui.special.fragment.LiveThemeTagFragment) list.get(i17)).f122114n.f256010c;
            kotlin.jvm.internal.o.g(fromThemeTag, "fromThemeTag");
            kotlin.jvm.internal.o.g(toThemeTag, "toThemeTag");
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver.TAG, "onFragmentChange fromPos:" + i28 + " to:" + i17 + " fromThemeTag: " + fromThemeTag + " toThemeTag: " + toThemeTag);
            gr2.p0 p0Var = ((gr2.n0) this).f274797g;
            p0Var.getClass();
            com.tencent.mm.autogen.events.LiveThemeTagChangeEvent liveThemeTagChangeEvent = new com.tencent.mm.autogen.events.LiveThemeTagChangeEvent();
            am.bj bjVar = liveThemeTagChangeEvent.f54478g;
            bjVar.f6258b = i17;
            bjVar.f6257a = 2;
            liveThemeTagChangeEvent.e();
            p0Var.f274812h = i17;
            com.tencent.mars.xlog.Log.i("Finder.ThemeLivingViewPagerConvert", "onSelectThemeTag pos: " + i17);
            if (liveThemeTagFragment != null) {
                liveThemeTagFragment.o0();
            }
        }
        this.f242586e = i17;
        this.f242587f = ((com.tencent.mm.plugin.finder.nearby.ui.special.fragment.LiveThemeTagFragment) list.get(i17)).f122114n.f256010c;
    }
}
