package m2;

/* loaded from: classes14.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m2.a0 f322905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f322906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f322907f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(m2.a0 a0Var, yz5.p pVar, int i17) {
        super(2);
        this.f322905d = a0Var;
        this.f322906e = pVar;
        this.f322907f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f322907f | 1;
        m2.d0.a(this.f322905d, this.f322906e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
