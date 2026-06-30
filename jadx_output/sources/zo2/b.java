package zo2;

/* loaded from: classes2.dex */
public abstract class b implements androidx.viewpager.widget.ViewPager.OnPageChangeListener, zo2.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f474844d;

    /* renamed from: e, reason: collision with root package name */
    public int f474845e;

    /* renamed from: f, reason: collision with root package name */
    public int f474846f;

    public b(com.tencent.mm.ui.MMActivity activity, java.util.List fragments) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(fragments, "fragments");
        this.f474844d = fragments;
        this.f474845e = -1;
        this.f474846f = -1;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver.TAG, "onPageScrollStateChanged position:" + i17);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        int i18 = this.f474845e;
        java.util.List list = this.f474844d;
        if (i18 != i17) {
            int i19 = 0;
            com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment = null;
            for (java.lang.Object obj : list) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment2 = (com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment) obj;
                if (i17 == i19) {
                    absNearByFragment = absNearByFragment2;
                } else if (this.f474845e == i19) {
                    absNearByFragment2.p0();
                    a(false, i19, absNearByFragment2);
                }
                i19 = i27;
            }
            l(this.f474845e, i17, this.f474846f, ((com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment) list.get(i17)).f121460p);
            if (absNearByFragment != null) {
                absNearByFragment.o0();
                a(true, i17, absNearByFragment);
            }
        }
        this.f474845e = i17;
        this.f474846f = ((com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment) list.get(i17)).f121460p;
    }
}
