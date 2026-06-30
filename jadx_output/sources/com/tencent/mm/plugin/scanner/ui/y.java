package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class y implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI f159817d;

    public y(com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI productFurtherInfoUI) {
        this.f159817d = productFurtherInfoUI;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI productFurtherInfoUI = this.f159817d;
        if (productFurtherInfoUI.f159300f.getParent() != null) {
            productFurtherInfoUI.f159300f.getParent().requestDisallowInterceptTouchEvent(true);
        }
        productFurtherInfoUI.f159299e.setPage(i17);
    }
}
