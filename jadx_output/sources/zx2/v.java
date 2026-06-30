package zx2;

/* loaded from: classes2.dex */
public class v implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f477089d;

    /* renamed from: e, reason: collision with root package name */
    public int f477090e;

    /* renamed from: f, reason: collision with root package name */
    public int f477091f;

    public v(com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout) {
        this.f477089d = new java.lang.ref.WeakReference(finderTabLayout);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        this.f477090e = this.f477091f;
        this.f477091f = i17;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = (com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout) this.f477089d.get();
        if (finderTabLayout != null) {
            int i19 = this.f477091f;
            finderTabLayout.o(i17, f17, i19 != 2 || this.f477090e == 1, (i19 == 2 && this.f477090e == 0) ? false : true);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = (com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout) this.f477089d.get();
        if (finderTabLayout == null || finderTabLayout.getSelectedTabPosition() == i17 || i17 >= finderTabLayout.getTabCount()) {
            return;
        }
        int i18 = this.f477091f;
        finderTabLayout.m(finderTabLayout.i(i17), i18 == 0 || (i18 == 2 && this.f477090e == 0));
    }
}
