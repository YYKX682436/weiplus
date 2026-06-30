package kp2;

/* loaded from: classes2.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC f310957d;

    public b(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC nearbyLiveSquareUIC, androidx.viewpager.widget.ViewPager viewPager) {
        this.f310957d = nearbyLiveSquareUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oa.i k17;
        com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC nearbyLiveSquareUIC = this.f310957d;
        androidx.fragment.app.Fragment fragment = nearbyLiveSquareUIC.getFragment();
        kotlin.jvm.internal.o.d(fragment);
        if (fragment.getView() == null) {
            com.tencent.mars.xlog.Log.i("NearbyLiveSquareUIC", "addFragments after post view is null");
            return;
        }
        androidx.fragment.app.Fragment fragment2 = nearbyLiveSquareUIC.getFragment();
        kotlin.jvm.internal.o.d(fragment2);
        if (fragment2.isDetached()) {
            com.tencent.mars.xlog.Log.i("NearbyLiveSquareUIC", "addFragments after fragment detached");
            return;
        }
        r45.dd2 dd2Var = nearbyLiveSquareUIC.f121497h;
        kp2.c cVar = nearbyLiveSquareUIC.f121504r;
        jz5.f0 f0Var = null;
        if (dd2Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addFragments go to target page:targetTabInfo=");
            r45.dd2 dd2Var2 = nearbyLiveSquareUIC.f121497h;
            sb6.append(dd2Var2 != null ? java.lang.Integer.valueOf(dd2Var2.getInteger(0)) : null);
            sb6.append('-');
            r45.dd2 dd2Var3 = nearbyLiveSquareUIC.f121497h;
            sb6.append(dd2Var3 != null ? dd2Var3.getString(1) : null);
            com.tencent.mars.xlog.Log.i("NearbyLiveSquareUIC", sb6.toString());
            nearbyLiveSquareUIC.S6(dd2Var.getInteger(0));
            cVar.onPageSelected(nearbyLiveSquareUIC.R6(dd2Var.getInteger(0)));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            androidx.fragment.app.Fragment fragment3 = nearbyLiveSquareUIC.getFragment();
            kotlin.jvm.internal.o.d(fragment3);
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(fragment3).a(qp2.y.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.google.android.material.tabs.TabLayout R6 = ((qp2.y) a17).R6();
            if (R6 != null && (k17 = R6.k(0)) != null && !k17.a()) {
                k17.b();
            }
            cVar.onPageSelected(0);
        }
    }
}
