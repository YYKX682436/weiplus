package tz0;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f423256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f423257e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(yz5.p pVar, int i17) {
        super(2);
        this.f423256d = pVar;
        this.f423257e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f423257e | 1;
        tz0.a0.a(this.f423256d, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
