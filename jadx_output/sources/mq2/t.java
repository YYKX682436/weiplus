package mq2;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC f330763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC) {
        super(0);
        this.f330763d = nearbyPersonV1UIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC = this.f330763d;
        androidx.appcompat.app.AppCompatActivity activity = nearbyPersonV1UIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC nearbyHomeUIC = (com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC.class);
        nearbyHomeUIC.getClass();
        if (c92.g.f39738a.b()) {
            nearbyHomeUIC.R6(1006);
        } else {
            nearbyHomeUIC.R6(1001);
        }
        nearbyPersonV1UIC.B = false;
        return jz5.f0.f302826a;
    }
}
