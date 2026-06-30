package zx2;

/* loaded from: classes15.dex */
public class n implements androidx.viewpager.widget.l {

    /* renamed from: d, reason: collision with root package name */
    public boolean f477060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout f477061e;

    public n(com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout) {
        this.f477061e = finderTabLayout;
    }

    @Override // androidx.viewpager.widget.l
    public void a(androidx.viewpager.widget.ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477061e;
        if (finderTabLayout.N == viewPager) {
            finderTabLayout.n(aVar2, this.f477060d);
        }
    }
}
