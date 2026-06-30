package kp2;

/* loaded from: classes2.dex */
public final class c extends zo2.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC f310958g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC nearbyLiveSquareUIC, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.util.LinkedList linkedList) {
        super((com.tencent.mm.ui.MMActivity) appCompatActivity, linkedList);
        this.f310958g = nearbyLiveSquareUIC;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
    }

    @Override // zo2.a
    public void a(boolean z17, int i17, com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // zo2.a
    public void l(int i17, int i18, int i19, int i27) {
        oa.i k17;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver.TAG, "onFragmentChange from:" + i17 + " to:" + i18);
        com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC nearbyLiveSquareUIC = this.f310958g;
        if (i17 != -1 && i17 != i18) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver.TAG, "onFragmentChange hit onPageScrolled scroll change.");
            androidx.fragment.app.Fragment fragment = nearbyLiveSquareUIC.getFragment();
            kotlin.jvm.internal.o.d(fragment);
            ((op2.a) pf5.z.f353948a.b(fragment).a(op2.a.class)).f347237d.e();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEVER_SCROLL_IN_LIVE_SQUARE_CNT_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            ip2.a.f293619h = 3;
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).xj(null, ml2.x1.f328202f, "94", ml2.y.f328240e, i19, i27);
        nearbyLiveSquareUIC.f121500n = i18;
        androidx.fragment.app.Fragment fragment2 = nearbyLiveSquareUIC.getFragment();
        kotlin.jvm.internal.o.d(fragment2);
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(fragment2).a(qp2.y.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.google.android.material.tabs.TabLayout R6 = ((qp2.y) a17).R6();
        if (R6 == null || (k17 = R6.k(i18)) == null || k17.a()) {
            return;
        }
        k17.b();
    }

    @Override // zo2.b, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }
}
