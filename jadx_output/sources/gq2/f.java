package gq2;

/* loaded from: classes2.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq2.j f274556d;

    public f(gq2.j jVar) {
        this.f274556d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gq2.j jVar = this.f274556d;
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = jVar.f274565h;
        if (finderViewPager != null && finderViewPager.isAttachedToWindow()) {
            com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager2 = jVar.f274565h;
            if (finderViewPager2 != null && finderViewPager2.getOffscreenPageLimit() == 2) {
                com.tencent.mars.xlog.Log.i("LiveTabViewPagerConvert", "onBindViewHolder: view pager post delay set page cache");
                com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager3 = jVar.f274565h;
                if (finderViewPager3 == null) {
                    return;
                }
                finderViewPager3.setOffscreenPageLimit(jVar.f274568n.size());
            }
        }
    }
}
