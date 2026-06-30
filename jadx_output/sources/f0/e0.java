package f0;

/* loaded from: classes14.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.q f258048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f258049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f258050f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0.q qVar, f0.r1 r1Var, int i17) {
        super(2);
        this.f258048d = qVar;
        this.f258049e = r1Var;
        this.f258050f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f258050f | 1;
        f0.k0.b(this.f258048d, this.f258049e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
