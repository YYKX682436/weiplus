package d0;

/* loaded from: classes14.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f225199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f225200e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(z0.t tVar, int i17) {
        super(2);
        this.f225199d = tVar;
        this.f225200e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f225200e | 1;
        d0.y.a(this.f225199d, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
