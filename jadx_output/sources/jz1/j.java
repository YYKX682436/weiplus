package jz1;

/* loaded from: classes5.dex */
public class j implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public long f302695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz1.e f302696e;

    public j(jz1.e eVar) {
        this.f302696e = eVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f302696e.Vi(1, 251L);
        if (currentTimeMillis - this.f302695d >= 251) {
            this.f302695d = currentTimeMillis;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
    }
}
