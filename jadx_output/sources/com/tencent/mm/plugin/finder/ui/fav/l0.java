package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class l0 extends zx2.l {
    @Override // zx2.l, zx2.a0
    public void c(android.view.Window window) {
        com.google.android.material.tabs.TabLayout tabLayout;
        androidx.viewpager.widget.ViewPager viewPager;
        com.tencent.mm.view.HardTouchableLayout hardTouchableLayout;
        kotlin.jvm.internal.o.g(window, "window");
        android.view.View findViewById = window.findViewById(com.tencent.mm.R.id.ugu);
        com.tencent.mm.view.HardTouchableLayout hardTouchableLayout2 = null;
        if (findViewById == null || (tabLayout = (com.google.android.material.tabs.TabLayout) findViewById.findViewById(com.tencent.mm.R.id.ugw)) == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderTabUIC", "alignTabLayout is null!");
            tabLayout = null;
        }
        this.f477053a = tabLayout;
        if (findViewById == null || (viewPager = (androidx.viewpager.widget.ViewPager) findViewById.findViewById(com.tencent.mm.R.id.ugx)) == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderTabUIC", "fragmentViewPager is null!");
            viewPager = null;
        }
        this.f477055c = viewPager;
        if (findViewById == null || (hardTouchableLayout = (com.tencent.mm.view.HardTouchableLayout) findViewById.findViewById(com.tencent.mm.R.id.ugv)) == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderTabUIC", "layoutContainer is null!");
        } else {
            hardTouchableLayout2 = hardTouchableLayout;
        }
        this.f477054b = hardTouchableLayout2;
    }

    @Override // zx2.a0
    public int d() {
        return com.tencent.mm.R.id.ugu;
    }

    @Override // zx2.l, zx2.a0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ecm;
    }
}
