package oa;

/* loaded from: classes15.dex */
public class j implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f343786d;

    /* renamed from: e, reason: collision with root package name */
    public int f343787e;

    /* renamed from: f, reason: collision with root package name */
    public int f343788f;

    public j(com.google.android.material.tabs.TabLayout tabLayout) {
        this.f343786d = new java.lang.ref.WeakReference(tabLayout);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        this.f343787e = this.f343788f;
        this.f343788f = i17;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) this.f343786d.get();
        if (tabLayout != null) {
            int i19 = this.f343788f;
            tabLayout.s(i17, f17, i19 != 2 || this.f343787e == 1, (i19 == 2 && this.f343787e == 0) ? false : true);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) this.f343786d.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i17 || i17 >= tabLayout.getTabCount()) {
            return;
        }
        int i18 = this.f343788f;
        tabLayout.q(tabLayout.k(i17), i18 == 0 || (i18 == 2 && this.f343787e == 0));
    }
}
