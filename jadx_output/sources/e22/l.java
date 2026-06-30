package e22;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f246678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f246679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yz5.a aVar, int i17) {
        super(2);
        this.f246678d = aVar;
        this.f246679e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f246679e | 1;
        e22.a1.b(this.f246678d, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
