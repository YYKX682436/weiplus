package mq2;

/* loaded from: classes2.dex */
public final class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC f330754d;

    public k(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f330754d = nearbyPersonV1UIC;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        rq2.u.f398889a.b(4L);
        gm0.j1.u().c().w(4104, java.lang.Boolean.TRUE);
        androidx.appcompat.app.AppCompatActivity activity = this.f330754d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC nearbyHomeUIC = (com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC.class);
        nearbyHomeUIC.getClass();
        if (c92.g.f39738a.b()) {
            nearbyHomeUIC.R6(1006);
        } else {
            nearbyHomeUIC.R6(1001);
        }
    }
}
