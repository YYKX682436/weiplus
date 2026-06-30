package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class xl implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView f120357d;

    public xl(com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView) {
        this.f120357d = finderLiveInfiniteLoopView;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView = this.f120357d;
        if (i17 == 1 || i17 == 2) {
            finderLiveInfiniteLoopView.h();
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager = finderLiveInfiniteLoopView.f117643f;
        if (finderLiveViewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        int currentItem = finderLiveViewPager.getCurrentItem();
        if (finderLiveInfiniteLoopView.e()) {
            if (currentItem == finderLiveInfiniteLoopView.f117649o.size() - 1) {
                finderLiveInfiniteLoopView.f117645h.post(new com.tencent.mm.plugin.finder.live.widget.ul(finderLiveInfiniteLoopView));
            } else if (currentItem == 0) {
                finderLiveInfiniteLoopView.f117646i.post(new com.tencent.mm.plugin.finder.live.widget.vl(finderLiveInfiniteLoopView));
            }
        }
        finderLiveInfiniteLoopView.g();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f120357d.f117641d, "[onPageScrolled] position:" + i17 + ", positionOffset:" + f17 + ", positionOffsetPixels:" + i18 + ", ");
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView = this.f120357d;
        java.util.Iterator it = finderLiveInfiniteLoopView.f117649o.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (i17 == finderLiveInfiniteLoopView.f117649o.size() - 2) {
                    com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView.b(finderLiveInfiniteLoopView);
                    return;
                } else {
                    if (i17 == 1) {
                        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView.a(finderLiveInfiniteLoopView);
                        return;
                    }
                    return;
                }
            }
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.KeyEvent.Callback callback = (android.view.View) next;
            com.tencent.mm.plugin.finder.live.widget.yl ylVar = callback instanceof com.tencent.mm.plugin.finder.live.widget.yl ? (com.tencent.mm.plugin.finder.live.widget.yl) callback : null;
            if (ylVar != null) {
                ylVar.j(i18 == i17);
            }
            i18 = i19;
        }
    }
}
