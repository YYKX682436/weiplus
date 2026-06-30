package wo2;

/* loaded from: classes2.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f448134d;

    public z(wo2.m0 m0Var) {
        this.f448134d = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.app.AppCompatActivity activity = this.f448134d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment O6 = ((com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC.class)).O6();
        if (O6 != null) {
            O6.y0();
        }
    }
}
