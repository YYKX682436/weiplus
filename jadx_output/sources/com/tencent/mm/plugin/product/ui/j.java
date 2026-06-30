package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class j implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallGalleryUI f153306d;

    public j(com.tencent.mm.plugin.product.ui.MallGalleryUI mallGalleryUI) {
        this.f153306d = mallGalleryUI;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public synchronized void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.plugin.product.ui.MallGalleryUI mallGalleryUI = this.f153306d;
        mallGalleryUI.f153196h = i17;
        if (mallGalleryUI.f153197i) {
            mallGalleryUI.hideTitleView();
            mallGalleryUI.f153197i = false;
        }
    }
}
