package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class e80 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC f134216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f134217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f134218f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e80(com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC, int i17, boolean z17) {
        super(0);
        this.f134216d = finderTabUIC;
        this.f134217e = i17;
        this.f134218f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC = this.f134216d;
        androidx.viewpager.widget.ViewPager viewPager = finderTabUIC.f133659h;
        int i17 = this.f134217e;
        if (!(viewPager != null && viewPager.getCurrentItem() == i17) && finderTabUIC.f7().size() > i17) {
            finderTabUIC.f133656e = this.f134218f;
            com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver finderFragmentChangeObserver = finderTabUIC.f133668t;
            if (finderFragmentChangeObserver == null) {
                kotlin.jvm.internal.o.o("fragmentChangeObserver");
                throw null;
            }
            finderFragmentChangeObserver.onPageSelected(i17);
            finderTabUIC.f133656e = true;
        }
        return jz5.f0.f302826a;
    }
}
