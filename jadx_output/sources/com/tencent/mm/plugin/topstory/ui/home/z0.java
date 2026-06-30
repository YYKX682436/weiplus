package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class z0 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175120d;

    public z0(com.tencent.mm.plugin.topstory.ui.home.j jVar) {
        this.f175120d = jVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPageScrollStateChanged:");
        sb6.append(i17);
        sb6.append(", canHideFakeIv:");
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175120d;
        sb6.append(jVar.V);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", sb6.toString());
        if (i17 == 0) {
            if (!jVar.V) {
                jVar.V = true;
            } else {
                jVar.f175012z.postDelayed(new com.tencent.mm.plugin.topstory.ui.home.y0(this, jVar.I), 100L);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onPageSelected:" + i17);
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175120d;
        com.tencent.mm.plugin.topstory.ui.widget.TopStoryViewPager topStoryViewPager = jVar.f175012z;
        ((wm4.y) ((java.util.ArrayList) jVar.f174999q).get(i17)).getClass();
        topStoryViewPager.setUseCustomScrollIntercept(true);
        jVar.e(i17, true);
        if (jVar.G.k(i17).a()) {
            return;
        }
        jVar.G.k(i17).b();
    }
}
