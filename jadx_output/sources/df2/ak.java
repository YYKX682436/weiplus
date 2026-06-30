package df2;

/* loaded from: classes3.dex */
public final class ak implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f229727d;

    public ak(df2.pk pkVar) {
        this.f229727d = pkVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        df2.pk pkVar = this.f229727d;
        com.tencent.mars.xlog.Log.i(pkVar.f231073m, "onPageSelected position:" + i17);
        com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveCustomGiftTagView finderLiveCustomGiftTagView = pkVar.f231084x;
        if (finderLiveCustomGiftTagView != null) {
            finderLiveCustomGiftTagView.post(new df2.zj(pkVar, i17));
        }
    }
}
