package db5;

/* loaded from: classes15.dex */
public class u7 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMViewPager f228528d;

    public u7(com.tencent.mm.ui.base.MMViewPager mMViewPager) {
        this.f228528d = mMViewPager;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.f228528d;
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = mMViewPager.M;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i17);
        }
        if (i17 == 0) {
            mMViewPager.P = 0.0f;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        int i19;
        db5.f0 f0Var;
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.f228528d;
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = mMViewPager.M;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i17, f17, i18);
        }
        mMViewPager.P = f17;
        if (i18 != 0 || (i19 = mMViewPager.f197611g) == -1) {
            return;
        }
        db5.p8 p8Var = (db5.p8) mMViewPager.getAdapter();
        if (p8Var == null || ((f0Var = p8Var.c(i19, true)) == null && (f0Var = p8Var.f(i19, true)) == null)) {
            f0Var = null;
        }
        if (f0Var != null) {
            f0Var.i();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.f228528d;
        mMViewPager.f197611g = mMViewPager.f197610f;
        mMViewPager.f197610f = i17;
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = mMViewPager.M;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i17);
        }
        db5.f0 selectedImageView = mMViewPager.getSelectedImageView();
        if (selectedImageView != null && (selectedImageView instanceof com.tencent.mm.ui.base.WxImageView)) {
            mMViewPager.p();
        } else {
            mMViewPager.f197609e = null;
        }
    }
}
