package fn2;

/* loaded from: classes5.dex */
public final class a0 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.b0 f264206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f264207e;

    public a0(fn2.b0 b0Var, java.util.LinkedList linkedList) {
        this.f264206d = b0Var;
        this.f264207e = linkedList;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        this.f264206d.e(i17, this.f264207e, 0, null);
    }
}
