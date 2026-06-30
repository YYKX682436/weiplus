package z;

/* loaded from: classes14.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.l2 f468699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f468700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f468701f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(z.l2 l2Var, java.lang.Object obj, int i17) {
        super(2);
        this.f468699d = l2Var;
        this.f468700e = obj;
        this.f468701f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f468701f | 1;
        this.f468699d.a(this.f468700e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
