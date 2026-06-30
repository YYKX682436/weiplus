package pe3;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe3.f f353634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f353635e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(pe3.f fVar, int i17) {
        super(2);
        this.f353634d = fVar;
        this.f353635e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f353635e | 1;
        this.f353634d.O6((n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
