package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dm implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112304d;

    public dm(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        this.f112304d = hmVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        this.f112304d.G1();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f112304d;
        hmVar.f112834u.post(new com.tencent.mm.plugin.finder.live.plugin.cm(hmVar, i17));
    }
}
