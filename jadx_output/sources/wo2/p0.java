package wo2;

/* loaded from: classes2.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC f448113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f448114e;

    public p0(com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC nearbyHomeUIC, int i17) {
        this.f448113d = nearbyHomeUIC;
        this.f448114e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oa.i k17;
        com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC nearbyHomeUIC = this.f448113d;
        androidx.appcompat.app.AppCompatActivity activity = nearbyHomeUIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(wo2.m0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        int i17 = this.f448114e;
        int P6 = nearbyHomeUIC.P6(i17);
        com.google.android.material.tabs.TabLayout R6 = ((wo2.m0) a17).R6();
        if (R6 != null && (k17 = R6.k(P6)) != null && !k17.a()) {
            k17.b();
        }
        nearbyHomeUIC.f121455i.onPageSelected(nearbyHomeUIC.P6(i17));
    }
}
