package dv2;

/* loaded from: classes2.dex */
public final class o implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.v f243912d;

    public o(dv2.v vVar) {
        this.f243912d = vVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        dv2.i iVar = dv2.i.f243866f;
        if (i17 != 1) {
            iVar = dv2.i.f243865e;
        }
        com.tencent.mars.xlog.Log.i("Finder.FollowAggregationTabUIC", "onPageSelected: position=" + i17 + " -> " + iVar);
        ((kotlinx.coroutines.flow.h3) this.f243912d.f243959w).k(iVar);
    }
}
