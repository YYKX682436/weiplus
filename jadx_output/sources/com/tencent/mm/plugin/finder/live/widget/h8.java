package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class h8 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.i8 f118552d;

    public h8(com.tencent.mm.plugin.finder.live.widget.i8 i8Var) {
        this.f118552d = i8Var;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.plugin.finder.live.widget.i8 i8Var = this.f118552d;
        i8Var.T = i17;
        i8Var.f0();
        i8Var.i0(i17);
    }
}
