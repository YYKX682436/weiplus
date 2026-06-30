package oa;

/* loaded from: classes15.dex */
public class b implements androidx.viewpager.widget.l {

    /* renamed from: d, reason: collision with root package name */
    public boolean f343759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.tabs.TabLayout f343760e;

    public b(com.google.android.material.tabs.TabLayout tabLayout) {
        this.f343760e = tabLayout;
    }

    @Override // androidx.viewpager.widget.l
    public void a(androidx.viewpager.widget.ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
        com.google.android.material.tabs.TabLayout tabLayout = this.f343760e;
        if (tabLayout.N == viewPager) {
            tabLayout.r(aVar2, this.f343759d);
        }
    }
}
