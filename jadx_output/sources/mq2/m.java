package mq2;

/* loaded from: classes15.dex */
public final class m implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC f330756a;

    public m(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f330756a = nearbyPersonV1UIC;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC = this.f330756a;
        if (booleanValue) {
            nearbyPersonV1UIC.R6();
        } else {
            nearbyPersonV1UIC.W6();
        }
    }
}
