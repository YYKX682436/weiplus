package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ol extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC f135478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC) {
        super(0);
        this.f135478d = finderHomeUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f135478d.findViewById(com.tencent.mm.R.id.m7j);
        int i17 = com.tencent.mm.R.id.g3y;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.g3y);
        if (frameLayout != null) {
            i17 = com.tencent.mm.R.id.gd9;
            androidx.fragment.app.FragmentContainerView fragmentContainerView = (androidx.fragment.app.FragmentContainerView) x4.b.a(findViewById, com.tencent.mm.R.id.gd9);
            if (fragmentContainerView != null) {
                i17 = com.tencent.mm.R.id.u2u;
                com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView finderPagerView = (com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView) x4.b.a(findViewById, com.tencent.mm.R.id.u2u);
                if (finderPagerView != null) {
                    i17 = com.tencent.mm.R.id.l8l;
                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.l8l);
                    if (frameLayout2 != null) {
                        android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) findViewById;
                        i17 = com.tencent.mm.R.id.f487303o82;
                        android.widget.FrameLayout frameLayout4 = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f487303o82);
                        if (frameLayout4 != null) {
                            i17 = com.tencent.mm.R.id.f487570p16;
                            com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = (com.tencent.mm.plugin.finder.view.FinderViewPager) x4.b.a(findViewById, com.tencent.mm.R.id.f487570p16);
                            if (finderViewPager != null) {
                                i17 = com.tencent.mm.R.id.pmj;
                                android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.pmj);
                                if (textView != null) {
                                    return new vb2.o(frameLayout3, frameLayout, fragmentContainerView, finderPagerView, frameLayout2, frameLayout3, frameLayout4, finderViewPager, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
