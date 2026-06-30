package fe2;

/* loaded from: classes3.dex */
public final class p implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe2.q f261524d;

    public p(fe2.q qVar) {
        this.f261524d = qVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "onPageSelected: " + i17 + " positionOffset: " + f17);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "onPageSelected: " + i17);
        fe2.q qVar = this.f261524d;
        java.lang.Object obj = qVar.f261531v.f280898e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        ee2.a aVar = (ee2.a) obj;
        if (aVar.f251583g instanceof com.tencent.mm.plugin.finder.live.plugin.vk0) {
            qVar.D1();
        } else {
            qVar.v1(aVar.f251580d);
        }
        int i18 = 0;
        for (java.lang.Object obj2 : qVar.f261531v.f280898e) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((ee2.a) obj2).j(i18 == i17);
            i18 = i19;
        }
    }
}
