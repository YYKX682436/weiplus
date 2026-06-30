package xc5;

/* loaded from: classes12.dex */
public final class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.z1 f453598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f453599e;

    public y1(xc5.z1 z1Var, int i17) {
        this.f453598d = z1Var;
        this.f453599e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc5.z1 z1Var = this.f453598d;
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = z1Var.f318310d;
        super/*lf3.c0*/.onPageSelected(viewPager2 != null ? viewPager2.getCurrentItem() : this.f453599e);
    }
}
