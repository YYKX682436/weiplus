package nu0;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.s f340070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f340071e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(nu0.s sVar, com.tencent.maas.base.MJID mjid) {
        super(0);
        this.f340070d = sVar;
        this.f340071e = mjid;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.maas.base.MJID layerID = this.f340071e;
        kotlin.jvm.internal.o.f(layerID, "$layerID");
        this.f340070d.N7(layerID, zw0.b.f476551e, mv0.c.f331532d);
        return jz5.f0.f302826a;
    }
}
