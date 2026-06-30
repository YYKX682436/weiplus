package l0;

/* loaded from: classes14.dex */
public final class z4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2.o1 f314717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f314719f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(a2.o1 o1Var, yz5.p pVar, int i17) {
        super(2);
        this.f314717d = o1Var;
        this.f314718e = pVar;
        this.f314719f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f314719f | 1;
        l0.e5.a(this.f314717d, this.f314718e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
