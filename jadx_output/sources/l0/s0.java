package l0;

/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f314507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(yz5.p pVar, int i17) {
        super(2);
        this.f314506d = pVar;
        this.f314507e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f314507e | 1;
        l0.t0.a(this.f314506d, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
