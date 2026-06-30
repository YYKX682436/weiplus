package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class zi implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveWrapContentViewPager f120576d;

    public zi(com.tencent.mm.plugin.finder.live.view.FinderLiveWrapContentViewPager finderLiveWrapContentViewPager) {
        this.f120576d = finderLiveWrapContentViewPager;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        this.f120576d.reMeasureCurrentPage(i17);
    }
}
