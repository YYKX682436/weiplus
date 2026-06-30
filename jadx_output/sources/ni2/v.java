package ni2;

/* loaded from: classes3.dex */
public final class v implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.w f337483d;

    public v(ni2.w wVar) {
        this.f337483d = wVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.view.recyclerview.WxRecyclerView contributorRv;
        ni2.w wVar = this.f337483d;
        androidx.viewpager.widget.ViewPager viewPager = wVar.f337490n;
        if (viewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        int currentItem = viewPager.getCurrentItem();
        androidx.viewpager.widget.ViewPager viewPager2 = wVar.f337490n;
        if (viewPager2 == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        int childCount = viewPager2.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            androidx.viewpager.widget.ViewPager viewPager3 = wVar.f337490n;
            if (viewPager3 == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            android.view.View childAt = viewPager3.getChildAt(i18);
            com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView finderLiveMicGiftMemberPanelTabView = childAt instanceof com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView ? (com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView) childAt : null;
            if (finderLiveMicGiftMemberPanelTabView != null && (contributorRv = finderLiveMicGiftMemberPanelTabView.getContributorRv()) != null) {
                int i19 = i18 == currentItem ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(contributorRv, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelWidget", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                contributorRv.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(contributorRv, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelWidget", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                contributorRv.setNestedScrollingEnabled(i18 == currentItem);
            }
            i18++;
        }
    }
}
