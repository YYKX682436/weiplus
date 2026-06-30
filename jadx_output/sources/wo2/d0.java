package wo2;

/* loaded from: classes2.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f448069d;

    public d0(wo2.m0 m0Var) {
        this.f448069d = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.app.AppCompatActivity activity = this.f448069d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment O6 = ((com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC.class)).O6();
        if (O6 != null) {
            O6.A0();
        }
    }
}
