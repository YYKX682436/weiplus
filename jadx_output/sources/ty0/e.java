package ty0;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f422821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f422822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f422823f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j17, long j18, int i17) {
        super(2);
        this.f422821d = j17;
        this.f422822e = j18;
        this.f422823f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        ty0.x.c(this.f422821d, this.f422822e, (n0.o) obj, this.f422823f | 1);
        return jz5.f0.f302826a;
    }
}
