package m85;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f324833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f324834e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.p pVar, int i17) {
        super(2);
        this.f324833d = pVar;
        this.f324834e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f324834e | 1;
        m85.h.a(this.f324833d, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
