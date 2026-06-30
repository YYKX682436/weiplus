package jn2;

/* loaded from: classes5.dex */
public final class i implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.j f300628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f300629e;

    public i(jn2.j jVar, java.util.LinkedList linkedList) {
        this.f300628d = jVar;
        this.f300629e = linkedList;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        this.f300628d.h0(i17, this.f300629e, 0, null);
    }
}
