package k0;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f302867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0.m f302868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f302869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f302870g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, k0.m mVar, yz5.p pVar, int i17) {
        super(2);
        this.f302867d = j17;
        this.f302868e = mVar;
        this.f302869f = pVar;
        this.f302870g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        k0.i.b(this.f302867d, this.f302868e, this.f302869f, (n0.o) obj, this.f302870g | 1);
        return jz5.f0.f302826a;
    }
}
