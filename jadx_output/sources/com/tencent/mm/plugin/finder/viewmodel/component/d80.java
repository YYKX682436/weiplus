package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class d80 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC f134091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d80(com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC) {
        super(0);
        this.f134091d = finderTabUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC = this.f134091d;
        androidx.viewpager.widget.ViewPager viewPager = finderTabUIC.f133659h;
        if ((viewPager != null && viewPager.getCurrentItem() == 0) && (!finderTabUIC.f7().isEmpty())) {
            com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver finderFragmentChangeObserver = finderTabUIC.f133668t;
            if (finderFragmentChangeObserver == null) {
                kotlin.jvm.internal.o.o("fragmentChangeObserver");
                throw null;
            }
            finderFragmentChangeObserver.onPageSelected(0);
        }
        return jz5.f0.f302826a;
    }
}
