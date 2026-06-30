package dv2;

/* loaded from: classes2.dex */
public final class s1 extends zx2.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        return new dv2.p1(this);
    }

    @Override // zx2.h, com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        androidx.viewpager.widget.ViewPager viewPager = this.f133659h;
        if (viewPager instanceof com.tencent.mm.plugin.finder.view.FinderViewPager) {
            ((com.tencent.mm.plugin.finder.view.FinderViewPager) viewPager).setEnableViewPagerScroll(true);
        }
        if (Y6().size() <= 1) {
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477039v;
            if (finderTabLayout != null) {
                finderTabLayout.setSelectedTabIndicatorColor(getColor(com.tencent.mm.R.color.a9e));
            }
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout2 = this.f477039v;
            if (finderTabLayout2 != null) {
                finderTabLayout2.setSelectedTabIndicatorHeight(0);
            }
        }
        this.f133656e = false;
    }
}
