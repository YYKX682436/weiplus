package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class ei implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingsUI f129108d;

    public ei(com.tencent.mm.plugin.finder.ui.FinderSettingsUI finderSettingsUI) {
        this.f129108d = finderSettingsUI;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.plugin.finder.ui.FinderSettingsUI finderSettingsUI = this.f129108d;
        finderSettingsUI.e = i17;
        oa.i k17 = finderSettingsUI.U6().f434629b.k(i17);
        if (k17 != null) {
            k17.b();
        }
        ((com.tencent.mm.plugin.finder.ui.SettingFragment) finderSettingsUI.f.get(i17)).A0();
    }
}
