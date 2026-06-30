package mq2;

/* loaded from: classes15.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC f330762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC) {
        super(0);
        this.f330762d = nearbyPersonV1UIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f330762d.getContext().finish();
        return jz5.f0.f302826a;
    }
}
